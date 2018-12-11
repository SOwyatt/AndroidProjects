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

    public void showMedia(View v) {
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);

        //Define Counters and Trackers
        double totalCost = 0.0;
        int totalRating = 0;
        int numSongs = 7;

        //Define Songs
        Song songA = new Song("Africa", 1.29, 10);
        totalCost += songA.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songB = new Song("Mr. Brightside", .99, 8);
        totalCost += songB.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songC = new Song("Perfect Couple", 1.29, 8);
        totalCost += songC.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songD = new Song("Sunflower", 1.29, 10);
        totalCost += songD.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songE = new Song("Ten Feet Tall", .99, 7);
        totalCost += songE.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songF = new Song("Green", 1.29, 10);
        totalCost += songF.getPrice();
        totalRating += songA.getRating();
        numSongs++;

        Song songG = new Song("Cut my Hair", .99, 8);
        totalCost += songG.getPrice();
        totalRating += songA.getRating();
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
        outputText.setText("Songs:\n");

        outputText.append(songA.displaySong());
        outputText.append(songB.displaySong());
        outputText.append(songC.displaySong());
        outputText.append(songD.displaySong());
        outputText.append(songE.displaySong());
        outputText.append(songF.displaySong());
        outputText.append(songG.displaySong());

        outputText.append("\nTotal Cost: $" + totalCost + " Total Rating: " + totalRating + " stars.");
        outputText.append("\nAverage Cost: $" + averageCost + " Average Rating: " + averageRating + " stars.");

        //Movies
        outputText.append("\n\nMovies:");
        outputText.append(movieA.displayMovie());
    }
}