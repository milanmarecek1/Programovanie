package sample;

import java.io.FileWriter;
import java.io.IOException;

public class OutputDemoA {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("Test", true);
            fileWriter.write("Nový riadok");
            fileWriter.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}