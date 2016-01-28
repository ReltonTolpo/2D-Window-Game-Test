package pkg2d.window.game;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Main extends JFrame implements ActionListener{

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
        setLayout(new FlowLayout());
        //Creates Buttons
        JButton begin = new JButton("I will do stuff!");
        JButton moreBut = new JButton("Batman");
        begin.addActionListener(this);
        moreBut.addActionListener(this);
        add(begin);
        add(moreBut);
        //;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String name = e.getActionCommand();
        if(name.equals("I will do stuff!")){
            System.out.println("Button has been clicked");
        }else if(name.equals("Batman")){
            System.out.println("I'm BATMAN");
        }
    }
    
}