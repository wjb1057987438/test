package chapter5;

public class TestExtends {
    public static void main(String[] args) {
        Student s=new Student("王五",180,"机械");
        s.rest();
        s.study();
        System.out.println(s instanceof  Person);
        System.out.println(s instanceof  Student);
    }
}

class  Person{
    String name;
    int height;
    public  void  rest(){
        System.out.println("休息");
    }
}

class  Student extends  Person{
    String major;
    public void  study(){
        System.out.println("学习");
    }
    public  Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }

}
