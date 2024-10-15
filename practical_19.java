class Shape {
    public void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class practical_19 {
    public static void main(String[] args)
    {
        Square square = new Square();
        square.printShape(); 
        square.printRectangle();
        System.out.println(":::::23DIT068:::::SHAH HARSH UMESHKUMAR:::::");
    }
}
