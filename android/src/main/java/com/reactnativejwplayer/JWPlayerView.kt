package com.reactnativejwplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.react.uimanager.annotations.ReactProp
import com.jwplayer.pub.api.license.LicenseUtil
import com.jwplayer.pub.view.JWPlayerView

class JWPlayerView : AppCompatActivity() {
  public var JwPlayerView:JWPlayerView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_jwplayer_view)

  }
  @ReactProp(name="licenceKey")
  fun setLicenseKey(var licenseKey: LicenseUtil?, val licenseString: String){
    licenseKey
  }
}
