import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("Dr.");
        author1.setLastName("Seuss");

        Quote quote1 = new Quote();
        quote1.setAuthor("Dr. Seuss");
        quote1.setId(1);
        quote1.setAuthorId(1);
        quote1.setContent("Oh the thinks you can think!");

        Quote quote2 = new Quote();
        quote2.setAuthor("Dr. Seuss");
        quote2.setId(2);
        quote2.setAuthorId(1);
        quote2.setContent("You’ll be on your way up! You’ll be seeing great sights! You’ll join the high fliers who soar to high heights.");

        ArrayList<Quote> quotesArr = new ArrayList<>();
        quotesArr.add(quote1);
        quotesArr.add(quote2);
        System.out.println();


        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("Polo G");
        album1.setName("Hall of Fame");
        album1.setGenre("Rap");
        album1.setReleaseDate("06-11-2021");
        album1.setSales(181.9);

        System.out.println(album1.getArtist());
        System.out.println(album1.getName());
        System.out.println(album1.getGenre());
        System.out.println(album1.getReleaseDate());
        System.out.println(album1.getSales());

    }
}
