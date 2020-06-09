# PBO-Teori
# A.Wrapper Class
Wrapper Class (Kelas Pembungkus) adalah suatu mekanisme yang digunakan untuk mengconvert atau mengubah suatu nilai yang di definisikan, dari tipe data primitif menjadi sebuah nilai dengan tipe data referensi (Objek). Selain itu, Wrapper Class mendukung method dari tipe data primitif, contohnya seperti Boolean, Character, Integer, Long, Float, dsb.

Bahasa pemrograman Java, terdapat 2 jenis tipe data, yaitu primitif dan referensi (objek), Tipe Data Primitif adalah tipe data yang tidak memiliki method, hanya memiliki data saja. Tipe data ini bukanlah sebuah object, sedangkan Tipe Data Referensi adalah tipe data yang digunakan untuk memegang referensi dari sebuah object ( instance dari class).

Table yang menjelaskan macam-macam tipe data primitif dan referensi pada Java:

![3](https://user-images.githubusercontent.com/65879490/83326240-7c2ad080-a29c-11ea-8489-198313c903c5.png)

Contoh Program :

ExWrapperClass.java

# B.Final, Finally, Finalize
   <>Final adalah keyword untuk mendeklarasikan bahwa sebuah variabel/atribut tidak dapat diubah lagi isinya (konstan), jika final disebutkan di method, artinya method tersebut tidak dapat di override oleh subclassnya, jika final disebutkan di class, artinya class tersebut tidak dapat diturunkan lagi
   
Contoh Program :

ExFinal.java

   <>Finally merupakan tag dalam try-finally yang digunakan untuk memastikan bahwa kode didalam finally akan dieksekusi walaupun dalam try sukses / gagal.
   
Contoh Program :

ExFinally.java

   <>Finalize merupakan methode kelas Object yang dieksekusi saat garbace collection menghapus sebuah object yang sudah tidak terpakai.

Contoh Program :

ExFinalize.java

