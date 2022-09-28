package Bank;

public class BOI extends Bank{
    private static double account_No = 11046;
   private static String pathString = "/home/ayushharma/IdeaProjects/Java1/src/Bank/transaction_log_BOI.txt";
    public  BOI (String Acc_holder){

        //super(float rateOfInterest, String IfscCode, String Branch, String Micrcode,double accountNo);
        //super(8.5F,"BOIN0006343", "New Delhi", "301002015", 110220578);
        super(8.5f,"BOI8008","Noida" ,"03028",account_No+1,Acc_holder,pathString);
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
