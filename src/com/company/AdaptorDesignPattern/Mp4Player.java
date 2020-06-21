package com.company.AdaptorDesignPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 playing "+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
