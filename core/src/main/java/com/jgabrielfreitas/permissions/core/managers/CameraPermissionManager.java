package com.jgabrielfreitas.permissions.core.managers;

import android.Manifest;
import android.content.Context;

import com.jgabrielfreitas.permissions.core.interfaces.OnPermissionRequest;

/**
 * Created by JGabrielFreitas on 10/06/16.
 */
public class CameraPermissionManager extends BasePermissionManager {

    public CameraPermissionManager(Context context, OnPermissionRequest onPermissionRequest) {
        super(context, onPermissionRequest);
    }

    public String getPermission() {
        return Manifest.permission.CAMERA;
    }

}
