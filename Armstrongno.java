import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int n,r,t=0;
        System.out.println("enter a no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int c=n;
        while(n>0){
            r=n%10;
            n=n/10;
            t=(r*r*r)+t;
        }
        if(c==t){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not a armstrong no:");
        }

    }
}
