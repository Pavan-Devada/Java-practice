import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int val=number*2;
        String s=Integer.toString(val);
        int length=s.length();
        //System.out.println(s.charAt(length-2)+" "+s.charAt(length-3));
        if(s.charAt(length-2)==s.charAt(length-3)){
            System.out.println("Entered number is Strontio number");
        }
        else{
            System.out.println("Entered number is not a Strontio number");
        }
    sc.close();
    }
}
