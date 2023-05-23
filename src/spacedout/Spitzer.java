package spacedout;
import java.awt.*;
import javax.swing.*;

public class Spitzer extends JPanel {
    private JRadioButton hubble;
    private JRadioButton spitzer;
    private JRadioButton chandra;
    private ButtonGroup bg;
    
    public Spitzer (){
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
        setBorder(BorderFactory.createTitledBorder(null, "Q.2", 0, 0, new Font("times new roman",Font.PLAIN,15), Color.cyan));
        
        add(hubble);
        add(spitzer);
        add(chandra);
    }
    
    public String answersQ2 (){
        String answer2 = "";
        
        if (hubble.isSelected())
            answer2 = "  Wrong !";
        else if (spitzer.isSelected())
            answer2 = "  Correct !";
        else if (chandra.isSelected())
            answer2 = "  Wrong !";
        
        return answer2;
    }
}
