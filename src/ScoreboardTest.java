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
    
    sb.addScore(60);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(60, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
    
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);

    sb.addScore(40);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(40, sb.getScore(1));
    assertEquals(50, sb.getScore(0));
    assertEquals(2, sb.getNumScores());
    
  }
  public void testMoreThanTwoScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(33);
    sb.addScore(4);
    sb.addScore(99);
    sb.addScore(60);
    sb.addScore(54);
    sb.addScore(50);
    sb.addScore(60);
    sb.addScore(40);
    sb.addScore(45);
    sb.addScore(2);
    sb.addScore(5);
    sb.addScore(1);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(5, sb.getScore(8));
    assertEquals(33, sb.getScore(7));
    assertEquals(40, sb.getScore(6));
    assertEquals(45, sb.getScore(5));
    assertEquals(50, sb.getScore(4));
    assertEquals(54, sb.getScore(3));
    assertEquals(60, sb.getScore(2));
    assertEquals(60, sb.getScore(1));
    assertEquals(99, sb.getScore(0));
    assertEquals(4, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
    
  }
 
}
