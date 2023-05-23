package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    public Main(){
        //Setting the frame:
        setTitle("Welcome");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel welcomingPanel = new JPanel ();
        JPanel goPanel = new JPanel();
        
        
        ImageIcon welcome = new ImageIcon(this.getClass().getResource("welcome.png"));
        JLabel welLabel = new JLabel(welcome);
        welcomingPanel.add(welLabel);
        
        
        welcomingPanel.setBackground(new java.awt.Color(26, 8, 54));
        JButton goButton = new JButton();
        goPanel.add(goButton);
        add(welcomingPanel, BorderLayout.CENTER);
        
       
        ImageIcon gButton;
        gButton = new ImageIcon(this.getClass().getResource("GoButton.png"));
        goButton.setIcon(gButton);
        goButton.setBackground(new java.awt.Color(4, 15, 46));
        goButton.setBorderPainted(false);
        goButton.setContentAreaFilled(false);
        goPanel.setBackground(new java.awt.Color(26, 8, 54));

        add(goPanel, BorderLayout.SOUTH);
        
        goButton.addActionListener(new GoListener());
        
        /**
         * everything about the menu bar is down here
         */
        JMenuBar menuBar = new JMenuBar();
        JMenu filemenu = new JMenu ("File");
        JMenu moremenu = new JMenu ("More");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem reItem = new JMenuItem("Resource");
       
        //building menu bar
        menuBar.add(filemenu);
        menuBar.add(moremenu);
        setJMenuBar(menuBar);
        
        //building the file 
        exitItem.setMnemonic(KeyEvent.VK_E);
        exitItem.addActionListener(new ExitListener());
        filemenu.add(exitItem);
        
        //building the more 
        moremenu.add(reItem);
        reItem.addActionListener(new ReListener());
        
        
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    private class ExitListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            System.exit(0);
        }
    }
    
    private class ReListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            setVisible(false);
            new Resource();
        }
    }
    
    private class GoListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            setVisible(false);
            new SpacedOut();
        }
    }
    
    
    public static void main(String[] args) {
        new Main();
    }
}
