package chapter10;

import java.io.*;

public class IO10_12 {
    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;
        try {
            br= new BufferedReader( new InputStreamReader(System.in));
            bw=new BufferedWriter(new OutputStreamWriter(System.out));
            String str=br.readLine();
            System.out.println("str:"+str);
            bw.write("输入流测试");
            bw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            close(bw,br);
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
