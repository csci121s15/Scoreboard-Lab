import java.util.ArrayList;

public class Scoreboard {
  private ArrayList<Integer> scores;
  private int maxCount;
  
  public Scoreboard(int maxScoreCount) {
    scores = new ArrayList<>(maxScoreCount);
    maxCount = maxScoreCount;
    int addScoreCount = 0;
  }
  
  public void addScore(int score) {
//    if(scores.size() == 0){
//      scores.add(0,score);
//    }
//    else{  
//      if(score > scores.get(0)){
//        scores.add(0,score);
//      }
//      else{
//        scores.add(1,score);
//      }
//    }
    boolean check = false;
    int i = scores.size();
    if(scores.size() == 0){
      scores.add(score);
      return;
    }
//    while(score < scores.get(i-1)){
//      i--;
//      if(i == 0){
//        scores.add(i, score);
//        break;
//      }
//      if(score <= scores.get(i)){
//        scores.add(i, score);
//        break;
//      }
//    }
    for(int x = 0; x < scores.size(); x++){
      int temp = scores.get(x);
      if(score > temp){
        scores.set(x+1, scores.get(x));
        scores.set(x, score);
        check = true;
        return;
      }
    }
    {
      if(!check){ // false
      scores.add(score);
      return;
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