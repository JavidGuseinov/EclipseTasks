package youtubeProject;

public abstract class BaseCreditManager implements CreditManager {
	
	public abstract void Calculate(); // Abstract(Tamamlanmamış seçeneği sunuyor.) 
	
	public  void Save() {
		System.out.println("Kaydedildi.");
		
	}

}