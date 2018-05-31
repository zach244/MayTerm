import java.io.*;
public abstract class EggDish{
   
    final void prepareEggs(int eggs){
        crackingEggs(eggs);
        prepare();
        cook();
       if(customerWantsSaltPepper()){
        saltAndPepper();
       }
        serve();


   }

    void crackingEggs(int num){
        System.out.println("Cracking " + num + " eggs.");
    }
    void serve(){
        System.out.println("Placing the eggs on a plate");
    }
    abstract void prepare();
    abstract void cook();
   
    final void saltAndPepper(){
        System.out.println("Adding Salt and Pepper");
    }
    
       public boolean customerWantsSaltPepper(){
           return true;
       }
       final String getUserInput(){
		String answer = null;
		System.out.print("Would you like salt and peper with your eggs (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = in.readLine();
		}catch(IOException ioe){
			System.err.print("IO Error");
		}
		if(answer == null){
			return "no";
		}
		return answer;
	}
}