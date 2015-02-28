package com.itech.dzservices;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements CircleLayout.OnItemSelectedListener,
        CircleLayout.OnItemClickListener, CircleLayout.OnRotationFinishedListener, CircleLayout.OnCenterClickListener {

    private TextView selectedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set content view by passed extra

        setContentView(R.layout.activity_main);

        // Set listeners
        CircleLayout circleMenu = (CircleLayout) findViewById(R.id.main_circle_layout);
        circleMenu.setOnItemSelectedListener(this);
        circleMenu.setOnItemClickListener(this);
        circleMenu.setOnRotationFinishedListener(this);
        circleMenu.setOnCenterClickListener(this);

        selectedTextView = (TextView) findViewById(R.id.main_selected_textView);
        selectedTextView.setText(((CircleImageView) circleMenu
                .getSelectedItem()).getName());
    }

    @Override
    public void onItemSelected(View view, String name) {
        selectedTextView.setText(name);

        switch (view.getId()) {
            case R.id.main_calendar_image:
                // Handle calendar selection
                break;
            case R.id.main_cloud_image:
                // Handle cloud selection
                break;
            case R.id.main_facebook_image:
                // Handle facebook selection
                break;
            case R.id.main_key_image:
                // Handle key selection
                break;
            case R.id.main_profile_image:
                // Handle profile selection
                break;
            case R.id.main_tap_image:
                // Handle tap selection
                break;
        }
    }

    @Override
    public void onItemClick(View view, String name) {
        Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.start_app) + " " + name,
                Toast.LENGTH_SHORT).show();

        switch (view.getId()) {
            case R.id.main_calendar_image:
                // Handle calendar click
                break;
            case R.id.main_cloud_image:
                // Handle cloud click
                break;
            case R.id.main_facebook_image:
                // Handle facebook click
                break;
            case R.id.main_key_image:
                // Handle key click
                break;
            case R.id.main_profile_image:
                // Handle profile click
                break;
            case R.id.main_tap_image:
                // Handle tap click
                break;
        }
    }

    @Override
    public void onRotationFinished(View view, String name) {
        Animation animation = new RotateAnimation(0, 360, view.getWidth() / 2,
                view.getHeight() / 2);
        animation.setDuration(250);
        view.startAnimation(animation);
    }

    @Override
    public void onCenterClick() {
        Toast.makeText(getApplicationContext(), R.string.center_click,
                Toast.LENGTH_SHORT).show();
    }
}
