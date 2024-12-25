import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();

        if(number<1000||number>9999){
            System.out.println("enter valid 4 digit no: ");
        }else{
            int reversed =0;
            while(number!=0)
            {
                int digit = number%10;
                reversed = reversed * 10 + digit;
                number = number/10;
            }
            System.out.println("Reversed number: "+reversed);
        }
    }
}
