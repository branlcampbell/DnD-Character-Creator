package dndcharactercreator.backgrounds;

public class Acolyte 
{
	private String[] skillProficiencies = {"Insight", "Religion"};
	private String[] languages = {"Two of Your Choice"};
	private String[] equipment = {"Holy Symbol", "Prayer Book", "5 Sticks of Incense", "Vestments",
			"A Set of Common Clothes", "Belt Pouch Containing 15 GP"};
	private String[] features = {"Shelter of the Faithful"};
	private String[] personalityTraits = {"I idolize a particular hero of my faith, and constantly "
			+ "refer to that person's deeds and example.",
			"I can find common ground between the fiercest enemies, empathizing with them and always "
			+ "working toward peace.",
			"I see omens in every event and action. The gods try to speak to us, we just need to listen.",
			"Nothing can shake my optimistic attitude.",
			"I quote (or misquote) sacred texts and proverbs in almost every situation.",
			"I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.",
			"I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me.",
			"I've spend so long in the temple that I have little practical experience dealing with people "
			+ "in the outside world."};
	private String[] ideals = {"The ancient traditions of worship and sacrifice must be preserved "
			+ "and upheld. (Lawful)", "I always try to help those in need, no matter what the personal cost. (Good)",
			"We must help bring about the changes the gods are constantly working in the world. (Chaotic)",
			"I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)", "I trust that "
			+ "my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)",
			"I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings. (Any)"};
	private String[] bonds = {"I would die to recover an ancient relic of my faith that was lost long ago.",
			"I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.",
			"I owe my life to the priest who took me in when my parents died.",
			"Everything I do is for the common people.",
			"I will do anything to protect the temple where I served.",
			"I seek to preserve a sacred text that my enemies consider heretical and seek to destroy."};
	private String[] flaws = {"I judge others harshly, and myself even more severely.",
			"I put too much trust in those who wield power within my temple's hierarchy.",
			"My piety sometimes leads me to blindly trust those that profess faith in my god.",
			"I am inflexible in my thinking.",
			"I am suspicious of strangers and expect the worst of them.",
			"Once I pick a goal, I become obsessed with it to the detriment of everything else in my life."};
	
	public Acolyte()
	{
		
	}
	
	public String[] getSkillProficiencies() 
	{
		return skillProficiencies;
	}
	
	public String[] getLanguages() 
	{
		return languages;
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
