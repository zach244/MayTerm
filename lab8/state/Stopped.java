/**
 * Stopped.java
 *
 * This file represents the Stopped state.
 */

public class Stopped implements State {
	private RemoteDevice remote;
	
	public Stopped(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("The player is now playing.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(remote.getPosition()+1);
		
		return true;
	}

	// the Paused button is pressed
	public boolean pressPause() {
		System.out.println("The player is now paused.");
		remote.setState(remote.getPausedState());
		
		return true;
	}

	// the  Stop button is pressed
	public boolean pressStop() {
		System.out.println("The player is already stopped.");
		
		return false;
	}

	public boolean pressRewind(){
		
		//need to look at state diagram
		remote.setPosition(0);
		System.out.println("The media is rewinded to the start");
		remote.setState(remote.getRewindState());



		return true;
	}
	public boolean pressLocked(){
        System.out.println("Keys are locked");
        remote.setState(remote.getLockedState());
		 return true;
     }
     public boolean pressUnlocked(){
         System.out.println("keys are unlocked");
         remote.setState(remote.getUnlockedState());
 
         return true;
     }
	
}
