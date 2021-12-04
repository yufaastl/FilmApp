package com.juwita.sitiluthfahumairah;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.juwita.sitiluthfahumairah.genre.Film;
public class ProfileActivity extends AppCompatActivity{

    Film film;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivPosterFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galerifilm);
        Intent intent = getIntent();
        film = (Film) intent.getSerializableExtra(DaftarActivityFilm.FILM_TERPILIH);
        inisialisasiView();
        tampilkanProfil(film);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txGenre);
        txAsal = findViewById(R.id.txNama);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivPosterFilm = findViewById(R.id.gambarFilm);
    }


    private void tampilkanProfil(Film film) {
        Log.d("Profil","Menampilkan "+film.getJenis());
        txJudul.setText(film.getJenis());
        txJenis.setText(film.getGenre());
        txAsal.setText(film.getNama());
        txDeskripsi.setText(film.getDeskripsi());
        ivPosterFilm.setImageDrawable(this.getDrawable(film.getDrawableRes()));
    }
}
