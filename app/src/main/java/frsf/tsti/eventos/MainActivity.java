package frsf.tsti.eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rgEquipos = (RadioGroup) findViewById(R.id.equipoFavorito);
        RadioGroup rgComida = (RadioGroup) findViewById(R.id.comidaFavorita);
        MiListener listenerEventoRadioButton = new MiListener();
        rgEquipos.setOnCheckedChangeListener(listenerEventoRadioButton );
        rgComida.setOnCheckedChangeListener(listenerEventoRadioButton );
    }

    class MiListener implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (radioGroup.getId()){
                case R.id.comidaFavorita:
                    // hizo click en algun checkbox de comida favorita
                    if(i == R.id.comEmp) {
                        Log.d("COMIDA1", "Le gusta las empandas");
                    }
                    if(i == R.id.comMila) {
                        Log.d("COMIDA1", "Le gusta las milanesas");
                    }
                    if(i == R.id.comRav) {
                        Log.d("COMIDA1", "Le gusta los ravioles");
                    }
                    break;
                case R.id.equipoFavorito:
                    switch (i){
                        case R.id.equBarsa:
                            Log.d("CoLOR","AZUL y ROJO");
                            break;
                        case R.id.equReal:
                            Log.d("CoLOR","BLANCO");
                            break;
                        case R.id.equAleti:
                            Log.d("CoLOR","ROJO Y BLANCO");
                            break;
                    }
                    break;
            }

        }
    }
}
