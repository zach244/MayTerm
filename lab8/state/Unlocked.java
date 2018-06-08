public class Unlocked implements State{
    private RemoteDevice remote;
	
	public Unlocked(RemoteDevice remote) {
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
		System.out.println("The player is stopped.");
		remote.setState(remote.getPlayingState());
		remote.setPosition(0);

		return true;
	}

	public boolean pressRewind(){
		
		//need to look at state diagram
		remote.setPosition(0);
		System.out.println("The media is rewinded and will play");
		remote.setState(remote.getRewindState());



		return true;
	}
    public boolean pressLocked(){
        System.out.println("Keys are locked");
        remote.setState(remote.getLockedState());
		 return true;
     }
     public boolean pressUnlocked(){
         System.out.println("keys are already unlocked");
         
 
         return true;
     }
	
}