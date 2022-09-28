package Bank;

import javax.swing.text.AbstractDocument;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

enum acc_type{
    SAVING,
    CURRENT
};
public class Bank {
    protected float rateOfInterest;
    protected String IfscCode;
    protected String Branch;
    protected String MicrCode;

    protected  double account_No;

    protected String Acc_holder;
    protected double c_amount;
    protected  double d_amount;
    protected  double prev_amount;
    protected   String pathString ;
    protected acc_type Acc_type;
   /* public  acc_type Acc_Saving =acc_type.Saving;

    public  acc_type Acc_Current = acc_type.Current;*/

    public double current_balance;

    public Bank(float rateOfInterest, String IfscCode, String Branch, String MicrCode,double account_No,String Acc_holder,String pathString){
        this.rateOfInterest = rateOfInterest;
        this.IfscCode = IfscCode;
        this.Branch = Branch;
        this.MicrCode = MicrCode;
        this.account_No = account_No;
        this.Acc_holder = Acc_holder;
      this.Acc_type = Acc_type;
        this.pathString = pathString;

    }



    public void getDetails(){
        System.out.println("Account Holder Name:" + this.Acc_holder);
       System.out.println("Account Type:" + this.Acc_type);
      //  System.out.println("Current Balance:" + this.current_balance);

    }
     void debit_amount(double d_amount) throws insufficientAmount{
         String Message;
        if(d_amount > current_balance) {
            Message = "Transaction failed , Insuficient Amount";
            String trans_info =  trans_Details(this.account_No,d_amount,prev_amount,this.current_balance,Message);
            trans_log(this.pathString, trans_info);
               throw new insufficientAmount(Message);
        }else {
            prev_amount = current_balance;
            current_balance -= d_amount;
            System.out.println("Amount is Deducted");
            System.out.println("Available Balance: " + current_balance);
            Message = "Transaction Successful.";

        }
        String trans_info =  trans_Details(this.account_No,d_amount,prev_amount,this.current_balance,Message);
         trans_log(this.pathString, trans_info);
     }

     void credit_amount(double c_amount){
        current_balance+= c_amount;
        System.out.println("Message: Amount is Credited");
        System.out.println("Available Balance:" + current_balance);
        String Message = "Transaction Successful";
         String trans_info =  trans_Details(this.account_No,this.d_amount,prev_amount,this.current_balance,Message);
         trans_log(this.pathString, trans_info);
     }

    public String trans_Details(double account_No,double d_amount,double prev_amount,double current_balance,String Message){
        //account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any
        StringBuilder trans_detail = new StringBuilder();
         SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         Date date = new Date();
         StringBuilder append = trans_detail.append("Time of Transaction: ").append(formatter.format(date)).append('\n')
                 .append("Account No: ").append(account_No).append('\n').append("Amount Withdraw: ")
                 .append(d_amount).append('\n').append("Amount Before Deduction: ").append(prev_amount).append('\n')
                 .append("Available Balance: ").append(current_balance).append('\n').append("Message: ")
                 .append(Message);
        String transac_String = append.toString();
         return transac_String;

     }

     public void trans_log(String pathString, String trans_details){
           Path path = Paths.get(pathString);
           try{
               Files.writeString(path, trans_details,
                       StandardCharsets.UTF_8);

           }catch(IOException e){
               System.out.println("Invalid Path");
         }
     }
    public void printDetails(){
        System.out.println("RateOfInterest:" + this.rateOfInterest);
        System.out.println("IfscCode:" + this.IfscCode);
        System.out.println("Branch:" + this.Branch);
        System.out.println("MicrCode:" + this.MicrCode);
        System.out.println("Account Types:" + acc_type.CURRENT + "," +  acc_type.SAVING);
    }


}
