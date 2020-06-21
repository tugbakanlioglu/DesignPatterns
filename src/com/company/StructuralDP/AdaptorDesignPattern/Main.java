package com.company.StructuralDP.AdaptorDesignPattern;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","tarkan");

        audioPlayer.play("vlc","sezen");

        audioPlayer.play("mp4","sila");

    }
}
