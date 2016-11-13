package dndcharactercreator.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dndcharactercreator.races.*;
import dndcharactercreator.classes.*;
import dndcharactercreator.backgrounds.*;

public class CenterPanel extends JPanel
{	
	private static final long serialVersionUID = -3135316718219106468L;
	GridLayout entryGrid = new GridLayout(15,2);
	private String[] race = {"Dragonborn", "Dwarf", "Hill Dwarf", "Mountain Dwarf", "Elf", "High Elf",
			"Wood Elf", "Dark Elf", "Gnome", "Forest Gnome", "Rock Gnome", "Halfling", "Half Elf",
			"Half Orc", "Lightfoot", "Stout", "Human", "Tiefling"};
	private String[] alignment = {"Lawful Good", "Neutral Good", "Chaotic Good", "Neutral Good",
			"Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	private String[] characterClass = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
			"Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
	private String[] backgrounds = {"Acolyte", "Charlatan", "Criminal", "Entertainer",
			"Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage",
			"Sailor", "Soldier", "Urchin"};
	
	public CenterPanel()
	{
		// Renderer for centering JComboBox options.
		DefaultListCellRenderer dlcr = new DefaultListCellRenderer(); 
		dlcr.setHorizontalAlignment(DefaultListCellRenderer.CENTER); 
		
		setLayout(entryGrid);
		JLabel characterName = new JLabel("Character Name");
		add(characterName);
		characterName.setHorizontalAlignment(JLabel.CENTER);
		JTextField characterEntry = new JTextField();
		add(characterEntry);
		
		setLayout(entryGrid);
		JLabel playerName = new JLabel("Player Name");
		add(playerName);
		playerName.setHorizontalAlignment(JLabel.CENTER);
		JTextField playerEntry = new JTextField();
		add(playerEntry);
		
		JLabel alignmentLabel = new JLabel("Alignment");
		add(alignmentLabel);
		alignmentLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<String> alignmentChoice = new JComboBox<String>(alignment);
		add(alignmentChoice);
		alignmentChoice.setSelectedIndex(-1);
		alignmentChoice.setRenderer(dlcr);
		
		JLabel raceLabel = new JLabel("Race");
		add(raceLabel);
		raceLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<String> raceChoice = new JComboBox<String>(race);
		add(raceChoice);
		raceChoice.setSelectedIndex(-1);
		raceChoice.setRenderer(dlcr);
		
		JLabel classLabel = new JLabel("Class");
		add(classLabel);
		classLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<String> classChoice = new JComboBox<String>(characterClass);
		add(classChoice);
		classChoice.setSelectedIndex(-1);
		classChoice.setRenderer(dlcr);
		
		JLabel backgroundLabel = new JLabel("Background");
		add(backgroundLabel);
		backgroundLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<String> backgroundChoice = new JComboBox<String>(backgrounds);
		add(backgroundChoice);
		backgroundChoice.setSelectedIndex(-1);
		backgroundChoice.setRenderer(dlcr);
		
		JLabel strengthLabel = new JLabel("Strength");
		add(strengthLabel);
		strengthLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> strengthNum = new JComboBox<Integer>();
		add(strengthNum);
		populateComboBox(strengthNum);
		strengthNum.setRenderer(dlcr);
		strengthNum.setSelectedIndex(-1);
		
		JLabel dexterityLabel = new JLabel("Dexterity");
		add(dexterityLabel);
		dexterityLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> dexterityNum = new JComboBox<Integer>();
		add(dexterityNum);
		populateComboBox(dexterityNum);
		dexterityNum.setRenderer(dlcr);
		dexterityNum.setSelectedIndex(-1);
		
		JLabel constitutionLabel = new JLabel("Constitution");
		add(constitutionLabel);
		constitutionLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> constitutionNum = new JComboBox<Integer>();
		add(constitutionNum);
		populateComboBox(constitutionNum);
		constitutionNum.setRenderer(dlcr);
		constitutionNum.setSelectedIndex(-1);
		
		JLabel intelligenceLabel = new JLabel("Intelligence");
		add(intelligenceLabel);
		intelligenceLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> intelligenceNum = new JComboBox<Integer>();
		add(intelligenceNum);
		populateComboBox(intelligenceNum);
		intelligenceNum.setRenderer(dlcr);
		intelligenceNum.setSelectedIndex(-1);
		
		JLabel wisdomLabel = new JLabel("Wisdom");
		add(wisdomLabel);
		wisdomLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> wisdomNum = new JComboBox<Integer>();
		add(wisdomNum);
		populateComboBox(wisdomNum);
		wisdomNum.setRenderer(dlcr);
		wisdomNum.setSelectedIndex(-1);
		
		JLabel charismaLabel = new JLabel("Charisma");
		add(charismaLabel);
		charismaLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox<Integer> charismaNum = new JComboBox<Integer>();
		add(charismaNum);
		populateComboBox(charismaNum);
		charismaNum.setRenderer(dlcr);
		charismaNum.setSelectedIndex(-1);
		
		JButton personalityButton = new JButton("Personality");
		add(personalityButton);
		personalityButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isPopulated(backgroundChoice) == true)
				{
					Object chosenBackground = determineBackgroundClass(backgroundChoice);
					displayPersonalityDialogBox(chosenBackground);
				}
			}
		});
		
		JButton idealsButton = new JButton("Ideals");
		add(idealsButton);
		idealsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isPopulated(backgroundChoice) == true)
				{
					Object chosenBackground = determineBackgroundClass(backgroundChoice);
					displayIdealsDialogBox(chosenBackground);
				}
			}
		});
		
		JButton bondsButton = new JButton("Bonds");
		add(bondsButton);
		bondsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isPopulated(backgroundChoice) == true)
				{
					Object chosenBackground = determineBackgroundClass(backgroundChoice);
					displayBondsDialogBox(chosenBackground);
				}
			}
		});
		
		JButton flawsButton = new JButton("Flaws");
		add(flawsButton);
		flawsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(isPopulated(backgroundChoice) == true)
				{
					Object chosenBackground = determineBackgroundClass(backgroundChoice);
					displayFlawsDialogBox(chosenBackground);
				}
			}
		});
		
		JButton submitButton = new JButton("Generate Character");
		add(submitButton);
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ArrayList<JComboBox<String>> stringCombo = new ArrayList<JComboBox<String>>();
				stringCombo.add(alignmentChoice);
				stringCombo.add(raceChoice);
				stringCombo.add(classChoice);
				stringCombo.add(backgroundChoice);
				ArrayList<JComboBox<Integer>> intCombo = new ArrayList<JComboBox<Integer>>();
				intCombo.add(strengthNum);
				intCombo.add(dexterityNum);
				intCombo.add(constitutionNum);
				intCombo.add(intelligenceNum);
				intCombo.add(wisdomNum);
				intCombo.add(charismaNum);
				if(areAllPopulatedStrings(stringCombo) == false ||
						areAllPopulatedInts(intCombo) == false)
				{
					System.out.println("False");
				}
				else
				{
					System.out.println("True");
				}
			}
		});
		
		/**
		 * All fields will be cleared if the user selects yes on the option pane.
		 */
		JButton clearButton = new JButton("Clear Fields");
		add(clearButton);
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int clearChoice = JOptionPane.showConfirmDialog(null, "Are you sure you "
						+ "want to clear all fields?", "Clear Confirmation",
						JOptionPane.YES_NO_OPTION);
				if(clearChoice == JOptionPane.YES_OPTION)
				{
				characterEntry.setText("");
				playerEntry.setText("");
				alignmentChoice.setSelectedIndex(-1);
				raceChoice.setSelectedIndex(-1);
				classChoice.setSelectedIndex(-1);
				backgroundChoice.setSelectedIndex(-1);
				strengthNum.setSelectedIndex(-1);
				dexterityNum.setSelectedIndex(-1);
				constitutionNum.setSelectedIndex(-1);
				intelligenceNum.setSelectedIndex(-1);
				wisdomNum.setSelectedIndex(-1);
				charismaNum.setSelectedIndex(-1);
				}
			}
		});
	}
	
	/**
	 * Fills each ability score ComboBox with values 8-12.
	 * @param comboBox
	 */
	public void populateComboBox(JComboBox<Integer> comboBox)
	{
		for(int i = 8; i < 17; i++)
		{
			comboBox.addItem(i);
		}
	}
	
	/**
	 * Checks if an option from the background ComboBox has been selected.
	 * @param comboChoice
	 * @return boolean
	 */
	public boolean isPopulated(JComboBox<String> comboChoice)
	{
		Object userBackground = comboChoice.getSelectedItem();
		if(userBackground == null)
		{
			JOptionPane.showMessageDialog(null,
				    "No background has been selected.",
				    "Background Error",
				    JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean areAllPopulatedStrings(ArrayList<JComboBox<String>> comboBox)
	{
		for(JComboBox<String> entry : comboBox)
		{
			if(entry.getSelectedItem() == null)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean areAllPopulatedInts(ArrayList<JComboBox<Integer>> comboBox)
	{
		for(JComboBox<Integer> entry : comboBox)
		{
			if(entry.getSelectedItem() == null)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Determines the object associated with the ComboBox choice. This object
	 * 
	 * @param comboChoice, characterEntry, strengthNum, dexterityNum,
	 * constitutionNum, intelligenceNum, wisdomNum, charismaNum
	 * @return race
	 */
	public Object createCharacter(JTextField characterEntry, JComboBox<String> raceChoice,
			JComboBox<Integer> strengthNum,
			JComboBox<Integer> dexterityNum, JComboBox<Integer> constitutionNum,
			JComboBox<Integer> intelligenceNum, JComboBox<Integer> wisdomNum,
			JComboBox<Integer> charismaNum)
	{
		String name = characterEntry.getText();
		int strength = getAbilityScore(strengthNum);
		int dexterity = getAbilityScore(dexterityNum);
		int constitution = getAbilityScore(constitutionNum);
		int intelligence = getAbilityScore(intelligenceNum);
		int wisdom = getAbilityScore(wisdomNum);
		int charisma = getAbilityScore(charismaNum);
		Object race = null;
		String choice = (String)raceChoice.getSelectedItem();
		switch(choice)
		{
		case "Dark Elf": race = new DarkElf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Dragonborn": race = new Dragonborn(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Dwarf": race = new Dwarf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Elf": race = new Elf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Forest Gnome": race = new ForestGnome(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Gnome": race = new Gnome(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Half Elf": race = new HalfElf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Halfling": race = new Halfling(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Half Orc": race = new HalfOrc(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "High Elf": race = new HighElf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Hill Dwarf": race = new HillDwarf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Human": race = new Human(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Lightfoot": race = new LightFoot(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Mountain Dwarf": race = new MountainDwarf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Rock Gnome": race = new RockGnome(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Stout": race = new Stout(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Tiefling": race = new Tiefling(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
			break;
		case "Wood Elf": race = new WoodElf(name, strength, dexterity, constitution,
				intelligence, wisdom, charisma);
		}
		return race;
	}	
	
	/*public String determineRace()
	{
		
	}*/
	
	/**
	 * Determines the object associated with the ComboBox choice. This object
	 * is passed into the populateDialogBox method to be cast as type Background.
	 * @param comboChoice
	 * @return background
	 */
	public Object determineBackgroundClass(JComboBox<String> comboChoice)
	{
		Object background = null;
		String choice = (String)comboChoice.getSelectedItem();
		switch(choice)
		{
		case "Acolyte": background = new Acolyte();
			break;
		case "Charlatan": background = new Charlatan();
			break;
		case "Criminal": background = new Criminal();
			break;
		case "Entertainer": background = new Entertainer();
			break;
		case "Folk Hero": background = new FolkHero();
			break;
		case "Guild Artisan": background = new GuildArtisan();
			break;
		case "Hermit": background = new Hermit();
			break;
		case "Noble": background = new Noble();
			break;
		case "Outlander": background = new Outlander();
			break;
		case "Sage": background = new Sage();
			break;
		case "Sailor": background = new Sailor();
			break;
		case "Soldier": background = new Soldier();
			break;
		case "Urchin": background = new Urchin();
			break;
		}
		return background;
	}
	
	/**
	 * Populates a dialog box pop up with personality traits for selected background.
	 * @param comboBoxSelection
	 * @return personalityComboBox.getSelectedItem()
	 */
	public Object displayPersonalityDialogBox(Object comboBoxSelection)
	{
		Background userBackground = (Background) comboBoxSelection;
		String[] backgroundPersonalityTraits = userBackground.getPersonalityTraits();
		JPanel panel = new JPanel();
		panel.add(new JLabel("Choose a personality trait: "));
		JComboBox<String> personalityComboBox = new JComboBox<String>(backgroundPersonalityTraits);
		panel.add(personalityComboBox);
		int result = JOptionPane.showConfirmDialog(null, panel, "Personality Traits For " 
		+ userBackground.getBackgroundName(), JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION)
		{
			return personalityComboBox.getSelectedItem();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Populates a dialog box pop up with ideals for selected background.
	 * @param comboBoxSelection
	 * @return idealsComboBox.getSelectedItem()
	 */
	public Object displayIdealsDialogBox(Object comboBoxSelection)
	{
		Background userBackground = (Background) comboBoxSelection;
		String[] backgroundIdeals = userBackground.getIdeals();
		JPanel panel = new JPanel();
		panel.add(new JLabel("Choose a personality trait: "));
		JComboBox<String> idealsComboBox = new JComboBox<String>(backgroundIdeals);
		panel.add(idealsComboBox);
		int result = JOptionPane.showConfirmDialog(null, panel, "Ideals For " 
		+ userBackground.getBackgroundName(), JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION)
		{
			return idealsComboBox.getSelectedItem();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Populates a dialog box pop up with bonds for selected background.
	 * @param comboBoxSelection
	 * @return bondsComboBox.getSelectedItem()
	 */
	public Object displayBondsDialogBox(Object comboBoxSelection)
	{
		Background userBackground = (Background) comboBoxSelection;
		String[] backgroundBonds = userBackground.getBonds();
		JPanel panel = new JPanel();
		panel.add(new JLabel("Choose a bond: "));
		JComboBox<String> bondsComboBox = new JComboBox<String>(backgroundBonds);
		panel.add(bondsComboBox);
		int result = JOptionPane.showConfirmDialog(null, panel, "Bonds For " 
		+ userBackground.getBackgroundName(), JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION)
		{
			return bondsComboBox.getSelectedItem();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Populates a dialog box pop up with flaws for selected background.
	 * @param comboBoxSelection
	 * @return flawsComboBox.getSelectedItem()
	 */
	public Object displayFlawsDialogBox(Object comboBoxSelection)
	{
		Background userBackground = (Background) comboBoxSelection;
		String[] backgroundFlaws = userBackground.getFlaws();
		JPanel panel = new JPanel();
		panel.add(new JLabel("Choose a flaw: "));
		JComboBox<String> flawsComboBox = new JComboBox<String>(backgroundFlaws);
		panel.add(flawsComboBox);
		int result = JOptionPane.showConfirmDialog(null, panel, "Flaws For " 
		+ userBackground.getBackgroundName(), JOptionPane.OK_CANCEL_OPTION);
		
		if(result == JOptionPane.OK_OPTION)
		{
			return flawsComboBox.getSelectedItem();
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * Gets the ability score entered by the user for one ComboBox.
	 * @param comboBoxSelection
	 * @return
	 */
	public int getAbilityScore(JComboBox<Integer> comboBoxSelection)
	{
		return (int)comboBoxSelection.getSelectedItem();
	}
	/*
	public int getAbilityModifier(JComboBox<Object> comboBoxSelection, Object character)
	{
		int abilityNum = (int) comboBoxSelection.getSelectedItem();
		
		
	}
	*/
}