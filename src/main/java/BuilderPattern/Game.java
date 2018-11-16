package BuilderPattern;

public class Game
{



    private String awayTeam;
    private String homeTeam;
    private String currentYardLine;
    private String stadium;
    private String weather;



    public Game(GameBuilder builder)
    {
        awayTeam = builder.awayTeam;
        homeTeam = builder.homeTeam;
        currentYardLine = builder.currentYardLine;
        stadium = builder.stadium;
        weather = builder.weather;
    }



}
