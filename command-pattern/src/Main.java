import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        usingSwitchCase();
//        usingCommandPattern();
//        usingCommandPatternWithLambda();
        usingCommandPatternWithMethodReference();
    }

    public static void usingSwitchCase() {
        System.out.println("Testing switch case");
        Player ourPlayer = new Player(10, 15);

        Scanner in = new Scanner(System.in);
        boolean doAgain = true;
        do {
            System.out.println(ourPlayer);
            String s = in.nextLine();
            switch (s) {
                case "w":
                    ourPlayer.moveUp();
                    break;
                case "s":
                    ourPlayer.moveDown();
                    break;
                case "a":
                    ourPlayer.moveLeft();
                    break;
                case "d":
                    ourPlayer.moveRight();
                    break;
                default:
                    System.out.println("Good bye!");
                    doAgain = false;
                    break;
            }

        } while (doAgain);
    }

    public static void usingCommandPattern() {
        System.out.println("Testing command pattern");
        Player ourPlayer = new Player(10, 15);

        Map<String, Action> commands = new HashMap<>();
        commands.put("w", new MoveUp(ourPlayer));
        commands.put("s", new MoveDown(ourPlayer));
        commands.put("a", new MoveLeft(ourPlayer));
        commands.put("d", new MoveRight(ourPlayer));

        Scanner in = new Scanner(System.in);
        boolean doAgain = true;
        do {
            System.out.println(ourPlayer);
            String s = in.nextLine();
            if (commands.containsKey(s)) {
                Action action = commands.get(s);
                action.perform();
            } else {
                System.out.println("Good bye!");
                doAgain = false;
            }

        } while (doAgain);
    }

    public static void usingCommandPatternWithLambda() {
        System.out.println("Testing command pattern with lambda");
        Player ourPlayer = new Player(10, 15);

        Map<String, Action> commands = new HashMap<>();
        commands.put("w", () -> ourPlayer.moveUp());
        commands.put("s", () -> ourPlayer.moveDown());
        commands.put("a", () -> ourPlayer.moveLeft());
        commands.put("d", () -> ourPlayer.moveRight());

        Scanner in = new Scanner(System.in);
        boolean doAgain = true;
        do {
            System.out.println(ourPlayer);
            String s = in.nextLine();
            if (commands.containsKey(s)) {
                Action action = commands.get(s);
                action.perform();
            } else {
                System.out.println("Good bye!");
                doAgain = false;
            }

        } while (doAgain);
    }

    public static void usingCommandPatternWithMethodReference() {
        System.out.println("Testing command pattern with method reference");
        Player ourPlayer = new Player(10, 15);

        Map<String, Action> commands = new HashMap<>();
        commands.put("w", ourPlayer::moveUp);
        commands.put("s", ourPlayer::moveDown);
        commands.put("a", ourPlayer::moveLeft);
        commands.put("d", ourPlayer::moveRight);

        Scanner in = new Scanner(System.in);
        boolean doAgain = true;
        do {
            System.out.println(ourPlayer);
            String s = in.nextLine();
            if (commands.containsKey(s)) {
                Action action = commands.get(s);
                action.perform();
            } else {
                System.out.println("Good bye!");
                doAgain = false;
            }

        } while (doAgain);
    }
}