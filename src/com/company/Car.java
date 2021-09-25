package com.company;

public class Car {
    // 成员变量
    String color = "黄色"; // 颜色
    int speed;// 速度
    int seat = 6; // 座位

    // 成员方法
    public void run(){
        System.out.println("车能跑");
    }
    public void fly(String color){
        System.out.println(this.color + "颜色的车会飞,飞在"+color+"的云彩中");
    }
    public static void main(String[]args){
        /*int a = 10;// 写在方法里的是局部变量

        Car c = new Car();

        c.run();
        c.color = "绿色";
        c.speed = 80;
        c.seat = 5;
        System.out.println(c.color);

        Car c2 = new Car();
        c2.color = "红色";
        c2.speed = 100;
        c2.seat = 8;
        System.out.println(c2.seat);
        System.out.println(c.seat);*/
        Car c = new Car();
//        c.color = "绿色";
        c.fly("黑色");

    }
}
