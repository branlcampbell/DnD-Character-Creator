package dndcharactercreator.backgrounds;

public class Soldier implements Background
{
	private String backgroundName = "Soldier";
	private String[] skillProficiencies = {"Athletics", "Intimidation"};
	private String[] toolProficiencies = {"One Type of Gaming Set", "Vehicles (Land)"};
	private String[] equipment = {"Insignia of Rank", "Trophy Taken From a Fallen Enemy",
			"Set of Bone Dice or Deck of Cards", "Set of Common Clothes", "Belt Pouch Containing 10 GP"};
	private String[] specialty = {"Officer", "Scout", "Infantry", "Cavalry", "Healer", "Quartermaster",
			"Standard Bearer", "Support Staff"};
	private String[] features = {"Military Rank"};
	private String[] personalityTraits = {"I'm always polite and respectful.",
			"I'm haunted by memories of war. I can't get the images of violence out of my mind.",
			"I've lost too many friends, and I'm slow to make new ones.",
			"I'm full of inspiring and cautionary tales from my military experience relevant to "
			+ "almost every combat situation.",
			"I can stare down a hell hound without flinching.",
			"I enjoy being strong and like breaking things.",
			"I have a crude sense of humor.",
			"I face problems head-on. A simple, direct solution is the best path to success."};
	private String[] ideals = {"Our lot is to lay down our lives in defense of others. (Good)",
			"I do what I must and obey just authority. (Lawful)",
			"When people follow orders blindly, they embrace a kind of tyranny. (Chaotic)",
			"In life as in war, the stronger force wins. (Evil)",
			"Ideals aren't worth killing over or going to war for. (Neutral)",
			"My city, nation, or people are all that matter. (Any)"};
	private String[] bonds = {"I would still lay down my life for the people I served with.",
			"Someone saved my life on the battlefield. To this day, I will never leave a friend behind.",
			"My honor is my life.",
			"I'll never forget the crushing defeat my company suffered or the enemies who dealt it.",
			"Those who fight besides me are those worth dying for.",
			"I fight for those who cannot fight for themselves."};
	private String[] flaws = {"The monstrous enemy we faced in battle still leaves me quivering with fear.",
			"I have little respect for anyone who is not a proven warrior.",
			"I made a terrible mistake in battle that cost many lives--and I would do anyting to keep that "
			+ "mistake secret.",
			"My hatred of my enemies is blind and unreasoning.",
			"I obey the law, even if the law causes misery.",
			"I'd rather eat my armor than admit when I'm wrong."};
	
	public Soldier()
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
	
	public String[] getSpecialty()
	{
		return specialty;
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
	
	public String getBackgroundName()
	{
		return backgroundName;
	}
}