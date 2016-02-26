package com.phkcorp.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

public class Echo extends CordovaPlugin {

    // The callback context used when calling back into JavaScript
    private CallbackContext command;
    
    @Override
    public boolean execute (String action, JSONArray args,
                            CallbackContext callback) throws JSONException {
        this.command = callback;
        
        return false;
    }
    
    /**
     * Called when an activity you launched exits, giving you the reqCode you
     * started it with, the resCode it returned, and any additional data from it.
     *
     * @param reqCode     The request code originally supplied to startActivityForResult(),
     *                    allowing you to identify who this result came from.
     * @param resCode     The integer result code returned by the child activity
     *                    through its setResult().
     * @param intent      An Intent, which can return result data to the caller
     *                    (various data can be attached to Intent "extras").
     */
    @Override
    public void onActivityResult(int reqCode, int resCode, Intent intent) {
        command.success();
    }
}
