
package org.cocos2dx.cpp;

import org.cocos2dx.lib.Cocos2dxActivity;

import android.os.Bundle;

import com.google.zxing.integration.android.IntentIntegrator;

public final class AppActivity extends Cocos2dxActivity {
	
	
	@Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Start

        IntentIntegrator integrator = new IntentIntegrator(AppActivity.this);
        integrator.initiateScan(IntentIntegrator.QR_CODE_TYPES);
    }
}
