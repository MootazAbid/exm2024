package exm2024;
public class StreamingPlatfrom {
	private Content[] contents;
	private User[] users;
	private int nbUsers;
	private int nbContents;
	public StreamingPlatfrom(int capaciteContents, int capaciteUsers) {
		contents=new Content[capaciteContents];
		users=new User[capaciteUsers];
		nbUsers=0;
		nbContents=0;
	}
	 public void addContent(Content content) {
	        if (nbContents < contents.length) {
	            contents[nbContents] = content;
	            nbContents++;}}
	public void addUser(User user) {
		if(nbUsers< users.length) {
			users[nbUsers]=user;
			nbUsers++;
		}
	}
	public Content findContent(String title) throws ContentNotFoundException {
	    for (int i = 0; i < nbContents; i++) {
	    	if (contents[i].getTitle().equals(title)) {
	            return contents[i];}}
	    throw new ContentNotFoundException("Content not found!");
	}
	 public void playContent(User user, String title) throws ContentNotFoundException , AccessDeniedException {
	        Content c = findContent(title);
	        if (user.canplay(c) == false) {
	        	throw new AccessDeniedException("Access denied!");}
	        c.play();
	        user.addWatchedContent(c);}
	    public Content[] getRecommendations(User user) {
	        Content[] recommendations = new Content[10];
	        String[] genres = user.getWatchedGenres();
	        int nbRecommendations = 0;
	        for (int i = 0; i < nbContents; i++) {
	            boolean sameGenre = false;
	            for (int j = 0; j < genres.length; j++) {
	                if (contents[i].getGenre().equals(genres[j])) {
	                    sameGenre = true;}}
	            if (sameGenre == true && user.hasWatched(contents[i]) == false) {
	                if (nbRecommendations < 10) {
	                    recommendations[nbRecommendations] = contents[i];
	                    nbRecommendations++;}}}
	        return recommendations;
	    }
}




