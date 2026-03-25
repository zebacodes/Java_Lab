import java.util.*;
 class Student{
    String name;
    int age;
    double cgpa;
    //constructor
    Student(String name){
        this.name=name;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
    void display(){
        System.out.println("Name is: "+this.name);
        System.out.println("Age is: "+this.age);
        System.out.println("Cgpa is: "+this.cgpa);

    }
}
class constructoroverloading{
    public static void main(String args[]){
       
       Student s1=new Student("Ritisha De");
       Student s2=new Student("Ritisha De",20);
       Student s3=new Student("Ritisha De",20,9.5);
       //s1.display();
       s3.display();
       s2.display();
    }
}