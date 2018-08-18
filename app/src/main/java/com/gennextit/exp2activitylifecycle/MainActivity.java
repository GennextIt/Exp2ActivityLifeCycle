package com.gennextit.exp2activitylifecycle;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    String tag = "LifeCycleEvents";
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "Main onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"Main Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"Main ReStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"Main Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"Main Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"Main Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"Main OnDestroy");
    }

    //Called when activity start-up is complete (after onStart() and onRestoreInstanceState(Bundle) have been called).
    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d(tag,"Main onPostCreate");
    }

    //Called when activity resume is complete (after onResume() has been called).
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(tag,"Main PostResume");
    }

    //Called to retrieve per-instance state from an activity before being killed so that the state can be restored in
    // onCreate(Bundle) or onRestoreInstanceState(Bundle) (the Bundle populated by this method will be passed to both).
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(tag,"Main onSaveInstanceState");
    }

    //This method is called after onStart() when the activity is being re-initialized from a previously saved state, given here in savedInstanceState.
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(tag,"Main onRestoreInstanceState");
    }
}