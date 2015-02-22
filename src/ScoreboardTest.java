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
    
    sb.addScore(49);
    
    
    assertTrue(sb.isHighScore(10));
    assertEquals(49, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(2, sb.getNumScores());
    assertEquals(49, sb.getScore(1));
    
  }
  
  public void testSecondScoreAfterFirst(){
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(49);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(49, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testSixScores(){
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    sb.addScore(48);
    sb.addScore(46);
    sb.addScore(44);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(50, sb.getScore(0));
    assertEquals(4, sb.getNumScores());
    
    sb.addScore(49);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(49, sb.getScore(1));
    assertEquals(5, sb.getNumScores());
    
    sb.addScore(51);
    
    assertTrue(sb.isHighScore(10));
    assertEquals(51, sb.getScore(0));
    assertEquals(6, sb.getNumScores());
  
  }
  
  public void testFullScoreboard(){
    Scoreboard sb = new Scoreboard(10);
    
    int[] list ={11, 9, 8, 7, 6, 5 ,4 , 3, 2 ,1};
    
    for (int i : list) {
      sb.addScore(i);
    }
    
    assertEquals(11, sb.getScore(0));
    assertEquals(9, sb.getScore(1));
    assertEquals(8, sb.getScore(2));
    assertEquals(7, sb.getScore(3));
    assertEquals(6, sb.getScore(4));
    assertEquals(5, sb.getScore(5));
    assertEquals(4, sb.getScore(6));
    assertEquals(3, sb.getScore(7));
    assertEquals(2, sb.getScore(8));
    assertEquals(1, sb.getScore(9));
    
    sb.addScore(10);
    
    assertEquals(10, sb.getScore(1));
    assertEquals(2, sb.getScore(9));

                  
  }

  
}