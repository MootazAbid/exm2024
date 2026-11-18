package exm2024;

public class User {
	private String name;
	private boolean isSubscribed;
	private Content[] watchedContent;
	private int nbWatched;
	private static final int MAX_WATCHED=100;
	 public User(String name, boolean isSubscribed) {
		 this.name = name;
		 this.isSubscribed = isSubscribed;
		 watchedContent = new Content[MAX_WATCHED];
		 nbWatched = 0;
	    }
	 public String getName() {
		 return name;
		 
	 }
	 public boolean canplay(Content content) {
		 if (isSubscribed==true || content.isFree()== true) {
			 return true;
		 }
		 return false; 
	 }
	 public void addWatchedContent(Content content) {
		 if(nbWatched < MAX_WATCHED) {
			 watchedContent[nbWatched]=content;
			 nbWatched++;
		 }
	 }
	 public boolean hasWatched(Content content) {
		 for (int i = 0; i < nbWatched; i++) {
			 if (watchedContent[i] == content) {
				 return true;}}
		 return false;
	    }
	 public String[] getWatchedGenres() {
		 String[] genres = new String[nbWatched];
		 int nbGenres = 0;
		 for (int i = 0; i < nbWatched; i++) {
			 String g = watchedContent[i].getGenre();
			 boolean existe = false;
			 for (int j = 0; j < nbGenres; j++) {
				 if (genres[j].equals(g)) {
					 existe = true;}}
			 if (existe == false) {
				 genres[nbGenres] = g;
				 nbGenres++;
				 }}
		 String[] resultat = new String[nbGenres];
		 for (int i = 0; i < nbGenres; i++) {
			 resultat[i] = genres[i];
	        }
		 return resultat;
	   
	}

}
