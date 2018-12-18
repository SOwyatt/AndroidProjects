package com.example.travisbergeron20.synthesizer;

import android.media.MediaPlayer;

public class UtilMediaPlayer extends MediaPlayer {

    public UtilMediaPlayer(SynthesizerActivity synthesizerActivity, int file) {
        MediaPlayer.create(synthesizerActivity, file);
    }

    public void playNote() {
        this.seekTo(0);
        this.start();
    }
}
