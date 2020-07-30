import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUI {
  private JFrame frame;
  
  private JTextField actionTime;
  
  private JTextField itemsPer;
  
  private JTextField unitPrice;
  
  private JTextField slots;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              GUI window = new GUI();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public GUI() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.setBounds(100, 100, 450, 300);
    this.frame.setDefaultCloseOperation(3);
    this.frame.getContentPane().setLayout((LayoutManager)null);
    this.frame.getContentPane().setBackground(Color.darkGray);
    this.frame.setTitle("Minion Calculator; Made by marvalarva2929");
    this.actionTime = new JTextField();
    this.actionTime.setBackground(new Color(192, 192, 192));
    this.actionTime.setBounds(86, 34, 309, 24);
    this.frame.getContentPane().add(this.actionTime);
    this.actionTime.setColumns(15);
    this.itemsPer = new JTextField();
    this.itemsPer.setBackground(new Color(192, 192, 192));
    this.itemsPer.setColumns(15);
    this.itemsPer.setBounds(110, 68, 285, 24);
    this.frame.getContentPane().add(this.itemsPer);
    this.unitPrice = new JTextField();
    this.unitPrice.setBackground(new Color(192, 192, 192));
    this.unitPrice.setColumns(15);
    this.unitPrice.setBounds(76, 102, 319, 24);
    this.frame.getContentPane().add(this.unitPrice);
    this.slots = new JTextField();
    this.slots.setBackground(new Color(192, 192, 192));
    this.slots.setColumns(15);
    this.slots.setBounds(86, 136, 309, 24);
    this.frame.getContentPane().add(this.slots);
    final JLabel momo = new JLabel("");
    momo.setFont(new Font("Tahoma", 0, 15));
    momo.setForeground(new Color(192, 192, 192));
    momo.setBounds(211, 193, 215, 35);
    this.frame.getContentPane().add(momo);
    JButton calc = new JButton("CALCULATE");
    calc.setBackground(new Color(192, 192, 192));
    calc.setForeground(new Color(0, 0, 0));
    Border border = BorderFactory.createLineBorder(Color.green);
    calc.setBorder(border);
    calc.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            try {
              float time = Float.parseFloat(GUI.this.actionTime.getText());
              float items = Float.parseFloat(GUI.this.itemsPer.getText());
              float price = Float.parseFloat(GUI.this.unitPrice.getText());
              float slot = Float.parseFloat(GUI.this.slots.getText());
              float money = (86400.0F / time * items * price + 138240.0F / time) * slot;
              String moneyParsed = Float.toString(money);
              momo.setText(String.valueOf(moneyParsed) + " coins per day");
            } catch (Exception e1) {
              JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
            } 
          }
        });
    calc.setBounds(10, 180, 178, 55);
    this.frame.getContentPane().add(calc);
    JLabel ActionLB = new JLabel("Action Time:");
    ActionLB.setForeground(new Color(152, 251, 152));
    ActionLB.setFont(new Font("Tahoma", 0, 13));
    ActionLB.setBackground(new Color(128, 128, 128));
    ActionLB.setLabelFor(this.actionTime);
    ActionLB.setBounds(5, 36, 89, 19);
    this.frame.getContentPane().add(ActionLB);
    JLabel itemsLB = new JLabel("Items Per Action:");
    itemsLB.setFont(new Font("Tahoma", 0, 13));
    itemsLB.setForeground(new Color(152, 251, 152));
    itemsLB.setLabelFor(this.itemsPer);
    itemsLB.setBackground(Color.GRAY);
    itemsLB.setBounds(5, 73, 105, 19);
    this.frame.getContentPane().add(itemsLB);
    JLabel PriceLB = new JLabel("Unit Price:");
    PriceLB.setForeground(new Color(144, 238, 144));
    PriceLB.setFont(new Font("Tahoma", 0, 13));
    PriceLB.setLabelFor(this.unitPrice);
    PriceLB.setBackground(Color.GRAY);
    PriceLB.setBounds(5, 104, 70, 19);
    this.frame.getContentPane().add(PriceLB);
    JLabel slotsLB = new JLabel("Minion Slots:");
    slotsLB.setLabelFor(this.slots);
    slotsLB.setForeground(new Color(152, 251, 152));
    slotsLB.setFont(new Font("Tahoma", 0, 13));
    slotsLB.setBackground(new Color(192, 192, 192));
    slotsLB.setBounds(5, 136, 79, 19);
    this.frame.getContentPane().add(slotsLB);
  }
}
