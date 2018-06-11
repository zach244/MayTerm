/**
 * An implementation of the Model interface.
 */

import javax.sound.midi.*;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
  
  Sequencer sequencer;
  ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
  ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
  int bpm = 90;
  Sequence sequence;
  Track track;
  Synthesizer synthesizer;
  
  public void initialize() {
    setUpMidi();
    buildTrackAndStart();
  }
  
  public void on() {
    sequencer.start();
    setBPM(90);
  }
  
  public void off() {
    setBPM(0);
    sequencer.stop();
  }
  
  public void setBPM(int bpm) {
    this.bpm = bpm;
    sequencer.setTempoInBPM(getBPM());
    notifyBPMObservers();
  }
  
  public int getBPM() {
    return bpm;
  }
  
  void beatEvent() {
    notifyBeatObservers();
  }
  
  public void registerObserver(BeatObserver o) {
    beatObservers.add(o);
  }
  
  public void notifyBeatObservers() {
    for (int i = 0; i < beatObservers.size(); i++) {
      BeatObserver observer = (BeatObserver) beatObservers.get(i);
      observer.updateBeat();
    }
  }
  
  public void registerObserver(BPMObserver o) {
    bpmObservers.add(o);
  }
  
  public void notifyBPMObservers() {
    for (int i = 0; i < bpmObservers.size(); i++) {
      BPMObserver observer = (BPMObserver) bpmObservers.get(i);
      observer.updateBPM();
    }
  }
  
  public void removeObserver(BeatObserver o) {
    int i = beatObservers.indexOf(o);
    if (i >= 0) {
      beatObservers.remove(i);
    }
  }
  
  public void removeObserver(BPMObserver o) {
    int i = bpmObservers.indexOf(o);
    if (i >= 0) {
      bpmObservers.remove(i);
    }
  }
  
  public void meta(MetaMessage message) {
    System.out.println(message.getType());        
    if (message.getType() == 47) {
      beatEvent();
      sequencer.start();
      setBPM(getBPM());
    }
  }
  
  public void setUpMidi() {
    try {
      sequencer = MidiSystem.getSequencer();
      sequencer.open();
      sequencer.addMetaEventListener(this);
      sequence = new Sequence(Sequence.PPQ, 1);
      track = sequence.createTrack();
      sequencer.setTempoInBPM(getBPM());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void buildTrackAndStart() {
    int[] trackList = {35, 0, 46, 0};
    
    sequence.deleteTrack(null);
    track = sequence.createTrack();
    
    makeTracks(trackList);
    // the following line was commented out.
    track.add(makeEvent(192, 9, 1, 0, 20));
    try {
      sequencer.setSequence(sequence);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if (! (sequencer instanceof Synthesizer))
    {
      /*
       * We try to get the default synthesizer, open()
       * it and chain it to the sequencer with a
       * Transmitter-Receiver pair.
       */
      try
      {
        
        synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        Receiver synthReceiver = synthesizer.getReceiver();
        Transmitter seqTransmitter = sequencer.getTransmitter();
        seqTransmitter.setReceiver(synthReceiver);
      }
      catch (MidiUnavailableException e)
      {
        e.printStackTrace();
      }
    }
    sequencer.setLoopStartPoint(0);
    sequencer.setLoopEndPoint(-1);
    sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
  }
  
  public void makeTracks(int[] list) {
    
    for (int i = 0; i < list.length; i++) {
      int key = list[i];
      
      if (key != 0) {
        track.add(makeEvent(ShortMessage.NOTE_ON, 0, key, 100, i));
        track.add(makeEvent(ShortMessage.NOTE_OFF, 0, key, 100, i + 1));
      }
    }
  }
  
  public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
    MidiEvent event = null;
    try {
      ShortMessage a = new ShortMessage();
      a.setMessage(comd, chan, one, two);
      event = new MidiEvent(a, tick);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    return event;
  }
}
