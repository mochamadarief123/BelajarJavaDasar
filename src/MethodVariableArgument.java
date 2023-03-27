/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class MethodVariableArgument {
    public static void main(String[] args) {
        /*
        * kadang disebuah method kita memerlukan variable yg values nya lebih dari satu atau banyak
        * saat kondisi spt ini, biasanya array digunakan sebagai parameter method tersebut
        * di java, kita bisa menggunakann variable argument untuk mengirimkan data yg jumlah nya tak tentu
        * parameter yg menggunakan variable argument hanya bisa ditempatkan diposisi terakhir parameter
        */

        //array nilai
        int nilai [] = {70,60,59,45,80};
        //panggil method tanpa menggunakan variable argument
        katakanSelamat("Doni",nilai);

        //panggil methode dengan variable argument
        katakanSelamatLagi("Wawan", nilai);

        //atau bisa memasukan data array nya langsung saat method di panggil
        katakanSelamatLagi("Ara", 80,80,80,80,90);

    }

    //membuat method yg akan menghitung nilai rata" dan menampilkan "Hello " + parameterName + " Anda lulus" jika nilai >=80
    //tidak menggunakan method variable argument
    static void katakanSelamat(String name, int nilai []){

        int totalNilai = 0;
        //foreach
        for (int perNilai : nilai){

             totalNilai += perNilai;
        }

        int nilaiRataRata = totalNilai / nilai.length;
        if (nilaiRataRata >= 80){
            System.out.println("Selamat " + name + ", anda lulus dengan nilai Rata-rata " + nilaiRataRata);
        } else{
            System.out.println("Maaf " + name + ", nilai anda " + nilaiRataRata + ". Anda tidak lulus");
        }

    }

    //dengan menggunakan variable method argument
    static void katakanSelamatLagi(String name, int... nilai){

        int totalNilai = 0;
        //foreach
        for (int perNilai : nilai){

            totalNilai += perNilai;
        }

        int nilaiRataRata = totalNilai / nilai.length;
        if (nilaiRataRata >= 80){
            System.out.println("Selamat " + name + ", anda lulus dengan nilai Rata-rata " + nilaiRataRata);
        } else{
            System.out.println("Maaf " + name + ", nilai anda " + nilaiRataRata + ". Anda tidak lulus");
        }

    }
}
