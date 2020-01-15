package chapter10;

import java.io.*;

public class IO10_8BufferTextCopy {
    public static void main(String[] args) {
        TextCopy("E:/source/test/src/chapter10/希灵帝国 精校版.txt","E:/source/test/src/chapter10/希灵帝国拷贝测试.txt");
    }
    public  static  void  TextCopy(String src,String des){
        InputStream is=null;
        InputStreamReader fr = null;
        FileWriter fw = null;
        BufferedReader br= null;
        BufferedWriter bw=null;
       String temp=null;
        try{
            fr=new InputStreamReader(new FileInputStream(src),"GBK");
            fw=new FileWriter(des);
            br=new BufferedReader(fr);
            bw=new BufferedWriter(fw);
            while((temp=br.readLine())!=null){
//                String s=new String(temp.getBytes(),"GBK");
//                System.out.println(temp);
                bw.write(temp);
                bw.newLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bw != null){
                try {
                    bw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(br != null){
                try {
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(fr != null){
                try {
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
