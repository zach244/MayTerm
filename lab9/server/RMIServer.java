import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer
{
 	public static void main(String[] args)  {
        try {
            RemoteDate dateServer = new RemoteDateImpl();

            // Bind this object instance to the name "DateServer"
            Naming.rebind("DateServer", dateServer);

            System.out.println("DateServer bound in registry");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
