import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<Integer>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {
    int scoreSize1 = scores.size();
    
    if (scores.size() == 0)
    {
      scores.add(score);
    }
    
    
    for (int i = 0; i < scores.size(); i++)
    {
      if (score > scores.get(i))
      {
        scores.add(i, score);
        if (scores.size() == maxCount + 1)
        {
          scores.remove(maxCount);
        }
        return;
      }
    }
    
    int scoreSize2 = scores.size();
    
    if (scoreSize2 == scoreSize1)
    {
    scores.add(score);
    }
    
    if (scores.size() == maxCount + 1)
    {
      scores.remove(maxCount);
    }
  }
  
  public boolean isHighScore(int score) {
    boolean isTrue = false;
    
    if (scores.size() == 0 && score == 0)
    {
      isTrue = true;
    }
    
    for (int i = 0; i < scores.size(); i++)
    {
      if (score == scores.get(i))
      {
       isTrue = true;
      }
    }
    return isTrue;
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