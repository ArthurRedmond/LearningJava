import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxDemonstration extends JFrame implements ItemListener
{
  FlowLayout flow = new FlowLayout();
  JLabel label = new JLabel("What would you like to drink?");
  JCheckBox coffee = new JCheckBox("Coffee", false);
  JCheckBox cola = new JCheckBox("Cola", false);
  JCheckBox milk = new JCheckBox("Milk", false);
  JCheckBox water = new JCheckBox("Water", false);
  public CheckBoxDemonstration()
  {
    super("CheckBoxDemonstration");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    label.setFont(new Font("Arial", Font.ITALIC, 22));
    coffee.addItemListener(this);
    cola.addItemListener(this);
    milk.addItemListener(this);
    water.addItemListener(this);
    add(label);
    add(coffee);
    add(cola);
    add(milk);
    add(water);
  }
  @Override
  public void itemStateChanged(ItemEvent check)
  {
    // Actions based on choic go here
  }
  public static void main(String[] args) {
    final int FRAME_WIDTH = 350;
    final int FRAME_HEIGHT = 120;
    CheckBoxDemonstration frame = new CheckBoxDemonstration();
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setVisible(true);
  }
}
