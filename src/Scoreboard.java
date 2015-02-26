import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<Integer>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    if (!isHighScore(score)) {
      return;
    }
    
    if (scores.size() < maxCount) {
      scores.add(score);
    }
    else {
      scores.set(scores.size() - 1, score);
    }
    scores.add(score);
    for(int i = scores.size() -1; i > 0; i--) {
    
      if ( scores.get(i) > scores.get(i - 1)) {
        int temp = scores.get(i-1);
        scores.set(i-1, scores.get(i));
        scores.set(i, temp);
      }
    }
  }
    
  
  public boolean isHighScore(int score) {
    if (scores.size() < maxCount) {
      return true;
    }
    
    else if (score > scores.get(scores.size()-1)) {
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