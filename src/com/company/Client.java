package com.company;

public class Client {
    public static void main(String[] args) {


        // 创建植物和僵尸
        ZhiWu zw = new ZhiWu("豌豆", 900, 50);
        JiangShi js = new JiangShi("铁桶", 500, 100);
        zw.fight(js);
        js.eat(zw);
    }
}
