package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputDemo {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("otazky_odpovede");
            int znak = reader.read();
            while (znak != -1){
                System.out.println((char) znak);
                znak = reader.readLine();
            }

            reader = new FileReader("otazky_odpovede");
            BufferedReader reader1 = new BufferedReader(reader);
            System.out.println(reader.read());

        }catch (FileNotFoundException e){
            System.out.println("Súbor nenájdený.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}