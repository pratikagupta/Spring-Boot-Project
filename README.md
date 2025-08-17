# Spring-Boot-Project
Learning Spring Boot Project from Scratch 





Issues - 
- I have faced while pushing code on github :
   * The problem was that your week1 and week2 folders were Git repositories themselves, nested inside your main project.
   * Git treats a repo-inside-a-repo as a submodule, and it won't track the individual files inside it.
   * To fix this, you had to delete the nested .git folders (rm -rf week1/.git and rm -rf week2/.git) to make them normal folders again. After that, you could add and commit their files like you normally would.
