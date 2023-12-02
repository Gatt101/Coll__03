abstract class Shape {
    

    public abstract void calculation();

    public abstract void display();

}

class Rectangle extends Shape {
    int len, bre,area;

    Rectangle(int len, int bre) {
        this.len = len;
        this.bre = bre;
    }

    public void calculation() {
      area = len * bre;

    }

    public void display() {
        System.out.println("The Area of the rectangle: " +area);
    }
}

class Circle extends Shape {
    double rad,area;

    Circle(double rad) {
        this.rad = rad;
    }

    public void calculation() {
       area = 2 * Math.PI * rad;
    }

    public void display() {
        System.out.println("The Area of the circle: " +area);
    }
}

class Triangle extends Shape {
    double height, base,area;

    Triangle(double h, double b) {
        this.height = h;
        this.base = b;
    }

    public void calculation() {
        area = 0.5 * base * height;
    }

    public void display() {
        System.out.println("The Area of the triangle: " +area);
    }
}

class Exp11 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 15);
        r1.calculation();
        r1.display();

        Circle c1 = new Circle(50);
        c1.calculation();
        c1.display();

        Triangle t1 = new Triangle(12.25, 13.69);
        t1.calculation();
        t1.display();
    }
}
