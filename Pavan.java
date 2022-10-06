public class Pavan{
public static void main(String args[]) {
    int a=10;
    int c=11;
    String b="1,2,3,4,,5,6,7,8,9";
    if(++a==c){
        System.out.println("Hello world");
    }
    else{
        System.out.println("not executed");
    }
    System.out.println(b.split(",")[0]);
}
}