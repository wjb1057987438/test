package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO10_1IOtest {
    public static void main(String[] args) {
        FileInputStream fs=null;
        try {
            fs=new FileInputStream("d:/test.txt");
            int a=fs.read();
            while (a != -1 ){
                System.out.println((char)a);
                a=fs.read();
            }

        }catch (FileNotFoundException e){
            e.getStackTrace();
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            if(fs !=null){
                try {
                    fs.close();
                }catch (IOException e){
                    e.getStackTrace();
                }

            }

        }

    }
}
