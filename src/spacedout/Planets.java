package spacedout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Planets extends JFrame{
    private JButton back;
    private JButton calculate1;
    private JButton calculate2;
    public JTextField ageText;
    public JTextField weightText;
    
    public Planets() {
        //Setting the frame:
        setTitle("Planets");
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(new java.awt.Color(16, 6, 31));
        
//------------------------------------------------------------------------------

        //Main panels
        JPanel picPanel = new JPanel();
        JPanel titlePanel = new JPanel();
        JPanel componentPanel = new JPanel();
        JPanel cPanel1 = new JPanel();
        JPanel cPanel2 = new JPanel();
        JPanel cPanel3 = new JPanel();
        JPanel cPanel4 = new JPanel();
        JPanel cPanel5 = new JPanel();
        
        
        //Label for the title panel
        JLabel title = new JLabel ("  Planets  ");
        JLabel question = new JLabel ("Let's See How You'd Look Living on Different Planets!");
        JLabel age = new JLabel("Age");
        JLabel weight = new JLabel("Weight");
        
        age.setFont(new Font("Calibri", Font.BOLD, 25));
        weight.setFont(new Font("Calibri", Font.BOLD, 25));
        age.setForeground (new java.awt.Color(177, 80, 154));
        weight.setForeground (new java.awt.Color(177, 80, 154));
        
        ageText = new JTextField(10);
        weightText = new JTextField(10);
        
        back = new JButton();
        calculate1 = new JButton("Calculate Age");
        calculate2 = new JButton("Calculate Weight");
        
        calculate1.setBackground(new java.awt.Color(97, 100, 182));
        calculate1.setBorderPainted(false);
        
        calculate2.setBackground(new java.awt.Color(97, 100, 182));
        calculate2.setBorderPainted(false);
        
        ImageIcon bButton;
        bButton = new ImageIcon(this.getClass().getResource("backButton.png"));
        back.setIcon(bButton);
        back.setBackground(new java.awt.Color(4, 15, 46));
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
//------------------------------------------------------------------------------


        //picture panel
        
        picPanel.setBounds(-32, 0, 290, 415);
        picPanel.setBackground(new java.awt.Color(16, 6, 31));
        ImageIcon planet = new ImageIcon(this.getClass().getResource("Planet.png"));
        JLabel PlanetLabel = new JLabel(planet);
        picPanel.add(back);
        picPanel.add(PlanetLabel);
        
        //title panel
        titlePanel.setBounds(250, 0, 500, 155);
        titlePanel.setBackground(new java.awt.Color(16, 6, 31));
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setForeground(Color.WHITE);
        question.setFont(new Font("", Font.BOLD, 14));
        question.setHorizontalAlignment(JLabel.CENTER);
        question.setForeground (new java.awt.Color(69, 123, 188));
        
        
        //buttons panel
        componentPanel.setBounds(210, 153, 555, 258);
        componentPanel.setLayout(new GridLayout(5,2));
        componentPanel.setBackground(new java.awt.Color(16, 6, 31));
        cPanel1.setBackground(new java.awt.Color(16, 6, 31));
        cPanel2.setBackground(new java.awt.Color(16, 6, 31));
        cPanel3.setBackground(new java.awt.Color(16, 6, 31));
        cPanel4.setBackground(new java.awt.Color(16, 6, 31));
        cPanel5.setBackground(new java.awt.Color(16, 6, 31));
        
//------------------------------------------------------------------------------
 
        add(picPanel);
        add(titlePanel);
        add(componentPanel);
        
//------------------------------------------------------------------------------
        
        titlePanel.add(title);
        titlePanel.add(question);
        componentPanel.add(cPanel1);
        componentPanel.add(cPanel2);
        componentPanel.add(cPanel3);
        componentPanel.add(cPanel4);
        componentPanel.add(cPanel5);
        
        
        cPanel1.add(age);
        cPanel2.add(ageText);
        cPanel3.add(weight);
        cPanel4.add(weightText);
        cPanel5.add(calculate1);
        cPanel5.add(calculate2);
        
        back.addActionListener(new ButtonListener());
        calculate1.addActionListener(new ButtonListener());
        calculate2.addActionListener(new ButtonListener());
        
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    private class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e ){
            if (e.getSource() == back){
                setVisible(false);
                new SpacedOut();
            }
            else if (e.getSource() == calculate1){
                try {
                    //Write age into Binary File
                    int age = Integer.parseInt(ageText.getText());
                    DataOutputStream outputFile = new DataOutputStream(new FileOutputStream("Info1.dat"));
                    outputFile.writeInt(age);
                    outputFile.close();
                    
                    //Read age from Binary File
                    DataInputStream inputFile = new DataInputStream(new FileInputStream("Info1.dat"));
                    float a = inputFile.readInt();
                    JOptionPane.showMessageDialog(null, "Here's Your Age on Other Planets!\n" + "\n[Earth] = " + a + "\n"
                    +"[Mercury] = " + String.format("%.2f", a*365/88) + "\n"
                    +"[Venus] = " +String.format("%.2f", a*365/225)  + "\n"
                    +"[Mars] = " + String.format("%.2f", a*365/687) + "\n"
                    +"[Jupiter] = " + String.format("%.2f", a/12)+ "\n"
                    +"[Saturn] = " + String.format("%.2f", a/29.5)  + "\n"
                    +"[Uranus] = " +String.format("%.2f", a/84 ) + "\n"
                    +"[Neptune] = " +String.format("%.2f", a/165)   + "\n"
                    +"[Pluto] = " + String.format("%.2f", a/248) + "\n");
                    inputFile.close();
                }
                   catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                }   catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Wrong Input!");
                }
                
            }
            
            else if (e.getSource() == calculate2){
                try {
                    //Write age into Binary File
                    double weight = Double.parseDouble(weightText.getText());
                    DataOutputStream outputFile = new DataOutputStream(new FileOutputStream("Info2.dat"));
                    outputFile.writeDouble(weight);
                    outputFile.close();
                    
                    //Read age from Binary File
                    DataInputStream inputFile = new DataInputStream(new FileInputStream("Info2.dat"));
                    double w = inputFile.readDouble();
                    JOptionPane.showMessageDialog(null, "Here's Your Weight on Other Planets!\n" + "\n[Earth] = " + w + "\n"
                    +"[Mercury] = " + String.format("%.2f", w*0.38) + "\n"
                    +"[Venus] = " + String.format("%.2f", w*0.91)  + "\n"
                    +"[Mars] = " + String.format("%.2f", w*0.38) + "\n"
                    +"[Jupiter] = " + String.format("%.2f", w*2.34)+ "\n"
                    +"[Saturn] = " + String.format("%.2f", w*1.06)  + "\n"
                    +"[Uranus] = " +String.format("%.2f", w*0.92) + "\n"
                    +"[Neptune] = " +String.format("%.2f", w*1.19)   + "\n"
                    +"[Pluto] = " + String.format("%.2f", w*0.06) + "\n");
                    inputFile.close();
                }
                   catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                }   catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Wrong Input!");
                }
                
            }
        }
    }
}
