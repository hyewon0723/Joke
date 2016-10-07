package com.android.lukekim.jokeviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class ViewerActivity extends AppCompatActivity {

    public static final String PARAM_JOKE = "PARAM_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);

        if (getIntent() != null && getIntent().hasExtra(PARAM_JOKE)) {

            TextView jokeTextView = (TextView)this.findViewById(R.id.text_view);
            jokeTextView.setText(getIntent().getStringExtra(PARAM_JOKE));
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case (android.R.id.home):
            default:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
