package fitnesstracker;

/**
 *
 * @author LENOVO
 */
public class Activity {

    
    double newCaloriesburnet;
    public int j = 0;

    protected double time;
    protected double calories_burnt;
    protected double oldHeartRate;
    protected double newHeartRate;
    protected double heartRate_increase;

    public Activity() {
        this.calories_burnt = 0.0;
        this.oldHeartRate = oldHeartRate = 80.0;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;

    }
//set calories burnt according to the object created

    public void setCalories_burnt(Activity a) {
        if (a instanceof Swimming) {
            this.calories_burnt = 4.0;
        } else if (a instanceof Running) {
            this.calories_burnt = 5.0;
        } else if (a instanceof Kick_boxing) {
            this.calories_burnt = 3.0;
        } else if (a instanceof Strength_training) {
            this.calories_burnt = 5.0;
        } else {
            System.out.println("Non-existing activity");
        }

    }
// setHeartreate increase according to the object creation 

    public void setHeartRate_increase(Activity a) {
        if (a instanceof Swimming) {
            this.heartRate_increase = 0.002;
        } else if (a instanceof Running) {
            this.heartRate_increase = 0.003;
        } else if (a instanceof Kick_boxing) {
            this.heartRate_increase = 0.005;
        } else if (a instanceof Strength_training) {
            this.heartRate_increase = 0.006;
        } else {
            System.out.println("Non-existing activity");
        }
    }

    public double getCalories_burnt() {
        newCaloriesburnet = calories_burnt * time;

        return newCaloriesburnet;
    }

    public void setNewHeartRate(double newHeartRate) {
        this.newHeartRate =oldHeartRate;
        this.newHeartRate =oldHeartRate+(oldHeartRate*time*heartRate_increase);
    }


    public double getNewHeartRate() {
        return newHeartRate;
    }

   
    
    
    
    
    }

    


   


