package dndcharactercreator.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class FillForm 
{

	private final String path = "C:/Users/Branl/workspace/DnD Character Creator/Character-Sheet.pdf";
	
	FillForm()
	{
		
	}
	
	public PDDocument loadDocument(String filePath) throws IOException
	{
		try
		{
			return PDDocument.load(new File(filePath));
		}
		catch(IOException e)
		{
			e.getMessage();
		}
		return null;
    }
	
	/**
	 * Gets the document catalog after loading the document.
	 * @param document
	 * @return PDAcroForm
	 */
	public PDAcroForm getDocumentCatalog(PDDocument document)
	{
		return document.getDocumentCatalog().getAcroForm();
	}
    
	/**
	 * Gets specified field.
	 * @param field
	 * @return contents of field
	 * @throws IOException
	 */
	public PDField getField(String field) throws IOException
	{
		PDAcroForm acroForm = getDocumentCatalog(loadDocument(path));
		return acroForm.getField(field);
	}
    
	/**
	 * Sets all character sheet fields.
	 * @param fieldName
	 * @param fillValue
	 * @throws IOException
	 */
    public void fillAllFields(List<String> character, List<String> characterClass,
    		List<String> modifiers, List<String> skills, List<String> features, List<String> proficiencies,
    		List<String> guaranteedEquipment, List<String> languages,
    		List<String> racialBonuses, List<String> subRacialBonuses,
    		List<String> miscCharacterInfo) throws IOException
    {
    	PDDocument loadedDocument = loadDocument(path);
    	PDAcroForm acroForm = getDocumentCatalog(loadedDocument);
    	if(acroForm != null)
    	{
    		acroForm.getField("CharacterName").setValue(character.get(0));
    		acroForm.getField("PlayerName").setValue(miscCharacterInfo.get(2));
    		acroForm.getField("Race ").setValue(miscCharacterInfo.get(0));
    		acroForm.getField("Alignment").setValue(miscCharacterInfo.get(1));
    		acroForm.getField("ClassLevel").setValue(miscCharacterInfo.get(3) + "1");
    		acroForm.getField("XP").setValue("0");
    		acroForm.getField("STR").setValue(character.get(1));
    		acroForm.getField("STRmod").setValue(modifiers.get(0));
    		acroForm.getField("DEX").setValue(character.get(2));
    		acroForm.getField("DEXmod ").setValue(modifiers.get(1));
    		acroForm.getField("CON").setValue(character.get(3));
    		acroForm.getField("CONmod").setValue(modifiers.get(2));
    		acroForm.getField("INT").setValue(character.get(4));
    		acroForm.getField("INTmod").setValue(modifiers.get(3));
    		acroForm.getField("WIS").setValue(character.get(5));
    		acroForm.getField("WISmod").setValue(modifiers.get(4));
    		acroForm.getField("CHA").setValue(character.get(6));
    		acroForm.getField("CHamod").setValue(modifiers.get(5));
    		acroForm.getField("Passive").setValue(modifiers.get(6));
    		acroForm.getField("ProfBonus").setValue(characterClass.get(3));
    		String profLang = concatStrings(concatList(proficiencies), concatList(languages));
    		acroForm.getField("ProficienciesLang").setValue(profLang);
    		acroForm.getField("Initiative").setValue(modifiers.get(1));
    		acroForm.getField("Speed").setValue(character.get(7));
    		acroForm.getField("HPMax").setValue(characterClass.get(2));
    		acroForm.getField("HPCurrent").setValue(characterClass.get(2));
    		acroForm.getField("HDTotal").setValue(characterClass.get(0));
    		acroForm.getField("HD").setValue(characterClass.get(1));
    		String raceBonuses = concatStrings(concatList(racialBonuses), concatList(subRacialBonuses));
    		String raceAndFeatures = concatStrings(raceBonuses, concatList(features));

    		acroForm.getField("Features and Traits").setValue(raceAndFeatures);

    		// Save and close the filled out form.
    		loadedDocument.save("C:/Users/Branl/workspace/DnD Character Creator/FilledOutForm.pdf");
    		loadedDocument.close();
    	}
    }
    
    /**
     * Formats the list into a string with each new element on a new line.
     * @param list
     * @return fullString
     */
    public String concatList(List<String> list)
    {
		String fullString = "";
		for(int i = 0; i < list.size(); i++)
		{
			if(i != list.size() - 1)
			{
				fullString = fullString.concat(list.get(i) + "\n");
			}
			else
			{
				fullString = fullString.concat(list.get(i));
			}
		}
		return fullString;
    }
    
    /**
     * Concatenates strings together for entry into a text field.
     * @param firstString
     * @param secondString
     * @return concatString
     */
    public String concatStrings(String firstString, String secondString)
    {
    	if(secondString == null)
    	{
    		return firstString;
    	}
    	else
    	{
    	return firstString.concat("\n" + secondString);
    	}
    }
}