import java.util.Scanner;

public class ATM_Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tAmount=100000;
        System.out.println("AUTOMATED TELLER MACHINE");
        while(true){
            System.out.println("1.Withdraw the money \n2.Deposit the money\n3.Check the balance\n4.Exit");
            System.out.print("Enter the operation to be performed:");
            int operation=sc.nextInt();
            switch(operation){
                case 1:{
                    System.out.print("Enter the amount:");
                    int amt=sc.nextInt();
                    if(amt<=tAmount){
                        tAmount-=amt;
                        System.out.println("Transaction successfull\n");
                    }
                    else{
                        System.out.println("Insufficient Balance\n");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter the amount:");
                    int amt=sc.nextInt();
                    tAmount+=amt;
                    System.out.println("Transaction Successfull\n");
                    break;
                }
                case 3:{
                    System.out.println("Your account balance is: "+tAmount+"\n");
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                
            }
        sc.close();
        }
    }
}
