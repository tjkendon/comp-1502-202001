# Tutorial 3 - Debugging in Ecliplse

A debugger is a tool designed to help you automate finding errors in your programs. Frequently you will discover that your software does not behave the way you had expected, usually due to code you did not expect to have execute being run or variables not being set to the values you planned.

Manually we can always add things like print statements to help us understand what's going on in our programs. This can get messy however and we often need to make changes to our code that aren't about fixing the problems, but are just about adjusting our informational outputs.

A debugger is a tool designed to help us avoid needing to print statements or modify our code for testing. The standard debugger for Java is called the **Java Debugger** (JDB). It's a stand-alone program, but it can be (and has been) incorperated directly into your IDE to use.

## Using the Debugger

Your class github will contain some buggy code in the package ``debugger``.
