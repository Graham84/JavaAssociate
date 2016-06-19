import javax.swing.JOptionPane;

public class InputDialogBox {
	public static void main(String[] args) {
		// Input:
		String name = JOptionPane.showInputDialog(null, "Enter Name: ",
				"Java GUI Developer", JOptionPane.INFORMATION_MESSAGE);
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter Age: ", "Java GUI Developer",
				JOptionPane.INFORMATION_MESSAGE));
		// Output:
		JOptionPane.showMessageDialog(null, "Name: " + name + "\n" + " Age: "
				+ age, "Java GUI Developer", JOptionPane.INFORMATION_MESSAGE);
	}// main
}// class
