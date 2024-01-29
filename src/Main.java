import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Guess the flag");
    frame.setSize(1100, 600);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    JPanel subPanelImages = new JPanel();

    JLabel label = new JLabel("Pick a Level");

    JLabel img = new JLabel();
    img.setIcon(new ImageIcon("images/Flags/US.png"));
    JPanel imgPanel = new JPanel();

    JButton button1 = new JButton("Easy");
    JButton button2 = new JButton("Medium");
    JButton button3 = new JButton("Hard");
    JTextField textField = new JTextField("Enter a guess", 10);

    panel.add(label, BorderLayout.NORTH);
    subPanelImages.add(button1);
    subPanelImages.add(button2);
    subPanelImages.add(button3);
    imgPanel.add(img);
    panel.add(subPanelImages, BorderLayout.WEST);
    panel.add(textField, BorderLayout.SOUTH);
    panel.add(imgPanel, BorderLayout.CENTER);

    frame.add(panel);
    frame.setVisible(true);

  }
}
