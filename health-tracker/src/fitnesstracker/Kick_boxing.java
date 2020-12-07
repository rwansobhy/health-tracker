package fitnesstracker;

/**
 *
 * @author LENOVO
 */
public class Kick_boxing extends Activity {

    public double heartrateKick_Sum = 0.0;
    public double kick_boxingCaloriesSum = 0.0;
    double kickboxingCaloriesArray[] = new double[100];
    int kickboxingCounter = 0;

    public Kick_boxing() {
        super();
    }

    public double print_sumofCalories() {

        this.kickboxingCaloriesArray[j] = getCalories_burnt();

        System.out.println("New calories burnt :" + kickboxingCaloriesArray[j]);

        this.kick_boxingCaloriesSum += kickboxingCaloriesArray[j];

        System.out.println("Total calouries burnt for kick boxing :" + kick_boxingCaloriesSum);
        j++;

        return kick_boxingCaloriesSum;
    }
    
    public double getHeartRate() {
        return heartrateKick_Sum;
    }
     @Override
    public double getNewHeartRate() {
        for(int i=kickboxingCounter;i<=kickboxingCounter;i++)
            heartrateKick_Sum+=newHeartRate;
        return heartrateKick_Sum;
       
    }
}
