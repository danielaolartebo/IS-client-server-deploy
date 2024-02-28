import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Demo.Response;

public class PrinterI implements Demo.Printer {

    private int totalRequests = 0;
    private long totalLatency = 0; // en milisegundos

    public Response printString(String s, com.zeroc.Ice.Current current) {

        // Latency metric
        long startTime = System.currentTimeMillis(); // capturamos tiempo de inicio
        long endTime = System.currentTimeMillis(); // capturamos tiempo de fin

        System.out.println(s);

        String array[] = s.split(":");
        String service = array[2];
        String extra = "";
        String response = "";
        if(array.length>3){
            extra = array[3];
        }
        

        try {
            if (service.matches("[0-9]+")) {
                startTime = System.currentTimeMillis();
                totalRequests++;
                String fibString = "";
                Long num = Long.parseLong(service);
                for (long i = 1; i <= num; i++) {
                    fibString += fibbonacci(i) + ",";
                }
                System.out.println(fibString);
                response = fibString;
                endTime = System.currentTimeMillis()- startTime;

            } else if (service.equalsIgnoreCase("listifs")) {
                startTime = System.currentTimeMillis();
                totalRequests++;
                response = pointB();
                System.out.println("Resultado de pointB: " + response);
                endTime = System.currentTimeMillis()- startTime;

            } else if (service.equalsIgnoreCase("listport")) {
                startTime = System.currentTimeMillis();
                totalRequests++;
                response = pointC(extra);
                System.out.println("Resultado de pointC: " + response);
                endTime = System.currentTimeMillis()- startTime;
                
            } else {
                startTime = System.currentTimeMillis();
                totalRequests++;
                response = pointD(extra);
                System.out.println("Resultado de pointD: " + response);
                endTime = System.currentTimeMillis()- startTime;
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Metrica latencia
        totalLatency += endTime; // latencia total del sistema
        double averageLatency = totalLatency / totalRequests; // promedio de latencia del sistema
        
        System.out.println("Latencia: "+averageLatency); 
        return new Response(0,response);
    }

    private String pointB() throws IOException {
        String command = "ip link show";
        return commandExecution(command);
    }

    private String pointC(String ipAddress) throws IOException {
        String command = "nmap -p- " + ipAddress;
        return commandExecution(command);
    }

    private String pointD(String info) throws IOException {
        return commandExecution(info);
    }

    private String commandExecution(String command) throws IOException{

        ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));
        Process process = processBuilder.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }

        return output.toString();
    }

    private long fibbonacci(long n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}