package com.maple.sambafilemanager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.maple.sambafilemanager.utils.NanoStreamer;

public class StreamService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
//        iStreamer = new CyberSmbStreamer();
        NanoStreamer.INSTANCE().start();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        NanoStreamer.INSTANCE().stopStream();
    }
}
