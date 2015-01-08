package minah.widgetevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TextActivity extends Activity {

	private EditText normalText;
	private EditText nameText;
	private EditText pwdText;
	private EditText npwdText;
	private EditText emailText;
	private EditText telText;
	private EditText addrText;
	private EditText multiText;
	private EditText timeText;
	private EditText dateText;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);
		
		// 멤버변수로 선언한 위젯변수에 객체를 정의
		// 레이아웃에 배치된 위젯을 지정하려면 findById() 메서드를 사용함
		// 단, 위젯의 id는 R.java에 정의된 이름을 참고함
		normalText = (EditText) findViewById(R.id.normalText);
		nameText = (EditText) findViewById(R.id.nameText);
		pwdText = (EditText) findViewById(R.id.pwdText);
		npwdText = (EditText) findViewById(R.id.npwdText);
		emailText = (EditText) findViewById(R.id.emailText);
		telText = (EditText) findViewById(R.id.telText);
		addrText = (EditText) findViewById(R.id.addrText);
		multiText = (EditText) findViewById(R.id.multiText);
	}

	public void showInput(View v){
		StringBuilder sb = new StringBuilder();
		
		sb.append(normalText.getText()).append("\n");
		sb.append(nameText.getText()).append("\n");
		sb.append(pwdText.getText()).append("\n");
		sb.append(npwdText.getText()).append("\n");
		sb.append(emailText.getText()).append("\n");
		sb.append(telText.getText()).append("\n");
		sb.append(addrText.getText()).append("\n");
		sb.append(multiText.getText()).append("\n");

		
		Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text, menu);
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
