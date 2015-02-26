# CSCI 121: Scoreboard lab
## Hailey Kester 2/19/15

**Question 1:** In terms of the mantra, descrie the tests you need to verify the correctness of a non-full `Scoreboard` with more than two entries.  Be specific about how many tests you need.

**Answer 1:** The tests we would need for more than two entries, let's say three entries, would be that we need to test the third score before and after the first, and the third score before and after the second.  The total number of tests needed for three scores would be 3. For multiple scores we would only need one new test called,`testMultipleScoresNonFull()`.

**Question 2:** In terms of the mantra, describe the tests you need to verify the corrections of a full `Scoreboard`.  Be specific about how many tests you need. 

**Answer 2:** The only test we would need to verify the corrections of a full `Scoreboard` would be `testMultipleScoresFull()` because we would be able to test multiple scores up to the total of scores in the scoreboard in one test. 