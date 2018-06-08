
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
		RemoteDevice remote = new RemoteDevice();
		remote.setState(new Paused(remote));
		remote.pressLocked();
		
		remote.setState(new Playing(remote));
		remote.pressUnlocked();

		remote.setState(new Stopped(remote));
		remote.pressRewind();
		// System.out.println(remote.getPreviouState());
		
		

	}

}
