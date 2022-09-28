package Bank;

public class ICICI extends Bank{
    private static double account_No =002362;
    private static String pathString = "/home/ayushharma/IdeaProjects/Java1/src/Bank/transaction_log_ICICI.txt";
    public  ICICI (String Acc_holder){

        //super(float rateOfInterest, String IfscCode, String Branch, String Micrcode,double accountNo);
        // super(9.5F,"ICICIN0006343", "New Delhi", "240002015", 100220578);
        super(9.5f,"ICICI3006","Ghaziabad" ,"02015",account_No+1,Acc_holder,pathString);
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
