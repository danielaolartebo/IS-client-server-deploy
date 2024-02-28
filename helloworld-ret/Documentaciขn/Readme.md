# HelloWorld Distribuited
## Ejecución del proyecto

1. Ingresar por protoco ssh a la maquina 11, 15 y 16 (hgrid11, hgrid15, hgrid16).
    Comando: ssh swarch@hgrid11
    Comando: ssh swarch@hgrid15
    Comando: ssh swarch@hgrid16
    
2. Ingresa al directorio Paz-Olarte en cada una de las maquinas.

3. Llega hasta el directorio helloworld.
    Comando: cd helloworld-ciclo-kbd-SebastianPaz-DanielaOlarte/helloworld-ret/helloworld-ret

4. Construimos el proyecto desde el código fuente, desde la maquina del servidor.
    Comando: ./gradlew build
    
5. En una de las maquinas seleccionadas en el punto 1, nos conectamos al servidor.
    Comando: java -jar server/build/libs/server.jar
    
6. Construimos el proyecto desde el código fuente, desde la maquina de los clientes.
    Comando: ./gradlew build

7. En las dos maquinas restantes, nos conectamos al cliente.
    Comando: java -jar client/build/libs/client.jar

6. Al ejecutar los comandos en las respectivas maquinas, en las que fueron seleccionadas como clientes, 
tendrá esta opciones de servicios o solicitudes al servidor, podrá ejecutar cada una dependiendo del número respectivo que tenga.
    - Fibonacci: Ejecutar fibonacci a partir de un número ingresado por CLI.
    - Listifs: Listado de Interfaces del servidor.
    - Listports: Listado de puertos a partir de una IPv4 ingresada por CLI
    - !: Comando ingresado para ejecutar en Terminal Linux.
    - exit: Ingreso de la palabra exit por consola, sin seleccionar número, para terminar la ejecución del programa.
