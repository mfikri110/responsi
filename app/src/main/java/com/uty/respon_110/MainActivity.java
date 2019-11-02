 package com.uty.respon_110;

 import android.content.Intent;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

 import androidx.appcompat.app.AlertDialog;
 import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
 import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btn_masuk;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.id_username);
        password = (EditText) findViewById(R.id.id_password);
        btn_masuk = (Button) findViewById(R.id.btn_masuk);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin")&& passwordKey.equals("123")){
                    //jika login berhasil

                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, tampil.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika gagal login
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("username atau password anda salah!")
                            .setNegativeButton("Retry",null).create().show();
                }
            }
        });

    }
}
