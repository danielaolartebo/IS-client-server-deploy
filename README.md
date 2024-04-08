# ***HelloWorld Modification and Deployment***

*Client-server helloworld deployment for software engineering class.*

## ***Built With*** 🛠️

<p align="left">
    <a href="https://code.visualstudio.com/" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/2ae2a900d2f041da66e950e4d48052658d850630/icons/vscode/vscode-original.svg" height="60" width = "60"></a>
    <a href="https://code.visualstudio.com/](https://gradle.org/install/)" target="_blank"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" height="60" width = "60"></a>
    <a href="https://code.visualstudio.com/](https://gradle.org/install/)" target="_blank"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" height="60" width = "60"></a>
</p>

## ***Versioned*** 📌

<p align="left">
     <a href="https://git-scm.com/" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/2ae2a900d2f041da66e950e4d48052658d850630/icons/git/git-original.svg" height="60" width = "60"></a>
    <a href="https://github.com/" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/2ae2a900d2f041da66e950e4d48052658d850630/icons/github/github-original.svg" height="60" width = "60"></a>
</p>

*For all the updates of the software, check the releases [here](https://github.com/danielaolartebo/PI1-RBE/tags).*

## ***Local Deploy*** 📦

*To run the web app you should follow these steps:*

1️⃣ *Clone or download the repository*

2️⃣ *Open it on your IDE (must have Java 11 and Gradle 6.6 or 7.0 installed)*

5️⃣ *Run the project on the IDE*

## ***Detailed Instructions*** 📦

1. Enter via SSH protocol to machine 11, 15 and 16 (hgrid11, hgrid15, hgrid16).
```bash
ssh swarch@hgrid11
ssh swarch@hgrid15
ssh swarch@hgrid16
```
    
3. Enter the Paz-Olarte directory on each of the machines.

4. Get to the helloworld directory and allow permission to the directory.
```bash
cd helloworld-ciclo-kbd-SebastianPaz-DanielaOlarte/helloworld-ret/helloworld-ret

chmod +x gradlew
```

6. Build the project from the source code, from the server machine.
```bash
./gradlew build
```
    
8. On one of the machines selected in step 1, connect to the server.
```bash
java -jar server/build/libs/server.jar
```
    
10. Build the project from the source code, from the clients' machine.
```bash
./gradlew build
```

12. On the remaining two machines, connect to the client.
```bash
java -jar client/build/libs/client.jar
```

6. By executing the commands on the respective machines, on which they were selected as clients,
You will have these options for services or requests to the server, you will be able to execute each one depending on the respective number you have.
      - Fibonacci: Execute fibonacci from a number entered by CLI. (Shows fibonacci algorithm)
      - Lists: List of server interfaces. (Lists logic interfaces that the server has)
      - Listports: List of ports from an IPv4 entered by CLI (Lists open ports and ports that are running in the specified IP and shows services)
      - !: Command entered to execute in Terminal Linux. (Any command with Unix type)
      - exit: Enter the word exit through the console, without selecting a number, to end the execution of the program.


## ***Other commands*** 📦

- Transfer files (fuente-destino)
```bash
scp swarch@xhgrid16:nameofdirectory swarch@xhgrid11:nameofdirectory
swarch@xhgrid11: scp ./ejem.txt swarch@xhgrid16:train
```
- Create files in a directory
```bash
touch example.txt
touch example.zip
```
- Connect to a machine
```bash
ssh swarch@xhgrid11
```
- Change to Java 11
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v11)
```
- Build with bash
```bash
bash ./gradlew build
```

## ***Authors*** ✒️

<p align="left">
  <a href="https://github.com/danielaolartebo" target="_blank"> <img src="https://images.weserv.nl/?url=avatars.githubusercontent.com/u/53228651?v=4&h=60&w=60&fit=cover&mask=circle"</a>
  <a href="https://github.com/Sebas-gifPaz777" target="_blank"> <img src="https://images.weserv.nl/?url=avatars.githubusercontent.com/u/84254040?v=4&h=60&w=60&fit=cover&mask=circle"</a>

    
</p>

---

[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/for-you.svg)](https://forthebadge.com)
