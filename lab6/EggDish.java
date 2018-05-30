public abstract class EggDish{
   
    final void prepareEggs(int eggs){
        crackingEggs(eggs);
        prepare();
        cook();
        if(saltAndPepperHook()){
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
   
    void saltAndPepper(){
        System.out.println("Adding Salt and Pepper");
    }
     boolean saltAndPepperHook() {
        return true;
       }

}