package com.example.nada_login;

import android.os.Bundle;
import android.os.Message;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	int intento = 5;
	Button Sesion, Catalogo;
	EditText usuario, contraseña;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Sesion = (Button)findViewById(R.id.button1);
		Catalogo = (Button)findViewById(R.id.button2);
		usuario = (EditText)findViewById(R.id.editText1);
		contraseña = (EditText)findViewById(R.id.editText2);
		Sesion.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String usu = usuario.getText().toString();
				String con = contraseña.getText().toString();
						if(usu == "admin" && con == "admin")
				{
				      Toast.makeText(getApplicationContext(), "Redirecting...", 
				    	      Toast.LENGTH_SHORT).show();
				}
				else
				{
					intento--;
					if(intento==0)
					{
						Sesion.setEnabled(false);
					}
					Toast.makeText(getApplicationContext(), "Tiene "+intento+ " restantes", Toast.LENGTH_SHORT).show();
				}
				}
		});}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
