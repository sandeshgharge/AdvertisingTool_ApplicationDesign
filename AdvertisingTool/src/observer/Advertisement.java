package observer;


import adapter.EnglishTranslator;
import adapter.GermanTranslator;
import adapter.Translator;

public abstract class Advertisement implements Observer{
	
	protected String adName;
	protected String description;
	protected String info;
	
	public Advertisement(String adName, String description) {
		this.adName = adName;
		this.description = description;
		update("English");
	}
	/*
	 * Translator is an Adapter used to change the language from English to German
	 * and visa versa
	 */
	public Translator translator;

	@Override
	public void update(String language) {
		// TODO Auto-generated method stub
		
		if(language.equals("English"))
			translator = new EnglishTranslator();
		else
			translator = new GermanTranslator();
		
	}
	
	
	@Override
	public String showInformation() {
		// TODO Auto-generated method stub
		info = this.translator.translate(info);
		return 	info;
	}
	
	@Override
	public String getAdName() {
		return this.adName;
	}
}
