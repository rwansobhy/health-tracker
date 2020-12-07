package fitnesstracker;

public class Strength_training extends Activity {

    public double heartrateStrength_Sum = 0.0;

    public double strength_trainingCaloriesSum = 0.0;
    int strengthTRAININGCounter = 0;
    double strengthCaloriesArray[] = new double[100];

    public Strength_training() {
        super();

    }

    public double print_sumofCalories() {

        this.strengthCaloriesArray[j] = getCalories_burnt();

        System.out.println("New calories burnt :" + strengthCaloriesArray[j]);

        this.strength_trainingCaloriesSum += strengthCaloriesArray[j];

        System.out.println("TOtal calouries burnt for stregnth trainging :" + strength_trainingCaloriesSum);
        j++;

        return strength_trainingCaloriesSum;
    }
    
    public double getHeartRate() {
        return heartrateStrength_Sum;
    }
    @Override
    public double getNewHeartRate() {
        for(int i=strengthTRAININGCounter;i<=strengthTRAININGCounter;i++)
            heartrateStrength_Sum+=newHeartRate;
        return heartrateStrength_Sum;
       
    }
}
