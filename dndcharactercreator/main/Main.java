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
		MountainDwarf dwarf = new MountainDwarf("Rhaegar", 8, 9, 10, 11, 12, 13);
		System.out.println(dwarf.getName());
		System.out.println("Strength: " + dwarf.getStrength());
		System.out.println("Dexterity: " + dwarf.getDexterity());
		System.out.println("Constitution: " + dwarf.modifyConstitution());
		System.out.println("Intelligence: " + dwarf.getIntelligence());
		System.out.println("Wisdom: " + dwarf.modifyStrength());
		System.out.println("Charisma: " + dwarf.getCharisma());
		System.out.println("Racial traits: " + dwarf.getSize());
		System.out.println("Racial traits: " + dwarf.getSpeed());
		System.out.println("Racial traits: " + dwarf.getLanguages());
		for(String arrayIndex : dwarf.getRacialBonus())
		{
			System.out.println(arrayIndex);
		}
		System.out.println(dwarf.getSubRacialBonus());
	}
}
