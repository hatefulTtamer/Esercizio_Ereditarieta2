public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // override del metodo calculateArea in "Shape"
    public int calculateArea() {
        return width * height;
    }
}
