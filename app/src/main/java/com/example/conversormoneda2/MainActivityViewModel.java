package com.example.conversormoneda2;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }
    public String calcularConversion(double valor1, double valor2){
        double calculo=valor1*valor2;
        return Double.toString((calculo));
    }
}
