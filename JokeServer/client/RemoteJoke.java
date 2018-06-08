import java.rmi.RemoteException;
import java.rmi.*;

public interface RemoteJoke extends Remote{
    public abstract String getJoke() throws RemoteException;
}