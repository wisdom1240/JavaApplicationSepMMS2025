import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawPanel extends JPanel {
    private MyShape[] shapes;
    private int shapeCount;
    private int shapeType;
    private MyShape currentShape;
    private Color currentColor;
    private boolean filledShape;
    private JLabel statusLabel;

    public DrawPanel(JLabel status) {
        this.statusLabel = status;
        this.shapes = new MyShape[100];
        this.shapeCount = 0;
        this.shapeType = 0;
        this.currentShape = null;
        this.currentColor = Color.BLACK;
        this.filledShape = false;

        setBackground(Color.WHITE);

        MouseHandler handler = new MouseHandler();
        addMouseListener(handler);
        addMouseMotionListener(handler);
    }

    public void setShapeType(int type) { this.shapeType = type; }
    public void setCurrentColor(Color color) { this.currentColor = color; }
    public void setFilledShape(boolean filled) { this.filledShape = filled; }

    public void clearLastShape() {
        if (shapeCount > 0) {
            shapeCount--;
            repaint();
        }
    }

    public void clearDrawing() {
        shapeCount = 0;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapeCount; i++) {
            shapes[i].draw(g);
        }
        if (currentShape != null) {
            currentShape.draw(g);
        }
    }

    private class MouseHandler extends MouseAdapter implements MouseMotionListener {
        @Override
        public void mousePressed(MouseEvent e) {
            switch (shapeType) {
                case 0 -> currentShape = new MyLine(e.getX(), e.getY(), e.getX(), e.getY(), currentColor);
                case 1 -> currentShape = new MyRectangle(e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
                case 2 -> currentShape = new MyOval(e.getX(), e.getY(), e.getX(), e.getY(), currentColor, filledShape);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (currentShape != null) {
                currentShape.setX2(e.getX());
                currentShape.setY2(e.getY());
                if (shapeCount < shapes.length) {
                    shapes[shapeCount++] = currentShape;
                }
                currentShape = null;
                repaint();
            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (currentShape != null) {
                currentShape.setX2(e.getX());
                currentShape.setY2(e.getY());
                statusLabel.setText(String.format("(%d, %d)", e.getX(), e.getY()));
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText(String.format("(%d, %d)", e.getX(), e.getY()));
        }
    }
}