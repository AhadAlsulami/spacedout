package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Observatories extends JFrame {
    private JButton back;
    private JButton check;
    private Hubble hubble;
    private Spitzer spitzer;
    private Chandra chandra;
    
    public Observatories (){
        //Setting the frame:
        setTitle("Observatories");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
//_____________________________________________________________________________

        //buttons for buttons panel
        hubble = new Hubble();
        spitzer = new Spitzer();
        chandra = new Chandra();
        check = new JButton("Check");
        back = new JButton();
        
        ImageIcon bButton;
        bButton = new ImageIcon(this.getClass().getResource("backButton.png"));
        back.setIcon(bButton);
        back.setBackground(new java.awt.Color(4, 15, 46));
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        
        check.setBackground(new java.awt.Color(217, 121, 115));
        check.setBorderPainted(false);
        
        //Panels for button & Labels:
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        
        //Main panels
        JPanel picPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        
        //Labels for the title panel
        JLabel title = new JLabel ("Observatories");
        JLabel use = new JLabel ("<html>Q.1: Only takes pictures in shades of black and white."
                + "<br>Q.2: Needed to be simultaneously \"cold\" and \"warm\" to function properly."
                + "<br>Q.3: Was designed to detect X-ray emission from very hot regions.</html>");

//------------------------------------------------------------------------------
        //picture panel
        picPanel.setBounds(0, 0, 265, 412);
        picPanel.setBackground(new java.awt.Color(4, 15, 46));
        ImageIcon observ = new ImageIcon(this.getClass().getResource("observ.png"));
        JLabel observLabel = new JLabel(observ);
        picPanel.add(back);
        picPanel.add(observLabel);
        
        //title panel
        titlePanel.setBounds(260, 0, 490, 180);
        titlePanel.setBackground(new java.awt.Color(4, 15, 46));
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setForeground(Color.WHITE);
        title.setHorizontalAlignment(JLabel.CENTER);
        use.setFont(new Font("", Font.LAYOUT_LEFT_TO_RIGHT, 14));
        use.setHorizontalAlignment(JLabel.CENTER);
        use.setForeground (new java.awt.Color(69, 123, 188));
        
        //buttons panel
        buttonsPanel.setBounds(260, 180, 490, 298);
        buttonsPanel.setLayout(new GridLayout(2,3));
        buttonsPanel.setBackground(new java.awt.Color(4, 15, 46));
        p1.setBackground(new java.awt.Color(4, 15, 46));
        p2.setBackground(new java.awt.Color(4, 15, 46));
        p3.setBackground(new java.awt.Color(4, 15, 46));
        p4.setBackground(new java.awt.Color(4, 15, 46));
        p5.setBackground(new java.awt.Color(4, 15, 46));
        p6.setBackground(new java.awt.Color(4, 15, 46));
        
//------------------------------------------------------------------------------
        //adding panels to frame
        add(picPanel);
        add(titlePanel);
        add(buttonsPanel);
        
        //adding buttons to their panels
        p1.add(hubble);
        p2.add(spitzer);
        p3.add(chandra);
        p5.add(check);
//------------------------------------------------------------------------------
        //adding components to thr main panels 
        titlePanel.add(title);
        titlePanel.add(use);
        buttonsPanel.add(p1);
        buttonsPanel.add(p2);
        buttonsPanel.add(p3);
        buttonsPanel.add(p4);
        buttonsPanel.add(p5);
        buttonsPanel.add(p6);
        
        back.addActionListener(new ButtonListener());
        check.addActionListener(new ButtonListener());
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            if (e.getSource() == back){
                setVisible(false);
                new SpacedOut();
            }
            else if (e.getSource() == check){
                String Check = "Q.1: "+ hubble.answersQ1() +"\n"
                        +"Q.2: " + spitzer.answersQ2() +"\n" 
                        + "Q.3: "+ chandra.answersQ3();
                JOptionPane.showMessageDialog(null, Check);
            }
        }
    }
}
