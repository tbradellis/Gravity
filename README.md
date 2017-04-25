# Gravity
MIT Lesson 1

https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/


In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity.
1. Create a new class called GravityCalculator.
2. Copy and paste the following initial version:
class GravityCalculator {
public static void main(String[] arguments) {
double gravity = -9.81; // Earth's gravity in m/s^2
double initialVelocity = 0.0;
double fallingTime = 10.0;
double initialPosition = 0.0;
double finalPosition = 0.0;
 System.out.println("The object's position after " + fallingTime +
" seconds is " + finalPosition + " m.");
}
}
3. Run it in Eclipse (Run → Run As → Java Application).
What is the output of the unmodified program? Include this as a comment in the source code of your submission.
Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in
meters. The formula in Math notation is:
x(t) = 0.5 × at
2
 + vit + xi
Variable Meaning Value
a Acceleration (m/s
2
) -9.81
t Time (s) 10
vi Initial velocity (m/s) 0
xi Initial position 0
Note: The correct value is -490.5 m. Java will output more digits after the decimal place, but that is unimportant.
Submit your GravityCalculator.java file via Stellar. 
MIT OpenCourseWare
http://ocw.mit.edu
6.092 Introduction to Programming in Java
January (IAP) 2010
For information about citing these materials or our Terms of Use, visit: http://ocw.mit.edu/terms. 
