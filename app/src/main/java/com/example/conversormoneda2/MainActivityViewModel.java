package com.example.conversormoneda2;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.security.cert.PKIXRevocationChecker;


public class MainActivityViewModel extends AndroidViewModel {
    private Context context;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public Double calcularConversion(double valor1, double valor2){
        if (valor1 == 0) {

        }

        
        double calculo=valor1*valor2;
        return calculo;
    }


    
    }

