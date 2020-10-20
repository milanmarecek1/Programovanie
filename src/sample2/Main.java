package sample;

import java.util.Scanner;

public class Main {

    void test() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napiš text a stlač Enter: ");
        String out = scanner.next();

        System.out.println("Výstup z klávesnice: " + out);

        int celkovypocet = 0;
        for (int x = 0; x < out.length(); x++){
            switch (out.charAt(x)){
                case 'a':
                    System.out.println('a');
                    celkovypocet++;
                    break;
                case 'e':
                    System.out.println('e');
                    celkovypocet++;
                    break;
                case 'i':
                    System.out.println('i');
                    celkovypocet++;
                    break;
                case 'o':
                    System.out.println('o');
                    celkovypocet++;
                    break;
                case 'u':
                    System.out.println('u');
                    celkovypocet++;
                    break;
            }
        }
        System.out.println(celkovypocet);
    }
}