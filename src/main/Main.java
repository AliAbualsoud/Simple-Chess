package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame window = new JFrame("Simple Chess");
        
        // Set default close operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Add GamePanel to the window
        GamePanel gp = new GamePanel ();
        window.add(gp);
        window.pack();
        
        // Set window properties
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        
        // Make the window visible
        window.setVisible(true);
        
        gp.launchGame();
    }
}
