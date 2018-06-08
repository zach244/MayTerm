/**
 * Implementation of the RemoteDate interface
 */

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class RemoteDateImpl extends UnicastRemoteObject implements RemoteDate
{
    public RemoteDateImpl() throws RemoteException {  }
    
    public  Date getDate() throws RemoteException {
        return new Date();
    }
}
