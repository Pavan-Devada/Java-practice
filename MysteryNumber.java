import java.util.*;
public class MysteryNumber {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int index=0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                int val=11*(i+j);
                arr[index]=val;
                index++;
            }
        }
        Set<Integer> set1=new HashSet<Integer>();
        for(int i:arr){
            set1.add(i);
        }
        for(int a: set1){
            System.out.print(a+" ");
        }
    }
}
