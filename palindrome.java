class palindrome {
    public static void main(String[] args) {
        for(int i = 100;i<=200;i++){
            if (ispalindrome(i)){
                System.out.println(i+" ");
            
            }
        }
      
    }
    
public static boolean ispalindrome(int num){
    int original = num;
    int reversed=0;
    while(num!=0){
        int digit = num%10;
        reversed = reversed*10+digit;
        num = num/10;
    }
  return original == reversed;
}
}
