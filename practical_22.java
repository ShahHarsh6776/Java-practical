interface Shape {
    double getArea();
    String getColor();
    void setColor(String color);
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}

interface Sign {
    Shape getShape();
    String getText();
    void setText(String text);
}

class CampusSign implements Sign {
    private Shape shape;
    private String text;

    public CampusSign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    public void displaySign() {
        System.out.println("Sign Text: " + getText());
        System.out.println("Shape Area: " + getShape().getArea());
        System.out.println("Shape Color: " + getShape().getColor());
    }
}
public class practical_22 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(10.0, 8.0, "Blue");

        CampusSign circleSign = new CampusSign(circle, "Welcome to the campus!");
        CampusSign rectangleSign = new CampusSign(rectangle, "Important announcement!");

        circleSign.displaySign();
        System.out.println();
        rectangleSign.displaySign();

        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
