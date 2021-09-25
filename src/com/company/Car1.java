package com.company;

public class Car1 {
    String color ;
    int speed ;
    int seat = 5;


    // java会自动赠送给每一个类一个无参的构造方法
    // 如果你自己调用了构造方法，java就不会再赠送给你了
     // 在创建对象的时候自动调用方法
    public Car1(String color,int speed){
        this.color = color;
        this.speed = speed;
    }
    public  void run(){
        System.out.println(this.color+"色的车会跑");
    }
    public static void main(String[] args) {
        Car1 c1 = new Car1("绿",180); // 默认调用的是构造方法
//        c1.color = "绿";
//        c1.speed = 180;

        Car1 c2 = new Car1("红",190);
//        c2.color = "红";
//        c2.speed = 190;
        c1.run();
        c2.run();
    }
}
