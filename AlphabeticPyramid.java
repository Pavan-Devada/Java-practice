import java.util.Scanner;
public class AlphabeticPyramid {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        int alphabet=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(alphabet+k)+" ");
            }
            System.out.println();
        }
    sc.close();    
    }
    
}
