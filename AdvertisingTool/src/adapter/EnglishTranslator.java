package adapter;

public class EnglishTranslator implements Translator{

	@Override
	public String translate(String str) { 
		// TODO Auto-generated method stub
		String newString = str;
		newString = newString.replace("Beschreibung","Description");
		newString = newString.replace("Geschätztes Gehalt","Estimated Salary");
		newString = newString.replace("Rolle","Role");
		newString = newString.replace("Stellenangebot","Job Opportunity");
		newString = newString.replace("Angebotspreis","Offer Price");
		newString = newString.replace("Kontaktdetails","Contact Details");
		newString = newString.replace("Auto zu vermieten","Car For Rent");
		newString = newString.replace("Haus zu vermieten","House For Rent");
		newString = newString.replace("Auto zu verkaufen","Car For Sale");
		newString = newString.replace("Elektronik zu verkaufen","Electronics For Sale");
		newString = newString.replace("Von","By");
		newString = newString.replace("Am","On");
		return newString;
	}
}
