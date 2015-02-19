import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertEquals(true, sb.isHighScore(10));
    assertEquals(0, sb.getScore(0));
    assertEquals(0, sb.getNumScores());
  }
  
  public void testOneEntry() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(5);
    
    assertEquals(true, sb.isHighScore(5));
    assertEquals(5, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
  }
  
  public void testMultipleEntries() {
    Scoreboard sb = new Scoreboard(10);
    boolean inOrder = true;
    
    sb.addScore(5);
    sb.addScore(2);
    sb.addScore(7);
    sb.addScore(9);
    sb.addScore(15);
    
    for(int i=0; i<sb.getNumScores()-1; i++)
    {
      if(sb.getScore(i) < sb.getScore(i+1))
        inOrder = false;
    }
    
    assertEquals(true, sb.isHighScore(20));
    assertEquals(true, inOrder);
    assertEquals(5, sb.getNumScores());
  }
  
  public void testTooMany() {
    Scoreboard sb = new Scoreboard(5);
    boolean inOrder = true;
    
    sb.addScore(100);
    sb.addScore(45);
    sb.addScore(25);
    sb.addScore(5);
    sb.addScore(65);
    sb.addScore(25);
    sb.addScore(35);
    
    for(int i=0; i<sb.getNumScores()-1; i++)
    {
      if(sb.getScore(i) < sb.getScore(i+1))
        inOrder = false;
    }
        
    assertEquals(true, sb.isHighScore(45));
    assertEquals(false, sb.isHighScore(20));
    assertEquals(true, inOrder);
    assertEquals(5, sb.getNumScores());
  }
  
  public void testSecondScoreBeforeFirst()
  {
    Scoreboard sb = new Scoreboard(10);
    boolean inOrder = true;
    
    sb.addScore(5);
    sb.addScore(10);
    
    for(int i=sb.getNumScores()-1; i>0; i--)
    {
      if(sb.getScore(i) > sb.getScore(i-1))
        inOrder = false;
    }
    
    assertEquals(true, inOrder);
  }
  
  public void testSecondScoreAfterFirst()
  {
    Scoreboard sb = new Scoreboard(10);
    boolean inOrder = true;
    
    sb.addScore(5);
    sb.addScore(10);
    
    for(int i=0; i<sb.getNumScores()-1; i++)
    {
      if(sb.getScore(i) < sb.getScore(i+1))
        inOrder = false;
    }
    
    assertEquals(true, inOrder);
  }
}
