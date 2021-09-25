package com.company;

public class DaXia {
    String name;
    String waiHao;
    int age;
    String bangPai;

    public DaXia(String name,int age,String bangPai){
        this.name = name;
        this.age = age;
        this.bangPai = bangPai;
    }
    // 构造方法也是方法，也可以进行重载
    // 可以让我们有更多的方式去创建对象
    public  DaXia(String name,int age,String bangPai,String waiHao){
        this(name, age, bangPai); // this还可以调用当前类中的其他的构造方法
        this.waiHao = waiHao;
    }
    public static void main(String[] args) {
        DaXia dx1 = new DaXia("岳不群",18,"华山派");
        DaXia dx2 = new DaXia("武松",19,"梁山","行者");
    }
}
