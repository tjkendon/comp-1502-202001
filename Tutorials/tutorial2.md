# Tutorial 2

## Phase 1 - The Github Classroom

Github allows me to create starter respositories for you. I can share them through github classroom, which you will actually see as links in the course blackboard page.

We will use these for assignments, for the lab exams, and for sharing code in class.

* Click the correct link in the course blackboard. You will be asked to create a new account or to log in. Please do so (and please provide a username that I will be able to identify, so that I can give you a *grade*.
* Github will process for a moment ("forking" a version of the starter repository for you to work with). Then it will provide you with a link to *your* repository.
* Follow that link to the repository page. You can browse and look at the different tools available. We're not going to use them (much) except for the basic code view.

Git works with a cycle, where in you do work and you add that to a "stage". Once you're happy with the stage, you will commit it, committing the changes into a "local repository", then you can "push" those changes to a remote repository. This allows you to keep safe version of your code stored away from your working computer and to keep track of the changes you've made.

## Phase 2 - Connecting Eclipse to your repository.

* First finishing making sure your repository is available. Find the green button on the right which will contain the string to allow you to connect to github.
* To set up the repository - in Ecliplse:
   * Go to Window -> Show View -> Other -> Git -> GitRepositories and click **open**
   * You will now see the git repository view, you can use this to connect to *remote* repositories.
   * Click on **Clone an existing Repository** (it will have the green arrow)
   * Copy the link from the repository page and past it in the box at the top of the window. Eclipse should fill in the details. You can add your *github* username and password to have eclipse not bother you with the details all the time. (Check "Store in Secure Store".
   * Click next, to see a list of branches (which we don't care about) and next again to see the project wizard.
   * The defaults for the project wizard should be good. **Note the directory which the repository is being stored to**
  
* To set up the project - in Eclipse:
   * Go to File -> New -> Project -> Java Project
   * Name the project
   * Uncheck the default location box and browse to the directory you noted above, where the repostitory was stored.
   * Click **Finish**
   * Now you should be set up, with a src directory and README.md in your project's root.
 
* Testing - make sure that Eclipse and github are talking.
   * Right-click on the src directory and create a new class. *Name doesn't matter*
   * Add a quick main / hello world to your program.
   * Notice that the icon for the new class in the package explorer, now has a question mark. That's because it hasn't been added to git yet.
   * Right click on the class, -> Team -> Commit
   * This will show you the git staging view. 
   * Drag the .java file into the staged changes area, add a message ("New class created...") and press **commit and push**
   * This should add the file to the local repository and pushes that change to github.
   * Look at your github page for your repository and you should see your new java class added.
   * Go back to the staging view. Right click on .classpath and choose ignore, and on .project and choose ignore.
      * This will keep git from moving unhelpful files to the repository, Eclipse edited the .gitignore file to acheive this.
   * Move the .gitignore file to Stage Changes, add a message (".gitignore updated") and **commit and push**
   
As you work, you'll notice a '>' symbol getting added beside files in your view. These indicate which files are changed and have not been committed and pushed to github.

Adding a message is always necessary, and adding better messages will help make your code more understandable.
   
   
 ## Extra
 
You can clone *my* main class repository which will have all of the code we generate in class. Follow the steps above, and give it the link https://github.com/tjkendon/comp-1502-202001.git
 
You can use the Team -> Pull command to regularily bring new code down from the repository.

You can also use this to share code between different locations (such as your home and classroom machines), at the beginning of each session, use the Team -> Pull command which will bring down the latest changes from github.
   
