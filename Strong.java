import java.util.Scanner;
public class Strong {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a no:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        int original =n;
        int sum=0;
        while(n>0){
            int digit = n%10;
            int fact=1;

            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        
        }
        if(sum==original){
            System.out.println("strong no");
        }
    else{
           System.out.println("not a strong no");
    }
}
}
//145 1!+4!+5!=145