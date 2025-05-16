import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame{
    public GUI(){
        setTitle("My first gui");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);

        JButton jButton = new JButton ("click me");
    }

    
}