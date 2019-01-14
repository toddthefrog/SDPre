public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int a;

    while(counter <= 20){
      a = counter % 2;
      if(a == 0){
        System.out.println(counter + " is even");
      }
      else {
        System.out.println(counter + " is odd");
      }
      counter++;
    }
  }
}
