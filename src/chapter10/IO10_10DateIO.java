package chapter10;

import java.io.*;

public class IO10_10DateIO {
    public static void main(String[] args) {
        DataInputStream dis=null;
        DataOutputStream dos=null;

        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("src/chapter10/data.txt");
            fos=new FileOutputStream("src/chapter10/data.txt");

            dis=new DataInputStream(new BufferedInputStream(fis));
            dos=new DataOutputStream(new BufferedOutputStream(fos));

            dos.writeUTF("数据输出流");
            dos.writeBoolean(false);
            dos.writeInt(45);
            dos.writeUTF("北京尚学堂");
            dos.flush();

            System.out.println("UTF:"+dis.readUTF());
            System.out.println("Boolean:"+dis.readBoolean());
            System.out.println("Int:"+dis.readInt());
            System.out.println("UTF:"+dis.readUTF());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            close(dos,dis,fos,fis);
        }
    }
    public  static void close(Closeable ... ios){
        for(Closeable io:ios){
            try {
                io.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
