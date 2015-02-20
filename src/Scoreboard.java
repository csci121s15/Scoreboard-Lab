import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<Integer>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    scores.add(score);
    
    for(int i = scores.size() - 1; i >= 0; i--) {
      if(score > scores.get(i)) {
        scores.set(i+1, scores.get(i));
        scores.set(i, score);
      }
    }
  }
  
  public boolean isHighScore(int score) {
    
      return true;
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