package com.company.StructuralDP.AdaptorDesignPattern;

public class AudioPlayer implements MediaPlayer {


    @Override
    public void play(String audiType, String fileName) {
        if (audiType.equals("mp3")){
            System.out.println("Mp3 playingg!!");
        }else if (audiType.equals("vlc") || audiType.equals("mp4")){
            MediaAdaptor mediaAdaptor = new MediaAdaptor(audiType);
            mediaAdaptor.play(audiType,fileName);
        }
    }
}
