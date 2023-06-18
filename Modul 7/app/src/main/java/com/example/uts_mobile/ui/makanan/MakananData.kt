package com.example.uts_mobile.ui.makanan

import com.example.uts_mobile.R

object MakananData {
    private val foodNames = arrayOf(
        "Nasi Goreng",
        "Sate Ayam",
        "Rendang",
        "Gado-gado",
        "Soto Ayam",
        "Pempek",
        "Nasi Uduk",
        "Nasi Padang",
        "Ayam Betutu",
        "Sate Kambing",
        "Nasi Kuning",
        "Sop buntut",
        "Soto Betawi",
        "Sambal Goreng Udang",
        "Ikan Bakar"
    )

    private val foodDetails = arrayOf("Bahan-bahan:\n" +
            "\uF0B72 piring nasi putih\n" +
            "\uF0B72 butir telur\n" +
            "\uF0B72 siung bawang putih, cincang halus\n" +
            "\uF0B71 siung bawang merah, cincang halus\n" +
            "\uF0B72 sdm minyak goreng\n" +
            "\uF0B72 sdm kecap manis\n" +
            "\uF0B71 sdm saus tiram\n" +
            "\uF0B71 sdm saus sambal\n" +
            "\uF0B71 batang daun bawang, iris halus\n" +
            "\uF0B7Garam secukupnya\n" +
            "\uF0B7Merica secukupnya\n" +
            "Cara membuat:\n" +
            "a.Tumis bawang putih dan bawang merah dengan minyak goreng hingga harum.\n" +
            "b.Masukkan telur, aduk rata.\n" +
            "c.Tambahkan nasi putih, kecap manis, saus tiram, saus sambal, daun bawang, garam, dan merica. Aduk rata.\n" +
            "d.Sajikan nasi goreng dengan taburan bawang goreng dan acar timun.",
        "Bahan-bahan:\n" +
                "\uF0B7500 gram daging ayam, potong dadu\n" +
                "\uF0B72 siung bawang putih, haluskan\n" +
                "\uF0B71 sdm air asam jawa\n" +
                "\uF0B72 sdm minyak goreng\n" +
                "\uF0B71 sdt kecap manis\n" +
                "\uF0B71 sdt gula merah serut\n" +
                "\uF0B71 sdt garam\n" +
                "\uF0B7Tusuk sate secukupnya\n" +
                "Cara membuat:\n" +
                "a.Campurkan bawang putih, air asam jawa, minyak goreng, kecap manis, gula merah serut, dan garam dalam wadah, aduk rata.\n" +
                "b.potongan daging ayam ke dalam campuran bumbu, aduk hingga rata, dan diamkan selama 1 jam.\n" +
                "c.Tusuk daging ayam yang sudah marinasi ke tusuk sate.\n" +
                "d.Panggang sate ayam di atas bara api atau grill hingga matang.\n" +
                "e.Sajikan sate ayam dengan bumbu kacang, irisan bawang merah, dan lontong.",
        "Bahan-bahan :\n" +
                "\uF0B7500 gram daging sapi, potong dadu\n" +
                "\uF0B73 lembar daun jeruk purut\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B74 lembar daun kunyit\n" +
                "\uF0B72 asam kandis\n" +
                "\uF0B72 sdm minyak goreng\n" +
                "\uF0B72 sdm kerisik\n" +
                "\uF0B7800 ml santan kelapa dari 1/2 butir kelapa\n" +
                "\uF0B7Garam secukupnya\n" +
                "\uF0B7Bumbu halus:\n" +
                "\uF0B78 butir bawang merah\n" +
                "\uF0B76 siung bawang putih\n" +
                "\uF0B75 buah cabai merah keriting\n" +
                "\uF0B75 buah cabai merah besar\n" +
                "\uF0B72 cm jahe\n" +
                "\uF0B73 cm lengkuas\n" +
                "\uF0B71 sdt ketumbar bubuk\n" +
                "\uF0B71/2 sdt jinten bubuk\n" +
                "\uF0B71/2 sdt merica bubuk\n" +
                "Cara membuat:\n" +
                "a.Panaskan minyak goreng, tumis bumbu halus, daun jeruk purut, dan serai hingga harum.\n" +
                "b.Masukkan potongan daging sapi, aduk rata hingga daging berubah warna.\n" +
                "c.Tambahkan daun kunyit, asam kandis, kerisik, dan santan kelapa. Aduk rata.\n" +
                "d.Masak rendang dengan api kecil, aduk sesekali agar bumbu meresap dan santan mengental.\n" +
                "e.Setelah sekitar 2 jam, cek keempukan daging. Jika sudah empuk, tambahkan garam secukupnya. Masak hingga daging benar-benar empuk dan bumbu meresap.\n" +
                "f.Angkat rendang, sajikan dengan nasi putih dan taburan bawang goreng. Nikmati rendang yang gurih dan pedas!",
        "Bahan-bahan:\n" +
                "\uF0B7300 gram tahu, potong kotak\n" +
                "\uF0B7200 gram tempe, potong kotak\n" +
                "\uF0B7200 gram kacang panjang, potong pendek\n" +
                "\uF0B71/2 kol, iris halus\n" +
                "\uF0B72 buah mentimun, iris tipis\n" +
                "\uF0B72 buah tahu telur, potong kotak\n" +
                "\uF0B7Daun selada secukupnya\n" +
                "\uF0B7Bumbu kacang:\n" +
                "\uF0B7200 gram kacang tanah, sangrai\n" +
                "\uF0B74 siung bawang putih\n" +
                "\uF0B74 buah cabai merah keriting\n" +
                "\uF0B72 sdm air asam jawa\n" +
                "\uF0B72 sdm gula merah serut\n" +
                "\uF0B71/2 sdt terasi bakar\n" +
                "\uF0B71/2 sdt garam\n" +
                "Bahan pelengkap:\n" +
                "\uF0B7Bawang goreng secukupnya\n" +
                "\uF0B7Krupuk secukupnya\n" +
                "Cara membuat:\n" +
                "a.Goreng tahu dan tempe hingga kuning kecokelatan, tiriskan.\n" +
                "b.Rebus kacang panjang dan kol dalam air mendidih selama 3-4 menit, tiriskan.\n" +
                "c.Blender bumbu kacang bersama kacang tanah, bawang putih, cabai merah keriting, air asam jawa, gula merah serut, terasi bakar, dan garam hingga halus.\n" +
                "d.Tata tahu, tempe, kacang panjang, kol, mentimun, dan tahu telur di atas piring saji.\n" +
                "e.Siram bumbu kacang di atas bahan-bahan yang telah ditata.\n" +
                "f.Taburi dengan bawang goreng dan hidangkan dengan krupuk. Gado-gado siap dinikmati sebagai salad tradisional Indonesia yang segar dan lezat!",
        "Bahan-bahan:\n" +
                "\uF0B7500 gram daging ayam, potong menjadi beberapa bagian\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B72 lembar daun jeruk\n" +
                "\uF0B72 cm jahe, memarkan\n" +
                "\uF0B72 cm lengkuas, memarkan\n" +
                "\uF0B71 batang daun bawang, iris halus\n" +
                "\uF0B72 sdm minyak goreng\n" +
                "\uF0B71 sdt gula merah serut\n" +
                "\uF0B71 sdt garam\n" +
                "\uF0B71/2 sdt merica bubuk\n" +
                "\uF0B71/2 sdt kaldu ayam bubuk\n" +
                "\uF0B71 liter air\n" +
                "Bahan pelengkap:\n" +
                "\uF0B7Mie kuning, rebus\n" +
                "\uF0B7Tauge, seduh air panas\n" +
                "\uF0B7Telur ayam rebus, belah menjadi dua\n" +
                "\uF0B7Bawang goreng\n" +
                "\uF0B7Daun seledri, iris halus\n" +
                "\uF0B7Jeruk nipis, iris menjadi wedges\n" +
                "Cara membuat:\n" +
                "a.Panaskan minyak goreng dalam panci, tumis serai, daun salam, daun jeruk, jahe, dan lengkuas hingga harum.\n" +
                "b.Masukkan potongan daging ayam, aduk hingga berubah warna.\n" +
                "c.Tambahkan air, gula merah serut, garam, merica bubuk, dan kaldu ayam bubuk. Biarkan mendidih.\n" +
                "d.Setelah itu, kecilkan api dan biarkan soto ayam mendidih perlahan selama 30-40 menit hingga daging ayam empuk dan bumbu meresap.\n" +
                "e.Angkat daging ayam, tiriskan, dan suwir-suwir halus.\n" +
                "Sajikan soto ayam dengan mie kuning, tauge, telur ayam rebus, bawang goreng, daun seledri, dan jeruk nipis. Nikmati soto ayam yang hangat dan gurih!",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B7300 gram ikan tenggiri fillet, haluskan\n" +
                "\uF0B7200 gram sagu tani\n" +
                "\uF0B72 siung bawang putih, haluskan\n" +
                "\uF0B71 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh gula pasir\n" +
                "\uF0B7200 ml air es\n" +
                "\uF0B7100 ml air daun suji (dari 5 lembar daun suji yang dicincang halus dan disaring)\n" +
                "\uF0B7Minyak goreng secukupnya\n" +
                "\uF0B7Bahan Cuko (saus):\n" +
                "\n" +
                "\uF0B7300 ml air matang\n" +
                "\uF0B73 siung bawang putih, haluskan\n" +
                "\uF0B72 buah cabai merah, haluskan\n" +
                "\uF0B72 sendok teh ebi (udang kering), sangrai\n" +
                "\uF0B71 sendok teh air asam jawa\n" +
                "\uF0B71 sendok makan gula merah serut halus\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71/2 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh air kapur sirih, larutkan dalam 50 ml air matang\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Campurkan ikan tenggiri yang sudah dihaluskan dengan sagu tani, bawang putih, merica bubuk, garam, dan gula pasir. Aduk rata.\n" +
                "b.Tambahkan air es dan air daun suji, aduk kembali hingga adonan bisa dipulung dan tidak lengket di tangan.\n" +
                "c.Bentuk adonan pempek menjadi bulat pipih atau bulat telur sesuai selera.\n" +
                "d.Panaskan minyak goreng dalam wajan dengan api sedang. Goreng pempek dalam minyak panas hingga matang dan berwarna kecokelatan. Angkat dan tiriskan.\n" +
                "e.Untuk membuat cuko (saus), campurkan air matang, bawang putih halus, cabai merah halus, ebi sangrai, air asam jawa, gula merah serut halus, garam, merica bubuk, dan air kapur sirih yang sudah dilarutkan. Aduk rata hingga semua bahan tercampur dengan baik.\n" +
                "f.Sajikan pempek yang sudah digoreng dengan cuko (saus) dan hidangkan sebagai makanan pembuka atau hidangan utama.",
        "Bahan-bahan:\n" +
                "\uF0B72 cangkir beras, cuci bersih\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B73 lembar daun jeruk\n" +
                "\uF0B71 batang daun bawang, iris halus\n" +
                "\uF0B71 sendok teh air kapur sirih\n" +
                "\uF0B7800 ml air matang\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh kaldu bubuk\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok makan minyak kelapa atau minyak goreng\n" +
                "\uF0B7Bumbu Halus:\n" +
                "\uF0B74 siung bawang putih\n" +
                "\uF0B76 butir bawang merah\n" +
                "\uF0B72 buah cabai merah keriting\n" +
                "\uF0B72 buah cabai rawit merah (optional)\n" +
                "\uF0B71/2 sendok teh ketumbar bubuk\n" +
                "Pelengkap (opsional):\n" +
                "\uF0B7Ayam Goreng atau Ayam Bakar\n" +
                "\uF0B7Telur Rebus\n" +
                "\uF0B7Emping Melinjo\n" +
                "\uF0B7Kerupuk Udang\n" +
                "\uF0B7Sambal Kecap atau Sambal Terasi\n" +
                "Cara membuat:\n" +
                "a.Panaskan minyak dalam panci. Tumis bumbu halus, daun salam, serai, daun jeruk, dan daun bawang hingga harum dan matang.\n" +
                "b.Tambahkan beras yang sudah dicuci bersih ke dalam panci, aduk rata dengan bumbu halus.\n" +
                "c.Tuangkan air matang ke dalam panci, tambahkan air kapur sirih, garam, kaldu bubuk, dan gula merah serut halus. Aduk rata.\n" +
                "d.Masak nasi menggunakan rice cooker atau kompor hingga matang dan aroma bumbu meresap, sekitar 20-25 menit.\n" +
                "e.Setelah nasi matang, angkat dan biarkan sejenak sebelum dihidangkan.\n" +
                "Sajikan Nasi Uduk panas dengan pelengkap seperti ayam goreng atau ayam bakar, telur rebus, emping melinjo, kerupuk udang, dan sambal kecap atau sambal terasi.",
        "Bahan-bahan:\n" +
                "\uF0B72 cangkir beras, cuci bersih\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B73 lembar daun jeruk\n" +
                "\uF0B71 batang daun bawang, iris halus\n" +
                "\uF0B71 sendok teh air kapur sirih\n" +
                "\uF0B7800 ml air matang\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh kaldu bubuk\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok makan minyak kelapa atau minyak goreng\n" +
                "\uF0B7Bumbu Halus:\n" +
                "\uF0B74 siung bawang putih\n" +
                "\uF0B76 butir bawang merah\n" +
                "\uF0B72 buah cabai merah keriting\n" +
                "\uF0B72 buah cabai rawit merah (optional)\n" +
                "\uF0B71/2 sendok teh ketumbar bubuk\n" +
                "Pelengkap (opsional):\n" +
                "\uF0B7Ayam Goreng atau Ayam Bakar\n" +
                "\uF0B7Telur Rebus\n" +
                "\uF0B7Emping Melinjo\n" +
                "\uF0B7Kerupuk Udang\n" +
                "\uF0B7Sambal Kecap atau Sambal Terasi\n" +
                "Cara membuat:\n" +
                "a.Panaskan minyak dalam panci. Tumis bumbu halus, daun salam, serai, daun jeruk, dan daun bawang hingga harum dan matang.\n" +
                "b.Tambahkan beras yang sudah dicuci bersih ke dalam panci, aduk rata dengan bumbu halus.\n" +
                "c.Tuangkan air matang ke dalam panci, tambahkan air kapur sirih, garam, kaldu bubuk, dan gula merah serut halus. Aduk rata.\n" +
                "d.Masak nasi menggunakan rice cooker atau kompor hingga matang dan aroma bumbu meresap, sekitar 20-25 menit.\n" +
                "e.Setelah nasi matang, angkat dan biarkan sejenak sebelum dihidangkan.\n" +
                "f.Sajikan Nasi Uduk panas dengan pelengkap seperti ayam goreng atau ayam bakar, telur rebus, emping melinjo, kerupuk udang, dan sambal kecap atau sambal terasi.",
        "Bahan-bahan:\n" +
                "\uF0B71 ekor ayam kampung, potong menjadi beberapa bagian\n" +
                "\uF0B72 lembar daun pisang (opsional)\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B73 lembar daun jeruk\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B73 cm lengkuas, memarkan\n" +
                "\uF0B73 cm jahe, memarkan\n" +
                "\uF0B75 buah cabai merah keriting, iris halus\n" +
                "\uF0B75 buah cabai rawit merah, iris halus (opsional, bisa disesuaikan dengan tingkat kepedasan yang diinginkan)\n" +
                "\uF0B74 siung bawang putih, cincang halus\n" +
                "\uF0B74 buah bawang merah, cincang halus\n" +
                "\uF0B72 sendok teh air asam jawa\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71/2 sendok teh merica bubuk\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B7Air secukupnya\n" +
                "Bumbu Halus:\n" +
                "\uF0B75 buah cabai merah besar\n" +
                "\uF0B77 butir bawang merah\n" +
                "\uF0B75 siung bawang putih\n" +
                "\uF0B73 butir kemiri, sangrai\n" +
                "Cara membuat:\n" +
                "a.Panaskan minyak dalam wajan. Tumis bumbu halus, bawang putih, dan bawang merah hingga harum dan matang.\n" +
                "b.Tambahkan daun salam, daun jeruk, serai, lengkuas, jahe, cabai merah keriting, dan cabai rawit (jika menggunakan) ke dalam wajan. Aduk rata.\n" +
                "c.Masukkan potongan ayam ke dalam wajan, aduk rata dengan bumbu hingga ayam berubah warna.\n" +
                "d.Tambahkan air asam jawa, gula merah serut, garam, dan merica bubuk ke dalam wajan. Aduk rata.\n" +
                "e.Tuangkan air secukupnya hingga ayam terendam, tutup wajan dan masak dengan api sedang hingga ayam matang dan bumbu meresap, sekitar 45-60 menit. Jika air terlalu banyak, bisa diuapkan hingga tinggal sedikit.\n" +
                "f.Setelah ayam betutu matang, angkat dan sajikan dalam piring saji. Hiasi dengan daun pisang (jika menggunakan) untuk memberikan aroma khas.\n" +
                "g.Ayam Betutu siap disajikan dengan nasi putih hangat dan pelengkap seperti sambal matah, urap, dan plecing kangkung.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B7500 gram daging kambing, potong dadu\n" +
                "\uF0B720 tusuk sate, rendam dalam air selama 30 menit sebelum digunakan\n" +
                "\uF0B73 sendok makan minyak goreng\n" +
                "\uF0B72 sendok makan kecap manis\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh air jeruk nipis\n" +
                "\n" +
                "Bumbu Marinasi:\n" +
                "\uF0B75 siung bawang putih, cincang halus\n" +
                "\uF0B73 butir kemiri, sangrai\n" +
                "\uF0B72 cm jahe, parut halus\n" +
                "\uF0B71 sendok teh ketumbar bubuk\n" +
                "\uF0B71 sendok teh kunyit bubuk\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok teh air asam jawa\n" +
                "\n" +
                "Bahan Bumbu Kacang:\n" +
                "\uF0B7200 gram kacang tanah, sangrai\n" +
                "\uF0B73 siung bawang putih, cincang halus\n" +
                "\uF0B73 buah cabai merah keriting\n" +
                "\uF0B72 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh air asam jawa\n" +
                "\uF0B7Air secukupnya\n" +
                "\n" +
                "Cara membuat:\n" +
                "a.Rendam tusuk sate dalam air selama 30 menit sebelum digunakan agar tidak gosong saat dipanggang.\n" +
                "b.Marinasi daging kambing dengan bumbu marinasi. Campurkan bawang putih, kemiri, jahe, ketumbar bubuk, kunyit bubuk, gula merah serut halus, dan air asam jawa dalam wadah. Tambahkan daging kambing, aduk rata, dan diamkan selama minimal 2 jam dalam lemari es.\n" +
                "c.Persiapkan bumbu kacang. Haluskan kacang tanah, bawang putih, cabai merah keriting, gula merah serut halus, garam, air asam jawa, dan air secukupnya dengan blender atau ulekan hingga menjadi pasta kacang yang halus. Sisihkan.\n" +
                "d.Tusuk daging kambing yang telah dimarinasi ke dalam tusuk sate yang sudah direndam. Panaskan minyak goreng dalam wajan datar, panggang sate kambing hingga matang dan berwarna kecokelatan di kedua sisi.\n" +
                "e.Campurkan kecap manis, garam, merica bubuk, dan air jeruk nipis dalam wadah. Aduk rata untuk membuat saus sate.\n" +
                "f.Sajikan sate kambing yang sudah matang dengan saus kacang dan saus sate. Nikmati Sate Kambing yang lezat sebagai hidangan utama atau lauk pauk dalam acara makan bersama.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B72 gelas beras, cuci bersih dan tiriskan\n" +
                "\uF0B72 1/2 gelas air daun pandan\n" +
                "\uF0B71/2 sendok teh kunyit bubuk\n" +
                "\uF0B71/2 sendok teh jinten bubuk\n" +
                "\uF0B71 batang serai, memarkan\n" +
                "\uF0B71 lembar daun salam\n" +
                "\uF0B72 cm lengkuas, memarkan\n" +
                "\uF0B72 daun jeruk, sobek-sobek\n" +
                "\uF0B71 sendok teh air asam jawa\n" +
                "\uF0B71 sendok teh gula pasir\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "Bumbu Halus:\n" +
                "\n" +
                "\uF0B75 siung bawang merah\n" +
                "\uF0B73 siung bawang putih\n" +
                "\uF0B73 butir kemiri\n" +
                "\uF0B71/2 sendok teh terasi bakar\n" +
                "Pelengkap:\n" +
                "\n" +
                "\uF0B7Ayam suwir\n" +
                "\uF0B7Telur rebus\n" +
                "\uF0B7Kentang goreng\n" +
                "\uF0B7Irisan mentimun\n" +
                "\uF0B7Acar timun dan wortel\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Panaskan minyak goreng dalam panci atau rice cooker. Tumis bumbu halus, serai, daun salam, lengkuas, dan daun jeruk hingga harum.\n" +
                "b.Tambahkan beras yang sudah dicuci bersih dan aduk rata dengan bumbu tumis. Masukkan air daun pandan, kunyit bubuk, jinten bubuk, air asam jawa, gula pasir, dan garam. Aduk rata.\n" +
                "c.Masak nasi dengan cara yang biasa Anda gunakan, bisa dengan rice cooker atau di atas kompor dengan api kecil hingga air meresap dan nasi matang.\n" +
                "d.Setelah nasi matang, biarkan sebentar hingga uapnya hilang, lalu angkat dan sajikan dalam wadah saji.\n" +
                "e.Hias nasi kuning dengan ayam suwir, telur rebus, kentang goreng, mentimun iris, dan acar timun dan wortel. Nikmati nasi kuning yang lezat dengan beragam pelengkap yang bisa disesuaikan dengan selera.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B71 kg buntut sapi, potong-potong\n" +
                "\uF0B72 liter air\n" +
                "\uF0B72 sendok teh air jeruk nipis\n" +
                "\uF0B73 lembar daun jeruk\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B73 cm jahe, memarkan\n" +
                "\uF0B73 cm lengkuas, memarkan\n" +
                "\uF0B72 batang daun bawang, iris halus\n" +
                "\uF0B71 batang seledri, iris halus\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B72 sendok teh garam\n" +
                "\uF0B71 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh gula pasir\n" +
                "\uF0B71/2 sendok teh pala bubuk\n" +
                "Bumbu Halus:\n" +
                "\n" +
                "\uF0B76 siung bawang merah\n" +
                "\uF0B74 siung bawang putih\n" +
                "\uF0B73 butir kemiri\n" +
                "\uF0B71 sendok teh ketumbar bubuk\n" +
                "\uF0B71/2 sendok teh jinten bubuk\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Rebus buntut sapi dalam air mendidih selama 15-20 menit, lalu angkat dan tiriskan. Cuci bersih buntut sapi dengan air mengalir.\n" +
                "b.Tumis bumbu halus, daun jeruk, serai, daun salam, jahe, dan lengkuas dalam minyak goreng hingga harum.\n" +
                "c.Masukkan buntut sapi yang sudah direbus ke dalam tumisan bumbu halus, aduk rata.\n" +
                "d.Tambahkan air, air jeruk nipis, garam, merica bubuk, gula pasir, dan pala bubuk. Aduk rata dan masak dalam api kecil hingga buntut sapi empuk dan bumbu meresap, sekitar 2-3 jam.\n" +
                "e.Setelah buntut sapi empuk, masukkan daun bawang dan seledri, masak sebentar hingga layu.\n" +
                "f.Angkat sop buntut dan sajikan dalam mangkuk saji.\n" +
                "Sajikan sop buntut panas dengan nasi putih dan pelengkap seperti emping, bawang merah goreng, dan sambal, sesuai selera.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B7500 gram daging sapi, potong-potong\n" +
                "\uF0B72 liter air\n" +
                "\uF0B72 lembar daun jeruk\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B73 cm jahe, memarkan\n" +
                "\uF0B73 cm lengkuas, memarkan\n" +
                "\uF0B72 batang daun bawang, iris halus\n" +
                "\uF0B71 batang seledri, iris halus\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B72 sendok teh garam\n" +
                "\uF0B71 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh gula pasir\n" +
                "\uF0B71/2 sendok teh pala bubuk\n" +
                "Bumbu Halus:\n" +
                "\n" +
                "\uF0B76 siung bawang merah\n" +
                "\uF0B74 siung bawang putih\n" +
                "\uF0B73 butir kemiri\n" +
                "\uF0B72 sendok teh ketumbar bubuk\n" +
                "\uF0B71/2 sendok teh jinten bubuk\n" +
                "\uF0B7Bumbu Pelengkap:\n" +
                "\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B73 siung bawang merah, iris halus\n" +
                "\uF0B72 batang serai, iris halus\n" +
                "\uF0B72 daun salam\n" +
                "\uF0B72 lembar daun jeruk\n" +
                "\uF0B72 sendok teh air asam jawa\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71/2 sendok teh merica bubuk\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Rebus daging sapi dalam air mendidih selama 15-20 menit, lalu angkat dan tiriskan. Cuci bersih daging sapi dengan air mengalir.\n" +
                "b.Tumis bumbu halus, daun jeruk, serai, daun salam, jahe, dan lengkuas dalam minyak goreng hingga harum.\n" +
                "c.Masukkan daging sapi yang sudah direbus ke dalam tumisan bumbu halus, aduk rata.\n" +
                "d.Tambahkan air, garam, merica bubuk, gula pasir, dan pala bubuk. Aduk rata dan masak dalam api kecil hingga daging sapi empuk dan bumbu meresap, sekitar 1-2 jam.\n" +
                "e.Setelah daging sapi empuk, masukkan daun bawang dan seledri, masak sebentar hingga layu.\n" +
                "f.Sementara itu, untuk bumbu pelengkap, tumis bawang merah, serai, daun salam, dan daun jeruk dalam minyak goreng hingga harum. Tambahkan air asam jawa, garam, merica bubuk, dan gula merah serut halus. Aduk rata dan masak sebentar hingga bumbu pelengkap matang.\n" +
                "g.Angkat soto betawi dan sajikan dalam mangkuk saji. Sajikan soto betawi panas dengan nasi putih dan bumbu pelengkap, seperti telur rebus, emping, daun bawang iris, jeruk nipis, dan sambal, sesuai selera.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B7500 gram udang ukuran sedang, kupas kulit dan sisakan ekor\n" +
                "\uF0B72 sendok makan air jeruk nipis\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh air asam jawa\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B72 lembar daun salam\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B73 lembar daun jeruk\n" +
                "\uF0B73 cabai merah besar, iris serong\n" +
                "\uF0B73 cabai merah keriting, iris serong\n" +
                "\uF0B72 cabai rawit merah, iris serong (optional)\n" +
                "\uF0B73 siung bawang putih, iris halus\n" +
                "\uF0B74 siung bawang merah, iris halus\n" +
                "\uF0B71 sendok teh terasi, bakar\n" +
                "\uF0B72 sendok makan air asam jawa\n" +
                "\uF0B71 sendok teh air kelapa dari 1/4 butir kelapa parut\n" +
                "\uF0B7Minyak goreng untuk menggoreng\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Lumuri udang dengan air jeruk nipis, garam, air asam jawa, dan gula merah serut halus. Diamkan selama 10-15 menit agar bumbu meresap.\n" +
                "b.Panaskan minyak goreng dalam wajan, goreng udang dalam minyak panas hingga berubah warna menjadi merah kecokelatan dan kering. Angkat dan tiriskan.\n" +
                "c.Dalam wajan yang sama, panaskan 2 sendok makan minyak goreng. Tumis daun salam, serai, dan daun jeruk hingga harum.\n" +
                "d.Tambahkan cabai merah besar, cabai merah keriting, cabai rawit merah (jika menggunakan), bawang putih, bawang merah, dan terasi bakar. Tumis hingga bumbu matang dan harum.\n" +
                "e.Masukkan air asam jawa dan air kelapa, aduk rata. Tambahkan gula merah serut halus dan garam, aduk kembali.\n" +
                "f.Masukkan udang goreng, aduk rata dengan bumbu sambal. Masak selama 2-3 menit hingga bumbu meresap dan udang terbalut dengan sambal.\n" +
                "g.Angkat dan sajikan Sambal Goreng Udang panas sebagai hidangan pelengkap nasi putih atau nasi kuning.",
        "Bahan-bahan:\n" +
                "\n" +
                "\uF0B7500 gram ikan segar (misalnya ikan kakap, ikan tongkol, atau ikan tenggiri), bersihkan dan lumuri air jeruk nipis\n" +
                "\uF0B72 sendok makan air jeruk nipis\n" +
                "\uF0B72 sendok makan minyak goreng\n" +
                "\uF0B73 siung bawang putih, cincang halus\n" +
                "\uF0B73 siung bawang merah, cincang halus\n" +
                "\uF0B72 batang serai, memarkan\n" +
                "\uF0B72 lembar daun jeruk, sobek-sobek\n" +
                "\uF0B71 sendok teh gula merah serut halus\n" +
                "\uF0B71 sendok teh garam\n" +
                "\uF0B71 sendok teh merica bubuk\n" +
                "\uF0B72 sendok makan kecap manis\n" +
                "\uF0B7Sambal cabe rawit atau sambal terasi (opsional)\n" +
                "\uF0B7Daun pisang untuk membungkus (opsional)\n" +
                "Cara membuat:\n" +
                "\n" +
                "a.Lumuri ikan dengan air jeruk nipis dan biarkan selama 10-15 menit agar bumbu meresap.\n" +
                "b.Panaskan minyak goreng dalam wajan, tumis bawang putih, bawang merah, serai, dan daun jeruk hingga harum.\n" +
                "c.Tambahkan gula merah serut halus, garam, merica bubuk, dan kecap manis. Aduk rata dan masak hingga bumbu matang.\n" +
                "d.Angkat wajan dari api dan dinginkan bumbu marinasi.\n" +
                "e.Setelah bumbu marinasi dingin, olesi ikan dengan bumbu marinasi secara merata dan diamkan selama minimal 30 menit agar bumbu meresap.\n" +
                "f.Panaskan panggangan atau grill, atau bisa juga menggunakan wajan anti lengket atau teflon.\n" +
                "g.Panggang ikan di atas panggangan atau grill dengan api sedang, atau panggang di dalam wajan anti lengket atau teflon dengan api sedang hingga ikan matang dan berbekas bakar pada kedua sisi, sekitar 3-4 menit setiap sisi.\n" +
                "h.Angkat ikan bakar dari panggangan atau grill, atau dari wajan anti lengket atau teflon.\n" +
                "i.Sajikan ikan bakar panas dengan nasi putih, sambal cabe rawit atau sambal terasi (jika diinginkan), dan daun pisang sebagai hidangan pelengkap (opsional)."
)

    private val foodsImages = intArrayOf(
        R.drawable.nasi_goreng,
        R.drawable.sate_ayam,
        R.drawable.rendang,
        R.drawable.gado_gado,
        R.drawable.soto_ayam,
        R.drawable.pempek,
        R.drawable.nasi_uduk,
        R.drawable.nasi_padang,
        R.drawable.ayam_betutu,
        R.drawable.sate_kambing,
        R.drawable.nasi_kuning,
        R.drawable.sop_buntut,
        R.drawable.soto_betawi,
        R.drawable.sambal_goreng_udang,
        R.drawable.ikan_bakar
    )

    val listData: ArrayList<Makanan>
        get() {
            val list = arrayListOf<Makanan>()
            for (position in foodNames.indices) {
                val foods = Makanan()
                foods.name = foodNames[position]
                foods.detail = foodDetails[position]
                foods.photo = foodsImages[position]
                list.add(foods)
            }
            return list
        }
}