public class TestRun
{
  public static void main(String[] args) {
    Model model1 = new PigLatinModel();
    Model model2 = new FlameModel();
    
    Controller controller = new ControllerImpl();
    View viewFrame = new ViewFrame(model1,model2,controller);
    viewFrame.createView();
  }
}