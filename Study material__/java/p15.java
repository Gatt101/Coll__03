// Abstract class
 abstract class Shape {
 public abstract void calculateArea();
    public abstract void display();
}

// Rectangle class
class Rectangle extends Shape {
    int length = 4;
    int breadth = 5;

    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

   public void display() {
        System.out.println("This is a rectangle");
    }
}

// Circle class
class Circle extends Shape {
    int radius = 3;

  public  void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + area);
    }

  public  void display() {
        System.out.println("This is a circle");
    }
}

// Triangle class
class Triangle extends Shape {
    int base = 6;
    int height = 4;

 public   void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

   public void display() {
        System.out.println("This is a triangle");
    }
}


public class p15 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.display();

        Circle circle = new Circle();
        circle.calculateArea();
        circle.display();

        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.display();
    }
}
