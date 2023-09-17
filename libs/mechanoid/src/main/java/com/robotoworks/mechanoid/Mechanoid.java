/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robotoworks.mechanoid;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.robotoworks.mechanoid.db.SQuery;
import com.robotoworks.mechanoid.ops.OpsInitializer;

/**
 * <p>Provides a means to initialize Mechanoid in an Android application, see {@link #init(Context)} for
 * more details.</p>
 */
public class Mechanoid {

    @SuppressLint("StaticFieldLeak")
    private static Mechanoid sInstance;
    private final Context mApplicationContext;

    private Mechanoid(Context context) {
        mApplicationContext = context.getApplicationContext();
    }

    public static Context getApplicationContext() {
        return get().mApplicationContext;
    }

    public static ContentResolver getContentResolver() {
        return get().mApplicationContext.getContentResolver();
    }

    public static void startService(Intent intent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            get().mApplicationContext.startForegroundService(intent);
        } else {
            get().mApplicationContext.startService(intent);
        }
    }

    public static Mechanoid get() {
        if (sInstance == null) {
            throw new MechanoidNotInitializedException();
        }
        return sInstance;
    }

    /**
     * <p>Initialize Mechanoid, this should be the very first thing called in onCreate of an
     * Android application implementation.</p>
     *
     */
    public static void init(Context context) {
        if (sInstance == null) {
            sInstance = new Mechanoid(context);

            SQuery.init(getContentResolver());

            OpsInitializer.init();
        }
    }
}
