package org.example.exceptionsfun;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExamples {

    // unchecked exceptions voorbeeld, op te lossen met beter coderen
    // in dit geval if statement
    public static void ohNoUnchecked() {
        String[] strings = null; //{ "!" };
        int i = 1;

        if(strings != null && strings.length > i) {
            System.out.println(strings[i]);
        }
    }

    // checked exception, handling voorbeeld 1
    public static void ohNoChecked1() throws IOException {
        String fileName = "blabla.txt";
        FileReader fr = new FileReader(fileName);
        int ch;
        while((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }

    // checked exception, handling voorbeeld 2
    public static void ohNoChecked2() {
        String fileName = "blabla.txt";
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // checked exception, handling voorbeeld 3
    public static void ohNoChecked3() {
        String fileName = "blabla.txt";
        try(FileReader fr = new FileReader(fileName)) {
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    // zelf exception gooien
    public static void ohNoThrowException() {
        throw new IllegalArgumentException("blablabla");
    }

    // zelf eigen exception gooien
    public static void ohNoThrowMyOwnException() {
        throw new VerkeerdeNaamException("dit klopt niet");
    }

    public static void main(String[] args) {
        ohNoUnchecked();
        ohNoChecked2();
        ohNoChecked3();
        try {
            ohNoChecked1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Lalalalal");
    }


}
