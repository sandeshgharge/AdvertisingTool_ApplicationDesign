package observer;

public interface Subject {
	
	public void register (Observer o);
	public void unRegister (Observer o);
	public void notifyObserver ();
	public int displayObserver();
	public void displayTitle();
	public Observer fetchObject(int i);
	public void setLanguage(String language);
}
