import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<Integer>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    int n = getNumScores();
    int e = 0;
    if (n == 0){
      scores.add(score);
    }
    else if (n != 0){
      int count = 0;
      int i = getScore(count);
      while(e != 1){
        if (score < i){
          count ++;
          i = getScore(count);
        }
        else if (score > i){
          scores.add(count, score);
          e = 1;
        }
        else if (score == i){
          scores.add(count, score);
          e = 1;
        }
      }
      if(getNumScores() > maxCount){
        scores.remove(maxCount);
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