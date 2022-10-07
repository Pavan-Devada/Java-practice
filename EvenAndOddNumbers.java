import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the range:");
        int range=input.nextInt();
        //Even numbers
        for(int i=0;i<range;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }//Odd numbers
        System.out.println();
        for(int j=0;j<range;j++){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
    input.close();
    }
}
