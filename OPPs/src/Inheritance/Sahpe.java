package Inheritance;

import java.util.Scanner;

class Shapes {
    int areaSquare(int a) {
        return a * a;
    }
}

class Square extends Shapes {
    int perimeterSquare(int a) {
        return 4 * a;
    }
}

class Diagonal extends Square {
    int perimeterUsingDiagonal(int d) {
        return (int) (d * Math.sqrt(2));
    }
}

public class Sahpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length for area calculation:");
        int a = sc.nextInt();
        System.out.println("Enter the side length for perimeter calculation:");
        int b = sc.nextInt();
        System.out.println("Enter the diagonal length:");
        int d = sc.nextInt();

        Diagonal obj1 = new Diagonal();
        int area = obj1.areaSquare(a);
        int perimeter = obj1.perimeterSquare(b);
        int perimeterFromDiagonal = obj1.perimeterUsingDiagonal(d);

        System.out.println("Area of square: " + area);
        System.out.println("Perimeter of square: " + perimeter);
        System.out.println("Perimeter using diagonal: " + perimeterFromDiagonal);

    }
}