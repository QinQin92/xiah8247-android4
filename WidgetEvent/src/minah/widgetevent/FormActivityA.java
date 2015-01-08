package minah.widgetevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class FormActivityA extends Activity {
	
	private RadioButton gmale;
	private RadioButton gfemale;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form_activity);
		
		gmale = (RadioButton)findViewById(R.id.gmale);
		gfemale = (RadioButton)findViewById(R.id.gfemale);
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
		//boolean checked = ((RadioButton)v).isChecked();	/*클릭한 라디오버튼의 체크여부 확인(버튼클릭시 사용)*/
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
