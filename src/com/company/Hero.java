package com.company;

public class Hero {
    String name;
    String skill_g;
    String skill_w;
    String skill_e;
    String skill_r;
    public Hero(String name){
        this.name = name;
    }
    public Hero(String name,String skill_e,String skill_g,String skill_r,String skill_w){
        this(name);// 调用当前类的1其他构造方法
        this.skill_e = skill_e;
        this.skill_g = skill_g;
        this.skill_r = skill_r;
        this.skill_w = skill_w;

    }

    public void fight(){
        System.out.println(this.name+"在上阵杀敌");
    }

    public static void main(String[] args) {
        Hero h = new Hero("盖伦","小宝剑","大宝剑","防御","攻击");
        h.fight();
    }
}
