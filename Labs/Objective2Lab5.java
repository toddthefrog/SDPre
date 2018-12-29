public class Objective2Lab5{
  public static void main(String[] args){
    /*
    double num = Math.sqrt(3 * 3); // num => 3
    double result = Math.sqrt(4) + Math.sqrt(9); //result => 2 + 3 => 5
    System.out.println(num);
    System.out.println(result);
    */

    double side1 = 10;
    double side2 = 8;
    double side1sqr = side1 * side1; // square side1
    double side2sqr = side2 * side2; // square side2
    double hypotenuse = Math.sqrt(side1sqr + side2sqr); // find square root of (side1sqr + side2sqr)

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
