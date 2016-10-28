package dndcharactercreator.main;

import java.awt.GridLayout;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CenterPanel extends JPanel
{
	GridLayout entryGrid = new GridLayout(10,2);
	private String [] race = {"Dwarf", "Hill Dwarf", "Mountain Dwarf", "Elf", "High Elf", "Wood Elf", 
			"Halfling", "Lightfoot", "Stout", "Human"};
	private String[] alignment = {"Lawful Good", "Neutral Good", "Chaotic Good", "Neutral Good",
			"Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};

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
		
		JLabel alignmentLabel = new JLabel("Alignment");
		add(alignmentLabel);
		alignmentLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox alignmentChoice = new JComboBox(alignment);
		add(alignmentChoice);
		alignmentChoice.setRenderer(dlcr);
		
		JLabel raceLabel = new JLabel("Race");
		add(raceLabel);
		raceLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox raceChoice = new JComboBox(race);
		add(raceChoice);
		raceChoice.setRenderer(dlcr);
		
		JLabel strengthLabel = new JLabel("Strength");
		add(strengthLabel);
		strengthLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox strengthNum = new JComboBox();
		add(strengthNum);
		populateComboBox(strengthNum);
		strengthNum.setRenderer(dlcr);
		
		JLabel dexterityLabel = new JLabel("Dexterity");
		add(dexterityLabel);
		dexterityLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox dexterityNum = new JComboBox();
		add(dexterityNum);
		populateComboBox(dexterityNum);
		dexterityNum.setRenderer(dlcr);
		
		JLabel constitutionLabel = new JLabel("Constitution");
		add(constitutionLabel);
		constitutionLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox constitutionNum = new JComboBox();
		add(constitutionNum);
		populateComboBox(constitutionNum);
		constitutionNum.setRenderer(dlcr);
		
		JLabel intelligenceLabel = new JLabel("Intelligence");
		add(intelligenceLabel);
		intelligenceLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox intelligenceNum = new JComboBox();
		add(intelligenceNum);
		populateComboBox(intelligenceNum);
		intelligenceNum.setRenderer(dlcr);
		
		JLabel wisdomLabel = new JLabel("Wisdom");
		add(wisdomLabel);
		wisdomLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox wisdomNum = new JComboBox();
		add(wisdomNum);
		populateComboBox(wisdomNum);
		wisdomNum.setRenderer(dlcr);
		
		JLabel charismaLabel = new JLabel("Charisma");
		add(charismaLabel);
		charismaLabel.setHorizontalAlignment(JLabel.CENTER);
		JComboBox charismaNum = new JComboBox();
		add(charismaNum);
		populateComboBox(charismaNum);
		charismaNum.setRenderer(dlcr);
		
		JButton submitButton = new JButton("Generate Character");
		add(submitButton);
		
		JButton clearButton = new JButton("Clear Fields");
		add(clearButton);
	}
	
	public void populateComboBox(JComboBox comboBox)
	{
		for(int i = 1; i < 13; i++)
		{
			comboBox.addItem(i);
		}
	}
}
