package com.dicoding.picodiploma.buku;

import java.util.ArrayList;

class BukuData {
    private static String[] bukuNames = {
            "Bumi Manusia",
            "This Is Why I Need You",
            "Orang-orang Biasa",
            "Rich People Problems",
            "Norwegian Wood",
            "Cara Berbahagia Tanpa Kepala",
            "Satu Setengah Meter (Five Feet Apart)",
            "Senja dan Pagi",
            "The Girl Who Drank The Moon",
            "Laskar Pelangi"
    };

    private static String[] bukuDetails = {
            "Bumi Manusia adalah buku pertama dari Tetralogi Buru karya Pramoedya Ananta Toer yang pertama kali diterbitkan oleh Hasta Mitra pada tahun 1980.\n" + "\n" + "Buku ini ditulis Pramoedya Ananta Toer ketika masih mendekam di Pulau Buru. Sebelum ditulis pada tahun 1975, sejak tahun 1973 terlebih dahulu telah diceritakan ulang kepada teman-temannya. ",
            "Apa jadinya jika seorang mahasiswa, dengan badan atletis tinggi besar, harus tinggal di kos-kosan putri? Belum lagi, profesi sampingannya sebagai bartender di salah satu toko alcohol di bandung, sangat bertolak belakang dengan jabatannya di sebuah organisasi Kekeluargaan Masjid di kampus.\n",
            "Sebatang kapur dan penghapus tergeletak di bawah papan tulis itu. Tampak benar telah sangat lama tak dipakai. Demikian minim angka-angka itu sehingga tak bisa dijadikan diagram batang, diagram kue cucur atau diagram naik-naik ke puncak bukit. Rupanya di kota ini, penduduknya telah lupa cara berbuat jahat.",
            "Masalah Orang Kaya atau Rich People Problems adalah sebuah novel tahun 2017 karya Kevin Kwan. Novel tersebut adalah novel ketiga dan terakhir dalam trilogi \"Crazy Rich...\" karya Kwan yang menyoroti keluarga-keluarga kaya dan berkuasa di Singapura.",
            "Norwegian Wood Noruwei no Mori is a 1987 novel by Japanese author Haruki Murakami.[1] The novel is a nostalgic story of loss and burgeoning sexuality.[2] It is told from the first-person perspective of Toru Watanabe, who looks back on his days as a college student living in Tokyo.[3] Through Watanabe's reminiscences readers see him develop relationships with two very different women—the beautiful yet emotionally troubled Naoko, and the outgoing, lively Midori.",
            "Sempati merasa kepalanya tak memberi solusi atas ragam persoalan. Kepalanya justru merepotkan, hingga membuatnya turut program Bebaskan Kepalamu —yang memungkinkan untuk menceraikan sementara kepalanya. Tanpa diduga kepala itu menghilang. Bahagiakah Sempati hidup tanpa kepala?\n.",
            "Bisakah kau mencintai seseorang yang tidak bisa kausentuh? Stella Grant suka memegang kendali. Hanya satu yang tak bisa dia kendalikan, yaitu penyakit fibrosis kistik yang membuatnya keluar masuk rumah sakit. Pada titik tersebut, yang harus Stella lakukan adalah menjauhkan diri dari siapa pun atau apa pun yang mungkin bisa menularkan infeksi dan menggagalkan transplantasi paru-paru. Terpisah dua meter. Tidak ada perkecualian.",
            "Katanya, rindu itu berat. Tapi bagi saya, 'Rindu' itu tanggung jawab besar. Harga sejati yang harus dibayar untuk mengungkapkan kerinduan adalah menghalalkanmu.",
            "Setiap tahun pada periode tertentu, warga di Protektorat wajib mempersembahkan seorang bayi kepada Sang Penyihir supaya mereka tak terkena petaka. Sementara itu, Xan si penyihir yang baik, setiap tahun menyelamatkan seorang bayi yang diambilnya di hutan, yang entah mengapa dia juga tidak mengerti kenapa setiap kali ada orangtua yang menelantarkan bayi di hutan. Bayi-bayi itu dinamai Anak Bintang. Suatu hari saat Xan mengambil seorang bayi perempuan, tanpa sengaja bayi itu meminum banyak cahaya bulan dan ia pun dipenuhi oleh sihir. Karena merasa bertanggung jawab, Xan merawat bayi itu yang kemudian dinamai Luna. Sihir yang dimiliki Luna, bisa menjadi  berkat ataupun bencana, sehingga Xan melindunginya, sampai Luna menjadi cukup dewasa untuk bisa mengendalikan kekuatan sihir yang dimilikinya.",
            "Laskar Pelangi adalah novel pertama karya Andrea Hirata yang diterbitkan oleh Bentang Pustaka pada tahun 2005. Novel ini bercerita tentang kehidupan 10 anak dari keluarga miskin yang bersekolah (SD dan SMP) di sebuah sekolah Muhammadiyah di Belitung yang penuh dengan keterbatasan."
    };

    private static int[] bukuImages = new int[]{
            R.drawable.bumi_manusia,
            R.drawable.this_why_love,
            R.drawable.orang_orang_biasa,
            R.drawable.rich_problem,
            R.drawable.norwegian_wood,
            R.drawable.cara_berbahagiajpg,
            R.drawable.satu_setengah,
            R.drawable.senja_pagi,
            R.drawable.the_girl,
            R.drawable.laskar_pelangi
    };

    static ArrayList<Buku> getListData() {
        ArrayList<Buku> list = new ArrayList<>();
        for (int position = 0; position < bukuNames.length; position++) {
            Buku buku = new Buku();
            buku.setName(bukuNames[position]);
            buku.setDetail(bukuDetails[position]);
            buku.setPhoto(bukuImages[position]);
            list.add(buku);
        }
        return list;
    }
}