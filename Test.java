import javax.swing.JFrame;
public class Test {
	public static void main(String[] args){
		System.out.println("hello");
		JFrame frame = new PrimeNumber();
		frame.setTitle("Prime Number Checker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}