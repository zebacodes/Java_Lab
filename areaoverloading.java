import java.util.*;
class Area{
    int area(int l,int b){
        return l*b;
    }
    int area(int a){
        return a*a;
    }
    double area(double b,double h){
        return 0.5*b*h;
    }
}
class areaoverloading{
    public static void main(String args[]){
       Area a1=new Area();
       System.out.println("Area of rectangle: "+a1.area(2,3));
       System.out.println("Area of square: "+a1.area(4));
       System.out.println("Area of triangle: "+a1.area(2.3,6.7));
    }
}