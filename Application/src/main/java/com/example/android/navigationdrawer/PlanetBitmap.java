package com.example.android.navigationdrawer;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PlanetBitmap {

  private static Map<String, Bitmap> cache = new HashMap<String, Bitmap>();
  private Activity activity;

  public PlanetBitmap(Activity activity) {
    this.activity = activity;
  }

  public Bitmap getBitmap(String planet) {
    Bitmap bitmap = cache.get(planet);
    if (bitmap != null) return bitmap;

    int imageId = activity.getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
        "drawable", activity.getPackageName());

    try {
      Thread.sleep(500);
    } catch (InterruptedException ignored) {
    }

    bitmap = BitmapFactory.decodeResource(activity.getResources(), imageId);
    cache.put(planet, bitmap);
    return bitmap;
  }
}
