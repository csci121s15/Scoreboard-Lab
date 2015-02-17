```
Josh Russett
CSCI II Lab
17 Feb 2015
```
#Scoreboard Lab Answers
####Question 1:
In order to properly test multiple scores, we simply need to add at least 3 scores to the scoreboard. However, like the Two-Score tests, we need to test when the score should be in different locations, specifically: 

* When the new score should be the highest (index = `0`)
* When the new score should be in the middle (index = `1`)
* When the new score should be at the end (index = `2`)

We also should throw in more than 3 scores to a new scoreboard to see if it works with more than just 3 scores. (I'll use 5 scores in my test).


####Question 2:
Considering I already tested for more than 3 scores and the code worked correctly, the focus on these tests will be when an element needs to be deleted/popped off from the end of the ArrayList and the new high score needs to be added somewhere in the list. Thus, I need to test:

* When the new score should be the lowest score
* When the new score should be at the head or in the middle

In the latter of the tests, all of the high scores lower than the new high score need to be moved one space down or popped off at the end. 

For fun, I'm also going to add another test that adds an initial 10 values and then add another 10 values and hope it all works.