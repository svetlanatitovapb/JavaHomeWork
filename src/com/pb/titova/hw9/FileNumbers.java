package com.pb.titova.hw9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();

    }
    public static void createNumbersFile() {
        OutputStream os = null;
        try {
            os = new FileOutputStream("numbers.txt");
            String mt = "";
             for(int i=0;i<10;i++) {
                 for(int j=0;j<10;j++) {
                     mt += new Random().nextInt(99 )+" ";
                 }
                 mt +="\n";
             }

            byte[] mag = mt.getBytes();

            try {
                os.write(mag);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(os!=null){
            try {
                os.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            }
        }


    }
    public static void createOddNumbersFile () {
        OutputStream os = null;
        try {
            os = new FileOutputStream("odd-numbers.txt");
            Path path = Paths.get("numbers.txt");
            Scanner scan = new Scanner(path);
            byte[] cht = new byte[100];
            int y = 0;
            while (scan.hasNextByte()){
                cht[y]=scan.nextByte();
                if (0 == cht[y] % 2)
                {cht[y] = 0;}
                y++;
            }
            y=0;
            String mt = "";
            for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
                    mt += cht[y]+" ";
                    y++;
                }
                mt +="\n";
            }
            byte[] mag = mt.getBytes();

            try {
                os.write(mag);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
