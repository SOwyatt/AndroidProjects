package com.example.travisbergeron20.synthesizer;

import android.media.MediaPlayer;
import android.util.Log;
import android.widget.Button;

public class UtilMediaPlayer extends MediaPlayer {

    public UtilMediaPlayer(SynthesizerActivity synthesizerActivity, int file) {
        MediaPlayer.create(synthesizerActivity, file);
    }

    public void playNote(int delay) {
        this.seekTo(0);
        this.start();
        delayPlaying(delay);
    }

    public static void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("Synthesizer Activity", "Audio playback interrupted");
        }
    }

}
