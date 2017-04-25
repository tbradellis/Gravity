import java.util.Scanner;

/**
 * Created by bellis on 4/22/17.
 */



class GravityCalculator {


    public static void main(String[] arguments) {
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;


        System.out.println("I'm going to ask you a few questions about an object that fell, then tell you where it is at a given point in time");

        Scanner myScanner = new Scanner(System.in);

        initialPosition = myScanner.nextDouble();



        System.out.println("Enter the initial velocity: ");
        initialVelocity = myScanner.nextDouble();

        System.out.println("Enter the falling time: ");
        fallingTime = myScanner.nextDouble();


        finalPosition = getFinalSpot(fallingTime, initialVelocity, initialPosition);

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");


    }



    public static double getFinalSpot(double fallTime, double initVeloc, double initPos){
        double EARTH_GRAVITY = -9.81;  // Earth's gravity in m/s^2
        double GV_CONSTANT = .5;

        return GV_CONSTANT * ((EARTH_GRAVITY * Math.pow(fallTime, 2)) + (initVeloc * fallTime) + initPos);

    }
}





