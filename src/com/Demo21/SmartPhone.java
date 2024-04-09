package com.Demo21;

public class SmartPhone extends Phone implements Compute,Avigraph{
    @Override
    public void orientation() {
        System.out.println("定位");
    }

    @Override
    public void navigate() {
        System.out.println("导航");
    }

    @Override
    public void surf() {
        System.out.println("上网");
    }

    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }

    @Override
    public void playVideo() {
        System.out.println("看视频");
    }
}
