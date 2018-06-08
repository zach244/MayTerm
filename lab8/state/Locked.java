public class Locked implements State{
    private RemoteDevice remote;
	
	public Locked(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("Buttons are locked");
		
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("The player is already paused.");
		
		return false;
	}


	// the Stop button is pressed
	public boolean pressStop() {
		System.out.println("Buttons are locked");
		
		return false;
	}
	public boolean pressRewind(){
		
		//need to look at state diagram
		System.out.println("Buttons are locked");

		return false;
    }
    public boolean pressLocked(){
       System.out.println("Keys are already locked");
        return true;
    }
    public boolean pressUnlocked(){
        System.out.println("keys are unlocked");
        //return to previous state after keys are unlocked
        remote.setState(remote.getPreviouState());

        return true;
    }

}