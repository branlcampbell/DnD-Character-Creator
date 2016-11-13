package dndcharactercreator.backgrounds;

public class GuildArtisan implements Background
{
	private String backgroundName = "Guild Artisan";
	private String[] skillProficiencies = {"Insight", "Persuasion"};
	private String[] toolProficiencies = {"One Type of Artisan's Tools"};
	private String[] equipment = {"Set of Artisan's Tools", "Letter of Introduction From Your Guild",
			"Set of Traveler's Clothes", "Belt Pouch Containing 15 GP"};
	private String[] guildBusiness = {"Alchemists and Apothecaries",
			"Armorers, LockSmiths, and FineSmiths",
			"Brewers, Distillers, and Vintners",
			"Calligraphers, Scribes, and Scriveners",
			"Carpenters, Roofers, and Plasterers",
			"Cartographers, Surveyors, and Chart-Makers",
			"Cobblers and Shoemakers",
			"Cooks and Bakers",
			"Glassblowers and Glaziers",
			"Jewelers and Gemcutters",
			"Leatherworkers, Skinners, and Tanners",
			"Masons and Stonecutters",
			"Painters, Limners, and Sign-Makers",
			"Potters and Tile-Makers",
			"Shipwrights and Sailmakers",
			"Smiths and Metal-Forgers",
			"Tinkers, Pewterers, and Casters",
			"Wagon-Makers and Wheelwrights",
			"Weavers and Dyers",
			"Woodcarvers, Coopers, and Bowyers"};
	private String[] features = {"Guild Membership"};
	private String[] personalityTraits = {"I believe that anything worth doing is worth doing right. "
			+ "I can't help it--I'm a perfectionist",
			"I'm a snob who looks down on those who can't appreciate fine art.",
			"I always want to know how things work and what makes people tick.",
			"I'm full of witty aphorisms and have a proverb for every occasion.",
			"I'm rude to people who lack my commitment to hard work and fair play.",
			"I like to talk at length about my profession.",
			"I don't part with my money easily and will haggle tirelessly to get the best deal possible.",
			"I'm well known for my work, and I want to make sure everyone appreciates it. I'm always "
			+ "taken aback when people haven't heard of me."};
	private String[] ideals = {"It is the duty of all civilized people to strengthen the bonds of "
			+ "community and the security of civilization. (Lawful)",
			"My talents were given to me so that I could use them to benefit the world. (Good)",
			"Everyone should be free to pursue his or her own livelihood. (Chaotic)",
			"I'm only in it for the money. (Evil)",
			"I'm committed to the people I care about, not to ideals. (Neutral)",
			"I work hard to be the best there is at my craft. (Any)"};
	private String[] bonds = {"The workshop where I learned my trade is the most important place in the world to me.",
			"I created a great work for someone, and then found them unworthy to receive it. I'm still "
			+ "looking for someone worthy.",
			"I owe my guild a great debt for forging me into the person I am today.",
			"I pursue wealth to secure someone's love.",
			"One day I will return to my guild and prove that I am the greatest artisan of them all.",
			"I will get my revenge on the evil forces that destroyed my place of business and ruined my livelihood."};
	private String[] flaws = {"I'll do anything to get my hands on something rare or priceless.",
			"I'm quick to assume that someone is trying to cheat me.",
			"No one must ever learn that I once stole money from my guild coffers.",
			"I'm never satisfied with what I have--I always want more.",
			"I would kill to acquire a noble title.",
			"I'm horribly jealous of anyone who can outshine my handiwork. Everywhere I go, I'm surrounded by rivals."};
	
	public GuildArtisan()
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
	
	public String[] getGuildBusiness()
	{
		return guildBusiness;
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