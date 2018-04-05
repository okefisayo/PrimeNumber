import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class PrimeNumber extends JFrame {
	private JTextField number;
	private JButton prime;
	private JTextField result;
	private JLabel label;

	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_LENGTH = 200;

	public PrimeNumber(){
		setSize(FRAME_WIDTH, FRAME_LENGTH);
		createTextField();
	    createButton();
	    result = new JTextField(10);
	    result.setEditable(false);
	    createPanel();
	}
	public void createTextField(){
		label = new JLabel("Enter Number");
		number = new JTextField(10);
	}
	//create an action for the button to perform when clicked
	class CheckPrime implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String value = number.getText();
			int valueLength = value.length();
			//check if there is a value that is not integer 
			for (int i = 0;i < valueLength;i++){
				if(!Character.isDigit(value.charAt(i))){
					result.setText("Enter an integer");
					number.setText("");
					return; 
				}
			}
		
			int valueInt = Integer.parseInt(number.getText());
			if(valueInt == 1){
				result.setText("False");
			}
			else 
			{
				for(int i = 2;i<valueInt;i++){
					if(valueInt%i == 0){
						result.setText("False");
						return;
					}
				}
				result.setText("True");
			}
		}

	}
	public void createButton(){
		prime = new JButton("Prime?");
		ActionListener listener = new CheckPrime();
		prime.addActionListener(listener);

	}
	public void createPanel(){
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(number);
		panel.add(prime);
		panel.add(result);	
		add(panel);
	}
}
