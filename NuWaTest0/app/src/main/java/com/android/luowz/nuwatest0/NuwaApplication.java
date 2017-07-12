package com.android.luowz.nuwatest0;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by luowz on 2017/7/12.
 */

public class NuwaApplication extends Application{
    @Override
    protected void attachBaseContext(Context base){
        super.attachBaseContext(base);
        Nuwa.init(this);
        //loadpatch方法中的参数是补丁文件的位置，应该从服务器动态获取文件，
        //并存储到sdcard指定项目专用目录，在这里我们是测试demo，
        // 就简单的固定好jar文件位置，sdcard根目录。
        Nuwa.loadPatch(this, Environment
                .getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
