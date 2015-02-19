import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<Integer>(maxScoreCount);
    maxCount = maxScoreCount;
  }
  
  public void addScore(int score) {    
    if(isHighScore(score))
    {
      for(int i=0; i<scores.size();i++)
      {
        if(score > scores.get(i))
        {
          scores.add(i,score);
          if(scores.size() > maxCount)
          {
            for(int j=maxCount; j<scores.size();j++)
              scores.remove(j);
          }
          return;
        }
      }
      if(scores.size() < maxCount)
        scores.add(score);
      if(scores.size() > maxCount)
      {
        for(int k=maxCount; k<scores.size();k++)
          scores.remove(k);
      }
    }
  }
  
  public boolean isHighScore(int score) {
    for(int i=0; i<=maxCount-1; i++)
    {
      if(scores.size() < maxCount)
        return true;
      if(score >= scores.get(i))
        return true;
    }
    return false;
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