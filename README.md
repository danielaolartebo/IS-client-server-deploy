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

2️⃣ *Open it on your IDE (must have Python 3.X installed)*

5️⃣ *Run the project on the IDE*

## ***Detailed Instructions*** 📦

1. Enter via SSH protocol to machine 11, 15 and 16 (hgrid11, hgrid15, hgrid16).
      Command: ssh sarch@hgrid11
      Command: ssh sarch@hgrid15
      Command: ssh sarch@hgrid16
    
2. Enter the Paz-Olarte directory on each of the machines.

3. Get to the helloworld directory.
      Command: cd helloworld-ciclo-kbd-SebastianPaz-DanielaOlarte/helloworld-ret/helloworld-ret

4. We build the project from the source code, from the server machine.
      Command: ./gradlew build
    
5. On one of the machines selected in point 1, we connect to the server.
      Command: java -jar server/build/libs/server.jar
    
6. We build the project from the source code, from the clients' machine.
      Command: ./gradlew build

7. On the remaining two machines, we connect to the client.
      Command: java -jar client/build/libs/client.jar

6. By executing the commands on the respective machines, on which they were selected as clients,
You will have these options for services or requests to the server, you will be able to execute each one depending on the respective number you have.
      - Fibonacci: Execute fibonacci from a number entered by CLI.
      - Lists: List of server interfaces.
      - Listports: List of ports from an IPv4 entered by CLI
      - !: Command entered to execute in Terminal Linux.
      - exit: Enter the word exit through the console, without selecting a number, to end the execution of the program.

## ***Summary*** ✉️

*Looking forward to developing a multimedia platform that recommends songs based on the tastes of the users themselves, we seek to determine what type of algorithm would be ideal for this task. Therefore, we will rely on different techniques and methods such as K-Means Clustering, the CRISP-DM method, and several more. In the data analysis, the most relevant thing was to find the correlations of the different datasets that we handled, this allowed us to reach coherent results in comparison with existing information on the Internet, such as the fact that there is a high correlation between the popularity and the year of launch of the song as well as the popularity and the acoustics of the songs. With what has been achieved, we can ensure that the platform will: improve the user experience, improve the recommendation process and reduce the rate of abandonment of platform users.*

*For more information regarding tecniques and methods used to build this Music Recommendation Platform based on user's musical linking, please check [documentation](https://github.com/danielaolartebo/IA-music-recommendation-project/blob/main/IA_Entrega_1_Olarte_Daniela_Pantoja_Carlos_Caicedo_Juan_Tafurt_Carlos.pdf)*

## ***Authors*** ✒️

<p align="left">
  <a href="https://github.com/danielaolartebo" target="_blank"> <img src="https://images.weserv.nl/?url=avatars.githubusercontent.com/u/53228651?v=4&h=60&w=60&fit=cover&mask=circle"></a>
</p>

---

[![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)](https://forthebadge.com)
[![forthebadge](https://forthebadge.com/images/badges/for-you.svg)](https://forthebadge.com)
