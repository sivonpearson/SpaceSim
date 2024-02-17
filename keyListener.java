import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class keyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {  
    }
    @Override
    public void keyPressed(KeyEvent e) {  
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            //Timers.togglePause();
        }
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            Timers.togglePause();
        }
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }
}


