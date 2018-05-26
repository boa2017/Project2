/*
 *
 *  * PROJECT LICENSE
 *  *
 *  * This project was submitted by Beatriz Ovejero as part of the Android Developer
 *  * Nanodegree at Udacity.
 *  *
 *  * As part of Udacity Honor code, your submissions must be your own work, hence
 *  * submitting this project as yours will cause you to break the Udacity Honor Code
 *  * and the suspension of your account.
 *  *
 *  * As author of the project, I allow you to check it as a reference, but if you submit it
 *  * as your own project, it's your own responsibility if you get expelled.
 *  *
 *  * Copyright (c) 2018 Beatriz Ovejero
 *  *
 *  * Besides the above notice, the following license applies and this license notice must be
 *  * included in all works derived from this project.
 *  *
 *  * MIT License
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in all
 *  * copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  * SOFTWARE.
 *
 */

package com.example.android.project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.TaekwondoCounter.R;

public class TaekwondoCounter extends AppCompatActivity {
    int scoreFighterA = 0;
    int scoreFighterB = 0;
    int foulsFighterA = 0;
    int foulsFighterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taekwondo_counter);
    }
    /**
     * Increase the score for Fighter A by 3 points.
     */
    public void addThreeForFighterA(View v) {
        scoreFighterA =scoreFighterA + 3;
        displayForFighterA(scoreFighterA);
    }
    /**
     * Increase the score for Fighter A by 2 points.
     */
    public void addTwoForFighterA(View v) {
        scoreFighterA =scoreFighterA + 2;
        displayForFighterA(scoreFighterA);
    }
    /**
     * Increase the score for Fighter A by 1 points.
     */
    public void addOneForFighterA(View v) {
        scoreFighterA =scoreFighterA + 1;
        displayForFighterA(scoreFighterA);
    }
    /**
     * Increase the score for Fighter B by 3 points.
     */
    public void addThreeForFighterB(View v) {
        scoreFighterB =scoreFighterB + 3;
        displayForFighterB(scoreFighterB);
    }
    /**
     * Increase the score for Fighter B by 2 points.
     */
    public void addTwoForFighterB(View v) {
        scoreFighterB =scoreFighterB + 2;
        displayForFighterB(scoreFighterB);
    }
    /**
     * Increase the score for Fighter B by 1 points.
     */
    public void addOneForFighterB(View v) {
        scoreFighterB =scoreFighterB + 1;
        displayForFighterB(scoreFighterB);
    }

    /**
     * Decrease the score for Fighter A by 1 points.
     */
    public void sustractOneForFighterA(View v) {
        if (scoreFighterA == 0) {
            // dont decrease score
            foulsFighterA++;
        }
        else {
            // decrease score
            scoreFighterA =scoreFighterA - 1;
            displayForFighterA(scoreFighterA);
            foulsFighterA++;
        }

        if (foulsFighterA == 3) {
            // show toast
            Toast.makeText(getApplicationContext(), "3 Fouls, FighterA is disqualified", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Decrease the score for Fighter B by 1 points.
     */
    public void sustractOneForFighterB(View v) {
        if (scoreFighterB == 0) {
            // dont decrease score
            foulsFighterB++;
        }
        else {
            // decrease score
            scoreFighterB =scoreFighterB - 1;
            displayForFighterB(scoreFighterB);
            foulsFighterB++;
        }

        if (foulsFighterB == 3) {
            // show toast
            Toast.makeText(getApplicationContext(), "3 Fouls, FighterB is disqualified", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Resets the score for both fighters back to 0.
     */
    public void resetScore(View v) {
        scoreFighterA = 0;
        scoreFighterB = 0;
        displayForFighterA(scoreFighterA);
        displayForFighterB(scoreFighterB);
    }
    /**
     * Displays the given score for Fighter A.
     */
    public void displayForFighterA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.figther_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Fighter B.
     */
    public void displayForFighterB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fighter_b_score);
        scoreView.setText(String.valueOf(score));
    }

  }
