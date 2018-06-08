/**
 * RemoteDevice.java
 *
 * This is the device that we are controlling with the
 * State pattern.
 */

public class RemoteDevice {
	// the different states the device may be in
	private State playing;
	private State paused;
	private State stopped;
	private State rewind;
	private State locked;
	private State unlocked;
	//the current state of the player
	private State currentState;
	private State previousState;
	/**
	 * the current position of the media
	 * this may be 0 (the beginning of the media)
	 * up to some int value representing  the end of the media
	 */
	private int currentPosition; 

	// initialize the remote device	
	public RemoteDevice() {
		playing = new Playing(this);
		paused = new Paused(this);
		stopped = new Stopped(this);
		rewind = new Rewind(this);
		locked = new Locked(this);
		unlocked = new Locked(this);
	
	
		// initial state is stopped	
		currentState = stopped;
		previousState = stopped;
		// we are at the beginning of the media
		currentPosition = 0;
	}

	// set the state of the device	
	public void setState(State state) {
		previousState = currentState;
		this.currentState = state;
	}

	// set the position of the media	
	public void setPosition(int position) {
		currentPosition = position;
	}

	// get the current position of the media	
	public int getPosition() {
		return currentPosition;
	}
	//get current state
	public State getCurrentState(){
		return currentState;
	}
	// press the Play button	
	public void pressPlay() {
		currentState.pressPlay();
	}
	
	// press the Pause button	
	public void pressPause() {
		currentState.pressPause();
	}
	
	// press the Stop button	
	public void pressStop() {
		currentState.pressStop();
	}

	public void pressRewind(){
		currentState.pressRewind();
	}
	// return the playing state	
	public State getPlayingState() {
		return playing;
	}
	
	// return the paused state	
	public State getPausedState() {
		return paused;
	}
	
	// return the stopped state	
	public State getStoppedState() {
		return stopped;
	}
	//return the rewind state
	public State getRewindState(){
		return rewind;
	}
	//return previous state
	public State getPreviouState(){
		return previousState;
	}
	public void pressLocked(){
		currentState.pressLocked();
	}
	public void pressUnlocked(){
		currentState.pressUnlocked();
	}
	public State getLockedState(){
		return locked;
	}
	public State getUnlockedState(){
		return unlocked;
	}
}
