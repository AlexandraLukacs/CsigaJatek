package main;

import java.util.Scanner;

public class CsigaJatek {
    
    static Scanner sc = new Scanner(System.in);
    
    void start(){
        System.out.print("Fogadás: ");
        String beker = sc.next();
        
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d. kör", i);
            
        }
    }
}
