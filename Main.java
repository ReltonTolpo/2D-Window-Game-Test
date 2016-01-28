package pkg2d.window.game;

import javax.swing.JFrame;

public class Main extends JFrame{

    private static final long serialVersionUID = 1L;
    
    public static void main(String[] args) {
        
        new Main().setVisible(true);
        
    }
    private Main(){
        //Creates Window
        super("Java2dWindow - Relton");
        setSize(1024, 768); //800 x 600
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //;
    }
    
}
