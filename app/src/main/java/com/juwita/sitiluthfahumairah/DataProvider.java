package com.juwita.sitiluthfahumairah;

import android.content.Context;

import com.juwita.sitiluthfahumairah.genre.Film;
import com.juwita.sitiluthfahumairah.genre.Horror;
import com.juwita.sitiluthfahumairah.genre.Romance;
import com.juwita.sitiluthfahumairah.genre.Comedy;

import java.util.ArrayList;
import java.util.List;
public class DataProvider {

    private static List<Film> films = new ArrayList<>();

    private static List<Horror> inifilmhorror(Context ctx) {
        List<Horror> horrors = new ArrayList<>();
        horrors.add(new Horror("Annabelle", "Horror",
                "  Annabele diangkat dari Kisah Nyata. Tahun 1967, diceritakan pasangan suami istri yang tinggal di Santa Monica, John Form (Ward Horton) dan Mia Form (Annabelle Wallis).Diketahui bahwa keluarga itu merupakan pengikut aliran sesat Ram (pemuja setan)", R.drawable.anabel));
        horrors.add(new Horror("The Conjuring 3", "Horror",
                " CONJURING 3 DEVIL MADE ME DO IT diangkat dari kasus pengadilan yang dikenal dengan nama sama. Ceritanya pada 24 November 1981 di Brookfield, Connecticut, Arne Cheyenne Johnson disidang kasus pembunuhan tingkat pertama atas kematian seorang tuan tanah bernama Alan Bono. Kasus tersebut menjadi terkenal karena melibatkan untuk pertama kalinya unsur \"kerasukan setan\" dalam sebuah persidangan atas kasus pembunuhan.n.", R.drawable.conjuring));
        horrors.add(new Horror("The Nun", "Horror",
                "Kisah dalam film The Nun bermula ketika pihak otoritas Vatikan mendapat laporan kematian seorang biarawati di Rumania. Biarawati ini dilaporkan tewas secara misterius dengan kondisi mengenaskan. Pihak Vatikan lantas mengirim utusan bernama Father Burke (Demián Bichir) ke Rumania untuk menyelidiki kasus ini.", R.drawable.thenun));
        return horrors;
    }

    private static List<Romance> inifilmromance(Context ctx) {
        List<Romance> romances = new ArrayList<>();
        romances.add(new Romance("Love Rosie", "Romance",
                "Love Rosie merupakan film drama komedi romantis yang menceritakan tentang kisah Rosie Dune dan Alex Stewart yang sudah menjalin hubungan persahabatan sejak usia mereka masih 5 tahun.", R.drawable.loverosie));
        romances.add(new Romance("Before Sunrise", "Romance ",
                "Before Sunrise adalah film drama romantis 1995. Film ini bercerita tentang Jesse, pria muda berkebangsaan Amerika, dan Céline, wanita muda Prancis, yang secara kebetulan bertemu dan bertukar pikiran di kereta Eurail.", R.drawable.beforesunrise));
        romances.add(new Romance("A Walk To Remember", "Romance",
                "Film ini merupakan drama romantis Amerika yang bercerita tentang kisah cinta seorang gadis kutu buku dan seorang pria yang populer di sekolah. ", R.drawable.film));
        return romances;
    }

    private static List<Comedy> inifilmcomedy(Context ctx) {
        List<Comedy> comedies = new ArrayList<>();
        comedies.add(new Comedy("Cek Toko Sebelah", "Comedy",
                "Cek Toko Sebelah adalah film komedi Indonesia. Cerita film ini dibuat berdasarkan pada realitas etnis Tionghoa saat anak beranjak dewasa, kuliah yang tinggi, mirisnya ujung-ujungnya bekerja di toko orang tuanya sendiri.", R.drawable.cektokosebelah));
        comedies.add(new Comedy("Susah Sinyal", "Comedy",
                "Film ini berfokus pada kehidupan seorang ibu bernama Ellen (Adinia Wirasti) yang bekerja sebagai seorang pengacara ternama. \n" +
                        "\n" +
                        "Sayangnya, karena pekerjaan yang menyita waktu ini, Ellen seringkali tidak memiliki waktu untuk putri semata wayangnya, Kiara (Aurora Ribero)..", R.drawable.susahsinyal));
        comedies.add(new Comedy("Marmut Merah Jambu ", "Comedy",
                "Dika menceritakan kisah cinta pertamanya saat SMA dengan cewek bernama Ina Mangunkusumo. Cerita ketika dia dan temannya Bertus membentuk sebuah grup detektif, dan juga persahabatannya dengan Cindy.", R.drawable.marmutmerah));
        return comedies;
    }

    private static void initAllFilms(Context ctx) {
        films.addAll(inifilmhorror(ctx));
        films.addAll(inifilmromance(ctx));
        films.addAll(inifilmcomedy(ctx));
    }

    public static List<Film> getAllFilm(Context ctx) {
        if (films.size() == 0) {
            initAllFilms(ctx);
        }
        return  films;
    }

    public static List<Film> getFilmsByTipe(Context ctx, String jenis) {
        List<Film> filmsByType = new ArrayList<>();
        if (films.size() == 0) {
            initAllFilms(ctx);
        }
        for (Film f : films) {
            if (f.getJenis().equals(jenis)) {
                filmsByType.add(f);
            }
        }
        return filmsByType;
    }
}
