import java.util.Scanner;
public class SmallestOfThree {
    int comparsion(int[] num){
        int a=num[0],b=num[1],c=num[2];
        int t=(a<b)?a:b;
        int v=(t<c)?t:c;
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
        SmallestOfThree sot=new SmallestOfThree();
        System.out.println(sot.comparsion(numbers));
    input.close();
    }
}
