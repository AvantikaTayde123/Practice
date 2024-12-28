import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        int n,fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("enter a no:");
n=sc.nextInt();
//for(int i=n;i>=1;i--){
while(n>=1){
//   fact=fact*i;
fact=fact*n;
n--;
}
System.out.println(fact);
    }
}
