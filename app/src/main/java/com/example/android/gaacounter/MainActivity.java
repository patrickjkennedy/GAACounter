package com.example.android.gaacounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.gaacounter.R;

public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int pointsTeamA = 0;
    int widesTeamA = 0;

    int goalsTeamB = 0;
    int pointsTeamB = 0;
    int widesTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalsForTeamA(0);
        displayPointsForTeamA(0);
        displayTotalPointsForTeamA(calculateTotalPointsTeamA());

        displayGoalsForTeamB(0);
        displayPointsForTeamB(0);
        displayTotalPointsForTeamB(calculateTotalPointsTeamB());

    }

    public void displayGoalsForTeamA(int goals) {
        TextView goalView = (TextView) findViewById(R.id.team_a_goals);
        goalView.setText(String.valueOf(goals));
    }

    public void displayPointsForTeamA(int points) {
        TextView pointView = (TextView) findViewById(R.id.team_a_points);
        pointView.setText(String.valueOf(points));
    }

    public void displayTotalPointsForTeamA(int totalPoints) {
        TextView totalPointsView = (TextView) findViewById(R.id.team_a_total_points);
        totalPointsView.setText(String.valueOf(totalPoints));
    }

    public void displayWidesForTeamA(int wides) {
        TextView widesView = (TextView) findViewById(R.id.team_a_wides);
        widesView.setText(String.valueOf(wides));
    }

    public void addGoalForTeamA(View view) {
        goalsTeamA += 1;
        displayGoalsForTeamA(goalsTeamA);
        displayTotalPointsForTeamA(calculateTotalPointsTeamA());
    }

    public void addPointForTeamA(View view) {
        pointsTeamA += 1;
        displayPointsForTeamA(pointsTeamA);
        displayTotalPointsForTeamA(calculateTotalPointsTeamA());
    }

    public void addWideForTeamA(View view){
        widesTeamA += 1;
        displayWidesForTeamA(widesTeamA);
    }

    public int calculateTotalPointsTeamA(){
        return goalsTeamA*3 + pointsTeamA;
    }

    public void displayGoalsForTeamB(int goals) {
        TextView goalView = (TextView) findViewById(R.id.team_b_goals);
        goalView.setText(String.valueOf(goals));
    }

    public void displayPointsForTeamB(int points) {
        TextView pointView = (TextView) findViewById(R.id.team_b_points);
        pointView.setText(String.valueOf(points));
    }

    public void displayWidesForTeamB(int wides) {
        TextView widesView = (TextView) findViewById(R.id.team_b_wides);
        widesView.setText(String.valueOf(wides));
    }

    public void addGoalForTeamB(View view) {
        goalsTeamB += 1;
        displayGoalsForTeamB(goalsTeamB);
        displayTotalPointsForTeamB(calculateTotalPointsTeamB());
    }

    public void addPointForTeamB(View view) {
        pointsTeamB += 1;
        displayPointsForTeamB(pointsTeamB);
        displayTotalPointsForTeamB(calculateTotalPointsTeamB());
    }

    public void addWideForTeamB(View view){
        widesTeamB += 1;
        displayWidesForTeamB(widesTeamB);
    }

    public int calculateTotalPointsTeamB(){
        return goalsTeamB*3 + pointsTeamB;
    }

    public void displayTotalPointsForTeamB(int totalPoints) {
        TextView totalPointsView = (TextView) findViewById(R.id.team_b_total_points);
        totalPointsView.setText(String.valueOf(totalPoints));
    }

    public void resetScores(View view) {
        goalsTeamA = 0;
        pointsTeamA = 0;
        goalsTeamB = 0;
        pointsTeamB = 0;
        widesTeamA = 0;
        widesTeamB = 0;

        displayGoalsForTeamA(goalsTeamA);
        displayPointsForTeamA(pointsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayPointsForTeamB(pointsTeamB);
        displayTotalPointsForTeamA(calculateTotalPointsTeamA());
        displayTotalPointsForTeamB(calculateTotalPointsTeamB());
        displayWidesForTeamA(widesTeamA);
        displayWidesForTeamB(widesTeamB);
    }


}
