// A simple java program to define the state and behavior of the droids using instance fields and methods

public class Droid{
  int batteryLevel;
  String name;
  public Droid(String droidName){
  name = droidName;
  batteryLevel = 100;
  }
  public String toString(){
    return "Hello, I'm the droid:" +name;
  }
  public void performTask(String task){
  System.out.println(name + " is performing task:" +task);
  // battery life reducing after each task  
  batteryLevel= batteryLevel - 10;
  }
  public void energyReport()
  {
  System.out.println("Battery Level after task is :" +batteryLevel); 
  }
  public static void main(String[] args){
  Droid Codey = new Droid("Codey");
  // printing the statements
  System.out.println(Codey);
  Codey.energyReport();
  Codey.performTask("dancing");
  Codey.energyReport();
  Codey.performTask("coding");
  Codey.energyReport();

  }
}
