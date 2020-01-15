package chapter10;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO10_4IOFileStream {
    public static void main(String[] args) {
        String str="文件字节流输入输出";
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream("src/chapter10/IOtest.txt",true);
            fos.write(str.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.getStackTrace();
                }


            }


        }

    }
}
