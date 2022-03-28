package com.eos.kakaologin

import android.app.Application
import android.util.Log
import com.kakao.sdk.common.KakaoSdk
import com.kakao.sdk.common.util.Utility

class GlobalApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    // 다른 초기화 코드들

    // Kakao SDK 초기화
    KakaoSdk.init(this, "{34158a9c3314fc6d7f70ef4d6172f37b}")
    var keyHash = Utility.getKeyHash(this)
    log(keyHash)
  }
}

fun log(str: Any?) = Log.d("jihyun", "$str")
