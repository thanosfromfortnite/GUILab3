import java.util.ArrayList;
import java.util.List;

public class GameTracker {
    private int score;
    private String name;
    private ArrayList<Integer> puzzle = new ArrayList<>();

    public void addNextPattern() {
        puzzle.add((int) (Math.random() * 3));
    }

    public List<Integer> returnPattern() {
        return puzzle;
    }

    public boolean checkCompletion(int guess, int index) {
        if (new Integer(guess).compareTo(puzzle.get(index)) == 0) {
            return true;
        }
        else return false;
    }

    public boolean checkIfIndexIsFrickedUp(int index) {
        if (index >= puzzle.size()) {
            return true;
        }
        else return false;
    }
}
