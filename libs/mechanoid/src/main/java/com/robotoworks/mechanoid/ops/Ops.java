package com.robotoworks.mechanoid.ops;

import java.lang.reflect.Field;
import java.util.Hashtable;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;

import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.ReflectUtil;

public class Ops {
	private static OperationServiceBridge mBridge;
	private static Hashtable<String, OperationServiceConfiguration> mConfigurations = new Hashtable<String, OperationServiceConfiguration>();

	public static void init(boolean enableLogging) {
		
		mBridge = new OperationServiceBridge(enableLogging);
		
		String packageName = Mechanoid.getApplicationContext().getPackageName();
		PackageManager pm = Mechanoid.getApplicationContext().getPackageManager();
		
		try {
			PackageInfo info = pm.getPackageInfo(packageName, PackageManager.GET_SERVICES);
			
			ServiceInfo[] services = info.services;
			
			for(ServiceInfo si : services) {
				String serviceName = si.name;
				
				Class<?> clz = ReflectUtil.loadClassSilently(Ops.class.getClassLoader(), serviceName);

				if(Service.class.isAssignableFrom(clz)) {
					Field field = ReflectUtil.getFieldSilently(clz, "CONFIG");
					if(field != null) {
						OperationServiceConfiguration factory = (OperationServiceConfiguration) ReflectUtil.getFieldValueSilently(field);
						mConfigurations.put(clz.getName(), factory);
					}
				}
			}
			
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int execute(Intent intent) {
		OperationServiceConfiguration config = mConfigurations.get(intent.getComponent().getClassName());
		
		Intent pending = config.findPendingRequestForUniqueConstraint(mBridge, intent);
		
		if(pending != null) {
			return pending.getIntExtra(OperationService.EXTRA_REQUEST_ID, 0);
		}
		
		return mBridge.execute(intent);
	}
	
	public static void bindListener(OperationServiceListener listener){
		mBridge.bindListener(listener);
	}
	
	public static void unbindListener(OperationServiceListener listener) {
		mBridge.unbindListener(listener);
	}
	
	public static boolean isRequestPending(int id) {
		return mBridge.isRequestPending(id);
	}
	
	public static OperationLog getLog() {
		return mBridge.getLog();
	}
}
