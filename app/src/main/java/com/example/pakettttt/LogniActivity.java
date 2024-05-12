package com.example.pakettttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogniActivity extends AppCompatActivity {

    private EditText usernameEditText,passwordEditText;

    private Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logni);

        // Inisialisasi views
        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);
        Button loginbutton = findViewById(R.id.loginin);

        // Set listener untuk tombol login
        loginbutton.setOnClickListener(v -> {
            // Mendapatkan nilai dari EditText username dan password
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Memeriksa apakah username dan password sudah sesuai
            if (username.equals("admin") && password.equals("admin")) {
                // Jika sesuai, tampilkan pesan berhasil
                Toast.makeText(LogniActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                // Lanjutkan ke activity selanjutnya atau lakukan tindakan lain
                startActivity(new Intent(LogniActivity.this, HomePage.class));
            } else {
                // Jika tidak sesuai, tampilkan pesan gagal
                Toast.makeText(LogniActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
            }
        });

    }
}