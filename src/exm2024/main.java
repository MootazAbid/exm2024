package exm2024;

public class main {
	public static void main(String[] args) {
        StreamingPlatform p = new StreamingPlatform(10, 10);
        Movie m1 = new Movie("Inception", "Sci-Fi", false, 148);
        Serie s1 = new Serie("Stranger Things", "Thriller", false, 25, 50);
        Movie m2 = new Movie("Charlie Chaplin", "Comedy", true, 75);
        Serie s2 = new Serie("Friends", "Comedy", true, 236, 22);
        p.addContent(m1);
        p.addContent(s1);
        p.addContent(m2);
        p.addContent(s2);
        m1.afficheDetails();
        s1.afficheDetails();
        m2.afficheDetails();
        s2.afficheDetails();
        User user1 = new User("Imene", false);
        User user2 = new User("Jihene", true);
        p.addUser(user1);
        p.addUser(user2);
        try {
            p.playContent(user1, "Inception");}
        catch (ContentNotFoundException e) {
            System.out.println(e.getMessage());}
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());}
        try {
            p.playContent(user1, "Charlie Chaplin");}
        catch (ContentNotFoundException e) {
            System.out.println(e.getMessage());}
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());}
        try {
            p.playContent(user2, "Stranger Things");}
        catch (ContentNotFoundException e) {
            System.out.println(e.getMessage());}
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());}
        try {
            p.playContent(user2, "Friends");}
        catch (ContentNotFoundException e) {
            System.out.println(e.getMessage());}
        catch (AccessDeniedException e) {
            System.out.println(e.getMessage());}
        Content[] recommendations = p.getRecommendations(user2);
        System.out.println("Recommendations for Jihene:");
        for (int i = 0; i < recommendations.length; i++) {
            if (recommendations[i] != null) {
                recommendations[i].afficheDetails();}}
    }

}
