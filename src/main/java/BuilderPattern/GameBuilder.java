package BuilderPattern;

public class GameBuilder
{



    private String awayTeam;
    private String homeTeam;
    private int currentYardLine;
    private String stadium;
    private String weather;



    public Game build()
    {
        if (homeTeam == null)
        { throw new IllegalStateException("Missing home team"); }
        if (awayTeam == null)
        { throw new IllegalStateException("No away team"); }
        if (currentYardLine == 0)
        { throw new IllegalStateException("Current YL cant be 0"); }
        if (stadium == null)
        { throw new IllegalStateException("No stadium"); }
        if (weather == null)
        { throw new IllegalStateException("No weather"); }
        return new Game(this);
    }



    public GameBuilder awayTeam(String name)
    {
        awayTeam = name;
        return this;
    }



    public GameBuilder homeTeam(String name)
    {
        homeTeam = name;
        return this;
    }



}
