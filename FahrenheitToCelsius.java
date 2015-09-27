package FarToCel;

import java.util.*;
 
class FahrenheitToCelsius {
  public static void main(String[] args) {
    float temperatue;
    Scanner in = new Scanner(System.in);      
 
<<<<<<< HEAD
    System.out.println("Kindly enter temperatue in Fahrenheit");
=======
    System.out.println("Please enter temperatue in terms of Fahrenheit");
>>>>>>> master
    temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Please enter temperatue in terms of Celsius = " + temperatue);
  }
}