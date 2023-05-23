package spacedout;
import java.awt.*;
import javax.swing.*;

public class Hubble extends JPanel {
    private JRadioButton hubble;
    private JRadioButton spitzer;
    private JRadioButton chandra;
    private ButtonGroup bg;
    
    public Hubble (){
        
        setLayout (new GridLayout (3,1));
        hubble = new JRadioButton("Hubble");
        spitzer = new JRadioButton("Spitzer");
        chandra = new JRadioButton("Chandra");
        bg = new ButtonGroup();
        setBackground(new java.awt.Color(4, 15, 46));
        
        bg.add(hubble);
        bg.add(spitzer);
        bg.add(chandra);
        
        hubble.setBackground(new java.awt.Color(4, 15, 46));
        hubble.setForeground (Color.white);
        spitzer.setBackground(new java.awt.Color(4, 15, 46));
        spitzer.setForeground (Color.white);
        chandra.setBackground(new java.awt.Color(4, 15, 46));
        chandra.setForeground (Color.white);
        setBorder(BorderFactory.createTitledBorder(null, "Q.1", 0, 0, new Font("times new roman",Font.PLAIN,15), Color.cyan));
        
        add(hubble);
        add(spitzer);
        add(chandra);
    }
    
    public String answersQ1 (){
        String answer1 = "";
        
        if (hubble.isSelected())
            answer1 = "  Correct !";
        else if (spitzer.isSelected())
            answer1 = "  Wrong !";
        else if (chandra.isSelected())
            answer1 = "  Wrong !";
        
        return answer1;
    }
}

