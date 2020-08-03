public class Objective3Lab2 {
  public static void main(String[] args) {
    int side1=10;
    int side2=8;
    double side1squared= (side1 * side1);
    double side2squared= (side2 * side2);

    double sum = side1squared + side2squared;
    double hypotenuse = Math.sqrt(sum);
    System.out.println(hypotenuse);


  }
}
