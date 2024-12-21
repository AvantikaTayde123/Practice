import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        int i,n,sum=0;;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        n= sc.nextInt();
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
            
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect no");
        }

    }
}
// 6 1+2+3=6
//28 1+2+4+7+14=28