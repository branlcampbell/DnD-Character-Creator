/**
 * @author Brandon Campbell
 * @version 1.0
 * The character creator is intended for the use of creating a level 1 5th edition
 * Dungeons & Dragons character. It will automatically calculate the remaining fields
 * for you to fill in once you provide the program with the six base stats needed.
 */
package dndcharactercreator.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import dndcharactercreator.armor.*;
import dndcharactercreator.classes.*;
import dndcharactercreator.races.*;

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
		BreastPlate breastPlate = new BreastPlate();
		System.out.println(breastPlate.getArmorClass());
		
		/*
		 * TODO initiative bonus = dexterity bonus
		 * TODO perception = 10 + wisdom bonus
		 * TODO calculate saving throws (class specified. Ability bonus + Attribute Bonus)
		 * TODO add ability bonuses (8-9 = -1, 10-11 = 0, 12-13 = 1, 14-15 = 2, 16-17 = 3)
		 * TODO add formFill methods to auto fill character sheet PDF
		 */
	}
}