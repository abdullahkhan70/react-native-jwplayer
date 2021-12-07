import PropTypes from 'prop-types';
import { requireNativeComponent, ViewPropTypes, UIManager } from 'react-native';
const componentName = "JwplayerView";

let viewProps = {
    name: componentName,
    propTypes: {
        licenseKey: PropTypes.string,
        playlistURL: PropTypes.string,
        ...ViewPropTypes
    }
}


JWPlayerView = requireNativeComponent(componentName, viewProps);

export default JWPlayerView

