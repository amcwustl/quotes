package quotes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import quotes.App;
import quotes.Quote;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    private static List<Quote> quotes;
    private static List<Quote> single;

    @BeforeAll
    public static void setUp() {
        quotes = new ArrayList<>();
        quotes.add(new Quote(new String[]{"tag1", "tag2"}, "author 1", "100 likes", "Quote 1"));
        quotes.add(new Quote(new String[]{"tag3"}, "author2", "50 likes", "test"));
        quotes.add(new Quote(new String[]{"tag1", "tag4"}, "author1", "200 likes", "Quote 3"));

        single = new ArrayList<>();
        single.add(new Quote(new String[]{"tag1", "tag2"}, "author 1", "100 likes", "Quote 1"));
    }

    @Test
    public void testGetRandomQuote() {
        String result = App.getRandomQuote(single);
        System.out.println(result);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.equals("Quote Author:'author 1', Quote: 'Quote 1'"));
    }

    @Test
    public void testGetRandomQuoteContaining() {
        String result = App.getRandomQuoteContaining(quotes, "test");
        System.out.println(result);
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.contains("test"));
    }

    @Test
    public void testGetRandomQuoteAuthor() {
        String result = App.getRandomQuoteAuthor(quotes, "author 1");
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.contains("author 1"));
    }
}
