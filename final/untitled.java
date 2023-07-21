//RUN ME


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//https://api.funtranslations.com/translate/yoda.json?text=Master%20Obiwan%20has%20lost%20a%20planet

public class untitled implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Quote or Translation");
    private JFrame frame = new JFrame();
    
    private testTest thing = new testTest();
    private space spaceSpacer = new space();
    private space spaceSpacer2= new space();
    private space spaceSpacer3= new space();
    
    
    private JButton button;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTextField myTextField;

    public untitled() {
        

        // the clickable button
        button = new JButton("Konya");
        button2 = new JButton("Yoida");
        button3 = new JButton("Pirete");
        button4 = new JButton("Sith");
        myTextField = new JTextField("Enter");
        
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button.addActionListener(this);
        
        
        button.setSize(10, 10);
        button.setBounds(50, 300, 20, 20);
        
        button2.setSize(50, 50);
        button2.setBounds(50, 50, 120, 100);
        
        button3.setSize(100, 50);
        button3.setBounds(200, 50, 120, 100);
        
        button4.setSize(100, 50);
        button4.setBounds(350, 50, 120, 100);

        // the panel with the button and text
        JPanel panel = new JPanel(new BorderLayout());
        //panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        
        frame.add(myTextField,BorderLayout.SOUTH);
        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        panel.add(label,BorderLayout.SOUTH);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1200, 500);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource() == button){
            spaceSpacer = new space();
            label.setText("");
            label.setText(thing.testTest("https://api.kanye.rest/"));
            myTextField.setText("");
            
        }
        
        if(e.getSource() == button2){
            spaceSpacer = new space();
            String text = spaceSpacer.space(myTextField.getText());
            String temp = thing.testTest("https://api.funtranslations.com/translate/yoda.json?text="+text);
            label.setText("");
            label.setText(spaceSpacer2.translation(temp));
            myTextField.setText("");
            
        }
        
        if(e.getSource() == button3){
            spaceSpacer = new space();
            String text = spaceSpacer.space(myTextField.getText());
            String temp = thing.testTest("https://api.funtranslations.com/translate/pirate.json?text="+text);
            label.setText("");
            label.setText(spaceSpacer2.translation(temp));
            myTextField.setText("");
            
        }
        
         if(e.getSource() == button4){
            spaceSpacer = new space();
            String text = spaceSpacer.space(myTextField.getText());
            String temp = thing.testTest("https://api.funtranslations.com/translate/sith.json?text="+text);
            label.setText("");
            label.setText(spaceSpacer2.translation(temp));
            myTextField.setText("");
            
        }
        
        //
        
        
    }

    // create one Frame
    public static void main(String[] args) {
        new untitled();
    }
}



