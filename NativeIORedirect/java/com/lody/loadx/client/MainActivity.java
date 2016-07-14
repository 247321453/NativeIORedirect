package com.lody.loadx.client;

import com.lody.loadx.client.hook.io.NativeIO;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		NativeIO.open();
		NativeIO.redirectFile("/data/data/com.wadahana.testhook/a.txt", "/data/data/com.wadahana.testhook/b.txt");
		NativeIO.test();
	}
}
