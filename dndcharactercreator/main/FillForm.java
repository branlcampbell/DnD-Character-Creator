package dndcharactercreator.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

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
    public void setAllFields(List<String> character, List<String> characterClass,
    		List<String> modifiers, List<String> skills, List<String> features, List<String> proficiencies,
    		List<String> guaranteedEquipment, String alignment) throws IOException
    {
    	PDDocument loadedDocument = loadDocument(path);
    	PDAcroForm acroForm = getDocumentCatalog(loadedDocument);
    	if(acroForm != null)
    	{
    		acroForm.getField("CharacterName").setValue(character.get(0));
    		acroForm.getField("Race").setValue(character.get(11));
    		acroForm.getField("Alignment").setValue(alignment);
    		acroForm.getField("STR").setValue(character.get(1));
    		acroForm.getField("STRmod").setValue(modifiers.get(0));
    		acroForm.getField("DEX").setValue(character.get(2));
    		acroForm.getField("DEXmod").setValue(modifiers.get(1));
    		acroForm.getField("CON").setValue(character.get(3));
    		acroForm.getField("CONmod").setValue(modifiers.get(2));
    		acroForm.getField("INT").setValue(character.get(4));
    		acroForm.getField("INTmod").setValue(modifiers.get(3));
    		acroForm.getField("WIS").setValue(character.get(5));
    		acroForm.getField("WISmod").setValue(modifiers.get(4));
    		acroForm.getField("CHA").setValue(character.get(6));
    		acroForm.getField("CHAmod").setValue(modifiers.get(5));
    		acroForm.getField("ProfBonus").setValue(characterClass.get(2));
    		
    		// Save and close the filled out form.
    		loadedDocument.save("C:/Users/Branl/workspace/Test9/FilledOutForm.pdf");
    		loadedDocument.close();
    	}
    }
}
