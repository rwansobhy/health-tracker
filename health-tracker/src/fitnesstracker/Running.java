package fitnesstracker;

/**
 *
 * @author LENOVO
 */
public class Running extends Activity {

    public double runningCaloriesSum = 0.0;
    public double heartrateRunning_sum = 0.0;
    int runningCounter = 0;
    double runningCaloriesArray[] = new double[100];

    public Running() {
        super();
    }

//    @Override
//    public double getHeartRate() {
//        return heartRate;
//    }
//    @Override
//  public void setNewHeartRate() {
//        newHeartRate =oldHeartRate+(oldHeartRate*time*heartRate_increase);
//        super.setNewHeartRate();
//    }
    public double print_sumofCalories() {

        this.runningCaloriesArray[j] = getCalories_burnt();

        System.out.println("New calories burnt :" + runningCaloriesArray[j]);

        this.runningCaloriesSum += runningCaloriesArray[j];

        System.out.println("Total calouries burnt for running :" + runningCaloriesSum);
        j++;

        return runningCaloriesSum;
    }
    
    @Override
    public double getNewHeartRate() {
        for(int i=runningCounter;i<=runningCounter;i++)
            heartrateRunning_sum=newHeartRate;
        return heartrateRunning_sum;
       
    }
    
    public double getHeartRate() {
        return heartrateRunning_sum;
    }

}
