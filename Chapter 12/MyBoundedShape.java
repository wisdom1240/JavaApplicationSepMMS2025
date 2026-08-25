import java.awt.*;

public abstract class MyBoundedShape extends MyShape {
    private boolean filled;

    public MyBoundedShape(int x1, int y1, int x2, int y2, Color color, boolean filled) {
        super(x1, y1, x2, y2, color);
        this.filled = filled;
    }

    public boolean isFilled() { return filled; }
}