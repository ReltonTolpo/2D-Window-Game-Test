package pkg2d.window.game;

//Imports
import java.awt.*;
import java.awt.event.*;
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
        setLayout(new GridBagLayout()); //More Layouts = Default, FlowLayout, GridLayout, GridBagLayout, BorderLayout
        //Creates Buttons
        JButton begin = new JButton("I will do stuff!");
        begin.addActionListener(this);
        begin.setActionCommand("begin");
        add(begin);
        //Creates Batman
        JButton moreBut = new JButton("Batman");
        moreBut.addActionListener(this);
        moreBut.setActionCommand("batman");
        add(moreBut);
        //;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String name = e.getActionCommand();
        if(name.equals("begin")){
            System.out.println("Button has been clicked");
        }else if(name.equals("batman")){
            System.out.println("I'M BATMAN!");
        }
    }
    
}

//GO to https://www.youtube.com/watch?v=ww-WxPkKMio for troll