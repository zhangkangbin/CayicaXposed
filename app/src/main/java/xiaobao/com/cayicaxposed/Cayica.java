package xiaobao.com.cayicaxposed;

import android.util.Log;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Created by zhangkangbin on 2016/6/13.
 */
public class Cayica implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {

        //Log.i("data","Cayica Hook-----------");
        if (!loadPackageParam.packageName.equals("com.cayica.mall"))
            return;
        Log.i("data","Cayica Hook-----------222222222");

    }
}
