package Project02;

import java.util.Scanner;

public class average3Numbers {
public static final double THREE=3;
public static void main(String[]args) {
//Prepare
Scanner kb=new Scanner(System.in);
double number1, number2, number3;
double Total;
double Average;
//input
System.out.println("Enter 1st Number");
number1=kb.nextDouble();
System.out.println("Enter 2nd Number");
number2=kb.nextDouble();
System.out.println("Enter 3rd Number");
number3=kb.nextDouble();
//Process
Total=(number1+number2+number3);
Average=(Total/THREE);
//Output
System.out.println("The average is:"+Average);
kb.close();
}//Ending Bracket of method main
}//Ending Bracket of Class average3Numbers

