# CS201-G2T3 - Maven: dijkstra-sp-custom-datastructure
In this project, my Team and I set out to investigate the time/space trade off for using different data structures to run shortest path algorithm (Dijkstra and BFS)

Ultimate Findings: task specific min stack structure outperforms general purpose min heap based PQ.

### Graph data structure comparison
![image](https://user-images.githubusercontent.com/54625060/182523355-74ade52c-79d6-4c44-9e64-1e75e1b3911b.png)

### Custom Data structures for Dijkstra Shortest Path Algo
All three below are faster than the default implementation for our case (Dense Social Network Graph)</br>
![image](https://user-images.githubusercontent.com/54625060/182523436-62b72944-477b-4891-a9fb-cd28dd94ca7e.png)

### Application UI
![image](https://user-images.githubusercontent.com/54625060/182523769-fc489ef9-e02e-415d-bcbe-4dd7e9795c3d.png)

### Usage:
### Install Maven

Install maven using homebrew `brew install maven` (MacOs only)

https://maven.apache.org/install.html Refer this link to install in windows or linux subsystem.

In the project directory, you can run:

### `mvn package`

Compile codes into package and really for launch

### `java -cp target/cs201-1.0-SNAPSHOT.jar sg.edu.smu.app.TestApplication`

Run the compiled package and launches the application

### `mvn install` 

Install the dependencies included in the POM.XML, complie codes into package and really for launch

### `mvn clean install`

Clear all installed dependencies and re-install the dependencies in the POM.XML. Complie codes into package and really for launch

# Use Guide
![Screenshot](https://user-images.githubusercontent.com/32857830/139798346-1c81e102-1297-422b-94e2-5ccd453ed8d2.png)

There are three buttons in the application:

1. Connect - Find the shortest path between two given user. You can use the user list on the left side to enter the user id
2. Input Test[^1] - Test the different input graphs with BFS and Dijkstra Algo
3. Data Structure Test[^1] - Test how different data structures in Dijkstra Algo (LL+HM, Min Stack etc..) will affect the algorithm 

- Bottom Left is the user list
- Bottom Right will display the result of the action

[^1]:Do take note that if you selected a big dataset and a large number of time to run Input and Data Structure Test, the program will probably hang for a while as it takes some time to compute the different test cases.

# Data
All data sets are stored inside the `data` Folder. You may use the dropdown in the application to select which dataset is going to be used for testing.

Do take note that ajdacency matrix will take up a lot of memory space
Here is a estimation table for memoery used for ajdacency matrix:
| Dataset | Number of Unique users | Estimated Heap Memory Used |
| ----------- | ----------- | ----------- |
| 100.json | ~10k | ~115MB |
| 300.json | ~32k | ~1042MB |
| 500.json | ~53k | ~2760MB |
| 1k.json | ~95k | ~9025MB |
| 5k.json | ~440k | ~19GB |
| 10k.json | ~821k | ~67GB |
| 250k.json | ~880k | ~77GB |

The default dataset used for input test is `100.json`, you may based on your computer's capacity and select different dataset for testing. 
The default dataset used for data structure test is `sample.json` which can generate a dense graph and help us to see the difference between different data structure.
