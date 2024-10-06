package Basic;

public class Practice4 {
    public static void main(String[] args) {
        
    int length=300;
    int breadth=150;
    int area = length*breadth;
    // int costper_100=6;
    // double costpersquare=costper_100/100;
    double costpersquare=0.06;
    double total= area*costpersquare;
     System.out.println("area: "+area);
     System.out.println("Cost of per square meter : "+costpersquare);
    System.out.println("Total cost : " + total);
    }
    
}
