package com.reactnativejwplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.jwplayer.pub.api.JWPlayer
import com.jwplayer.pub.api.configuration.PlayerConfig
import com.jwplayer.pub.api.license.LicenseUtil
import com.jwplayer.pub.api.media.playlists.PlaylistItem
import com.jwplayer.pub.view.JWPlayerView

class JWPlayerViews(context: ThemedReactContext): ConstraintLayout {
    private val reactContext: ReactContext = context
    private val JWplayerView: JWPlayerView
    private val JWplayer: JWPlayer
    private val playlistItems: PlaylistItem
    private val playerConfig: PlayerConfig

    /**
     * Pass the License Key for getting the info related to your JWPlayer account.
     */

    @ReactProp(name="licenseKey")
      fun setUrl(licKey: String){
        LicenseUtil.setLicenseKey(reactContext.currentActivity, licenseKey);
     }

    @ReactProp(name="playlistURL")
    fun setPlaylistURL(playListURL: String){
      playlistItems = PlaylistItem.Builder().file(playListURL).build()
    }


    public fun JWPlayerViews(context: ThemedReactContext){

      val layoutInflate: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      val view: View = layoutInflate.inflate(R.layout.activity_jwplayer_view, null)
      JWplayerView = view.findViewById(R.id.jwplayerview);
      JWplayer = JWplayerView.player

      var playList: MutableList<PlaylistItem> = ArrayList()
      playList.add(playlistItems)
      playerConfig = PlayerConfig.Builder().playlist(playList).build()

      JWplayer.setup(playerConfig)
    }

      override fun requestLayout() {
        super.requestLayout()
        post(measureAndLayout)
      }

  var measureAndLayout = Runnable {
    public fun run() {
      measure(
        MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
        MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
      )
      layout(left, top, right, bottom)
    }
  }
}
