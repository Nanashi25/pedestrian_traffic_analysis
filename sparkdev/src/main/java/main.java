/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import org.pcap4j.core.NotOpenException;
import org.pcap4j.core.PcapNativeException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Shaneka Lewis
 */
public class main {
    public static void main(String[] args) throws PcapNativeException, NotOpenException, IOException {
        pcapTools test = new pcapTools();
        Scanner s = new Scanner(System.in);
        String ans;
        int option;
        
        do {
            System.out.println("SparkDev Cybersecurity - Pedestrian Traffic Analyzer\n");
            System.out.println("Choose an option:");
            System.out.println("0 - Get all session data");
            System.out.println("1 - Get the unique IPs in a session");
            System.out.println("2 - Get destination IP addresses");
            System.out.println("3 - Trace the path of an IP address");
            System.out.println("4 - Get population of session");
            System.out.println("5 - Get population at a node");
            System.out.println("6 - Get most travelled path");
            
            option = s.nextInt();
                        
            switch (option){
                case 0:
                    System.out.println("Getting all session data...");
                    pcapTools a = new pcapTools();
                    a.getAllSessionData();
                    System.out.println("\n");
                    a = null;
                    break;
                case 1:
                    System.out.println("Getting unique IP addresses...");
                    pcapTools b = new pcapTools();
                    b.getUniqueIPs();
                    System.out.println("\n");
                    b = null;
                    break;
                case 2:
                    System.out.println("Getting destination IPs...");
                    break;
                case 3:
                    System.out.println("Tracing path of IP address...");
                    break;
                case 4:
                    System.out.println("Getting population of session...");
                    break;
                case 5:
                    System.out.println("Getting population at node...");
                    break;
                case 6:
                    System.out.println("Getting most travelled path...");
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            
            s.nextLine();
            System.out.println("New analysis? y/n");
            ans = s.next();
        } while (ans.charAt(0) == 'y');
    }
}
