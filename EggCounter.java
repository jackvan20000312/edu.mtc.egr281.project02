package Project02;
import java.util.Scanner;
public class EggCounter {
public static void main(String[]args) {
int NOEG,NOD,NORE;
int DOZEN=12;
Scanner Egg=new Scanner(System.in);
System.out.print("Enter number of eggs collected: ");
NOEG = Egg.nextInt();
NOD=NOEG/DOZEN;
NORE=NOEG%DOZEN;
System.out.println(NOEG+" eggs is "+NOD+" dozens and remsinder is "+NORE);
Egg.close();
}
}
