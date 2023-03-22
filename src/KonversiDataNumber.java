/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 5:12
 * To change this template use File | Settings | File Templates.
 */
public class KonversiDataNumber {
    public static void main(String[] args) {
        //widening casting (konversi otomatis)
        //byte -> short -> int -> long -> float -> double
        byte number = 100;
        short hasilKonversi = number;
        int hasilKonversi2 = hasilKonversi;

        //narrowing casting (konversi manual)
        //double -> float -> long -> int -> short -> byte
        //ketika konversi manual, pastikan value yg di konversi sesuai degn kapasitas tipe data yg akan jadi hasil konversi agar tidak terjadi number overflow
        int numberInt = 1000;
        short hasilKonversi3 = (short)numberInt;
    }

}
