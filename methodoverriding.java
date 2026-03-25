import java.util.*;
class Shape{
    void area(){
        System.out.println("No area shape is done");
    }
}
class Rectangle extends Shape{
    int length,width;
    Rectangle(int length,int width){
       this .length=length;
       this.width=width;
    }
    void area(){
        int area=length * width;
        System.out.println("Area of rectangle: "+area);
    }
}
class methodoverriding{
    public static void main(String args[]){
       Rectangle r=new Rectangle(3,4);
       r.area();
    }
}