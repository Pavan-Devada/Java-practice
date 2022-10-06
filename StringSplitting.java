import java.util.Scanner;

public class StringSplitting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String num=Integer.toString(number);//integer to string
        int length=num.length();
        int mid=length/2;
        String[] parts={num.substring(0, mid),num.substring(mid,length)};
        int firstValue=Integer.valueOf(parts[0]);
        int secondValue=Integer.valueOf(parts[1]);//string to integer
        System.out.println(parts[0]+" "+parts[1]);
        System.out.println(firstValue+" "+secondValue);
    sc.close();
    }
}
