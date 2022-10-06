import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n2=number*2;
        int n3=number*3;
        String s=""+number+n2+n3;
        int count=0;
        for(char c='1';c<='9';c++){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    count+=1;
                    break;
                }
            }
        }
        if(count==9){
            System.out.println("Entered number "+number+" is fascinating number");
        }
        else{
            System.out.println("Entered numnber "+number+" is not a fascinating number");
        }
    sc.close();
    }
    
}
