package com.activitytransition;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity
{
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    //opening transition animations
    overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);
  }

  @Override
  protected void onPause()
  {
    super.onPause();
    //closing transition animations
    overridePendingTransition(R.anim.activity_open_scale,R.anim.activity_close_translate);
  }
}
