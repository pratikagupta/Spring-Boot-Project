# Spring-Boot-Project
Learning Spring Boot Project from Scratch 





Issues - 
- I have faced while pushing code on github :
   * The problem was that your week1 and week2 folders were Git repositories themselves, nested inside your main project.
   * Git treats a repo-inside-a-repo as a submodule, and it won't track the individual files inside it.
   * To fix this, you had to delete the nested .git folders (rm -rf week1/.git and rm -rf week2/.git) to make them normal folders again. After that, you could add and commit their files like you normally would.


"Web server failed to start. Port 8080 was already in use." got this error many time. 
How to fix this issue in mac - 
1. Find which process is using port 8080 => lsof -i :8080
2. Kill that process => kill -9 <PID> (process ID)
3. Verify the port is free => lsof -i :8080 
 

New term - 
1. Concreate class
2. proxy classes
3. Required-args constructor
4. POJO class


orm

1:1 relationship
1: many relationship
many to many relationship
