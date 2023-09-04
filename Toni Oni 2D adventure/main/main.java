package main;

import javax.swing.JFrame;

public class main {
    
//main not accepted mainTO is accetped but wont pull up game window ? also key handler will not move character tf 
//is going on 
    public static void mainTO ( String [] args)   {
  
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("ToniOni");

        GamePanelTO gamePanelTO = new GamePanelTO();
        window.add(gamePanelTO);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanelTO.startGameThread();


    }
} 