package fractal;

import javax.swing.*;
import java.awt.*;

public class Fractal extends JPanel {

    public Fractal(int width, int height) {
        setSize(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point a = new Point(getWidth() / 2, 0);
        Point b = new Point(0, getHeight());
        Point c = new Point(getWidth(), getHeight());

        g.setColor(Color.BLUE);

        render(g, a, b, c, 4);
    }

    private void render(Graphics g, Point a, Point b, Point c, int level) {
        drawTraingle(g, a, b, c);

        Point ab = new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
        Point bc = new Point((c.x + b.x) / 2, (c.y + b.y) / 2);
        Point ac = new Point((a.x + c.x) / 2, (a.y + c.y) / 2);

        if (level > 0) {
            render(g, a, ab, ac, level - 1);
            render(g, ab, b, bc, level - 1);
            render(g, ac, c, bc, level - 1);
        }
    }

    private void drawTraingle(Graphics g, Point a, Point b, Point c) {

        g.drawLine(a.x, a.y, b.x, b.y);
        g.drawLine(b.x, b.y, c.x, c.y);
        g.drawLine(a.x, a.y, c.x, c.y);

    }
}
