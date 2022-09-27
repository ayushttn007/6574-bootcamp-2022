package java1_exercise26sep;


import java.util.Scanner;

public class exercise_26sep {

   static void areaOfCircle(int radius){
       // area of circle = 22 / 7 * radius * radius;

       int result = (int) (Math.PI * radius * radius);
       System.out.println("Area of Circle: " + result);

   }

   static void Exit(){
       System.out.println("Exit");
   }

   static void circumOfCircle(int radius){
       int result =  (int) (Math.PI * radius * 2);
       System.out.println("Circumfrence of Circle:" + result);
   }
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);

       System.out.println("*******Menu*******");
       /* 1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
       * */
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit");
         int radius ;
        int input = scn.nextInt();

        switch (input){
            case 1: {
                System.out.print("Radius: ");
                radius = scn.nextInt();
                areaOfCircle(radius);
            }
            break;
            case 2: {
                System.out.print("Radius: ");
                radius = scn.nextInt();
                circumOfCircle(radius);
            }
            break;
            case 3: {
                Exit();
            }
            break;
        }
    }





}
