package es.upv.gnd.primeraclase;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //clase siempre publica para que la lea android

    /*//@Override  (opcional)
    protected void onCreate(Bundle savedInstanceState) {//cuando esta actividad sea creada,se llama a la funcion
        Log.d("HolaMundo","Entramos en onCreate");
        super.onCreate(savedInstanceState);
        Object o = null;
        //o.toString();
        setContentView(R.layout.activity_main);
    }*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView texto = new TextView(this);
        texto.setText("Hello, Android");
        texto.setTextColor(Color.RED); //color de las letras
        setContentView(texto);
        System.out.printl("yooooooooo");
    }
}
