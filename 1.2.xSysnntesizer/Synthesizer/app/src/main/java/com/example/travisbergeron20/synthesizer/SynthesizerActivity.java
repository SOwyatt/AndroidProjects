package com.example.travisbergeron20.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.GsmCellLocation;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private static final int WHOLE_NOTE = 1000;
    private Button button1;
    private Button button2;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBb;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mphE;
    private MediaPlayer mphF;
    private MediaPlayer mphFs;
    private MediaPlayer mphG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.btnE);
        button2 = (Button)findViewById(R.id.btnF);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mphE = MediaPlayer.create(this, R.raw.scalehighe);
        mphF = MediaPlayer.create(this, R.raw.scalehighf);
        mphFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mphG = MediaPlayer.create(this, R.raw.scalehighg);
    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("Synthesizer Activity", "Audio playback interrupted");
        }
    }

    /**
     * Plays a note, restarting it and playing it
     * */
    private void playNote(MediaPlayer m) {
        m.seekTo(0);
        m.start();
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "E Button Clicked");
        mpE.start();
    }

    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.i(TAG, "F button clicked");
        mpF.start();
    }

    public void challenge1(View v) {
        playNote(mpE);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpFs);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpG);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpA);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpB);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpCs);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpD);
        delayPlaying(WHOLE_NOTE / 2);
        playNote(mpE);
    }
}
