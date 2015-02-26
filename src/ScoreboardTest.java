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
    sb.addScore(51);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(1));
    assertEquals(51, sb.getScore(0));
    assertEquals(2, sb.getNumScores());
  }
    
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(49);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(49, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testMulipleScoresNonFull() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(51);
    sb.addScore(52);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(2));
    assertEquals(51, sb.getScore(1));
    assertEquals(52, sb.getScore(0));
    assertEquals(3, sb.getNumScores());
  } 
  
  public void testMulipleScoresFull() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(51);
    sb.addScore(52);
    sb.addScore(53);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(53, sb.getScore(0));
    assertEquals(51, sb.getScore(2));
    assertEquals(52, sb.getScore(1));
    assertEquals(3, sb.getNumScores());
}
}
