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
    sb.addScore(40);
    
    assertTrue(sb.isHighScore(40));
    assertEquals(40, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(40);
    sb.addScore(20);
    
    assertTrue(sb.isHighScore(40));
    assertEquals(40, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  public void testThirdScoreFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(10);
    sb.addScore(20);
    sb.addScore(30);
    
    assertTrue(sb.isHighScore(30));
    assertEquals(30, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(10, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }
  public void testThirdScoreInMiddle() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(30);
    sb.addScore(10);
    sb.addScore(20);
    
    assertTrue(sb.isHighScore(30));
    assertEquals(30, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(10, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }
  public void testThirdScoreInLast() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(30);
    sb.addScore(20);
    sb.addScore(10);
    
    assertTrue(sb.isHighScore(30));
    assertEquals(30, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(10, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
  }
}

