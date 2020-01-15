package chapter10;

import java.io.ByteArrayInputStream;

public class IO10_9BatyArray {
    public static void main(String[] args) {
        byte[] b="adfasffbhdrt".getBytes();
        test(b);
    }
    public  static  void  test(byte[] b){
        ByteArrayInputStream bais=null;
        StringBuilder sb = new StringBuilder();
        int temp=0;
        int num=0;
        bais= new ByteArrayInputStream(b);
        while ((temp=bais.read())!=-1){
            sb.append((char) temp);
            num++;
        }
        System.out.println("字符个数："+ num);
        System.out.println("字符串："+sb.toString());
    }
}
