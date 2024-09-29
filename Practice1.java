//Q1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm,
// find its breadth and area.
package Basic;
class Practice1{
// public static void main(String args[]){

    int parameter=230;
    int length=70;
    int width;
    int area;
// parameter of rectangle is 2*l+w;
    // width=(parameter/2)-length;
    // System.out.println("parameter of rectangle is: "+parameter );

    // area=length*width;
    // System.out.println("area of rectangle is: "+area);

public int widthofrectangle(){
    width=(parameter/2)-length;
     return width;
}

public int areaofrectangle(){
    int area =length*width;
     return area;
}

public static void main(String[] args) {
    Practice1 p= new Practice1();
    System.out.println("width of rectangle is:" +p.widthofrectangle());
    System.out.println("area of rectangle is:" +p.areaofrectangle());
}
}
