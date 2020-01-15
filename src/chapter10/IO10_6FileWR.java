package chapter10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO10_6FileWR {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        char[] buffer=new char[1024];
        int temp=-1;
        try{
            fr=new FileReader("src/chapter10/IOtest.txt");
            fw=new FileWriter("src/chapter10/FileWR.txt");
            temp=fr.read(buffer);
            while(temp!=-1){
                fw.write(buffer,0,temp);
                fw.flush();
                temp=fr.read(buffer);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fr !=null){
                try{
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fw !=null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
