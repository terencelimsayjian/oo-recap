public class Square {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getArea() {
        return (length * length);
    }

    public int getPerimeter() {
        return 4 * length;
    }
}
