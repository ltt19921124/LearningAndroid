package com.example.tianlu.servicebestpractice;

/**
 * Created by Tian Lu on 2017/1/16.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCancled();

}
