package exm2024;

public class Movie extends Content{
	private int duration;
	public Movie(int duration , String title , String genre , Boolean isFree ) {
		super(title , genre , isFree);
		this.duration=duration;
	}
	public void afficheDetails() {
		System.out.println("Title"+ title);
		System.out.println("Genre"+ genre);
		System.out.println("Duration"+ duration);
	}
	public int getDuration() {
		return duration;
	}
	

}
