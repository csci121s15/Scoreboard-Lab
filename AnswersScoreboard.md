**Question 1:** To test the correctness of a non-full scoreboard with more than two 
entries, you would need to run a test for an empty scoreboard, a scoreboard with one entry, 
and a scoreboard with two or more entries. To test it we used a testMultipleScoresNonFull
test. This test takes in the score and adds it in order into the array.

**Question 2:** You need a test called testMultipleScoresFull for a full scoreboard with
more than two entries. You have to set several conditionals in addScore and isHighScore
in order to make sure that the values that are added to scores are in the correct order 
and are not writing each other out. You also need to set a temp score like in 
testMultipleScoresNonFull so that there is a place holder. Have to keep track of max count 
and isHighScore. 


