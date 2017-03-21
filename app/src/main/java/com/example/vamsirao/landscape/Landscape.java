package com.example.vamsirao.landscape;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;

/**
 * Created by Vamsi Rao on 3/3/2017.
 */

public class Landscape extends Service {

    private LinearLayout orientationChanger;

    @Override
    public void onCreate() {
        super.onCreate();
        this.orientationChanger = new LinearLayout(this);
        WindowManager.LayoutParams orientationLayout = new WindowManager.LayoutParams(2006, 0, 1);
        orientationLayout.screenOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).addView(this.orientationChanger, orientationLayout);
        this.orientationChanger.setVisibility(View.VISIBLE);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;

    }
}
