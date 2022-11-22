//java program to demonstrate awt and Key Event Handling
import java.awt.*;
import java.awt.event.*;
public class KeyListenerDemo extends Frame implements KeyListener {
    Label l;
    TextArea ta;
    KeyListenerDemo()
    {
    	l=new Label();
    	l.setBounds(20, 50, 100, 20);
    	ta=new TextArea();
    	ta.setBounds(20, 80, 300, 300);
    	ta.addKeyListener(this);
    	add(l);
    	add(ta);
    	setSize(400,400);
    	setLayout(null);
    	setVisible(true);
    }
    
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key Pressed");
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("Key Released");
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("Key Typed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new KeyListenerDemo();
	}
}
