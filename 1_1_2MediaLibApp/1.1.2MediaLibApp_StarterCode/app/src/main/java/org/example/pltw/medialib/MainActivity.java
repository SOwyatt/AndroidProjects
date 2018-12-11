package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);

        Greeter greeter = new Greeter();
        welcomeText.setText(greeter.message);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/

    textView outputText = (TextView) findByViewId(R.id.medialibText);

    public void showMedia(View v) {
        //Define Counters and Trackers
        double totalCost = 0.0;
        int totalRating = 0;
        int numSongs = 7;

        //Define Songs
        Song songA = new Song("Africa", 1.29, 10);
        totalCost += songA.getPrice();
        numSongs++;

        Song songB = new Song("Mr. Brightside", .99, 8);
        totalCost += songB.getPrice();
        numSongs++;

        Song songC = new Song("Perfect Couple", 1.29, 8);
        totalCost += songC.getPrice();
        numSongs++;

        Song songD = new Song("Sunflower", 1.29, 10);
        totalCost += songD.getPrice();
        numSongs++;

        Song songE = new Song("Ten Feet Tall", .99, 7);
        totalCost += songE.getPrice();
        numSongs++;

        Song songF = new Song("Green", 1.29, 10);
        totalCost += songF.getPrice();
        numSongs++;

        Song songG = new Song("Cut my Hair", .99, 8);
        totalCost += songG.getPrice();
        numSongs++;

        //Define Movies
        Movie movieA = new Movie("8th Grade", 94, 10);

        //Define Averages
        double averageCost;
        double averageRating;


        //Set Averages
        averageCost = totalCost / numSongs;
        averageRating = ((double) totalRating / numSongs);

        //Print output

        //Songs
        outputText.append("Songs:");

        outputText.append(songA.displaySong());
        outputText.append(songB.displaySong());
        outputText.append(songC.displaySong());
        outputText.append(songD.displaySong());
        outputText.append(songE.displaySong());
        outputText.append(songF.displaySong());
        outputText.append(songG.displaySong());


        outputText.append("\nTotal Cost: $" + totalCost + " Total Rating: " + totalRating + " stars.");
        outputText.append("Average Cost: $" + averageCost + " Average Rating: " + averageRating + " stars.");

        //Movies
        outputText.append("\nMovies:");
        outputText.append(movieA.displayMovie());



    }



}