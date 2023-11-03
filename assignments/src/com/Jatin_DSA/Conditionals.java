package com.Jatin_DSA;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
//        BASIC PROGRAMS
        Circle_area();
        Triangle_area();
        Rectangle_area();
        Parallelogram_area();
        Rhombus_area();
        Equi_Triangle_area();
        Cicle_peri();
        Equi_Triangle_peri();
        Parallelogram_peri();
        Rectangle_peri();
        Square_peri();
        Rhombus_peri();
        Cone_vol();
        Prism_vol();
        Cylinder_vol();
        Sphere_vol();
        

    }

    private static void Sphere_vol() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        System.out.println("The volume of Sphere:"+" "+4*Math.PI*Math.pow(radius,3)/3);
    }

    private static void Cylinder_vol() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        System.out.println("Enter the height:");
        int height=sc.nextInt();
        System.out.println("The volume of Cylinder is"+" "+(Math.PI*radius*radius*height));
    }

    private static void Prism_vol() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side:");
        int side=sc.nextInt();
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Volume of prism is"+" "+Math.pow(3,.5)*side*side*length/4);
    }

    private static void Cone_vol() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height:");
        int height=sc.nextInt();
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        System.out.println("The volume of cone is"+" "+(Math.PI*radius*radius*height)/3);
    }

    private static void Rhombus_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of one side:");
        int side1=sc.nextInt();
        System.out.println("Enter the length of it's opposite side:");
        int side2=sc.nextInt();
        System.out.println("Perimeter of rhombus is"+" "+2*(side1+side2));
    }

    private static void Square_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of one side:");
        int side=sc.nextInt();
        System.out.println("Perimeter of square is"+" "+4*side);
    }

    private static void Rectangle_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth=sc.nextInt();
        System.out.println("Perimeter of Rectangle is"+" "+2*(length+breadth));

    }

    private static void Parallelogram_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth=sc.nextInt();
        System.out.println("Perimeter of parallelogram is"+" "+2*length+breadth);
    }

    private static void Equi_Triangle_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of triangle:");
        int side=sc.nextInt();
        System.out.println("Perimeter of triangle is"+" "+side*3);
    }

    private static void Cicle_peri() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        System.out.println("Perimeter of circle is"+" "+2*Math.PI*radius);
    }

    private static void Equi_Triangle_area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of one of the sides:");
        int side=sc.nextInt();
        System.out.println("Area of triangle is"+" " +Math.pow(3,.5)*side*side/4);
    }

    private static void Rhombus_area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of diagonal 1:");
        int base=sc.nextInt();
        System.out.println("Enter the length of diagonal 2:");
        int height=sc.nextInt();
        System.out.println("Area of triangle is"+" " +.5*height*base);
    }

    private static void Parallelogram_area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of base:");
        int base=sc.nextInt();
        System.out.println("Enter the the height:");
        int height=sc.nextInt();
        System.out.println("Area of Parallelogram is"+" " +height*base);
    }

    private static void Rectangle_area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Enter the breadth:");
        int breadth=sc.nextInt();
        System.out.println("Area of rectangle is"+" " +length*breadth);
    }

    private static void Triangle_area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of base:");
        int base=sc.nextInt();
        System.out.println("Enter the the height:");
        int height=sc.nextInt();
        System.out.println("Area of triangle is"+" " +.5*height*base);
    }

    private static void Circle_area() {
        System.out.println("Enter the Radius of the circle:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Area of circle is"+" " +Math.PI*Math.pow(r,2));
    }
}
