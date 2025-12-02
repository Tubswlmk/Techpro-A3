public class Sw4part2 {
    public int calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Main class below
    public static void main(String[] args) {
        ShapeAreaCalculator calc = new ShapeAreaCalculator();

        int squareArea = calc.calculateArea(5);
        double rectangleArea = calc.calculateArea(4.0, 6.0);

        System.out.println("Square area: " + squareArea);
        System.out.println("Rectangle area: " + rectangleArea); 
    }
}
