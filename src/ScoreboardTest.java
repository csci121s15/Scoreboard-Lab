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
   
    sb.addScore(20);
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(2, sb.getNumScores());
    assertEquals(20, sb.getScore(1));
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(20);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(2, sb.getNumScores());
    assertEquals(20, sb.getScore(1));
  }
  
  public void testFullScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(44);
    sb.addScore(33);
    sb.addScore(66);
    sb.addScore(5);
    sb.addScore(7);
    sb.addScore(6);
    sb.addScore(9);
    sb.addScore(7);
    sb.addScore(8);
    sb.addScore(5);
    sb.addScore(3);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(66, sb.getScore(0));
    assertEquals(5, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
  }
}
