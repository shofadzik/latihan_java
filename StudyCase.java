/* 
Buat aplikasi java yang menghitung nilai berdasarkan input dari argumen. Alur perhitungannya adalah:
argumen pertama dikali argumen kedua dikali argumen ketiga dan berlaku kelipatan selanjutnya. Kemudian
print type bilangan (ganjil atau genap) seperti contoh di output. Buat class java dengan nama StudyCase.
contoh command input:
java StudyCase 2 4
java StudyCase 1 3 5
output:
8 - Genap
15 - Ganjil
*/

public class StudyCase{
    public static void main (String[] args){
        int total=1;
        for (int i=0; i<args.length; i++){
            total = total * Integer.parseInt(args[i]);
        } //tujuan di loop karena kita tidak tau jumlah argumen ada brp

        if (total%2 == 0){
            System.out.println(String.valueOf(total)+ "--Genap");
        }
        else{
            System.out.println(String.valueOf(total)+ "--Ganjil");
        }

        /* 
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        int angka3 = Integer.parseInt(args[2]);
        total = angka1*angka2*angka3;
        
        //seperti diatas juga bisa tapi hanya diambil atau menghitung 3 masukan
        */
    }
}