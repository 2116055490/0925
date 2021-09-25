package com.company;

public class ZhiWu {
    String name;
    int hp;
    int attack;
    public ZhiWu(String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    // 植物打僵尸
    public void fight(JiangShi js){
        System.out.println(this.name+"在干"+js.name);
        // 僵尸掉血
        js.hp -= this.attack;
        System.out.println("僵尸的剩余血量"+js.hp);
    }
}
