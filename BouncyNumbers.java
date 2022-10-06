import java.util.Scanner;

public class BouncyNumbers {
    static void isBouncy(int num){
        String s=Integer.toString(num);
        char[] arr=s.toCharArray();
        int length=s.length();
        int c1=0,c2=0;
        for(int i=0;i<length-1;i++){
            if(arr[i]<arr[i+1]){
                c1+=1;
            }
            else if(arr[i]>arr[i+1]){
                c2+=1;
            }
            if(c1!=0&&c2!=0){
                System.out.println("Entered number is Bouncy number");
                break;
            }
        }
        if(c1==0 || c2==0){
            System.out.println("Entered number is not a bouncy number");
        } 
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        isBouncy(number);
    sc.close();
    }
}
