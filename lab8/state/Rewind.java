public class Rewind implements State{
    private RemoteDevice remote;
	
	public Rewind(RemoteDevice remote) {
		this.remote = remote;
	}

	// the Play button is pressed
	public boolean pressPlay() {
		System.out.println("must stop before pressing play");
		
		return false;
	}

	// the Pause button is pressed
	public boolean pressPause() {
		System.out.println("must return to stopped state before pause");
		
		return false;
	}

	// the Stop button is pressed
	public boolean pressStop() {
		
		remote.setState(remote.getStoppedState());
		remote.setPosition(0);

		return true;
    }

    public boolean pressRewind(){
		
		//need to look at state diagram
		System.out.println("Media is already rewinding");
		return false;
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