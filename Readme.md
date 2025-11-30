== PERCOBAAN 1 ==

1. Apakah fungsi tanpa parameter selalu harus bertipe void? 
> Jawab: Tidak,  Tidak. Fungsi tanpa parameter boleh mengembalikan nilai (return) ataupun tidak. parameter hanya berhubungan dengan input, bukan tipe return.

2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi 
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu 
tanpa menggunakan fungsi! 
> Jawab: Bisa, Cukup tulis semua perintah print langsung di dalam main().

3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua 
perintah penampilan menu langsung di dalam fungsi main. 
> Jawab:Menggunakan fungsi Menu() membuat kode lebih rapi, mudah dibaca, tidak perlu mengulang kode saat menampilkan menu, dan memudahkan perbaikan karena perubahan cukup dilakukan di satu tempat.

4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main 
(mulai dari program dijalankan sampai daftar menu tampil di layar).
> Jawab:-Program dimulai dari main().
        -Main() memanggil fungsi Menu().
        -Program masuk ke dalam badan fungsi Menu().
        -Menu dicetak ke layar.
        -Eksekusi kembali ke main().
        -Program berhenti.


== PERCOBAAN 2 ==
1. Apakah kegunaan parameter di dalam fungsi?  
> Jawab: Parameter digunakan untuk mengirim data dari pemanggil fungsi ke dalam fungsi, sehingga fungsi bisa bekerja dengan nilai yang berbeda-beda tanpa harus menulis ulang kodenya.

2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter 
namaPelanggan dan isMember?
> Jawab: namaPelanggan -> adalah untuk menampilkan siapa yang datang 
         Ismember -> adalah menentukan apakah pelanggan tersebut mendapatkan diskon atau tidak

3. Apakah parameter sama dengan variabel? Jelaskan.
> Jawab: Tidak sama, tetapi terkait. 1. Parameter adalah variabel, tetapi berada di dalam tanda kurung fungsi 2. Parameter digunakan untuk menerima nilai dari luar fungsi 3. Parameter bersifat lokal hanya di fungsi tersebut

4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa 
perbedaan output ketika isMember bernilai true dan ketika false?
> Jawab:  Jika true → tampilkan “member“ dan diskon. Jika false → tampilkan “non-member“.

5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter 
namaPelanggan dan isMember? 
> Jawab: akan muncul eror compile karena funngsi membutuhkan paramrter. 

6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). 
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo 
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang 
berlaku, tampilkan kode invalid.
> Jawab: Sudah

7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan 
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris 
perintah pemanggilan fungsi menu yang benar.
> Jawab: sudah, Menu("Budi", true, "DISKON30");

8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember 
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan 
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? 
Jelaskan alasan Anda.
> Jawab: iya, karena fungsi menjadi fleksibel ,nilai dapat diganti tanpa mengedit isi fungsi, dan mempermudah           pengembangan program


==  PERCOBAAN 3 ==  
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return 
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh 
dari program kafe pada Percobaan 3 untuk masing-masing kasus. 
> Jawab: return dibutuhkan jika fungsi menghasilkan nilai seperti misal penghitungan total harga, dan return tidak di perlukan jika hanya menampilkan sesuatu seperti contoh menu()

2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan 
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua 
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing 
parameter dalam konteks program kafe.
> Jawab: Return type: int atau double (total harga), Parameter: int pilihanMenu = menu mana yang dipilih int banyakItem = berapa porsi yang dipesan

3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima 
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari 
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka 
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode 
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga 
totalHarga.
> Jawab: Sudah

4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta 
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga 
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis 
menu)?  
> Jawab: Sudah 


== PERCOBAAN 4 ==
1.  Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String... 
namaPengunjung! 
> Jawab: Karena String adalah variable arguments (varags) yang memiliki fungsi dapat menerima jumlah parameter String yang tidak terbatas tanpa harus membuat array secara manual.

2. Modifikasi method daftarPengunjung menggunakan for-each loop. 
> Jawab:  Bisa. Cukup tulis semua perintah print langsung di dalam main().

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban 
Anda berdasarkan aturan varargs di Java, dan berikan contohnya! 
> Jawab: Tidak bisa, di dalam Java, kita tidak dapat menggunakan dua varargs dalam satu fungsi.

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. 
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? 
Jika tetap berjalan, bagaimana output yang dihasilkan?
> Jawab: Program tidak error (tidak saat kompilasi, tidak saat runtime).
Varargs yang kosong akan dianggap sebagai array dengan panjang 0.

== PERCOBAAN 5 ==
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program 
dijalankan hingga menampilkan luas persegi panjang dan volume balok! 
> Jawab: 1. Program mulai dari main(). 2. Input p, l, t. 3. Panggil fungsi hitungLuas(). 4. Panggil hitungVolume(). 5. Tampilkan hasil. 6. Program selesai.

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna 
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur 
jalannya program sampai output tersebut muncul.
> Jawab: Output jika panjang=4, lebar=3, tinggi=5 ,Luas = 4 × 3 = 12 > Volume = 4 × 3 × 5 = 60 Alur: 1. Input dibaca 2. Fungsi hitungLuas dipanggil = hasil 12 3. Fungsi hitungVolume dipanggil = hasil 60 4. Dicetak ke layar

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program 
tersebut!
> Jawab: output = 1234567 penjelasan : Program dimulai dari main. 1.Jumlah(1,1) dipanggil = mengembalikan 2. 2. Hasilnya disimpan ke variabel temp. 3. Fungsi TampilJumlah(temp,5) dipanggil = berarti TampilJumlah(2,5). 4. Di dalam TampilJumlah, dilakukan: 5. Maka dipanggil TampilHinggaKei(7). 6. TampilHinggaKei mencetak angka dari 1 sampai 7. 7. Output final: 1234567

4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? 
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? 
Jelaskan!
> Jawab: Fungsi harus menggunakan parameter ketika membutuhkan data dari luar untuk diproses, Fungsi harus memiliki nilai kembalian (return) jika hasilnya akan digunakan di bagian lain dari program, Fungsi tidak perlu return ketika fungsinya hanya menjalankan aksi tanpa menghasilkan nilai.

5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi 
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume 
di Percobaan 5.
> Jawab: hitungLuas & hitungVolume = perlu parameter, main = tidak perlu parameter.

6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan 
kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, 
hitungLuas, dan hitungVolume.
> Jawab: Fungsi harus menggunakan parameter ketika membutuhkan data dari luar untuk diproses, Fungsi tidak perlu parameter ketika tidak membutuhkan input sama sekali, misal menampilkan menu atau pesan.