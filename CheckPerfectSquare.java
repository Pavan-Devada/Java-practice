import java.util.*;
public class CheckPerfectSquare {
    static String isPerfectSquare(int num){
        double sqrt=Math.sqrt(num);
        if(sqrt-Math.floor(sqrt)==0){
            return("a");
        }
    return("not a");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        System.out.println("Entered number is "+isPerfectSquare(number)+" perfect square");
    input.close();

    }
}
