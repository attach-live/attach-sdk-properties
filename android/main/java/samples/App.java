package samples;

import android.app.Application;

import live.attach.sdk.AttachSdk;

/**
 * Set your app as context for the ATTACH SDK in your Application class.
 * @see  https://documentation.attach.live/android/concepts/setup
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AttachSdk.init(this);

        // Help us by sending anonymous error reports (default: true).
        // https://documentation.attach.live/android/concepts/error-reporting
        AttachSdk.setErrorReporting(true);
    }
}
