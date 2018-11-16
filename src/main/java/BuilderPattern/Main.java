package BuilderPattern;

public class Main
{



    public static void main(String[] args)
    {



        GameBuilder builder = new GameBuilder().homeTeam("Denver");
        Game game = builder.build();



    }



}
