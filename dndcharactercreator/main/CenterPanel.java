package dndcharactercreator.main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CenterPanel extends JPanel
{
	private static final long serialVersionUID = -3135316718219106468L;
	GridLayout entryGrid = new GridLayout(15,2);
	private String [] race = {"Dragonborn", "Dwarf", "Hill Dwarf", "Mountain Dwarf", "Elf", "High Elf",
			"Wood Elf", "Dark Elf", "Gnome", "Forest Gnome", "Rock Gnome", "Halfling", "Half Elf",
			"Half Orc", "Lightfoot", "Stout", "Human", "Tiefling"};
	private String[] alignment = {"Lawful Good", "Neutral Good", "Chaotic Good", "Neutral Good",
			"Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	private String[] characterClass = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
			"Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};
	private String[] backgrounds = {"Acolyte", "Charlatan", "Criminal", "Entertainer",
			"Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage",
			"Sailor", "Solider", "Urchin"};
	

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
				
			}
		});
		
		
		JButton idealsButton = new JButton("Ideals");
		add(idealsButton);
		idealsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		JButton bondsButton = new JButton("Bonds");
		add(bondsButton);
		bondsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		JButton flawsButton = new JButton("Flaws");
		add(flawsButton);
		flawsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		JButton submitButton = new JButton("Generate Character");
		add(submitButton);
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		JButton clearButton = new JButton("Clear Fields");
		add(clearButton);
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
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
		});
	}
	
	public void populateComboBox(JComboBox<Integer> comboBox)
	{
		for(int i = 8; i < 13; i++)
		{
			comboBox.addItem(i);
		}
	}
}