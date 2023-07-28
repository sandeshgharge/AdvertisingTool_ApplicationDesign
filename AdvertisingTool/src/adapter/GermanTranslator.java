package adapter;

public class GermanTranslator implements Translator{

	@Override
	public String translate(String str) { 
		// TODO Auto-generated method stub
		String newString = str;
		newString = newString.replace("Description", "Beschreibung");
		newString = newString.replace("Estimated Salary", "Geschätztes Gehalt");
		newString = newString.replace("Role", "Rolle");
		newString = newString.replace("Job Opportunity", "Stellenangebot");
		newString = newString.replace("Offer Price", "Angebotspreis");
		newString = newString.replace("Contact Details", "Kontaktdetails");
		newString = newString.replace("Car For Rent", "Auto zu vermieten");
		newString = newString.replace("House For Rent", "Haus zu vermieten");
		newString = newString.replace("Car For Sale", "Auto zu verkaufen");
		newString = newString.replace("Electronics For Sale", "Elektronik zu verkaufen");
		newString = newString.replace("By","Von");
		newString = newString.replace("On","Am");
		return newString;
	}

}
