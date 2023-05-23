package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Constellations extends JFrame{
    private JButton back;
    private JButton bigDipper;
    private JButton draco;
    private JButton cepheus;
    
    public Constellations(){
        //Setting the frame:
        setTitle("Constellations");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
//______________________________________________________________________________

        //buttons for buttons panel
        bigDipper = new JButton("Big Dipper");
        draco = new JButton("    Draco    ");
        cepheus = new JButton("  Cepheus ");
        back = new JButton();
        
        ImageIcon bButton;
        bButton = new ImageIcon(this.getClass().getResource("backButton.png"));
        back.setIcon(bButton);
        back.setBackground(new java.awt.Color(21, 42, 73));
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        
        bigDipper.setPreferredSize(new Dimension(150, 45));
        draco.setPreferredSize(new Dimension(150, 45));
        cepheus.setPreferredSize(new Dimension(150, 45));
        
        bigDipper.setBackground(new java.awt.Color(97, 100, 182));
        bigDipper.setBorderPainted(false);
        draco.setBackground(new java.awt.Color(97, 100, 182));
        draco.setBorderPainted(false);
        cepheus.setBackground(new java.awt.Color(97, 100, 182));
        cepheus.setBorderPainted(false);
        
        //Panels for button & Labels:
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        //Main panels
        JPanel picPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        
        //Labels for the title panel
        JLabel title = new JLabel ("Constellations");
        JLabel use = new JLabel ("Use your Imagination to Find them:");

//------------------------------------------------------------------------------
        //picture panel
        picPanel.setBounds(-2, -7, 290, 450);
        picPanel.setBackground(new java.awt.Color(16, 6, 31));
        ImageIcon planet = new ImageIcon(this.getClass().getResource("constela.png"));
        JLabel PlanetLabel = new JLabel(planet);
        picPanel.add(back);
        picPanel.add(PlanetLabel);
        
        //title panel
        titlePanel.setBounds(250, 0, 500, 155);
        titlePanel.setBackground(new java.awt.Color(16, 6, 31));
        title.setFont(new Font("Serif", Font.BOLD, 45));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.WHITE);
        
        use.setFont(new Font("Serif", Font.BOLD, 20));
        use.setHorizontalAlignment(JLabel.CENTER);
        use.setForeground(new java.awt.Color(177, 80, 154));
        
        
        //buttons panel
        buttonsPanel.setBounds(210, 153, 555, 258);
        buttonsPanel.setLayout(new GridLayout(3,1));
        buttonsPanel.setBackground(new java.awt.Color(16, 6, 31));
        p1.setBackground(new java.awt.Color(16, 6, 31));
        p2.setBackground(new java.awt.Color(16, 6, 31));
        p3.setBackground(new java.awt.Color(16, 6, 31));
        
//------------------------------------------------------------------------------
        //adding panels to frame
        add(picPanel);
        add(titlePanel);
        add(buttonsPanel);
        
        //adding buttons to their panels
        p1.add(bigDipper);
        p2.add(draco);
        p3.add(cepheus);

//------------------------------------------------------------------------------
        //adding components to thr main panels 
        titlePanel.add(title);
        titlePanel.add(use);
        buttonsPanel.add(p1);
        buttonsPanel.add(p2);
        buttonsPanel.add(p3);
        
        back.addActionListener(new ButtonListener());
        bigDipper.addActionListener(new ButtonListener());
        draco.addActionListener(new ButtonListener());
        cepheus.addActionListener(new ButtonListener());
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            if (e.getSource() == back){
                setVisible(false);
                new SpacedOut();
            }
            else if (e.getSource() == bigDipper){
                new BigDipper();
            }
            else if (e.getSource() == draco){
                new Draco();
            }
            else if (e.getSource() == cepheus){
                new Cepheus();
            }
        }
    }

}
