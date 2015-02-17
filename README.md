# CSCI 121: Computer Science II
## Scoreboard Lab

### Overview

In class we started to implement a `Scoreboard` class using test-driven
development. In this lab we will complete the `Scoreboard` implementation.

### The `Scoreboard` Class

Here is a description of the class's methods:

- `Scoreboard(int maxScoreCount)` creates an emtpy scoreboard.
- `void addScore(int score)` adds the score to the appropriate position in the
high score list.  If the score is not a high score, the list is not changed.
- `boolean isHighScore(int score)` returns true if the score is a highscore,
and false otherwise.
- `int getScore(int position)` returns the score in the specified position.
- `int getNumScores()` returns the number of high scores, a value between 0 and
maxScoreCount (inclusive).

The code as we left it in class is in the `src/` directory of this
repository. We created a test for an empty scoreboard and a test for a
scoreboard that contains only one score. Both of the tests currently pass, but
we never wrote a test for a scoreboard that contains multiple scores.

### Testing Two Scores

Recall the Matra of testing:

1. Create an object in a known state.
2. Exercise the object (do something with the object).
3. Verify (test) the current state of the object.

To test the `Scoreboard` with two scores we should:

1. Create a `Scoreboard` with a single score (a state we know is working).
2. Exercise the `Scoreboard` by adding a second score
3. Verify that the `Scoreboard` has the scores in the proper order and that there are 2 scores.

But wait!  In step 2 we could add the second score that is *greater than* or
*less than* the first.  If the second score is greater than the first, then the
second score added needs to take the first position in the scoreboard, and the
first score added needs to be bumped down to second place. That means that we
should have 2 tests.

**Activity:** Add two tests, `testSecondScoreBeforeFirst` and `testSecondScoreAfterFirst` to the `Scoreboard` class, and then modify the `Scoreboard` class so that all four tests pass.


### Testing Multiple Scores

**Question 1:** In terms of the mantra, describe the tests you need to verify the correctness of a *non-full* `Scoreboard` with more than two entries.  Be specific about how many tests you need.

**Activity:** Add the appropriate tests and ensure they pass.

### Testing a Full Scoreboard

A scoreboard should never contain more scores than the value specified in the constructor.

**Question 2:** In terms of the mantra, describe the tests you need to verify the corrections of a *full* `Scoreboard`.  Be speicific about how many tests you need.  *HINT*: Think carefully about the "bottom" of the `Scoreboard`.

**Activity:** Add the appropriate tests and ensure they pass.

### Pushing Labs to GitHub

Here is a refresher on how to submit labs through GitHub.

In the terminal, make sure you are in the directory containing the lab you want
to submit. Check the current status of the git repoisitory by running

```
git status
```

Any files that you added or modified that should be part of the submission need
to be added to the git repository's staging area with `git add`. For this lab
you'll be modifying two files and adding a file with your answers, so you will
type something like this (your answers file might be named something different):

```
git add src/Scoreboard.java src/ScoreboardTest.java Answers.md
```

Now run `git status` again. The changes that will be committed will show up in
green. If all looks good, commit to the repository:

```
git commit
```

Alternatively, to save a little time you can specify your commit message
directly on the command line with the `-m` option so you don't have to use the
editor. Make sure your message is in quotes! For example:

```
git commit -m "Submission for the Scoreboard lab"
```

Now push:

```
git push
```

Finally, create a pull request on GitHub.
