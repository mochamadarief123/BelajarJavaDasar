/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 5:03
 * To change this template use File | Settings | File Templates.
 */
public class TipeDataNumber {
    public static void main(String[] args) {
        //macam macam tipe data number

        // tipe data            min                           max                 kapasitas memori        default
        // byte                -128                           127                      1 byte                0
        // short             -32.768                        -32.367                    2 byte                0
        // int           -2.147.483.648                  -2.147.483.6487               4 byte                0
        // long      -9.223.372.036.854.775.808     -9.223.372.036.854.775.807         8 byte                0
        // float             34e-038                         34e-038                   4 byte               0.0
        // double            1.7e-308                        1.7e-308                  8 byte               0.0

        //integer number
        byte iniByte = 10;
        short iniShort = 1000;
        int iniInt = 10000;
        long iniLong = 100000;
        long iniLOng2 = 100000L;

        //floating number
        float iniFloat = 20.20F;
        double iniDouble = 20.20;

        //literals
        int decimalInt = 30;
        int hexaInt = 0xFFFAB;
        //int binaryInt = 0b1010101; hanya bisa dijalankan di jdk 7 keatas
    }
}
