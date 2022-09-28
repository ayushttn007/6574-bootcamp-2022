package Bank;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SBI extends Bank{


 /*  public float rateOfInterest;
    public String IfscCode;
    public  String Branch;
    public  String MicrCode;
    public double accountNo;*/
   private static String pathString = "/home/ayushharma/IdeaProjects/Java1/src/Bank/transaction_log_SBI.txt";
  // private acc_type Acc_type;
    private static double account_No = 1100234;
  public  SBI(String Acc_holder){

      //super(float rateOfInterest, String IfscCode, String Branch, String Micrcode,double accountNo);
     // super(7.5F,"SBIN0006343", "New Delhi", "283002015", 400220578);
      super(7.5f,"SBIN0006343","New Delhi" ,"283002015",account_No+1,Acc_holder,pathString);
  }

   public void debit_account(double d_amount) throws insufficientAmount {
      try{
          super.debit_amount(d_amount);
      }catch (insufficientAmount e){
          System.out.println("Message:" + "Transaction failed due to Insufficient Amount!!");
      }

   }
   @Override
   public void credit_amount(double c_amount){
      super.credit_amount(c_amount);
   }


}
