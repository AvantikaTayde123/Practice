package Basic;

public class Practice5 {
    public static void main(String[] args) {
        
    int costoffencing=1600;
    float length=20;
    int ratepersq=25;
    int total;

    int area=costoffencing/ratepersq;
    System.out.println("Area of park : "+area);

    float breadth =area/length;
    System.out.println("breadth of park : "+breadth);

    float perameter=2*(length+breadth);
    System.out.println("perameter of park : "+perameter);

    }
    
}
