//java program to demonstrate basic swing application by extending JFrame
import javax.swing.*;
public class JButtonDemo extends JFrame {
    JFrame f;
    JButtonDemo()
    {
    	JButton b=new JButton("Submit");
    	b.setBounds(130, 100, 100, 40);
    	add(b);
    	setSize(400,500);
    	setLayout(null);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new JButtonDemo();
	}

}
