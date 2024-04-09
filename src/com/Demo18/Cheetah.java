package com.Demo18;

public class Cheetah implements Hunter,Runner{
    @Override
    public void hunt() {
        System.out.println("猎豹在捕猎");
    }

    @Override
    public void run() {
        System.out.println("猎豹在奔跑");
    }
}
