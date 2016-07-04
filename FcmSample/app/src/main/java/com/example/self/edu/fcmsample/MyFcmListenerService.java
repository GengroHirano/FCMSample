package com.example.self.edu.fcmsample;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFcmListenerService extends FirebaseMessagingService {

  @Override
  public void onMessageReceived(RemoteMessage remoteMessage) {
    super.onMessageReceived(remoteMessage);
    String from = remoteMessage.getFrom();
    Map data = remoteMessage.getData();

    Log.v("from: ", from);
    Log.v("data: ", data.toString());

    Notification.Builder builder = new Notification.Builder(getApplicationContext());
    builder.setSmallIcon(R.mipmap.ic_launcher);
    builder.setContentText("Received!!");
    builder.setAutoCancel(true);

    NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    notificationManager.notify(0, builder.build());
  }

}
