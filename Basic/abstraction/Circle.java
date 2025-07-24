// Concrete class implementing abstract class and interface
class Circle extends Shape implements Movable {
    private double radius;
    
    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius + 
                          " at position (" + x + ", " + y + ")");
    }
    
    @Override
    public void move(int newX, int newY) {
        System.out.println("Moving circle from (" + x + ", " + y + ") to (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }
    
    public double getRadius() {
        return radius;
    }
}