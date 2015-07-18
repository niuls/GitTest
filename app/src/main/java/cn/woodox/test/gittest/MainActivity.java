package cn.woodox.test.gittest;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		System.out.printf("modified at work. 7.17");
		System.out.println("now push at home 7.18");
	}
}
