package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputDemoABufferedWriter {
    public static void main(String[] args) {
        try {
           // FileWriter fileWriter = new FileWriter("Test", true);
           // BufferedWriter bufferedWriter01 = new BufferedWriter(fileWriter);
            BufferedWriter bufferedWriter02 = new BufferedWriter(new FileWriter("Test"));
            bufferedWriter02.newLine();
            bufferedWriter02.write("BufferWriter nový zápis");
            bufferedWriter02.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}