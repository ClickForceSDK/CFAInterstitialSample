package com.force.click.cfainterstitialsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.clickforce.ad.AdView;

public class MainActivity extends AppCompatActivity {
    private AdView fullad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullad = (AdView) this.findViewById(R.id.fullad);
        fullad.getFullScreenAd(3789);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (fullad != null)
            fullad.releaseAd();
    }
}
