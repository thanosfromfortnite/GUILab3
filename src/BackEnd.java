import java.util.ArrayList;
import java.util.List;

public class BackEnd {
    private int score, increment;
    private ArrayList<Integer> puzzle = new ArrayList<>();

    public void addNextPattern() {
        puzzle.add((int) (Math.random() * 4));
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

    public int returnPartOfPattern(int index) {
        return puzzle.get(index);
    }

    public void increment() {
        increment ++;
    }

    public void resetIncrement() {
        increment = 0;
    }

    public int getIncrement() {
        return increment;
    }
    public boolean checkIfIndexIsFrickedUp(int index) {
        if (index >= puzzle.size()) {
            return true;
        }
        else return false;
    }

    public void addScore(int increment) {
        score += increment;
    }

    public int returnScore() {
        return score;
    }

    public void createHighScore(String name) {
        String hiScore = name + ": " + score;
    }

}
