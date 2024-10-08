// Q. Shelly has a rectangular garden of length 22 m and breath 15 m. 
// Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
public class Practice6 {
    public static void main(String[] args) {
       int lengthofrec=22;
       int breadthofrec=15;
       int area=lengthofrec*breadthofrec;
       System.out.println("Total area of shelly's garden is : "+area);
       int sideofsq=21;
       int areaofsq = sideofsq*sideofsq;
       System.out.println("Total area of Rachel's garden is : "+areaofsq);

       int difference;
       if(area>areaofsq){
        difference=area-areaofsq;
        System.out.println("area of shelly's garden is bigger by "+difference);
       }
       else{
        difference=areaofsq-area;
        System.out.println("area of Rachel's garden is bigger by "+difference);
       }

    }
}
