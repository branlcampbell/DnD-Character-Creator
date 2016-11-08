package dndcharactercreator.backgrounds;

public class Urchin 
{
	private String[] skillProficiencies = {"Sleight of Hand", "Stealth"};
	private String[] toolProficiencies = {"Disguise Kit", "Thieves' Tools"};
	private String[] equipment = {"Small Knife", "Map of the City You Grew Up In",
			"Pet Mouse", "Token to Remember Your Parents By", "Set of Common Clothes",
			"Belt Pouch Containing 10 GP"};
	private String[] features = {"City Secrets"};
	private String[] personalityTraits = {"I hide scraps of food and trinkets away in my pockets.",
			"I ask a lot of questions",
			"I like to squeeze into small places where no one else can get to me.",
			"I sleep with my back to a wall or a tree, with everything I own wrapped in a bundle in my arms.",
			"I eat like a pig and have bad manners.",
			"I think anyone who's nice to me is hiding evil intent.",
			"I don't like to bathe.",
			"I bluntly say what other people are hinting at or hiding."};
	private String[] ideals = {"All people, rich or poor, deserve respect. (Good)",
			"We have to take care of each other, because no one else is going to do it. (Lawful)",
			"The low are lifted up, and the high and mighty are brought down. Change is the nature of things. (Chaotic)",
			"The rich need to be shown what life and death are like in the gutters. (Evil)",
			"I help the people who help me--that's what keeps us alive. (Neutral)",
			"I'm going to prove that I'm worthy of a better life. (Any)"};
	private String[] bonds = {"My town or city is my home, and I'll fight to defend it.",
			"I sponsor an orphanage to keep others from enduring what I was forced to endure.",
			"I owe my survival to another urchin who taught me to live on the streets.",
			"I owe a debt I can never repay to the person who took pity on me.",
			"I escaped my life of poverty by robbing an important person, and I'm wanted for it.",
			"No one else should have to endure the hardships I've been through."};
	private String[] flaws = {"If I'm outnumbered, I will run away from a fight.",
			"Gold seems like a lot of money to me, and I'll do just about anything for more of it.",
			"I will never fully trust anyone other than myself.",
			"I'd rather kill someone in their sleep than fight fair.",
			"It's not stealing if I need it more than someone else.",
			"People who can't take care of themselves get what they deserve."};
	
	public Urchin()
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