package com.example.listagemdetimes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listViewClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewClubs = findViewById(R.id.listViewClubs);

        List<Club> clubList = new ArrayList<>();

        clubList.add(new Club("Atletico MG", R.drawable.atletico));
        clubList.add(new Club("Bahia", R.drawable.bahia));
        clubList.add(new Club("Botafogo", R.drawable.botafogo));
        clubList.add(new Club("Ceará", R.drawable.ceara));
        clubList.add(new Club("Corinthians", R.drawable.corinthians));
        clubList.add(new Club("Cruzeiro", R.drawable.cruzeiro));
        clubList.add(new Club("Flamengo", R.drawable.flamengo));
        clubList.add(new Club("Fluminense", R.drawable.fluminense));
        clubList.add(new Club("Fortaleza", R.drawable.fortaleza));
        clubList.add(new Club("Gremio", R.drawable.gremio));
        clubList.add(new Club("Internacional", R.drawable.internacional));
        clubList.add(new Club("Juventude", R.drawable.juventude));
        clubList.add(new Club("Mirassol", R.drawable.mirassol));
        clubList.add(new Club("Palmeiras", R.drawable.palmeiras));
        clubList.add(new Club("Santos", R.drawable.santos));
        clubList.add(new Club("São Paulo", R.drawable.saopaulo));
        clubList.add(new Club("Sport", R.drawable.sport));
        clubList.add(new Club("Vasco", R.drawable.vasco));
        clubList.add(new Club("Vitória", R.drawable.vitoria));

        ClubAdapter adapter = new ClubAdapter(this, clubList);
        listViewClubs.setAdapter(adapter);







    }
}