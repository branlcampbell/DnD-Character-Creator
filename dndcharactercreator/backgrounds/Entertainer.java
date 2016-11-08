package dndcharactercreator.backgrounds;

public class Entertainer 
{
	private String[] skillProficiencies = {"Acrobatics", "Performance"};
	private String[] toolProficiencies = {"Diguise Kit", "One Type of Musical Instrument"};
	private String[] equipment = {"Musical Instrument of Your Choice", "Favor of an Admirer",
			"Costume", "Belt Pouch Containing 15 GP"};
	private String[] routines = {"Actor", "Dancer", "Fire-eater", "Jester", "Juggler", "Instrumentalist",
			"Poet", "Singer", "Storyteller", "Tumbler"};
	private String[] features = {"By Popular Demand"};
	private String[] personalityTraits = {"I know a story relevant to almost every situation.",
			"Whenever I come to a new place, I collect local rumors and spread gossip.",
			"I'm a hopeless romantic, always searching for that 'special someone'",
			"Nobody stays angry at me or around me for long, since I can defuse any amount of tension.",
			"I love a good insult, even one directed at me.",
			"I get bitter if I'm not the center of attention.",
			"I'll settle for nothing less than perfection.",
			"I change my mood or my mind as quickly as I change a key in a song."};
	private String[] ideals = {"When I perform, I make the world better than it was. (Good)",
			"The stories, legends, and songs of the past must never be forgotten, for they teach us "
			+ "who we are. (Lawful)",
			"The world is in need of new ideas and bold action. (Chaotic)",
			"I'm only in it for the money and fame. (Evil)",
			"I like seeing the smiles on people's faces when I perform. That's all that matters. (Neutral)",
			"Art should reflect the soul; it should come from within and reveal who we really are. (Any)"};
	private String[] bonds = {"My instrument is my most treasured posession, and it reminds me of someone I love.",
			"Someone stole my precious instrument, and someday I'll get it back.",
			"I want to be famous, whatever it takes.",
			"I idolize a hero of the old tales and measure my deeds against that person's.",
			"I will do anything to prove myself superior to my hated rival.",
			"I would do anything for the other members of my old troupe."};
	private String[] flaws = {"I'll do anything to win fame and renown.",
			"I'm a sucker for a pretty face.",
			"A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.",
			"I once satirized a noble who still wants my head. It was a mistake that I will likely repeat.",
			"I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble.",
			"Despite my best efforts, I am unreliable to my friends."};
	
	public Entertainer()
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
	
	public String[] getRoutines()
	{
		return routines;
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