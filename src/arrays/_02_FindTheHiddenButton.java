/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton [] buttons;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String positive= JOptionPane.showInputDialog("Enter a positive number!");
		int posnum= Integer.parseInt(positive);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons= new JButton[posnum];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < buttons.length; i++) {
			JButton button= new JButton();
			button.addActionListener(this);
			panel.add(button);
			window.add(panel);
			buttons[i]=button;
			
		}
			//6. initialize each JButton in the array
		//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
			//7. add the ActionListener to each JButton

			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setSize(1000, 300);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Find the hidden button!");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random randy= new Random();
		hiddenButton= randy.nextInt(posnum);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
buttons [hiddenButton].setText("ME");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	//
}
//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
		//16. Set the text of the JButton located at hiddenButton to be blank.
buttons [hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("clicked");
		JButton buttonClicked = (JButton)e.getSource();
		
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked==buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You Win!");
		}
		//18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null, "Try Again!");
		}
	}
}
