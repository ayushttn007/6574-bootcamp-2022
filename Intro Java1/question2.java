package java1_exercise26sep;


import java.util.Scanner;

public  class exercise_26sep {


    public static void main(String[] args){
           Scanner scn = new Scanner(System.in);
           StringBuilder str = new StringBuilder("");
           while(true){
               String rstr = scn.nextLine();
               if("XDONE".equals(rstr)){
                   break;
               }
               str.append(rstr);
           }
           System.out.println(str.toString());
    }


}
