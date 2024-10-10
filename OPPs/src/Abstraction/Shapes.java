package Abstraction;

import Inheritance.Sahpe;

import java.awt.geom.Area;
import java.util.Scanner;

abstract class Shape{
    abstract double CalculateArea();
    abstract double CalculatePerimeter();
}

class Circle extends Sahpe{
    double CalculateArea(double r){
        double res=3.14*r*r;
        return res;
    }
    double CalculatePerimeter( double r){
        double res1=2*3.14*r;
        return  res1;
    }
}

class Triangle extends Sahpe{
    double CalculateArea(int b,int h){
        double res=(b*h)/2;
        return res;
    }
    double CalculatePerimeter( int a,int b,int c){
        double res1=a+b+c;
        return  res1;
    }
}


public class Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r;
        int a,b,c,h;
        System.out.println("Enter radius");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        h= sc.nextInt();
        r= sc.nextDouble();

        Circle circle=new Circle();
        Triangle triangle=new  Triangle();
       double res1= circle.CalculateArea(r);
        System.out.println("Area of Circle="+res1);
       double res2= circle.CalculatePerimeter(r);
        System.out.println("Perimeter of circle="+res2);
      double res3=  triangle.CalculateArea(b,h);
        System.out.println("Area of Triangel="+res3);
       double res4= triangle.CalculatePerimeter(a,b,c);
        System.out.println("Perimeter of Triangel="+res4);
    }
}
