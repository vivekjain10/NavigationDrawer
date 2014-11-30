package com.example.android.navigationdrawer;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Locale;

public class PlanetBitmap {

  private Activity activity;

  public PlanetBitmap(Activity activity) {
    this.activity = activity;
  }

  public Bitmap getBitmap(String planet) {
    int imageId = activity.getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
        "drawable", activity.getPackageName());

    return BitmapFactory.decodeResource(activity.getResources(), imageId);
  }
}
