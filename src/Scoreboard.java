import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  private int highScore = 0;
  private int temp;
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    scores.add(score);
  }
  public boolean isHighScore(int score) {
    if (score >= getScore(0)){
      return true;
    }
    else {
      return false;
    }
  }
    
  public int getScore(int position) {
    if (position < scores.size()) {
      return scores.get(position);
    }
    else {
      return 0;
    }
  }
  
  public int getNumScores() {
    return scores.size();
  }
}
