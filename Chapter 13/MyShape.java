import java.awt.*;

public abstract class MyShape {
    private int x1, y1, x2, y2;
    private Paint paint;
    private Stroke stroke;

    public MyShape(int x1, int y1, int x2, int y2, Paint paint, Stroke stroke) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.paint = paint;
        this.stroke = stroke;
    }

    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
    public Paint getPaint() { return paint; }
    public Stroke getStroke() { return stroke; }

    public abstract void draw(Graphics2D g2d);
}