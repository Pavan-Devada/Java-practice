import java.util.Scanner;
public class HollowTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<=n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(i!=n-1){
                if(j==0||j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }}
                else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    sc.close();
    }
    
}
