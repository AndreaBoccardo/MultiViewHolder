package cl.desafiolatm.desafio6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatm.desafio6.adapter.ItemAdaptador;
import cl.desafiolatm.desafio6.databinding.ActivityMainBinding;
import cl.desafiolatm.desafio6.modelo.Item;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;
    List<Item> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        initData();
        ItemAdaptador adaptador = new ItemAdaptador(lista);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        b.rvLista.setLayoutManager(layoutManager);
        b.rvLista.setAdapter(adaptador);
    }

    private void initData(){
        lista = new ArrayList<>();
        lista.add(new Item("Hoy"));
        lista.add(new Item("Hoy una rica cena con mi polola, ¿será un momento de comida japonesa?",
                R.drawable.sushi, "2:30 pm"));
        lista.add(new Item("Crep que me toca cocina en casa, quizás un delicioso pollo.",
                R.drawable.ic_pollo, "6:30 pm"));
        lista.add(new Item());
        lista.add(new Item("Mañana"));
        lista.add(new Item("En el trabajo, a veces tomo una merienda en las tardes, " +
                "hoy toco un \"Sopaipilla\".", "4:30 pm"));
        lista.add(new Item("Celebrando el cumpleaños de mi hermana, ya son 30 años.",
                R.drawable.ic_cake, "8:00 pm"));
        lista.add(new Item());
        lista.add(new Item("Próxima Semana"));
        lista.add(new Item("Hoy quiero comer algo dulce en la mañana.",
                R.drawable.ic_cupcake, "8:30 am"));
        lista.add(new Item("En la tarde debo ir a buscar comida a que la tía Rosa",
                "8:30 am"));
        lista.add(new Item("Voy a salir a celebrar el cumple de Pancho",
                R.drawable.ic_beer, "8:30 am"));
        lista.add(new Item());
    }
}