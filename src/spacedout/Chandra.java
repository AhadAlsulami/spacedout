package spacedout;
import java.awt.*;
import javax.swing.*;

public class Chandra extends JPanel {
    private JRadioButton hubble;
    private JRadioButton spitzer;
    private JRadioButton chandra;
    private ButtonGroup bg;
    
    public Chandra (){
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
        setBorder(BorderFactory.createTitledBorder(null, "Q.3", 0, 0, new Font("times new roman",Font.PLAIN,15), Color.cyan));
        
        add(hubble);
        add(spitzer);
        add(chandra);
    }
    
    public String answersQ3 (){
        String answer3 = "";
        
        if (hubble.isSelected())
            answer3 = "  Wrong !";
        else if (spitzer.isSelected())
            answer3 = "  Wrong !";
        else if (chandra.isSelected())
            answer3 = "  Correct !";
        
        return answer3;
    }
}
