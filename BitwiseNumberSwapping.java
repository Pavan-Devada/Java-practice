import java.util.Scanner;

public class BitwiseNumberSwapping {
    static String swap(int[] numbers){
        int x=numbers[0];
        int y=numbers[1];
        x=x^y;
        y=x^y;
        x=x^y;
    return(x+" "+y);
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String line=input.nextLine();
        String[] Snumbers=line.trim().split(" ");
        int[] numbers=new int[Snumbers.length];
        int i=0;
        for(String s:Snumbers){
            numbers[i]=Integer.parseInt(s);
            i++;
        }
        System.out.println(swap(numbers));
    input.close();
    }
}
