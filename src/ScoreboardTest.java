import junit.framework.TestCase;

public class ScoreboardTest extends TestCase {
  public void testEmptyScoreboard() {
    Scoreboard sb = new Scoreboard(10);
    
    assertFalse(sb.isHighScore(10));
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
  
  public void testSecondScoreBeforeFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }
  
  public void testSecondScoreAfterFirst() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(25));
    assertEquals(50, sb.getScore(0));
    assertEquals(25, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  }  
  
  public void testHighestOfMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(100));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(150);
    
    assertTrue(sb.isHighScore(150));
    assertEquals(150, sb.getScore(0));
    assertEquals(100, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
    
  public void testMiddleOfMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(100));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(75);
    
    assertTrue(sb.isHighScore(75));
    assertEquals(100, sb.getScore(0));
    assertEquals(75, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
  
  public void testEndofMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(100));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(25));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(25, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
  }
  
  public void test5ScoreMultipleScores() {
    Scoreboard sb = new Scoreboard(10);
    
    sb.addScore(50);
    
    assertTrue(sb.isHighScore(50));
    assertEquals(50, sb.getScore(0));
    assertEquals(1, sb.getNumScores());
    
    sb.addScore(100);
    
    assertTrue(sb.isHighScore(100));
    assertEquals(100, sb.getScore(0));
    assertEquals(50, sb.getScore(1));
    assertEquals(2, sb.getNumScores());
  
    sb.addScore(90);
    
    assertTrue(sb.isHighScore(90));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(50, sb.getScore(2));
    assertEquals(3, sb.getNumScores());
    
    sb.addScore(80);
    
    assertTrue(sb.isHighScore(80));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(50, sb.getScore(3));
    assertEquals(4, sb.getNumScores());
    
    sb.addScore(25);
    
    assertTrue(sb.isHighScore(25));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(50, sb.getScore(3));
    assertEquals(25, sb.getScore(4));
    assertEquals(5, sb.getNumScores());
  }
  
  public void FullScoreboardBottomValue() {
    Scoreboard sb = new Scoreboard(10);
    
    int[] numbers = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    
    for ( int item : numbers) {
      sb.addScore(item);
    }
    
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(70, sb.getScore(3));
    assertEquals(60, sb.getScore(4));
    assertEquals(50, sb.getScore(5));
    assertEquals(40, sb.getScore(6));
    assertEquals(30, sb.getScore(7));
    assertEquals(20, sb.getScore(8));
    assertEquals(10, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
    
    sb.addScore(15);
    
    assertTrue(sb.isHighScore(15));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(70, sb.getScore(3));
    assertEquals(60, sb.getScore(4));
    assertEquals(50, sb.getScore(5));
    assertEquals(40, sb.getScore(6));
    assertEquals(30, sb.getScore(7));
    assertEquals(20, sb.getScore(8));
    assertEquals(15, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
  }
  
  public void FullScoreboardMiddleValue() {
    Scoreboard sb = new Scoreboard(10);
    
    int[] numbers = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    
    for ( int item : numbers) {
      sb.addScore(item);
    }
    
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(70, sb.getScore(3));
    assertEquals(60, sb.getScore(4));
    assertEquals(50, sb.getScore(5));
    assertEquals(40, sb.getScore(6));
    assertEquals(30, sb.getScore(7));
    assertEquals(20, sb.getScore(8));
    assertEquals(10, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
    
    sb.addScore(75);
    
    assertTrue(sb.isHighScore(15));
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(75, sb.getScore(3));
    assertEquals(70, sb.getScore(4));
    assertEquals(60, sb.getScore(5));
    assertEquals(50, sb.getScore(6));
    assertEquals(40, sb.getScore(7));
    assertEquals(30, sb.getScore(8));
    assertEquals(20, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
    
  }
  
  public void FullScoreboardFunTest() {
    Scoreboard sb = new Scoreboard(10);
    
    int[] numbers = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    
    for ( int item : numbers) {
      sb.addScore(item);
    }
    
    assertEquals(100, sb.getScore(0));
    assertEquals(90, sb.getScore(1));
    assertEquals(80, sb.getScore(2));
    assertEquals(70, sb.getScore(3));
    assertEquals(60, sb.getScore(4));
    assertEquals(50, sb.getScore(5));
    assertEquals(40, sb.getScore(6));
    assertEquals(30, sb.getScore(7));
    assertEquals(20, sb.getScore(8));
    assertEquals(10, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
    
    //Time to add another 10 random scores~
    
    int[] numbers1 = {317, 284, 255, 98, 86, 76, 75, 48, 16, 4};
    
    for ( int item : numbers1) {
      sb.addScore(item);
    }
    
    assertEquals(317, sb.getScore(0));
    assertEquals(284, sb.getScore(1));
    assertEquals(255, sb.getScore(2));
    assertEquals(100, sb.getScore(3));
    assertEquals(98, sb.getScore(4));
    assertEquals(86, sb.getScore(5));
    assertEquals(80, sb.getScore(6));
    assertEquals(76, sb.getScore(7));
    assertEquals(75, sb.getScore(8));
    assertEquals(70, sb.getScore(9));
    assertEquals(10, sb.getNumScores());
  }
}
