import java.util.*;
import java.io.*;
import java.awt.event.*; // for action events
import java.awt.*; // for layout managers
import javax.swing.*;

//Viraj Patel

public class password extends JFrame
{
	public static void main(String [] args)
	{
		JFrame pass = new JFrame();
		JFrame main = new JFrame();

		JButton click = new JButton("Button");

		pass.add(click);

		pass.setVisible(true);
		main.setVisible(false);
		pass.pack();
		main.pack();
		click.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				pass.setVisible(false);
				main.setVisible(true);
				JOptionPane.showMessageDialog(pass, "Fuck Off");
			}
		});

	}
}