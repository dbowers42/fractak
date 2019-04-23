package fractal;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Fractal f = new Fractal(400, 400);

        add(f);

        setSize(400, 400);
    }


}
