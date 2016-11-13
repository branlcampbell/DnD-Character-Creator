package dndcharactercreator.backgrounds;

public class Hermit implements Background
{
	private String backgroundName = "Hermit";
	private String[] skillProficiencies = {"Medicine", "Religion"};
	private String[] toolProficiencies = {"Herbalism Kit"};
	private String[] languages = {"One of Your Choice"};
	private String[] equipment = {"Scroll Case Stuffed Full of Notes From Your Studies or Prayers",
			"Winter Blanket", "Set of Common Clothes", "Herbalism Kit", "5 GP"};
	private String[] lifeOfSeclusion = {"I was searching for spiritual enlightenment",
			"I was partaking of communal living in accordance with the dictates of a religious order.",
			"I was exiled for a crime I didn't commit.",
			"I retreated from society after a life-altering event.",
			"I needed a quiet place to work on my art, literature, music, or manifesto.",
			"I needed to commune with nature, far from civilization.",
			"I was the caretake of an ancient ruin or relic.",
			"I was a pilgrim in search of a person, place, or relic of spiritual significance."};
	private String[] features = {"Discovery"};
	private String[] personalityTraits = {"I've been isolated for so long that I rarely speak, "
			+ "preferring gestures and the occasional grunt.",
			"I am utterly serene, even in the face of disaster.",
			"The leader of my community had something wise to say on every topic, and I am eager to share that wisdom.",
			"I feel tremendous empathy for all who suffer.",
			"I'm oblivious to etiquette and social expectations.",
			"I connected everything that happens to me to a grand, cosmic plan.",
			"I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.",
			"I am working on a grand philosophical theory and love sharing my ideas."};
	private String[] ideals = {"My gifts are meant to be shared with all, not used for my own benefit. (Good)",
			"Emotions must not cloud our sense of what is right and true, or our logical thinking. (Lawful)",
			"Inquiry and curiosity are the pillars of progress. (Chaotic)",
			"Solitude and contemplation are paths toward mystical or magical power. (Evil)",
			"Meddling in the affairs of others only causes trouble. (Neutral)",
			"If you know yourself, there's nothing left to know. (Any)"};
	private String[] bonds = {"Nothing is more important than the other members of my hermitage, order, "
			+ "or association",
			"I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.",
			"I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.",
			"I entered seclusion because I loved someone I could not have.",
			"Should my discovery come to light, it could bring ruin to the world.",
			"My isolation gave me great insight into a great evil that only I can destroy."};
	private String[] flaws = {"Now that I've returned to the world, I enjoy its delights a little too much.",
			"I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.",
			"I am dogmatic in my thoughts and philosophy.",
			"I let my need to win arguments overshadow friendships and harmony.",
			"I'd risk too much to uncover a lost bit of knowledge.",
			"I like keeping secrets and won't share them with anyone."};
	
	public Hermit()
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
	
	public String[] getLanguages() 
	{
		return languages;
	}
	
	public String[] getEquipment() 
	{
		return equipment;
	}
	
	public String[] getLifeOfSeclusion()
	{
		return lifeOfSeclusion;
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