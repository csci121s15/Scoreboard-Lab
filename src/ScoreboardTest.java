import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(0, sb.getScore(0));
    assertEquals(0, sb.getNumScores());
  }
  
  public void testOneEntry() {
    Scoreboard sb = new Scoreboard(10);
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
  }
  
  public void testSecondScoreBeforeFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(60);
    sb.addScore(65);
    
    assertEquals(65, sb.getScore(0));
    assertEquals(60, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(25);
    
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(49);
    sb.addScore(50);
    sb.addScore(51);
    
    assertEquals(49, sb.getScore(2));
    assertEquals(50, sb.getScore(1));
    assertEquals(51, sb.getScore(0));
  }
  
  public void testMultipleScoresFull() {
    Scoreboard sb = new Scoreboard(3);
  
    sb.addScore(50);
    sb.addScore(51);
    sb.addScore(52);
    sb.addScore(53);
    
    assertEquals(false, sb.isHighScore(2));
    assertEquals(53, sb.getScore(0));
    assertEquals(52, sb.getScore(1));
    assertEquals(51, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
               
}
}
