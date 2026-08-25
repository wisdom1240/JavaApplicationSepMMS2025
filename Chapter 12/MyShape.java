import java.awt.*;

public abstract class MyShape {
    private int x1, y1, x2, y2;
    private Color color;

    public MyShape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.color = color;
    }

    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
    public void setX2(int x2) { this.x2 = x2; }
    public void setY2(int y2) { this.y2 = y2; }
    public Color getColor() { return color; }

    public int getUpperLeftX() { return Math.min(x1, x2); }
    public int getUpperLeftY() { return Math.min(y1, y2); }
    public int getWidth() { return Math.abs(x1 - x2); }
    public int getHeight() { return Math.abs(y1 - y2); }

    public abstract void draw(Graphics g);
}