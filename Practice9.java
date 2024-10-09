//18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. 
//If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
public class Practice9 {
  public static void main(String[] args) {
    int length=50;
    int breadth=30;
    int perameter=2*(50+30);
    System.out.println("perameter of Rectangular park is : "+perameter);
    int run = perameter*10;
    System.out.println("The Total distance Ron covers in meters is : "+run);
    double totaldist=run/1000;
    System.out.println("Ron covers "+totaldist +" kilometers in a day by jogging 10 rounds of the park.");
  }  
}
