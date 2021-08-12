package com.company.day17.接口在开发中的作用;

/**
 * 西餐厨师类
 * 实现菜单上的菜
 * 厨师是接口的实现者
 */
public class AmericaCook implements FoodMenu{
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("西餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void YuXiangRouSi() {
        System.out.println("西餐师傅做的鱼香肉丝");
    }
}
