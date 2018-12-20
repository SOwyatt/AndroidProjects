package com.example.travisbergeron20.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class SynthesizerActivity extends AppCompatActivity {

    private static final String TAG = SynthesizerActivity.class.getName();
    private static final int WHOLE_NOTE = 1000;

    private Button challenge1_btn;
    private NumberPicker numPickerDuration;
    private NumberPicker numPickerNote;

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

    private MediaPlayer[] allNotes = new MediaPlayer[16];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        challenge1_btn = findViewById(R.id.btn_challenge1);
        allNotes[0] = mpA = MediaPlayer.create(this, R.raw.scalea);
        allNotes[1] = mpB = MediaPlayer.create(this, R.raw.scaleb);
        allNotes[2] = mpBb = MediaPlayer.create(this, R.raw.scalebb);
        allNotes[3] = mpC = MediaPlayer.create(this, R.raw.scalec);
        allNotes[4] = mpCs = MediaPlayer.create(this, R.raw.scalecs);
        allNotes[5] = mpD = MediaPlayer.create(this, R.raw.scaled);
        allNotes[6] = mpDs = MediaPlayer.create(this, R.raw.scaleds);
        allNotes[7] = mpE = MediaPlayer.create(this, R.raw.scalee);
        allNotes[8] = mpF = MediaPlayer.create(this, R.raw.scalef);
        allNotes[9] = mpFs = MediaPlayer.create(this, R.raw.scalefs);
        allNotes[10] = mpG = MediaPlayer.create(this, R.raw.scaleg);
        allNotes[11] = mpGs = MediaPlayer.create(this, R.raw.scalegs);
        allNotes[12] = mphE = MediaPlayer.create(this, R.raw.scalehighe);
        allNotes[13] = mphF = MediaPlayer.create(this, R.raw.scalehighf);
        allNotes[14] = mphFs = MediaPlayer.create(this, R.raw.scalehighfs);
        allNotes[15] = mphG = MediaPlayer.create(this, R.raw.scalehighg);

        numPickerDuration.setMaxValue(1000);
        numPickerDuration.setMinValue(1);
        numPickerNote.setMaxValue(15);
        numPickerNote.setMinValue(0);
    }

    private static void playNote(MediaPlayer note, int delay) {
        note.seekTo(0);
        note.start();
        delayPlaying(delay);
    }

    private static void playNote(MediaPlayer note) {
    playNote(note, WHOLE_NOTE);
}

    private static void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("Synthesizer Activity", "Audio playback interrupted");
        }
    }

//    public void onButton1Click(View v) {
//        mpE.seekTo(0);
//        Log.i(TAG, "E Button Clicked");
//        mpE.start();
//    }
//
//    public void onButton2Click(View v) {
//        mpF.seekTo(0);
//        Log.i(TAG, "F button clicked");
//        mpF.start();
//    }

    public void challenge1(View v) {
        Log.i(TAG, "Challenge 1 Clicked");
        playNote(mpE, WHOLE_NOTE/2);
        playNote(mpF, WHOLE_NOTE/2);
        playNote(mpG, WHOLE_NOTE/2);
        playNote(mpA, WHOLE_NOTE/2);
        playNote(mpB, WHOLE_NOTE/2);
        playNote(mpCs, WHOLE_NOTE/2);
        playNote(mpD, WHOLE_NOTE/2);
        playNote(mpE, WHOLE_NOTE/2);
    }

    public void challenge2(View v) {

    }
}