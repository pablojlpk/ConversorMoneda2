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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.security.cert.PKIXRevocationChecker;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private Double cotizaEuro= 1.025;
    private Double cotizaDolar=1.087;




    private MutableLiveData <Double> mutableconversion;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public LiveData<Double> getMutableConversion(){
        if (mutableconversion == null) {
            mutableconversion = new MutableLiveData<>();

        }
        return  mutableconversion;
    }

    public void calcularConversion(String valor1, String valor2,int tconv){
        Double calculo= (double) 0;

        if (valor1.length()==0 || valor2.length()==0 && tconv==0) {
            Toast.makeText(context, "RECUERDE INGRESAR VALOR Y EL TIPO DE CONVERSIÓN", Toast.LENGTH_LONG).show();
        }else {
            if (tconv==1) {
                calculo=Double.parseDouble(valor1)*cotizaDolar;
            } else {
                calculo=Double.parseDouble(valor2)*cotizaEuro;
            }

        }
        mutableconversion.setValue(calculo);

    }


    
    }

