import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    double number, anotherNumber, sum;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number:");
    number = input.nextDouble();
    //System.out.println(number); //test print number variable

    System.out.println("Please enter another number:");
    anotherNumber = input.nextDouble();
    //System.out.println(anotherNumber); //test print anotherNumber variable

    sum = number + anotherNumber;
    //System.out.println(sum); //test print sum variable

    System.out.println("The sum of " + number + " + " + anotherNumber + " = " + sum);

    input.close();
  }
}
