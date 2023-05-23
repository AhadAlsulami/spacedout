package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Resource extends JFrame {
    public Resource(){
        //Setting the frame:
        setTitle("Welcome");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel resPanel = new JPanel ();
        JPanel backPanel = new JPanel();
        
        
        ImageIcon welcome = new ImageIcon(this.getClass().getResource("res.png"));
        JLabel welLabel = new JLabel(welcome);
        resPanel.add(welLabel);
        
        
        resPanel.setBackground(new java.awt.Color(15, 0, 29));
        JButton goButton = new JButton();
        backPanel.add(goButton);
        add(resPanel, BorderLayout.CENTER);
        
       
        ImageIcon gButton;
        gButton = new ImageIcon(this.getClass().getResource("backButton.png"));
        goButton.setIcon(gButton);
        goButton.setBorderPainted(false);
        goButton.setContentAreaFilled(false);
        backPanel.setBackground(new java.awt.Color(15, 0, 29));

        add(backPanel, BorderLayout.NORTH);
        
        goButton.addActionListener(new GoListener());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    private class GoListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            setVisible(false);
            new Main();
        }
    }
}
