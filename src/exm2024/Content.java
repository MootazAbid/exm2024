package exm2024;

public abstract class Content {
	protected String title;
	protected String genre;
	protected boolean isFree;
	
	public Content (String titre , String genre , boolean isFree) {
		this.title=title;
		this.genre=genre;
		this.isFree=isFree;
	}
	public abstract void afficheDetails();
	
	public void play() {
		System.out.println("lecture de :"+ getClass().getSimpleName());
		afficheDetails();
	}
	public String getTitle() {
		return title;
		
	}
	public String getGenre() {
		return genre;
	}
	public boolean isFree() {
		return isFree;
	}
	
	
}
