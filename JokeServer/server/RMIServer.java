import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer
{
 	public static void main(String[] args)  {
        try {
            RemoteJoke jokeServer = new RemoteJokeImpl();

            // Bind this object instance to the name "DateServer"
            Naming.rebind("JokeServer", jokeServer);

            System.out.println("jokeserver bound in registry");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
