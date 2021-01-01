package ayush.springframework.springbootjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {

    private final ChuckNorrisQuotes quotes;

    public RandomQuoteServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJokeQuote() {
        return quotes.getRandomQuote();
    }
}
