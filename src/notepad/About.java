package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener
{
    About()
    {
        setSize(400, 400);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        //adding the application icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notelar.png"));
        Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(10,10,200,80);
        add(headerIcon);
        //adding the label section
        JLabel text = new JLabel("<html>This Project is made by Anil Sonawane.<br>It is Desktop Based Application<br>created by using Java</html>");
        text.setBounds(60,80,250,90);
        text.setFont(new Font("AERIAL",Font.PLAIN,14));
        add(text);
        //
        JButton b1 = new JButton("OK");
        b1.setBounds(150,250,120,25);
        b1.addActionListener(this);
        add(b1);
          
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }
    
    public static void main(String [] args)
    {
        new About();
    }
}
