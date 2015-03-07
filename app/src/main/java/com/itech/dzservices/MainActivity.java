package com.itech.dzservices;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements CircleLayout.OnItemSelectedListener,
        CircleLayout.OnItemClickListener, CircleLayout.OnRotationFinishedListener, CircleLayout.OnCenterClickListener {

    private TextView selectedTextView;
    public static LinearLayout l;
    private CircleLayout circleMenu;
    private AnimationDrawable animHidden;
    public static MainActivity ma;
    private AnimationDrawable animShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ma = this;
        // Set content view by passed extra

        setContentView(R.layout.activity_main);

        // Set listeners
        circleMenu = (CircleLayout) findViewById(R.id.main_circle_layout);
        circleMenu.setOnItemSelectedListener(this);
        circleMenu.setOnItemClickListener(this);
        circleMenu.setOnRotationFinishedListener(this);
        circleMenu.setOnCenterClickListener(this);

        selectedTextView = (TextView) findViewById(R.id.main_selected_textView);
        selectedTextView.setText(((CircleImageView) circleMenu
                .getSelectedItem()).getName());

       l = (LinearLayout) findViewById(R.id.center);

        animateCenterHiddenCreate();
        animateCenterShownCreate();
        animateCenterShownPlay();

    //    circleMenu.setObjectsHidden(true);

      //  circleMenu.groupeButtons(circleMenu.isObjectsHidden());

        //     animateCenterPlay();

    }

    @Override
    public void onItemSelected(View view, String name) {
        selectedTextView.setText(name);

        switch (view.getId()) {
         /*   case R.id.main_calendar_image:
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
                break;*/
        }
    }

    @Override
    public void onItemClick(View view, String name) {
        Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.start_app) + " " + name,
                Toast.LENGTH_SHORT).show();

        switch (view.getId()) {
          /*  case R.id.main_calendar_image:
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

          */
        }
    }

    @Override
    public void onRotationFinished(View view, String name) {
     /*   Animation animation = new RotateAnimation(0, 360, view.getWidth() / 2,
                view.getHeight() / 2);*/
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        animation.setDuration(240);
        view.startAnimation(animation);
    }

    @Override
    public void onCenterClick() {
      /*  Toast.makeText(getApplicationContext(), R.string.center_click,
                Toast.LENGTH_SHORT).show();*/

        circleMenu.groupeButtons(circleMenu.isObjectsHidden());
    }

    public void animateCenterHiddenPlay() {
        l.setBackgroundDrawable(animHidden);
        animHidden.run();

    }

    public void animateCenterHiddenStop() {

        animHidden.stop();

    }

  public void animateCenterHiddenCreate() {
        animHidden = new AnimationDrawable();

        //Bitmap bm = decodeSampledBitmapFromUri();

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled=true;
        options.inPreferredConfig= Bitmap.Config.RGB_565;

        //   options.inSampleSize=2;

      //  options.inPurgeable = true;

        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon0, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon1, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon2, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon3, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon4, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon5, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon6, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon7, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon8, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon9, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon10, options)), 40);
        animHidden.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon11, options)), 40);


        //if you want the animation to loop, set false
        animHidden.setOneShot(false);

    }

    public void animateCenterShownPlay() {
        l.setBackgroundDrawable(animShown);
        animShown.run();

    }

    public void animateCenterShownStop() {
        animShown.stop();

    }

  public void animateCenterShownCreate() {

        animShown = new AnimationDrawable();

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;

        animShown.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon_hidden0, options)), 600);
        animShown.addFrame(  new BitmapDrawable(getResources(), BitmapFactory
                .decodeResource(getResources(),R.drawable.back_moon_hidden1, options)), 600);

        //if you want the animation to loop, set false
        animShown.setOneShot(false);

        animShown.run();

    }

    @Override
    protected void onStop() {
        super.onStop();
     //   animShown = null;
       // animHidden = null;
   //     System.gc();
        Log.d("Etat", "onStop");
   //     invalidateOptionsMenu();
     //   finish();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
      //  Log.d("Etat", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
     //   Log.d("Etat", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //  Log.d("Etat", "onResume");

    }

    @Override
    protected void onDestroy() {
        super.onRestart();
      //  Log.d("Etat", "onDestroy");
    }


}
