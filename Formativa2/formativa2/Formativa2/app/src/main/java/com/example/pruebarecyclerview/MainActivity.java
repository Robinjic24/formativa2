package com.example.pruebarecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;

    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://ih1.redbubble.net/image.4108176410.3851/flat,750x,075,f-pad,750x1000,f8f8f8.jpg", "John", "Movil");
        Usuario usu2 = new Usuario("https://i.pinimg.com/originals/5c/54/b9/5c54b968384c83550d26cf9bdcaf9f8f.jpg", "Jack", "Cactus Jack");
        Usuario usu3 = new Usuario("https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/jackboys-poster-oliver-jager.jpg", "Webster", "JackBoys");

        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(listaUsuarios));

    }
}