package exm2024;

public class Serie extends Content {
	private int nbEpisodes;
	private int dureeEpisodes;

	public Serie(int nbEpisodes , int dureeEpisodes , String title , String genre , boolean isFree) {
		super(title,genre,isFree);
		this.nbEpisodes=nbEpisodes;
		this.dureeEpisodes=dureeEpisodes;
	}
	public void afficheDetails() {
		System.out.println("Title"+ title);
		System.out.println("genre"+ genre);
		System.out.println("nbr episodes"+ nbEpisodes);
		System.out.println("duree de l'ep"+ dureeEpisodes);
		
	}
	public int getDuration() {
		return nbEpisodes* dureeEpisodes;
		
	}
}
