package com.example.conversormoneda2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.conversormoneda2.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
private MainActivityViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        binding.btConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.texResultado.setText(vm.calcularConversion(Double.parseDouble(binding.EdDolares.getText().toString()), Double.parseDouble(binding.EdEuros.getText().toString())));
            }
        });


        binding.rbEuroaPesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hola mundo ", Toast.LENGTH_SHORT).show();
            binding.rbPesosaEuros.setEnabled(false);
            }
        });
        binding.rbPesosaEuros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.rbPesosaEuros.setEnabled(false);
                Toast.makeText(MainActivity.this, "accion boton 2", Toast.LENGTH_SHORT).show();
            }
        });


    }
}