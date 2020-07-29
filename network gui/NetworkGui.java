import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
import javax.swing.border.*;

public class NetworkGui extends JFrame{
    
    JButton button1, button2;
    JLabel label1, label2, label3, label4, label5, label6, label7;
    JTextField textField1, textField2, textField3, textField4, textField6; //textField5, , textField7;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton event, message, photo;
    JSlider howManyTimes;
    JTextArea textArea1;
    JScrollPane scrollbar1;
    NewsFeed feed = new NewsFeed();
    
    double number1, number2, number3, number4, number5, totalCalc;
    
    public static void main(String[] args){
        
        new NetworkGui();
        
    }
    
    public NetworkGui(){
        this.setSize(275, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        this.setTitle("Network Feeds");    
        JPanel thePanel = new JPanel();

        // radio buttons
        event = new JRadioButton("Event");
        message = new JRadioButton("Message");
        photo = new JRadioButton("Photo");
       
        ButtonGroup operation = new ButtonGroup();
        
        operation.add(event);
        operation.add(message);
        operation.add(photo);
        
        JPanel operPanel = new JPanel();
        
        Border operBorder = BorderFactory.createTitledBorder("Post");
        
        operPanel.setBorder(operBorder);
        
        operPanel.add(event);
        operPanel.add(message);
        operPanel.add(photo);
        
        thePanel.add(operPanel);
        
        ListenForButton Radio1 = new ListenForButton();
        event.addActionListener(Radio1);
        photo.addActionListener(Radio1);
        message.addActionListener(Radio1);
        
        
        //labels
        label6 = new JLabel("Author");
        label1 = new JLabel("Event Type");
        label2 = new JLabel("Message");
        label3 = new JLabel("Image Name");
        label4 = new JLabel("Caption");
        
        //text fields
        textField6 = new JTextField("", 15);
        textField1 = new JTextField("", 15);                
        textField2 = new JTextField("", 15);
        textField3 = new JTextField("", 15);
        textField4 = new JTextField("", 15);
        
        
        //text areas
        textArea1 = new JTextArea("", 15, 15);
        
        
        //buttons
        button1 = new JButton("Submit");
        button2 = new JButton("Show");
        
        //scrollbar
        scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        //layout
        thePanel.add(label6);
        thePanel.add(textField6);
        thePanel.add(label1);
        thePanel.add(textField1); 
        thePanel.add(label2);
        thePanel.add(textField2);
        thePanel.add(label3);
        thePanel.add(textField3);
        thePanel.add(label4);
        thePanel.add(textField4);
        thePanel.add(button1);
        thePanel.add(button2);
        thePanel.add(scrollbar1);
        
        //visibility
        label1.setVisible(false);
        label2.setVisible(false);        
        label3.setVisible(false);
        label4.setVisible(false);
        
        textField1.setVisible(false);
        textField2.setVisible(false);
        textField3.setVisible(false);        
        textField4.setVisible(false);
        
        button1.setVisible(true);
        button2.setVisible(true);
        textArea1.setVisible(true);
        
        //listener
        ListenForButton lForButton = new ListenForButton();
        button1.addActionListener(lForButton);
        button2.addActionListener(lForButton);
        
       
        
        
        
        
        
        this.add(thePanel);
        this.setVisible(true);
    }
    
    private class ListenForButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(event.isSelected()) { 
                label1.setVisible(true);
                textField1.setVisible(true);
                label2.setVisible(false);
                textField2.setVisible(false);
                label3.setVisible(false);
                textField3.setVisible(false);
                label4.setVisible(false);
                textField4.setVisible(false);
                button1.setVisible(true);
                button2.setVisible(true);
                textArea1.setVisible(true);
                }
            
            else if(message.isSelected()) { 
                label1.setVisible(false);
                textField1.setVisible(false);
                label2.setVisible(true);
                textField2.setVisible(true);
                label3.setVisible(false);
                textField3.setVisible(false);
                label4.setVisible(false);
                textField4.setVisible(false);
                button1.setVisible(true);
                button2.setVisible(true);
                textArea1.setVisible(true);
            }
            
            else if(photo.isSelected()){ 
                label1.setVisible(false);
                textField1.setVisible(false);
                label2.setVisible(false);
                textField2.setVisible(false);
                label3.setVisible(true);
                textField3.setVisible(true);
                label4.setVisible(true);
                textField4.setVisible(true);
                button1.setVisible(true);
                button2.setVisible(true);
                textArea1.setVisible(true);
            }
            if(e.getSource() == button1){
                if(event.isSelected()){
                    EventPost post = new EventPost(textField6.getText(), textField1.getText());
                    feed.addPost(post);
                    textField6.requestFocus();
                    textField6.setText("");
                    textField1.setText("");
                }
                if(message.isSelected()){
                    MessagePost post = new MessagePost(textField6.getText(), textField2.getText());
                    feed.addPost(post);
                    textField6.requestFocus();
                    textField6.setText("");
                    textField2.setText("");
                }
                if(photo.isSelected()){
                    PhotoPost post = new PhotoPost(textField6.getText(), textField3.getText(), textField4.getText());
                    feed.addPost(post);
                    textField6.requestFocus();
                    textField6.setText("");
                    textField3.setText("");
                    textField4.setText("");
                }
            }
            if(e.getSource() == button2) {
                textArea1.setText("\n" + feed.output());
            }
        }
        }
        
    }