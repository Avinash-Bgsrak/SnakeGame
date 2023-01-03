
package SnakeGame;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Avinash Kumar
 */
public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("SnakeGame(by Avinash)");
        frame.setBounds(10,10,910,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
