import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class  RemoteJokeImpl extends UnicastRemoteObject implements RemoteJoke
{
    public RemoteJokeImpl() throws RemoteException {  }
    
    public  String getJoke() throws RemoteException {
        //this is where the logic goes for delivring a joke
        Random rand = new Random();
        String[] jokes = {"Q: What does a nosey pepper do? A: Gets jalapeno business!","Q: What do you call a fake noodle? A: An Impasta","Q: What do you call an alligator in a vest? A: An Investigator"};

        int i = rand.nextInt(3);
        return jokes[i];
    }
}