
	import java.util.concurrent.*;

public class TeaFacade{
   TeaCup teaCup;
   Water water;
   TeaInfuser teaInfuser;
    Tea tea;


    public TeaFacade(TeaCup teaCup, Water water,TeaInfuser teaInfuser){
        this.teaCup = teaCup;
        this.water = water;
        this.teaInfuser = teaInfuser;
    }
    public void makeTea(String teaType){
        tea = new Tea(teaType);
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new Runnable() { public void run() { teaInfuser.addTea(tea); }  });

		water.boilWater();

		teaCup.addWater(water);

		teaCup.setSteepTime(15);

		teaCup.steep();
    }
}
