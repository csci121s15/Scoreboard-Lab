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
    
//    for(int i = 0; i < getNumScores() - 1; i++) {
//      if(score > scores.get(i)) {
//        scores.set(i + 1, scores.get(i));
//        scores.set(i, score);
//      }
//    }
        
    // adding to an arraylist places the number to the new 11th index
    if(getNumScores() > 1) {
      for(int i = getNumScores() - 1; i > 0; i--) {
        // check if the current score is greater than the one before it
        if(scores.get(i) > scores.get(i - 1)) {
          // switch the current score and one before it
          int temp = scores.get(i - 1);
          scores.set(i - 1, scores.get(i));
          scores.set(i, temp);
        }
      }
      // if the number of scores is too large, remove the extra score
      if(getNumScores() > maxCount) {
        scores.remove(maxCount);
      }
    }
  }
  
//   public void addScore(int score) {
//    scores.add(score);
//    
//    
//    for(int i = 0; i < getNumScores(); i++) {
//      int min = i;
//      for(int j = 0; j + 1 < getNumScores(); i++) {
//        
//        if(scores.get(j) < scores.get(min)) {
//          min = j;
//        }
//      int temp = 0;
//      scores.set(temp, scores.get(i));
//      scores.set(i, min);
//      scores.set(min, temp);   
//      }
//    }
//  }

  
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