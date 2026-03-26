package br.fecapads.projetoaula06;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pet dog1 = new Pet("Rex", 3, "15/04/2021", "Golden Retriever", "Caramelo", 0);
        Pet dog2 = new Pet("Thor", 5, "10/08/2019", "Bulldog", "Branco e Marrom", 0);
        Pet dog3 = new Pet("Max", 1, "05/12/2023", "Poodle", "Branco", 0);

        Pet cat1 = new Pet("Luna", 2, "22/11/2022", "Siamês", "Creme", 0);
        Pet cat2 = new Pet("Mia", 4, "10/02/2020", "Persa", "Cinza", 0);
        Pet cat3 = new Pet("Tom", 3, "14/07/2021", "SRD", "Preto e Branco", 0);


        TextView txtDog1 = findViewById(R.id.txt_name_dog1);
        Button btnDog1 = findViewById(R.id.btn_dog1);
        TextView txtDog2 = findViewById(R.id.txt_name_dog2);
        Button btnDog2 = findViewById(R.id.btn_dog2);
        TextView txtDog3 = findViewById(R.id.txt_name_dog3);
        Button btnDog3 = findViewById(R.id.btn_dog3);

        TextView txtCat1 = findViewById(R.id.txt_name_cat1);
        Button btnCat1 = findViewById(R.id.btn_cat1);
        TextView txtCat2 = findViewById(R.id.txt_name_cat2);
        Button btnCat2 = findViewById(R.id.btn_cat2);
        TextView txtCat3 = findViewById(R.id.txt_name_cat3);
        Button btnCat3 = findViewById(R.id.btn_cat3);


        txtDog1.setText(dog1.getNome());
        txtDog2.setText(dog2.getNome());
        txtDog3.setText(dog3.getNome());
        txtCat1.setText(cat1.getNome());
        txtCat2.setText(cat2.getNome());
        txtCat3.setText(cat3.getNome());


        btnDog1.setOnClickListener(v -> abrirDetalhes(dog1));
        btnDog2.setOnClickListener(v -> abrirDetalhes(dog2));
        btnDog3.setOnClickListener(v -> abrirDetalhes(dog3));
        btnCat1.setOnClickListener(v -> abrirDetalhes(cat1));
        btnCat2.setOnClickListener(v -> abrirDetalhes(cat2));
        btnCat3.setOnClickListener(v -> abrirDetalhes(cat3));
    }

    private void abrirDetalhes(Pet petSelecionado) {
        Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);


        intent.putExtra("NOME_PET", petSelecionado.getNome());
        intent.putExtra("IDADE_PET", petSelecionado.getIdade());
        intent.putExtra("ANIVERSARIO_PET", petSelecionado.getAniversario());
        intent.putExtra("RACA_PET", petSelecionado.getRaca());
        intent.putExtra("COR_PET", petSelecionado.getCor());
        intent.putExtra("IMAGEM_PET", petSelecionado.getImagemResId());

        startActivity(intent);
    }
}