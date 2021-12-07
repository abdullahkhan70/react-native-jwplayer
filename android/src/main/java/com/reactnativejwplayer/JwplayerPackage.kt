package com.reactnativejwplayer

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.google.android.exoplayer2.ExoPlayer


class JwplayerPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        val nativeModules: MutableList<NativeModule> = ArrayList();
        nativeModules.add(RNJwplayerMainView())
//        return emptyList()
      return nativeModules;
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return listOf(RNJwplayerMainView())
    }
}
