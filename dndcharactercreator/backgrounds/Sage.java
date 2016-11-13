package dndcharactercreator.backgrounds;

public class Sage implements Background
{
	private String backgroundName = "Sage";
	private String[] skillProficiencies = {"Arcana", "History"};
	private String[] languages = {"Two of Your Choice"};
	private String[] equipment = {"Bottle of Black Ink", "Quill", "Small Knife",
			"Letter From a Dead Colleague Posing a Question You Have Not Yet Been Able to Answer",
			"Set of Common Clothes", "Belt Pouch Containing 10 GP"};
	private String[] specialty = {"Alchemist", "Astronomer", "Discredited Academic", "Librarian",
			"Professor", "Researcher", "Wizard's Apprentice", "Scribe"};
	private String[] features = {"Researcher"};
	private String[] personalityTraits = {"I use polysyllabic words that convey the impression of great erudition.",
			"I've read every book in the world's greatest libraries--or I like to boast that I have.",
			"I'm used to helping out those who aren't as smart as I am, and I patiently explain anything "
			+ "and everything to others.",
			"There's nothing I like more than a good mystery.",
			"I'm willing to listen to every side of an argument before I make my own judgement.",
			"I...speak...slowly...when talking...to idiots...which...almost...everyone...is...compared...to me.",
			"I am horribly, horribly awkward in social situations.",
			"I'm convinced that people are always trying to steal my secrets"};
	private String[] ideals = {"The path to power and self-improvement is through knowledge. (Neutral)",
			"What is beautiful points us beyond itself toward what is true. (Good)",
			"EMotions must not cloud our logical thinking. (Lawful)",
			"Nothing should fetter the infinite possibility inherent in all existence. (Chaotic)",
			"Knowledge is the path to power and domination. (Evil)",
			"The goal of a life of study is the betterment of oneself. (Any)"};
	private String[] bonds = {"It is my duty to protect my students.",
			"I have an ancient text that holds terrible secrets that must not fall into "
			+ "the wrong hands.",
			"I work to preserve a library, university, sciptorium, or monastery.",
			"My life's work is a series of tomes related to a specific field of lore.",
			"I've been searching my whole life for the answer to a certain question.",
			"I sold my soul for knowledge. I hope to do great deeds and win it back."};
	private String[] flaws = {"I am easily distracted by the promise of information.",
			"Most people scream and run when they see a demon. I stop and take notes on its anatomy.",
			"Unlocking an ancient mystery is worth the price of civilization.",
			"I overlook obvious solutions in favor of complicated ones.",
			"I speak without really thinking through my words, invariably insulting others.",
			"I can't keep a secret to save my life, or anyone else's."};
	
	public Sage()
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