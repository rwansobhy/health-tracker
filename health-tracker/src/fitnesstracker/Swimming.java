package fitnesstracker;

/**
 *
 * @author LENOVO
 */
public class Swimming extends Activity {

    public double heartrateSwimming_Sum = 0.0;
    public double swimmingCalorieSum = 0.0;
    int swimmigCounter = 0;
    double swimmingCaloriesArray[] = new double[100];

    public Swimming() {
        super();
    }

    public double print_sumofCalories() {

        this.swimmingCaloriesArray[j] = getCalories_burnt();

        System.out.println("New calories burnt :" + swimmingCaloriesArray[j]);

        this.swimmingCalorieSum += swimmingCaloriesArray[j];

        System.out.println("TOtal calouries burnt for swimming :" + swimmingCalorieSum);
        j++;

        return swimmingCalorieSum;
    }

    @Override
    public double getNewHeartRate() {
        for (int i = swimmigCounter; i <= swimmigCounter; i++) {
            heartrateSwimming_Sum += newHeartRate;
        }
        return heartrateSwimming_Sum;

    }

    public double getHeartRate() {
        return heartrateSwimming_Sum;
    }

}
