package com.example.self.edu.fcmsample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyInstanceIDListenerService extends FirebaseInstanceIdService {

  @Override
  public void onTokenRefresh() {
    super.onTokenRefresh();
    //Tokenはこちらで取得
    String refreshToken = FirebaseInstanceId.getInstance().getToken();
    Log.d("token", "token: " + refreshToken);
    //自分の立ち上げたサービスとかに送る処理
//    sendRegistrationToServer(refreshedToken);
  }
}
