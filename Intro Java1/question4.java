package java1_exercise26sep;


import java.util.Scanner;

public  class exercise_26sep {


    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int[][] arr = {
               {2 ,4 , 6 , 5},
               {3 ,6 , 9 , 4},
               {4 ,8 , 12, 3},
               {5 ,10, 15 , 2}
       };
       int[] rowarr = new int[4];
       int[] colarr = new int[4];

       for(int i = 0 ; i<arr.length; i++){
           for(int j = 0; j < arr[i].length; j++){
               rowarr[i] = rowarr[i] + arr[i][j];
               colarr[j] = colarr[j] + arr[i][j];
           }
       }
        System.out.print("RowSum: ");
       for(int val : rowarr){

           System.out.print(val+ " ");
       }
       System.out.println();
        System.out.print("colSum: ");
        for(int val : colarr){

            System.out.print(val+ " " );
        }
    }





}
