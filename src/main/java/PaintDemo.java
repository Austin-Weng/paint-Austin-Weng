import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaintDemo {
    JFrame frame;
    DrawingPanel dPanel;

    // This is the constructor which sets up the JFrame
    // and all other components and containers
    public PaintDemo() {
        // Set up JFrame
        frame = new JFrame("Paint Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add DrawingPanel to CENTER
        dPanel = new DrawingPanel();
        frame.add(dPanel);

        // Set the size and set the visibility
        frame.pack();
        frame.setVisible(true);
    }

    // Main method just creates a PaintDemo object
    public static void main(String[] args) {
        PaintDemo x = new PaintDemo();
    }

    class DrawingPanel extends JPanel {
        // Constructor sets up DrawingPanel
        public DrawingPanel() {
            setBackground(Color.WHITE);
        }

        // Sets the size of the DrawingPanel, so frame.pack() considers
        // its preferred size when sizing the JFrame
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        // This is the method that draws everything
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.fillRect(200, 100, 50, 50);
            g.fillOval(200, 60, 50, 75);
            g.fillOval(200, 135, 15, 30);
            g.fillOval(235, 135, 15, 30);
            g.fillRect(185, 95, 15, 35);
            g.setColor(Color.white);
            g.fillOval(225, 75, 40, 20);
            g.setColor(Color.black);
            g.drawOval(225, 75, 40, 20);
        }
    }
}
