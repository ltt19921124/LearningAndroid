package com.example.tianlu.servicebestpractice;

import android.content.Intent;
import android.os.AsyncTask;

/**
 * Created by Tian Lu on 2017/1/16.
 */

public class DownloadeTask extends AsyncTask<String,Integer,Integer>{

    public static final int TYPE_SUCCESS = 0;
    public static final int TYPE_FAILED = 1;
    public static final int TYPE_PAUSED = 2;
    public static final int TYPE_CANCLED = 3;

    private DownloadListener listener;

}
