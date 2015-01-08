package minah.widgetevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class FormActivityA extends Activity {
	
	private RadioButton gmale;
	private RadioButton gfemale;
	private CheckBox jja;
	private CheckBox woo;
	private CheckBox tang;
	private String myjja="";
	private String mywoo="";
	private String mytang="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form_activity);
		
		gmale = (RadioButton)findViewById(R.id.gmale);
		gfemale = (RadioButton)findViewById(R.id.gfemale);
		
		jja = (CheckBox)findViewById(R.id.jja);
		woo = (CheckBox)findViewById(R.id.woo);
		tang = (CheckBox)findViewById(R.id.tang);
	}
	
	/*보통크기 버튼 이벤트 처리*/
	public void nbtnClick(View v){
		Toast.makeText(getApplicationContext(), "보통크기버튼 클릭", Toast.LENGTH_SHORT).show();
		// 간단한 알림창 표시(짧은 시간동안 표시되고 사라짐)
	}
	
	/*작은크기 버튼 이벤트 처리*/
	public void sbtnClick(View v){
		Toast.makeText(getApplicationContext(), "작은크기버튼 클릭", Toast.LENGTH_LONG).show();
	}
	
	public void btnClick(View v){

		String msg="";
		
		// 클릭이벤트를 발생시킨 주체를 ID로 넘겨받음
		// case문으로 그 주체를 확인한 다음 적절하게 이벤트 처리
		switch(v.getId()){
			case R.id.nbtn :
				msg="보통크기 버튼이 클릭됨"; break;
			case R.id.sbtn :
				msg="작은크기 버튼이 클릭됨"; break;
		}
		Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
	}
	
	/*성별확인 이벤트 처리*/
	public void checkGender(View v){
		String result="";
		
		switch(v.getId()){
		case R.id.gmale: result="남자"; break;
		case R.id.gfemale: result="여자"; break;
		case R.id.gbtn:
			if(gmale.isChecked()) result="남자가 선택됨";
			else if(gfemale.isChecked()) result="여자가 선택됨";
			break;
		}
		Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
	}
	
	/*좋아하는 음식확인 이벤트*/
	public void checkFood(View v){
		switch(v.getId()){
		case R.id.jja: 
			if(jja.isChecked()){
				myjja="짜장면";
			}else{
				myjja="";
				 break;
			}
		case R.id.woo:
			if(woo.isChecked()){
				mywoo="우동";
			}else{
				mywoo="";
				 break;
			}
		case R.id.tang:
			if(tang.isChecked()){
				mytang="탕수육";
			}else{
				mytang="";
				break;
			}
		
		}
		String result = myjja + " " + mywoo + " " + mytang; 
		Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form_activity, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
