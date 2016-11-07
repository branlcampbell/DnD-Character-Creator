/**
 * @author Brandon Campbell
 * @version 1.0
 * The character creator is intended for the use of creating a level 1 5th edition
 * Dungeons & Dragons character. It will automatically calculate the remaining fields
 * for you to fill in once you provide the program with the six base stats needed.
 */
package dndcharactercreator.main;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import dndcharactercreator.classes.*;
import dndcharactercreator.races.*;

public class Main
{
	public static void main(String[] args) 
	{
		MainFrame mainFrame = new MainFrame();
		/* TODO fix icon display.
		java.net.URL url = ClassLoader.getSystemResource("dndcharactercreator/main/Resources/dndLogo.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		mainFrame.setIconImage(img);
		*/
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		mainFrame.setVisible(true);
		mainFrame.setSize(400, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		// Places the frame in the center of the screen.
		mainFrame.setLocation(dim.width/2-mainFrame.getSize().width/2, dim.height/2-mainFrame.getSize().height/2);
		
		// Currently for testing purposes.
		Human todd = new Human("Todd", 12, 10, 11, 9, 8, 9);
		System.out.println(todd.getName());
		System.out.println("Strength: " + todd.getStrength());
		System.out.println("Dexterity: " + todd.getDexterity());
		System.out.println("Constitution: " + todd.getConstitution());
		System.out.println("Intelligence: " + todd.getIntelligence());
		System.out.println("Wisdom: " + todd.getWisdom());
		System.out.println("Charisma: " + todd.getCharisma());
		System.out.println("Size: " + todd.getSize());
		System.out.println("Speed: " + todd.getSpeed());;
		for (String arrayIndex : todd.getLanguages())
		{
			System.out.println(arrayIndex);
		}
		/*
		 * TODO initiative bonus = dexterity bonus
		 * TODO perception = 10 + wisdom bonus
		 * TODO calculate saving throws (class specified. Ability bonus + Attribute Bonus)
		 * TODO add ability bonuses (8-9 = -1, 10-11 = 0, 12-13 = 1, 14-15 = 2, 16-17 = 3)
		 * TODO add backgrounds classes
		 * TODO add formFill methods to auto fill character sheet PDF
		 */
	}
}
