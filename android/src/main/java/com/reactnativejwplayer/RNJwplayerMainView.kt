package com.reactnativejwplayer

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.jwplayer.pub.api.JWPlayer
import com.jwplayer.pub.api.license.LicenseUtil


class RNJwplayerMainView: SimpleViewManager<JWPlayerViews> {
  private val libName: String = "JWPlayerPlaylistViews"

  override fun getName(): String {
    return libName;
  }

  override fun createViewInstance(reactContext: ThemedReactContext): JWPlayerViews {
    return JWPlayerViews(reactContext)
  }
}
