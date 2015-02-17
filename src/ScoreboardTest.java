import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertTrue(sb.isHighScore(0));
    assertEquals(0, sb.getScore(0));
    assertEquals(0, sb.getNumScores());
  }
  
  public void testOneEntry() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
  }
  
  public void testSecondScoreBeforeFirst()
  {
    Scoreboard sb = new Scoreboard(10);
    
    
    sb.addScore(40);
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(40, sb.getScore(1));
  }
  
  public void testSecondScoreAfterFrist()
  {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(40);
    sb.addScore(30);
    
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(30));
    assertEquals(40, sb.getScore(0));
    assertEquals(30, sb.getScore(1));
  }


  public void testMultipleScoresAccending()
  {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(10);
    sb.addScore(20);
    sb.addScore(30);
    sb.addScore(40);
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    
    assertEquals(50, sb.getScore(0));
    assertEquals(40, sb.getScore(1));
    assertEquals(30, sb.getScore(2));
    assertEquals(20, sb.getScore(3));
    assertEquals(10, sb.getScore(4));
  } 

  public void testMultipleScoresDeccending()
    {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(40);
    sb.addScore(30);
    sb.addScore(20);
    sb.addScore(10);
    
    assertTrue(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    
    assertEquals(50, sb.getScore(0));
    assertEquals(40, sb.getScore(1));
    assertEquals(30, sb.getScore(2));
    assertEquals(20, sb.getScore(3));
    assertEquals(10, sb.getScore(4));
  } 
  
  public void testMultipleScoresMixed()
    {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(10);
    sb.addScore(30);
    sb.addScore(50);
    sb.addScore(40);
    sb.addScore(20);
    
    assertTrue(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    
    assertEquals(50, sb.getScore(0));
    assertEquals(40, sb.getScore(1));
    assertEquals(30, sb.getScore(2));
    assertEquals(20, sb.getScore(3));
    assertEquals(10, sb.getScore(4));
  }
  
  public void testFullDeccending()
  {
    Scoreboard sb = new Scoreboard(5);
    
    sb.addScore(60);
    sb.addScore(50);
    sb.addScore(40);
    sb.addScore(30);
    sb.addScore(20);
    sb.addScore(10);
    
    assertFalse(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    assertTrue(sb.isHighScore(60));
    
    assertEquals(60, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(40, sb.getScore(2));
    assertEquals(30, sb.getScore(3));
    assertEquals(20, sb.getScore(4));

    assertEquals(5, sb.getNumScores());
  } 
  
  public void testFullAscending()
  {
    Scoreboard sb = new Scoreboard(5);
    
    sb.addScore(10);
    sb.addScore(20);
    sb.addScore(30);
    sb.addScore(40);
    sb.addScore(50);
    sb.addScore(60);
    
    assertFalse(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    assertTrue(sb.isHighScore(60));
    
    assertEquals(60, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(40, sb.getScore(2));
    assertEquals(30, sb.getScore(3));
    assertEquals(20, sb.getScore(4));

    assertEquals(5, sb.getNumScores());
  } 
  
  public void testFullMixed()
  {
    Scoreboard sb = new Scoreboard(5);
    
    sb.addScore(10);
    sb.addScore(40);
    sb.addScore(30);
    sb.addScore(60);
    sb.addScore(50);
    sb.addScore(20);
    
    assertFalse(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
    assertTrue(sb.isHighScore(40));
    assertTrue(sb.isHighScore(50));
    assertTrue(sb.isHighScore(60));
    
    assertEquals(60, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(40, sb.getScore(2));
    assertEquals(30, sb.getScore(3));
    assertEquals(20, sb.getScore(4));

    assertEquals(5, sb.getNumScores());
  } 
  
  public void testFullSameVal()
  {
    Scoreboard sb = new Scoreboard(5);
    
    sb.addScore(10);
    sb.addScore(20);
    sb.addScore(20);
    sb.addScore(20);
    sb.addScore(30);
    sb.addScore(20);
    sb.addScore(20);
    
    assertFalse(sb.isHighScore(10));
    assertTrue(sb.isHighScore(20));
    assertTrue(sb.isHighScore(30));
 
    assertEquals(30, sb.getScore(0));
    assertEquals(20, sb.getScore(1));
    assertEquals(20, sb.getScore(2));
    assertEquals(20, sb.getScore(3));
    assertEquals(20, sb.getScore(4));

    assertEquals(5, sb.getNumScores());
  } 
}
    