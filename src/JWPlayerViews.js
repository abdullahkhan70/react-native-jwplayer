import React, { Component } from 'react';
import { requireNativeComponent, Platform, View, NativeModules } from 'react-native';
const componentName = 'JWPlayerPlaylistViews';

const JWPlayerPlaylistView = Platform.select({
  ios: View,
  android: requireNativeComponent(componentName),
});

export class JWPlayerPlaylistViews extends Component {
  render() {
    const { width = '100%', height = 200 } = this.props;
    <JWPlayerPlaylistView
      style={{ width: width, height: height }}
      {...this.props}
    />;
  }
}
