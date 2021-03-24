//Jacob Vaught
//Due-9-9-2020
//Date-9-9-2020
//A Simple Program to calculate BMI.
package Project02;
import java.util.Scanner;
public class calcBMI {//Class
//SETUP
public static void main(String[]args) {//method main
double W,H,X;//W=Weight, H=Height, X=Answer
double B=703;//B= BMI Variable(703)
Scanner BMI=new Scanner(System.in);//Reads your input
System.out.print("Enter Weight(LBS):");//Outputs a sentence
//INPUT
W = BMI.nextDouble();
System.out.print("Enter Height(inches):");//Outputs a sentence
H = BMI.nextDouble();
//CALCULATIONS
X=((W*B)/(H*H));
//OUTPUT
System.out.println("Your BMI is:"+X);
BMI.close();
}//method main ending bracket
}//class end bracket
