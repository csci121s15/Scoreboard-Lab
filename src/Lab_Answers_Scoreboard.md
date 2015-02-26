***Wilson Silverio Scoreboard-Lab answers***

**Question 1:** In terms of the mantra, describe the tests you need to verify the correctness of a *non-full* `Scoreboard` with more than two entries.  Be specific about how many tests you need.

>Since one more socre is being added to the scoreboard, we need to check all the current scores that are on the board and see if they're in order. We would also test the Scoreboard to confirm the all scores at in descending and ascending order.


**Question 2:** In terms of the mantra, describe the tests you need to verify the corrections of a *full* `Scoreboard`.  Be speicific about how many tests you need.  *HINT*: Think carefully about the "bottom" of the `Scoreboard`.

>We'll have to create a Scoreboard with the maximum amount of score, then pass those scores through the scoreboard to see if they pass into Scoreboard. We'll also need to test the scores to make sure that they're in descending and ascending order; we'll also check if the full set of scores are present.