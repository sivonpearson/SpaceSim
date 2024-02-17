import javax.swing.JFrame;
import java.awt.*;


public class Start {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Space Simulation");
        WndwGraphics wndwGraphics = new WndwGraphics();
        PlanetVariables planetVariables = new PlanetVariables();
        Timers timers = new Timers();
        
        frame.addKeyListener(new keyListener());
        frame.addMouseListener(new mouseListener());
        //frame.add(mouseAndKeyL);
        frame.add(wndwGraphics);
        frame.setFocusable(true); //
        frame.setSize(WndwGraphics.WINDOW_WIDTH, WndwGraphics.WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}





