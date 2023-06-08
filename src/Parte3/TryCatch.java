package Parte3;

import java.io.File;
import java.util.Scanner;

public class TryCatch {

    public TryCatch() {
    }

    public void start() {
        try {
            // codice che potrebbe generare un'eccezione
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (Exception e) {
            // codice che gestisce l'eccezione
            System.out.println(e.getMessage());
        } finally {
            // codice che viene eseguito sempre
            System.out.println("Codice che viene eseguito");
        }
    }
}
