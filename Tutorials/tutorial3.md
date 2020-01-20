# Tutorial 3 - Debugging in Ecliplse

A debugger is a tool designed to help you automate finding errors in your programs. Frequently you will discover that your software does not behave the way you had expected, usually due to code you did not expect to have execute being run or variables not being set to the values you planned.

Manually we can always add things like print statements to help us understand what's going on in our programs. This can get messy however and we often need to make changes to our code that aren't about fixing the problems, but are just about adjusting our informational outputs.

A debugger is a tool designed to help us avoid needing to print statements or modify our code for testing. The standard debugger for Java is called the **Java Debugger** (JDB). It's a stand-alone program, but it can be (and has been) incorperated directly into your IDE to use.

## Using the Debugger

Your class github repository will contain some code in the package ``debugger``. If you're cloning the class repository you should be able to *pull* from the repository, otherwise you'll want to copy the code from the webpage interface.

Once you have the code ready to run, you can run it with the traditional "play" button at the top of your eclipse window. It will output some output to the console in the bottom.

Now instead of running the code with the "play" button, you are going to click the button with a bug on it (this should be just beside the run button). You can also choose ``Debug`` from the ``Run`` menu.

Eclipse will now ask you if you want to change your view, you can click switch and you will enter the "debugger view". On the left you should see your usual project explorer replaced with the "Stack Trace" which allows you to see which method is currently being executed. On the right you should see a window called "Variables".
* If your windows didn't change, you can force it to by selecting ``Window -> Perspective -> Open Perspective -> Debug``
* If you want to return to your usual view, you can reverse the above, ``Window -> Perspective -> Open Perspective -> Java``

You will also notice that your code ran right through as though you'd pressed the "play" button. In order to really start getting the benefits of the debugger, we will have to tell it we would like it to stop part way through execution. We can do that by setting a **breakpoint**. A breakpoint tells the debugger to run the program up to that point and then suspend so we can look at the program.

There is a tab beside Variables called Breakpoints. You can click it to bring up a list of breakpoints (right now it will be empty). To add a breakpoint double click just to the left of the line number in the main editing panel. You can do this next to any line where there is code to be executed (no comments or blank lines). When you double click a dot will appear next to the line and the line number will be shown in the Breakpoints tab. For now, add a breakpoint to the line ``int x = 10``.
* We will almost never use this tab, except for the button at the top to remove all breakpoints.

Once you've added a breakpoint, eclipse will run your code up until then and pause. You can see which line it paused on, becuase that line is highlighted green. You can press the resume button (a green triangle) and it will run on, either to the next breakpoint or until the program ends. You can add breakpoints into helpful points (especially loops). Sometimes that will be all you need, but you might also want to "step through" your program line by line.

You have two options **step into** and **step over**. Each of these will move one line down in your program over any expressions. If you switch back to the Variables tab, you will be able to see the variables being added.
* The **step into** button will cause eclipse to jump into any method which is called. This will always include your own code, but might also include the actual Java source (which can be confusing, but interesting).
* The **step over** button will cause eclipse to execute any method and show the state after that method runs. This can be helpful if you have a lot of code to navigate.

If you have a breakpoint set on the line ``int x = 10`` and you step over repeatedly, you will see eclipse entre the for loop and the loop variable i be incremented as the loop is repeated. Notice how any time a variable is added or changed it is highlighted in yellow. (Also note that only 1 variable is every changed at a time).

When you get to the String, notice that eclipse shows the text of the String, but also an id number. That's because the string is an object and every object in Java gets assigned a unique number. As you step through the next loop notice that the id number of the string changes when the contents do. That's a special feature of strings in Java we'll discuss later in the course.

When you get to the the Point object (notice that it's part of the same package), you can click on the triangle beside the variable to see details about the object created. String is a little different and never shares these, but for your own objects the debugger will make it easy to see what instance variables have been set to. When you stop on the line ``while (!o.same(p1)) {`` you can click **step into** and you will jump into the ``same`` method of the ``Point`` object, if you step into again, you will jump into the getX method. Notice on the left that the stack increases and each method gets added to it.

You can use this to see what variables are set to in your program and what path through your code the execution is taking. The debugger has some other useful features as well, but the last one to discuss today is the ability to set variables. This can be espeically helpful when a loop must be executed many times before the error becomes noticable. Restart your execution (you can press the red square "stop" button" and then press the bug again). Set a breakpoint, or step through your program until you enter the for loop. Now in the variable tab you can edit the value directly, click on the right hand side and set the value to 8. Then click the step over button, notice that your program will react as though the value had been set to 8 in code and the loop will only run 2 more times.
* This makes it much easier to diagnose and manage situations where only specific values for variables cause your program to break.

You're welcome to continue using print lines to debug your programs after this, but expect when you ask questions that we will ask you to use the debugger to help diagnose them, and we think this will be a useful tool to help you see what your program is doing.


