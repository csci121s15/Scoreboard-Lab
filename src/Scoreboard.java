import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    boolean breaker = false;
    
    if (scores.size() == 0) 
      scores.add(score);
    else {
      for (int i = 0; i < scores.size(); i++) {
        if (score > scores.get(i)) {
          scores.add(i, score);
          breaker = true;
          break;
        }
      }
        
      if (breaker == false)
        scores.add(score);
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