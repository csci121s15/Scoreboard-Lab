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
  public void testSecondScoreBeforeFirst(){
    Scoreboard sb = new Scoreboard(10);
    sb.addScore(50);
    sb.addScore(100);
    
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
  }
  public void testSecondScoreAfterFirst(){
    Scoreboard sb = new Scoreboard(10);
    sb.addScore(100);
    sb.addScore(50);
    
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    
  }
  public void testNonFullScoreboard(){
    Scoreboard sb = new Scoreboard(10);
    sb.addScore(1);
    sb.addScore(2);
    sb.addScore(3);
    sb.addScore(4);
    sb.addScore(5);
    
    assertEquals(1, sb.getScore(0));
    assertEquals(2, sb.getScore(1));
    assertEquals(3, sb.getScore(2));
    assertEquals(4, sb.getScore(3));
    assertEquals(5, sb.getScore(4));
  }
  
}
