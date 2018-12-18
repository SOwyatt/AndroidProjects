package com.example.travisbergeron20.synthesizer;

import android.media.MediaPlayer;
//import com.example.travisbergeron20.synthesizer.UtilMediaPlayer;
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
    private UtilMediaPlayer mpA;
    private UtilMediaPlayer mpB;
    private UtilMediaPlayer mpBb;
    private UtilMediaPlayer mpC;
    private UtilMediaPlayer mpCs;
    private UtilMediaPlayer mpD;
    private UtilMediaPlayer mpDs;
    private UtilMediaPlayer mpE;
    private UtilMediaPlayer mpF;
    private UtilMediaPlayer mpFs;
    private UtilMediaPlayer mpG;
    private UtilMediaPlayer mpGs;
    private UtilMediaPlayer mphE;
    private UtilMediaPlayer mphF;
    private UtilMediaPlayer mphFs;
    private UtilMediaPlayer mphG;

    private UtilMediaPlayer[] allNotes = new UtilMediaPlayer[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = findViewById(R.id.btnE);
        button2 = findViewById(R.id.btnF);
        mpA = new UtilMediaPlayer(this, R.raw.scalea);
        mpB = new UtilMediaPlayer(this, R.raw.scaleb);
        mpBb = new UtilMediaPlayer(this, R.raw.scalebb);
        mpC = new UtilMediaPlayer(this, R.raw.scalec);
        mpCs = new UtilMediaPlayer(this, R.raw.scalecs);
        mpD = new UtilMediaPlayer(this, R.raw.scaled);
        mpDs = new UtilMediaPlayer(this, R.raw.scaleds);
        mpE = new UtilMediaPlayer(this, R.raw.scalee);
        mpF = new UtilMediaPlayer(this, R.raw.scalef);
        mpFs = new UtilMediaPlayer(this, R.raw.scalefs);
        mpG = new UtilMediaPlayer(this, R.raw.scaleg);
        mpGs = new UtilMediaPlayer(this, R.raw.scalegs);
        mphE = new UtilMediaPlayer(this, R.raw.scalehighe);
        mphF = new UtilMediaPlayer(this, R.raw.scalehighf);
        mphFs = new UtilMediaPlayer(this, R.raw.scalehighfs);
        mphG = new UtilMediaPlayer(this, R.raw.scalehighg);
    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("Synthesizer Activity", "Audio playback interrupted");
        }
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
        mpE.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpFs.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpG.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpA.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpB.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpCs.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpD.playNote();
        delayPlaying(WHOLE_NOTE / 2);
        mpE.playNote();
    }
}