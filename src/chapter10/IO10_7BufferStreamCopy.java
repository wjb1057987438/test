package chapter10;

import java.io.*;

public class IO10_7BufferStreamCopy {
    public static void main(String[] args) {
        long time1=System.currentTimeMillis();
        copyFile1("src/chapter10/06-第一天下午：界面模型基础（15分钟）.flv","src/chapter10/06-第一天下午：界面模型基础（15分钟）copy1.flv");
        long time2=System.currentTimeMillis();
        System.out.println("文件拷贝1用时："+(time2-time1));

        time1=System.currentTimeMillis();
        copyFile2("src/chapter10/thumb.jpg","src/chapter10/thumb2.jpg");
        time2=System.currentTimeMillis();
        System.out.println("文件拷贝2用时："+(time2-time1));

    }
    public static void copyFile2(String srcPath,String decPath){
        FileInputStream fis=null;
        FileOutputStream fos=null;
        byte[] buffer = new byte[1024];
        int temp=-1;
        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(decPath,true);
            while ((temp =fis.read(buffer)) != -1){
                for (byte b:buffer){
                    int v = b & 0xFF;
                    System.out.print( Integer.toHexString(v));
                }

                fos.write(buffer);
            }
            System.out.println();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fis !=null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fos !=null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
    public static void copyFile1(String srcPath,String decPath){
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        byte[] buffer = new byte[1024];
        int temp=-1;
        try {
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(decPath,true);
            bis=new BufferedInputStream(fis);
            bos=new BufferedOutputStream(fos);
            while ((temp =bis.read()) != -1){
                bos.write(temp);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bos !=null){
                try {
                    bos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fos !=null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(bis !=null){
                try {
                    bis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
