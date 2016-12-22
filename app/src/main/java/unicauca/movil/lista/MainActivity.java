package unicauca.movil.lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.lista.adapters.PlcmmsAdapter;
import unicauca.movil.lista.models.PLCmms;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PlcmmsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment > onCreateView
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        adapter = new PlcmmsAdapter(getLayoutInflater()); // Fragment > getLayoutInflater(null)
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // Fragment > recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //api.all();

        loadInfo();


    }

    public void loadInfo(){

        //Datos de prueba
        List<PLCmms> data = new ArrayList<>();

        PLCmms plCmms = new PLCmms();
        plCmms.setNombre("Dato 1");
        plCmms.setDescripcion("Descripcion 1");

        PLCmms plCmms2 = new PLCmms();
        plCmms2.setNombre("Dato 2");
        plCmms2.setDescripcion("Descripcion 2");

        PLCmms plCmms3 = new PLCmms();
        plCmms3.setNombre("Dato 3");
        plCmms3.setDescripcion("Descripcion 3");

        data.add(plCmms);
        data.add(plCmms2);
        data.add(plCmms3);


        //Colocamos los datos en el Adaptador
        adapter.setData(data);



    }
}
