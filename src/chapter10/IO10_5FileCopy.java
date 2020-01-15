package chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO10_5FileCopy {
    public static void main(String[] args) {
        FileInputStream fin=null;   //字节输入流
        FileOutputStream fos=null; //字节输出流
        byte[] by=new byte[1024];  //緩存字节数组
        int temp=-1;  //结束标识

        try{
            fin=new FileInputStream("src/chapter10/IOtest.txt");
            fos=new FileOutputStream("src/chapter10/copyIotest.txt");
            temp=fin.read(by);
            if(temp !=-1) {
                fos.write(by);
                temp = fin.read(by);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fin!=null){
                try {
                    fin.close();

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
