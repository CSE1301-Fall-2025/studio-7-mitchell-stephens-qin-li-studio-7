

public class Rectangle {
private double length;
private double width;


public Rectangle (double initLength, double initWidth) {
    length = initLength;
    width = initWidth;
}

public double calcArea() {
    return length * width;
}

public double calcPerimeter() {
    return 2 * length + 2 * width;
}

public String toString() {
    return "The area is " + calcArea() + " The perimeter is " + calcPerimeter(); 

}

public static void main ( String[] args) {
    Rectangle r1 = new Rectangle(3.0, 4.0);
    System.out.println(r1);
}
}

