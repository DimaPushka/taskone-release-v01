import java.util.ArrayList;

public class Player {

    private final String name;
    private final VARIANTS variant;


    public Player(VARIANTS variant, String name) {
        this.name = name;
        this.variant = variant;
    }


    public Player() {
        this.name = "Bot";
        this.variant = Random();

    }


    private VARIANTS Random() {

        int rnd = (int) ((Math.random() * 3) + 1);


        return switch (rnd) {
            case 1 -> VARIANTS.PAPER;
            case 2 -> VARIANTS.ROCK;
            default -> VARIANTS.SCISSORS;
        };

    }


    public String whoWins(Player bot, Player human) {


        ArrayList<VARIANTS> arr = new ArrayList<>();
        arr.add(VARIANTS.ROCK);
        arr.add(VARIANTS.PAPER);
        arr.add(VARIANTS.SCISSORS);


        int index1 = arr.indexOf(bot.variant);
        int index2 = arr.indexOf(human.variant);


        if (index1 == index2)
            return "Draw";

        else if ((index1 - index2) == 1 || (index1 - index2) == -2)
            return bot.name + " Win!";
        else
            return human.name + " Win!";

    }
}
