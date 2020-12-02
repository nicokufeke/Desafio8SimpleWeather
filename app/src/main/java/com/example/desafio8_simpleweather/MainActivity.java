package com.example.desafio8_simpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.desafio8_simpleweather.databinding.ActivityMainBinding;

/*
[X] 1. Crear un proyecto desde el template de actividad vacía.
[X] 2. Copiar los recursos entregados dentro de los directorios correspondientes.
[X] 3. Configurar DataBinding en archivo build.gradle y enlazar en MainActivity.
[X] 4. Cambiar el layout usando background_grandient.xml como fondo.
[X] 5. Crear una nueva imagen de un sol usando Vector Asset y la galería de imágenes incluida en el SDK.
[X] 6. Agregar las vistas para cumplir con la interfaz usando ConstraintLayout. Estas son:
       TextView para la ciudad, TextView para la fecha, ImageView para el clima, TextView para la temperatura,
       TextView para la unidad de medida (grados celsius)

En el archivo res/values/styles.xml, el estilo HeaderTextView y SubHeaderTextView pueden ser utilizados para la ciudad y la fecha respectivamente.
[X] 7.Crear una clase DailyWeather con los atributos para ciudad, fecha, imagen de clima, temperatura y unidad que serán utilizados en la interfaz.
[X] 8. Utilizar Data Binding para asignar los valores a desplegar por las vistas en MainActivity.
*/

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setWeather(new DailyWeather("Wuhan", "31 de Diciembre", R.drawable.ic_baseline_wb_sunny_24,"40","º"));
    }
}