package dndcharactercreator.backgrounds;

public class Criminal implements Background
{
	private String[] skillProficiencies = {"Deception", "Stealth"};
	private String[] toolProficiencies = {"One type of gaming set", "Thieves' tools"};
	private String[] equipment = {"Crowbar", "Set of Dark Common Clothes Including a Hood", "Belt Pouch "
			+ "Containing 15 GP"};
	private String[] specialty = {"Blackmailer", "Burglar", "Enforcer", "Fence", "Highway Robber",
			"Hired Killer", "Pickpocket", "Smuggler"};
	private String[] features = {"Criminal Contact"};
	private String[] personalityTraits = {"I always have a plan for what to do when things go wrong.",
			"I am always calm, no matter what the situation. I never raise my voice or let my emotions control me.",
			"The first thing I do in a new place is note the locations of everything valuable--or where "
			+ "such things could be hidden.",
			"I would rather make a new friend than a new enemy.",
			"I am incredibly slow to trust. Those who seem the fairest often have the most to hide.",
			"I don't pay attention to the risks in a situation. Never tell me the odds.",
			"The best way to get me to do something is to tell me I can't do it.",
			"I blow up at the slightest insult."};
	private String[] ideals = {"I don't steal from others in the trade.",
			"Chains are meant to be broken, as are those who would forge them. (Chaotic)",
			"I steal from the wealthy so that I can help people in need. (Good)",
			"I will do whatever it takes to become wealthy. (Evil)",
			"I'm loyal to my friends, not to any ideals, and everyone else can take a trip down "
			+ "the Styx for all I care. (Neutral)",
			"There's a spark of good in everyone. (Good)"};
	private String[] bonds = {"I'm trying to pay off an old debt I owe to a generous benefactor.",
			"My ill-gotten gains go to support my family.",
			"Something important was taken from me, and I aim to steal it back.",
			"I will become the greatest thief that ever lived.",
			"I'm guilty of a terrible crime. I hope I can redeem myself for it.",
			"Someone I loved died because of a mistake I made. That will never happen again."};
	private String[] flaws = {"When I see something valuable, I can't think of anything but how to steal it.",
			"When faced with a choice between money and my friends, I usually choose the money.",
			"If there's a plan, I'll forget it. If I don't forget it, I'll ignore it.",
			"I have a 'tell' that reveals when I'm lying.",
			"I turn tail and run when things look bad.",
			"An innocent person is in prison for a crime that I committed. I'm okay with that."};
	
	public Criminal()
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
	
	public String[] getSpecialties()
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
}