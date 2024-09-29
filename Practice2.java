//Q2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
package Basic;
public class Practice2 {
        int area=96;
        int width=8;
        int length;
        int perameter;

         public int lengthofrectangle(){
           //area=l*b;
           //96=l*8;
           length=area/width;
            return length;
         }
         int parameterofrectangle(){
            //perameter=2*(l+w)
            perameter=2*(length*width);
            return perameter;
        }

        public static void main(String[] args) {
            Practice2 p = new Practice2();
            System.out.println("length of the rectangle is:"+p.lengthofrectangle());
            System.out.println("Parameter of the rectangle is: "+p.parameterofrectangle()); 
        }
        }
    
        
    
