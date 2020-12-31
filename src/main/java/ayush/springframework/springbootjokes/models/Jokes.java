package ayush.springframework.springbootjokes.models;

public class Jokes {

    private String jokeText;

    Jokes(){}

    Jokes(String joke){
        this.jokeText = joke;
    }
    public String getJokeText() {
        return jokeText;
    }

    public void setJokeText(String jokeText) {
        this.jokeText = jokeText;
    }
}
