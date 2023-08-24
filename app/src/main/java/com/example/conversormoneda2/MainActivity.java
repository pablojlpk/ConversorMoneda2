package com.example.conversormoneda2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.conversormoneda2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private MainActivityViewModel vm;
private int tconversion=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        vm.getMutableConversion().observe(this, new Observer<Double>() {
            @Override
            public void onChanged(Double aDouble) {
            binding.texResultado.setText(aDouble.toString());
            }
        });

        binding.btConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             vm.calcularConversion((binding.EdDolares.getText().toString()),(binding.EdEuros.getText().toString()),tconversion);

            }

        });


        binding.rbEuroaDolares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.rbDolaresaEuros.setChecked(false);
                binding.EdEuros.setEnabled(false);
                binding.EdDolares.setEnabled(true);
                tconversion=1;
}
        });

        binding.rbDolaresaEuros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.rbEuroaDolares.setChecked(false);
                binding.EdDolares.setEnabled(false);
                binding.EdEuros.setEnabled(true);
                tconversion = 2;
            }
        });


    }
}
