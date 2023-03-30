/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 30/03/23
 * Time: 2:56
 * To change this template use File | Settings | File Templates.
 */
public class LatihanJavaDasar01 {
    public static void main(String[] args) {



        kalkulasiNilai("ara", 50, 100, 70, 80, 75);
        kalkulasiNilai("danar", 90, 50, 52, 70, 70);
        kalkulasiNilai("ayu", 97, 73, 52, 77, 79);
        kalkulasiNilai("daniel", 97, 90, 88, 87, 89);
        kalkulasiNilai("benny", 57, 60, 40, 54, 49);

    }

    static void kalkulasiNilai(String name, int nTugas1, int nTugas2, int nTugas3, int nUts, int nUas){

        int nTotalTugas = (nTugas1 + nTugas2 + nTugas3) * 20 /100;

        int nTotalUts = nUts * 30 / 100;

        int nTotalUas = nUas * 50 / 100;

        float nFinal = nTotalTugas + nTotalUts + nTotalUas / 5;


        //cek lulus atau tidak
        if(nFinal >= 70){
            System.out.println("====================");
            System.out.println("  Raport Mahasiswa  ");
            System.out.println("====================");
            System.out.println("Nilai Tugas 1 : " + nTugas1);
            System.out.println("Nilai Tugas 2 : " + nTugas2);
            System.out.println("Nilai Tugas 3 : " + nTugas3);
            System.out.println("Nilai UTS     : " + nUts);
            System.out.println("Nilai UAS     : " + nUas);

            //penentuan grade nilai
            if(nFinal > 90 && nFinal <= 100){
                System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + nFinal + ", grade A");
            }else if(nFinal > 79 && nFinal < 90){
                System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + nFinal + ", grade B");
            }else if(nFinal > 69 && nFinal < 80){
                System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + nFinal + ", grade C");
            }else if(nFinal > 49 && nFinal < 70){
                System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + nFinal + ", grade D");
            }else if( nFinal < 50){
                System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + nFinal + ", grade E");
            }
        }else{
            System.out.println("===================================");
            System.out.println("          Raport Mahasiswa         ");
            System.out.println("===================================");

            //cek nilai perlu diperbaiki jika nilai tidak lulus
            if(nTugas1 < 55){
                System.out.println("Nilai Tugas 1 : " + nTugas1 + " Perlu Perbaikan");
            }else{
                System.out.println("Nilai Tugas 1 : " + nTugas1);
            }
            if(nTugas2 < 55){
                System.out.println("Nilai Tugas 2 : " + nTugas2 + " Perlu Perbaikan");
            }else{
                System.out.println("Nilai Tugas 2 : " + nTugas2);
            }
            if(nTugas3 < 55){
                System.out.println("Nilai Tugas 3 : " + nTugas3 + " Perlu Perbaikan");
            }else{
                System.out.println("Nilai Tugas 3 : " + nTugas3);
            }
            if(nUts < 55){
                System.out.println("Nilai UTS     : " + nUts + " Perlu Perbaikan");
            } else{
                System.out.println("Nilai UTS     : " + nUts);
            }
            if(nUas < 55){
                System.out.println("Nilai UAS     : " + nUas + " Perlu Perbaikan");
            }else{
                System.out.println("Nilai UAS     : " + nUas);
            }

            //penentuan grade nilai
            if(nFinal > 90 && nFinal <= 100){
                System.out.println("Maaf " + name + ", Anda tidak lulus. Nilai anda : " +  nFinal + ", grade A");
            }else if(nFinal > 79 && nFinal < 90){
                System.out.println("Maaf " + name + ", Anda tidak lulus. Nilai anda : " +  nFinal + ", grade B");
            }else if(nFinal > 69 && nFinal < 80){
                System.out.println("Maaf " + name + ", Anda tidak lulus. Nilai anda : " +  nFinal + ", grade C");
            }else if(nFinal > 49 && nFinal < 70){
                System.out.println("Maaf " + name + ", Anda tidak lulus. Nilai anda : " +  nFinal + ", grade D");
            }else if( nFinal < 50){
                System.out.println("Maaf " + name + ", Anda tidak lulus. Nilai anda : " +  nFinal + ", grade E");
            }
        }
    }
}
