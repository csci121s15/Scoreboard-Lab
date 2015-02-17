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
}
