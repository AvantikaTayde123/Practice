public class Fibonacci {
    public static void main(String[] args) {
        int first=0, second=1,c;
        for(int i=0;i<=10;i++){
            c=first+second;
            first=second;
            second=c;
            System.out.println(c);
        }
    }
}
