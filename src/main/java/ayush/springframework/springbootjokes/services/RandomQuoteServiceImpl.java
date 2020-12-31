package ayush.springframework.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
public class RandomQuoteServiceImpl implements RandomQuoteService {
    @Override
    public String getJokeQuote() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
