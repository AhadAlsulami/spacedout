package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class SpacedOut extends JFrame{
    private JButton back;
    private JButton planets;
    private JButton constellations;
    private JButton observatories;
    
    public SpacedOut(){
        //Setting the frame:
        setTitle("Spaced Out!");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(new java.awt.Color(4, 15, 46));
//______________________________________________________________________________

        //buttons for buttons panel
        planets = new JButton();
        constellations = new JButton();
        observatories = new JButton();
        back = new JButton();
        
        ImageIcon pButton;
        pButton = new ImageIcon(this.getClass().getResource("PlanetsButton.png"));
        planets.setIcon(pButton);
        planets.setBackground(new java.awt.Color(4, 15, 46));
        planets.setBorderPainted(false);
        planets.setContentAreaFilled(false);
        
        ImageIcon cButton;
        cButton = new ImageIcon(this.getClass().getResource("ConstButton.png"));
        constellations.setIcon(cButton);
        constellations.setBackground(new java.awt.Color(4, 15, 46));
        constellations.setBorderPainted(false);
        constellations.setContentAreaFilled(false);
        
        ImageIcon oButton;
        oButton = new ImageIcon(this.getClass().getResource("ObservButton.png"));
        observatories.setIcon(oButton);
        observatories.setBackground(new java.awt.Color(4, 15, 46));
        observatories.setBorderPainted(false);
        observatories.setContentAreaFilled(false);
        
        ImageIcon bButton;
        bButton = new ImageIcon(this.getClass().getResource("backButton.png"));
        back.setIcon(bButton);
        back.setBackground(new java.awt.Color(4, 15, 46));
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        
        //Labels to describe the the buttons
        JLabel b1 = new JLabel ("Planets");
        JLabel b2 = new JLabel ("Constellations");
        JLabel b3 = new JLabel ("observatories");
        b1.setForeground (new java.awt.Color(69, 123, 188));
        b2.setForeground (new java.awt.Color(69, 123, 188));
        b3.setForeground (new java.awt.Color(69, 123, 188));
        
        //Panels for button & Labels:
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        //Main panels
        JPanel picPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        
        //Labels for the title panel
        JLabel greeting = new JLabel ("<html><br>Greetings, Earthling!<html>");
        JLabel choose = new JLabel ("<html>Choose Your Destination:</html>");

//------------------------------------------------------------------------------
        //picture panel
        picPanel.setBounds(0, 0, 266, 412);
        picPanel.setBackground(new java.awt.Color(4, 15, 46));
        ImageIcon astro = new ImageIcon(this.getClass().getResource("Astro.png"));
        JLabel AstroLabel = new JLabel(astro);
        picPanel.add(back);
        picPanel.add(AstroLabel);
       
        
        //title panel
        titlePanel.setBounds(260, 0, 490, 200);
        titlePanel.setBackground(new java.awt.Color(4, 15, 46));
        greeting.setFont(new Font("Serif", Font.BOLD, 45));
        greeting.setForeground (Color.white);
        choose.setFont(new Font("Serif", Font.BOLD, 20));
        choose.setForeground (new java.awt.Color(177, 80, 154));
        greeting.setHorizontalAlignment(JLabel.CENTER);
        choose.setHorizontalAlignment(JLabel.CENTER);
        
        
        //buttons panel
        buttonsPanel.setBounds(266, 163, 480, 250);
        buttonsPanel.setLayout(new GridLayout(1,3));
        buttonsPanel.setBackground(new java.awt.Color(4, 15, 46));
        p1.setBackground(new java.awt.Color(4, 15, 46));
        p2.setBackground(new java.awt.Color(4, 15, 46));
        p3.setBackground(new java.awt.Color(4, 15, 46));
//------------------------------------------------------------------------------
        //adding panels to frame
        add(picPanel);
        add(titlePanel);
        add(buttonsPanel);
        
        //adding buttons to their panels
        p1.add(planets);
        p2.add(constellations);
        p3.add(observatories);
        //adding labels to the same buttons panel
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
//------------------------------------------------------------------------------
        //adding components to thr main panels 
        titlePanel.add(greeting);
        titlePanel.add(choose);
        buttonsPanel.add(p1);
        buttonsPanel.add(p2);
        buttonsPanel.add(p3);
        
        
        
        
        
        
        back.addActionListener(new ButtonListener());
        planets.addActionListener(new ButtonListener());
        constellations.addActionListener(new ButtonListener());
        observatories.addActionListener(new ButtonListener());
        
        
        
        
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            if (e.getSource() == back){
                setVisible(false);
                new Main();
            }
            else if (e.getSource() == planets){
                setVisible(false);
                new Planets();
            }
            else if (e.getSource() == constellations){
                setVisible(false);
                new Constellations();
            }
            else if (e.getSource() == observatories){
                setVisible(false);
                new Observatories();
            }
        }
    }
}
