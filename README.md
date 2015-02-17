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

### Testing Multiple Scores

Before you write the next test, answer the following:

**Question 1:** After adding a new score, the scoreboard should always be in
descending sorted order. When writing tests we want to think of conditions
that might expose coding errors. In what order should scores be added to the
scoreboard so we can convince ourselves the code works correctly?

Now write a test that puts a `Scoreboard` object in a state where it contains
multiple scores, and then verify that the scores are all present and in the
proper order.

### Testing the Scoreboard Size

A `Scoreboard` should never contain more than `maxScoreCount` scores. Write
another test that adds a number of scores greater than `maxScoreCount` and
tests that there are only `maxScoreCount` scores in the `Scoreboard` and that
they are in the proper order.

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
