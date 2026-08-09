package principle.liskov;

public class Square implements Shape {
    private int size;

    public Square(int side) {
        this.size = side;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int computeArea() {
        return size * size;
    }
}
