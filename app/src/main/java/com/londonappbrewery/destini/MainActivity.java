package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    Button mResetButton;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mResetButton = (Button) findViewById(R.id.resetButton);

        mStoryIndex = 1;
        mStoryText.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);
        mResetButton.setText(R.string.Reset);
        mResetButton.setVisibility(View.GONE);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex = mStoryIndex + 1;
                System.out.println("INDEX IS: " + mStoryIndex);

                if (mStoryIndex == 2 || mStoryIndex == 4) {
                    mStoryIndex = mStoryIndex + 2;
                    mStoryText.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);

                } else if (mStoryIndex > 4) {
                    mStoryText.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mResetButton.setVisibility(View.VISIBLE);
                }
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex = mStoryIndex + 1;
                System.out.println("INDEX IS: " + mStoryIndex);

                if (mStoryIndex == 2) {
                    mStoryIndex = mStoryIndex + 1;
                    mStoryText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);

                } else if (mStoryIndex == 4) {
                    mStoryIndex = mStoryIndex + 1;
                    mStoryText.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mResetButton.setVisibility(View.VISIBLE);

                } else if (mStoryIndex > 3) {
                    mStoryText.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                    mResetButton.setVisibility(View.VISIBLE);
                }
            }
        });

        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex = 1;
                mStoryText.setText(R.string.T1_Story);
                mButtonTop.setText(R.string.T1_Ans1);
                mButtonBottom.setText(R.string.T1_Ans2);
                mResetButton.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.VISIBLE);
                mButtonBottom.setVisibility(View.VISIBLE);
            }
        });

    }
}
