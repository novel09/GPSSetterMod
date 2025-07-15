package com.novel.gpssetter;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

public class LSPosedEntry implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!lpparam.packageName.equals("com.shopee.foody.driver.id")) return;

        findAndHookMethod("android.location.Location", lpparam.classLoader, "isFromMockProvider",
            XC_MethodReplacement.returnConstant(false));
    }
}
