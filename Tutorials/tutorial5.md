# Tutorial 4 - Writing JUnit Tests

## Step 1

* Create a new repository for the repository from the link in blackboard.
* Connect the new repository to your eclips.
* Find the 3 packages, line, robot and score.

## Step 2 - Line

* Take the line package and look at the Line class and the LineTest class. This is the solution to the Line repl and the tests we used on them.
* Run the tests and look at the results. 
* Make changes to the Line method to see how the tests results change.
* For each test, rewrite it so that the explected and actual results are variables (so we can identify them) and that each assert includes a message which explains what was expected to happen.

## Step 3 - Robot

* This is the broken robot from the last set of repls.
* Generate a test class for the Robot class, and write a test to ensure the constructor is working properly.
* Write a note (as a comment) of all of the other tests you think would make sense for this class. (You can compare to the tests we wrote for the repl).

## Step 4 - Score

* There's no code here!
* You'll have to write your Score class here, but first lets write the test.
* Take the list of behaviours and tests you generated yesterday and write a test for each of those (at least the begining).
* Notice that your test doesn't compile (that's because the Score class doesn't exist).
* You could solve that by writing the whole Score class, but that might take time, so instead you can create "Stubs". A stub is a method with the same signature as the real method, but that returns a default value (or better yet throws an exception). You can do that manually, but Eclipse will actually do work for you (right click).
