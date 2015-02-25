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
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(25);
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testThreeScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(25);
    sb.addScore(50);
    sb.addScore(32);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(2));
    assertEquals(32, sb.getScore(1));
    assertEquals(3, sb.getNumScores());
  }
  
  public void testFullScoreboardWithHighScore() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(25);
    sb.addScore(50);
    sb.addScore(32);
    sb.addScore(45);
    sb.addScore(14);
    sb.addScore(64);
    sb.addScore(87);
    sb.addScore(35);
    sb.addScore(90);
    sb.addScore(39);
    sb.addScore(71);
    sb.addScore(38);
    
    assertEquals(90, sb.getScore(0));
    assertEquals(87, sb.getScore(1));
    assertEquals(71, sb.getScore(2));
    assertEquals(64, sb.getScore(3));
    assertEquals(50, sb.getScore(4));
    assertEquals(45, sb.getScore(5));
    assertEquals(39, sb.getScore(6));
    assertEquals(38, sb.getScore(7));
    assertEquals(35, sb.getScore(8));
    assertEquals(32, sb.getScore(9));
    assertEquals(25, sb.getScore(10));
  }
  
  public void testFullScoreboardWithLowScore() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(25);
    sb.addScore(50);
    sb.addScore(32);
    sb.addScore(45);
    sb.addScore(14);
    sb.addScore(64);
    sb.addScore(87);
    sb.addScore(35);
    sb.addScore(90);
    sb.addScore(39);
    sb.addScore(27);
    sb.addScore(8);

    assertEquals(90, sb.getScore(0));
    assertEquals(87, sb.getScore(1));
    assertEquals(64, sb.getScore(2));
    assertEquals(50, sb.getScore(3));
    assertEquals(45, sb.getScore(4));
    assertEquals(39, sb.getScore(5));
    assertEquals(35, sb.getScore(6));
    assertEquals(32, sb.getScore(7));
    assertEquals(27, sb.getScore(8));
    assertEquals(25, sb.getScore(9));
    assertEquals(14, sb.getScore(10));
  }
}
