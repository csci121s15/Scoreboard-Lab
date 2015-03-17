# Scoreboard Lab
##Carly Thorpe 
##2/17/15


**Question 1:** In terms of the mantra, you need to verify three tests in a non-full `Scoreboard` before all tests pass. At first we weren't considering if the `Scoreboard` was empty. First, you need to check if the test is empty. If so, you would assign the first score to index 0. Once it goes through that test, it will go into the second two tests to compare the score being added to the previous index and place the score in the index it belongs depending on the values. You have to make sure the scores are being added in decending order, so the highest score is in index 0 and the lowest is in the last index. You would have to have a test that compared the score being added to the index next to it to see where it should be placed.

**Question 2:** In terms of the mantra, you need to verify that tests in a full `Scoreboard` pass. 
You have to test if the scores are listed from least to greatest, if they're listed from greatest to least, when the same value is added more than once, and when they are in a random order. If these tests pass, your full `Scoreboard` will work.
