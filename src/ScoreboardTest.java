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
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }  
  
  public void testHighestOfMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(150);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(150, sb.getScore(0));
    assertEquals(100, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
    
  public void testMiddleOfMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(75);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(75, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
  
  public void testEndofMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(25, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
  
  public void test5ScoreMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(90);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
    sb.addScore(80);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(50, sb.getScore(3));
    assertEquals(4, sb.getNumScores());
    
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(50, sb.getScore(3));
    assertEquals(25, sb.getScore(4));
    assertEquals(5, sb.getNumScores());
  }
    
}
