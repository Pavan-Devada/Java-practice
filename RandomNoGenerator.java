import java.util.Scanner;
import java.util.Random;

public class RandomNoGenerator {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Random random=new Random();
    int n=sc.nextInt();
    int w=random.nextInt(n);
    System.out.println("Random  integer number is: "+w); 
    float x=random.nextFloat();
    double y=random.nextDouble();
    long z=random.nextLong();
    boolean a=random.nextBoolean();
    System.out.println(x+"\n"+y+"\n"+z+"\n"+a);
    sc.close();
    }
}