import java.rmi.*;


public class RMIJokeClient
{  
   public static void main(String args[]) { 
       String hostName = "10.0.0.214";
       
    try {
      String host = "rmi://" + hostName + "/JokeServer";
      RemoteJoke jokeServer = (RemoteJoke)Naming.lookup(host);
      System.out.println(jokeServer.getJoke());
    }
    catch (Exception e) {
        System.err.println(e);
    }
   }
}