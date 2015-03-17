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
    
    sb.addScore(50);
    sb.addScore(100);
    
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
    assertEquals(true, sb.isHighScore(10));
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(100);
    
    assertEquals(50, sb.getScore(1));
    assertEquals(100, sb.getScore(0));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testNonFullScoreBoard() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(10);
    sb.addScore(20);
    sb.addScore(30);
    
    
    assertEquals(30, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(10, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    assertEquals(true, sb.isHighScore(10));
  }
}
