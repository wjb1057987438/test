package chapter5;

public class TestOverride {
    public static void main(String[] args) {
        Vechicle v1=new Vechicle();
        Vechicle v2=new Horse();
        Vechicle v3=new Plane();
        v1.run();
        v2.run();
        v3.run();
        v1.stop();
        v2.stop();
        v3.stop();

    }
}
class  Vechicle{
    public  void  run(){
        System.out.println("跑。。。。");
    }
    public  void  stop(){
        System.out.println("停止");
    }
}
class  Horse extends Vechicle{
    @Override
    public void run() {
        System.out.println("马：四个蹄子跑。。。。");
    }
}
class  Plane extends  Vechicle{
    public  void  run(){
        System.out.println("飞行");
    }

    @Override
    public void stop() {
        System.out.println("悬停空中");
    }
}