/**
 * The RMI Client
 */

import java.rmi.*;


public class RMIClient 
{  
   public static void main(String args[]) { 
       String hostName = "10.0.0.214";
       
    try {
      String host = "rmi://" + hostName + "/DateServer";
      RemoteDate dateServer = (RemoteDate)Naming.lookup(host);
      System.out.println(dateServer.getDate());
    }
    catch (Exception e) {
        System.err.println(e);
    }
   }
}

