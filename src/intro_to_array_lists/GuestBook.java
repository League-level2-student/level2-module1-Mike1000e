package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static JButton addName = new JButton();
	static JButton viewNames = new JButton();
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static ArrayList<String> guests;
	public static void main(String [] args) {
		new GuestBook().Listener();
		guests = new ArrayList<String>();
		
	}
	void Listener() {
		addName.addActionListener(this);
		addName.setText("Add Name");
		viewNames.addActionListener(this);
		viewNames.setText("View Names");
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.setVisible(true);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addName)) {
			guests.add(JOptionPane.showInputDialog(null, "Type in a name"));
			System.out.println(guests);
			
		}
		
	}
}
