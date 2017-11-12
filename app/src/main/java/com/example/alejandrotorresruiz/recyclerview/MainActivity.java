package com.example.alejandrotorresruiz.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> names;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = this.devolverNombres();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //Establecemos que tipo de layaut vamos a utilizar
        mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager = new GridLayoutManager(this);
        myAdapter = new MyAdapter(names, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(String name, int posicion) {
                Toast.makeText(MainActivity.this,name +" "+posicion, Toast.LENGTH_LONG).show();
            }
        });

        //Le pasamos a la vista el layout y el adaptador.
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(myAdapter);
    }


    private List<String> devolverNombres(){
        return new ArrayList<String>(){{
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
            add("Prueba");
        }};
    }
}
