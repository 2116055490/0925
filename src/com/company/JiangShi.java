package com.company;

public class JiangShi {
    String name;
    int hp;
    int attack;

    public JiangShi(String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }

    // 僵尸吃植物
    public void eat(ZhiWu zw){
        System.out.println(this.name+"在吃"+zw.name);
        // 植物掉血
        zw.hp -= this.attack;
        System.out.println("植物剩余的血量为"+zw.hp);
    }
}
