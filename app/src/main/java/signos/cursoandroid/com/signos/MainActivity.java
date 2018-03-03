package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {
            "Áries","Câncer","Gêmeos","Touro", "Leão","Virgem",
            "Libra","Escorpião","Sagitário","Capricórnio","Aquário",
            "Peixes"


    };
    private String[] perfis= {
            "Arianos são animados, Independentes , individualistas , dinâmicos, corajosos e aventureiros",
            "Uma característica típica de cancerianos é a sua demora em se entregar e confiar na outra pessoa, são naturalmente desconfiados",
            "...","...","...","...","...","...","...","...","...","..."

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listViewId);

//        cria um adaptador para o array de strings signos
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos

        );

//        exibe na tela o adaptador
        listaSignos.setAdapter(adaptador);


//        ao clicar em algum item da lista, vai exibir o texto que está na posição do array perfis
        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                int codigoPosicao = position;

                Toast.makeText(getApplicationContext(),perfis[codigoPosicao], Toast.LENGTH_LONG).show();
            }
        });



    }
}
