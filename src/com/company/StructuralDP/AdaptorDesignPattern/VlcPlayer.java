package com.company.StructuralDP.AdaptorDesignPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing mp4 "+fileName);
    }
}
