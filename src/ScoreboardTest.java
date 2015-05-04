import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertEquals(0, sb.getScore(0));
    assertEquals(0, sb.getNumScores());
  }
  
  public void testOneEntry() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
  }
  
  public void testSecondBeforeFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(1);
    sb.addScore(2);
      
    assertEquals(1, sb.getScore(0));
    assertEquals(2, sb.getScore(1));  
  }
  
  public void testFirstBeforeSecond() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(1);
    sb.addScore(2);
    
    assertEquals(1, sb.getScore(0));
    assertEquals(2, sb.getScore(1));
  }
  
  public void testHighScore() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(1);
    sb.addScore(2);
    sb.addScore(3);
  
    assertEquals(true, sb.isHighScore(3));
  }
  public void testFullBoard() {
   Scoreboard sb = new Scoreboard(5);
    
   sb.addScore(4);
   sb.addScore(2);
   sb.addScore(1);
   sb.addScore(3);
   sb.addScore(5);
   
   assertEquals(4, sb.getScore(0));
   assertEquals(2, sb.getScore(1));
   assertEquals(1, sb.getScore(2));
   assertEquals(3, sb.getScore(3));
   assertEquals(5, sb.getScore(4));
  
  }

}