package spacedout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cepheus extends JFrame implements MouseMotionListener{
    Cepheus(){
        addMouseMotionListener(this);
        ImageIcon star = new ImageIcon(this.getClass().getResource("cepheus1.png"));
        JLabel starl = new JLabel(star);
        starl.setSize(400, 400);
        add(starl);
        JPanel panel = new JPanel();
        JButton button = new JButton("Check");
        panel.add(button);
        panel.setBackground(new java.awt.Color(13, 18, 31));
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorderPainted(false);
        add(panel, new BorderLayout().SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        button.addActionListener(new buttonListener());
    }
    
    public void mouseDragged(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillOval(e.getX(), e.getY(), 4, 4);
    }
    
    public void mouseMoved(MouseEvent e){
    }
   
    private class buttonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            setVisible(false);
            new Cepheus2();
        }
    }
     
}

class Cepheus2 extends JFrame {
    Cepheus2(){
        ImageIcon star = new ImageIcon(this.getClass().getResource("cepheus2.png"));
        JLabel starl = new JLabel(star);
        starl.setSize(400, 400);
        add(starl);
        JPanel panel = new JPanel();
        JButton button = new JButton("OK");
        panel.add(button);
        panel.setBackground(new java.awt.Color(13, 18, 31));
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorderPainted(false);
        add(panel, new BorderLayout().SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        button.addActionListener(new buttonListener());
    }
    private class buttonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            setVisible(false);
        }
    }
}
