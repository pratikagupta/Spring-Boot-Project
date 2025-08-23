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


Owing side and inverse side in 1:1 relationship

Hibernate Dirty Checking

Public Key Retrieval is not allowed - Getting this error in Dbeaver

Enable allowPublicKeyRetrieval in connection -
1. In DBeaver, go to your Database Connection → Edit Connection.
2. Navigate to the Driver Properties tab.
3. Add a new property:
   - Name: allowPublicKeyRetrieval
   - Value: true
4. Also check if useSSL is set correctly (often false if you're on local/dev).

When you connect to MySQL 8+ with a client like DBeaver, the default authentication plugin is often:
caching_sha2_password (newer, more secure than old mysql_native_password). 
With this plugin:
The client (DBeaver) needs the server’s RSA public key to encrypt your password before sending it.
By default, the MySQL JDBC driver does not allow fetching the key from the server automatically (for security reasons).
If it tries and the setting isn’t enabled → you get:
Public Key Retrieval is not allowed


http://localhost:9090/swagger-ui/index.html
http://localhost:9090/v3/api-docs
