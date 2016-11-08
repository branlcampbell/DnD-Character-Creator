package dndcharactercreator.backgrounds;

public class Sailor 
{
	private String[] skillProficiencies = {"Athletics", "Perception"};
	private String[] toolProficiencies = {"Navigator's Tools", "Vehicles (Water)"};
	private String[] equipment = {"Belaying Pin (Club)", "50 Feet of Silk Rope",
			"Lucky Charm", "Set of Common Clothes", "Belt Pouch Containing 10 GP"};
	private String[] features = {"Ship's Passage"};
	private String[] personalityTraits = {"My friends know they can rely on me, no matter what.",
			"I work hard so that I can play hard when the work is done.",
			"I enjoy sailing into new ports and making new friends over a flagon of ale.",
			"I stretch the truth for the sake of a good story.",
			"To me, a tavern brawl is a nice way to get to know a new city.",
			"I never pass up a friendly wager.",
			"My language is as foul as an otyugh nest.",
			"I like a job well done, especially if I can convince someone else to do it."};
	private String[] ideals = {"The thing that keeps a ship together is mutual respect between "
			+ "captain and crew. (Good)",
			"We all do the work, so we all share in the rewards. (Lawful)",
			"The sea is freedom--the freedom to go anywhere and do anything. (Chaotic)",
			"I'm a predator, and the other ships on the sea are my prey. (Evil)",
			"I'm committed to my crewmates, not to ideals. (Neutral)",
			"Someday I'll own my own ship and chart my own destiny. (Any)"};
	private String[] bonds = {"I'm loyal to my captain first, everything else second.",
			"The ship is most important--crewmates and captains come and go.",
			"I'll always remember my first ship.",
			"In a harbor town, I have a paramour whose eyes nearly stole me from the sea.",
			"I was cheated out of my fair share of the profits, and I want to get my due.",
			"Ruthless pirates murdered my captain and crewmates, plundered our ship, and "
			+ "left me to die. Vengeance will be mine."};
	private String[] flaws = {"I follow orders, even if I think they're wrong.",
			"I'll say anything to avoid having to do extra work.",
			"Once someone questions my courage, I never back down no matter how dangerous the situation.",
			"Once I start drinking, it's hard for me to stop.",
			"I can't help but pocket loose coins and other trinkets I come across.",
			"My pride will probably lead to my destruction."};
	
	public Sailor()
	{
		
	}
	
	public String[] getSkillProficiencies() 
	{
		return skillProficiencies;
	}
	
	public String[] getToolProficiencies()
	{
		return toolProficiencies;
	}
	
	public String[] getEquipment() 
	{
		return equipment;
	}
	
	public String[] getFeatures() 
	{
		return features;
	}
	
	public String[] getPersonalityTraits()
	{
		return personalityTraits;
	}
	
	public String[] getIdeals()
	{
		return ideals;
	}
	
	public String[] getBonds()
	{
		return bonds;
	}
	
	public String[] getFlaws()
	{
		return flaws;
	}
}