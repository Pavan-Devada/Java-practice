import java.util.Scanner;
public class LargestOfThree {
    int comparsion(int[] num){
        int a=num[0],b=num[1],c=num[2];
        int t=(a>b)?a:b;
        int v=(t>c)?t:c;
    return v;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] list=line.trim().split(" ");
        int[] numbers=new int[list.length];
        for(int i=0; i<list.length;i++){
            numbers[i]=Integer.parseInt(list[i]);
        }
        LargestOfThree lot=new LargestOfThree();
        System.out.println(lot.comparsion(numbers));
    input.close();
    }
}
