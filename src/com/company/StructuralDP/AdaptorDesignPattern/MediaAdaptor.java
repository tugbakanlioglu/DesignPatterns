package com.company.StructuralDP.AdaptorDesignPattern;

public class MediaAdaptor implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String type) {
        if (type.equals("vlc")){
           advancedMediaPlayer =  new VlcPlayer();
        }else if (type.equals("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audiType, String fileName) {
        if (audiType.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audiType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);

        }
    }
}
