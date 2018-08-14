package com.example.arial.mvvm.base;

import android.app.Activity;

import com.arialyy.frame.core.AbsFrame;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * Created by lyy on 2016/4/1.
 */
public class Application extends android.app.Application {
  public static String token;


  @Override public void onCreate() {
    super.onCreate();
    //        AbsFrame.init(this).openCrashHandler();
    //        AbsFrame.init(this).openCrashHandler("http://192.168.2.183/server.php", "params");
    AbsFrame.init(this);

    Logger.addLogAdapter(new AndroidLogAdapter());
  }
}
