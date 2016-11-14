/**
 * @author Brandon Campbell
 * @version 1.0
 * The character creator is intended for the use of creating a level 1 5th edition
 * Dungeons & Dragons character. It will automatically calculate the remaining fields
 * for you to fill in once you provide the program with the six base stats needed.
 */
package dndcharactercreator.main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args) 
	{
		MainFrame mainFrame = new MainFrame();
		ImageIcon img = new ImageIcon("C:/Users/Branl/workspace/DnD Character Creator/src/dndcharactercreator/assets/dndLogo.png");
		mainFrame.setIconImage(img.getImage());
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setVisible(true);
		mainFrame.setSize(500, 500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		// Places the frame in the center of the screen.
		mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);
		/*
		 * TODO initiative bonus = dexterity bonus
		 * TODO perception = 10 + wisdom bonus
		 * TODO calculate saving throws (class specified. Ability bonus + Attribute Bonus)
		 * TODO add formFill methods to auto fill character sheet PDF
		 */
	}
}