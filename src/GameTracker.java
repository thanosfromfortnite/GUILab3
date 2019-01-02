import java.util.ArrayList;

public class GameTracker {
    private int score;
    private String name;
    private ArrayList<Integer> puzzle = new ArrayList<>();

    public void addNextPattern() {
        puzzle.add((int) (Math.random() * 3));
    }

    public List
}
