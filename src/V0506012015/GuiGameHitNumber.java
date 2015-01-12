package GuiVjezba;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;




public class GuiGameHitNumber {
	static int [] array = new int[10000];
	static int counter, start, end, mid;

	public static void main(String[] args) {
		JFrame window = new JFrame("HitTheNumber");

		
		
		window.setSize(400, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		JButton button = new JButton("M");
		window.add(button);
		button.setSize(60, 25);
		button.setLocation(50, 170);
		button.setVisible(true);

		JButton button2 = new JButton("V");
		window.add(button2);
		button2.setSize(60, 25);
		button2.setLocation(250, 170);
		button2.setVisible(true);

		JButton button1 = new JButton("T");
		window.add(button1);
		button1.setSize(60, 25);
		button1.setLocation(150, 170);
		button1.setVisible(true);
		
		JTextField text = new JTextField(10);
		window.add(text);
		text.setText(" " + randomNumber(0, 10000));
		text.setSize(70, 50);
		text.setLocation(150, 70);
		text.setVisible(true);
		
		ButtonHandler listener = new ButtonHandler();
		
		for(int i = 0; i < array.length; i++){
			array[i];
		}
		


	}

	private static int randomNumber(int start, int end) {

		int number = (int) (start + Math.random() * (end - start + 1));
		return number;
	}

	public static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton click = (JButton) e.getSource();
		}
	}

}
