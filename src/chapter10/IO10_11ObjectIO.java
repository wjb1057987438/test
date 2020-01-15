package chapter10;

import java.io.*;

public class IO10_11ObjectIO {
    public static void main(String[] args) {
//        write();
        reader();
    }
    public  static  void reader(){
        InputStream is=null;
        BufferedInputStream bis=null;
        ObjectInputStream ois=null;
        try{
            is=new FileInputStream(new File("src/chapter10/data.txt"));
            bis=new BufferedInputStream(is);
            ois=new ObjectInputStream(bis);
            String str1=ois.readUTF();
            String str=(String)ois.readObject();
            Ponser pon=(Ponser) ois.readObject();
            System.out.println("str:"+str);
            System.out.println(pon.toString());
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public  static void   write(){
        OutputStream os=null;
        BufferedOutputStream bos=null;
        ObjectOutputStream oos=null;
        try {
            os=new FileOutputStream(new File("src/chapter10/data.txt"));
            bos=new BufferedOutputStream(os);
            oos=new ObjectOutputStream(bos);
            oos.writeUTF("safdafwefr");
            oos.writeObject("测试对象输出流");
            oos.writeObject(new Ponser("测试员",4500));
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            close(oos,bos,os);
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
class Ponser implements   Serializable{
    private  String name;
    private  int sal;

    public Ponser(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Ponser{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}