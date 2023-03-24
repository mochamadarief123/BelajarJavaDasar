/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/03/23
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        //hampir sama dengan if statement, bedanya switch statement hanya dapat membandingkan satu variable

        int nilai = 10;

        switch(nilai){
            case 100 :
                System.out.println("Wow.. nilai anda sempurna");
            break;
            case 90 :
                System.out.println("nilai anda sangat bagus");
            break;
            case 80 :
                System.out.println("nilai anda bagus");
            break;
            case 70 :
                System.out.println("nilai anda cukup bagus");
            break;
            case 60 :
                System.out.println("nilai anda cukup");
            break;
            case 50 :
                System.out.println("nilai anda kurang");
            break;
            case 40 :
                System.out.println("nilai anda cukup kurang");
             break;
            case 30 :
            case 20 :
            case 10 :
                System.out.println("nilai anda sangat kurang, mungkin anda salah jurusan");
            break;
            default :
                System.out.println("masukan nilai genap dari range 10 sampai 100");
        }


        //switch lamda / switch statement dengan penulisan lebih singkat tanpa harus mengetikan keyword break spt diatas
        //dapat berjalan di java 14 keatas

    /** switch (nilai){
            case 100 -> System.out.println("Wow.. nilai anda sempurna");
            case 90 -> System.out.println("nilai anda sangat bagus");
            case 80 -> System.out.println("nilai anda bagus");
            case 70 -> System.out.println("nilai anda cukup bagus");
            case 60 -> System.out.println("nilai anda cukup");
            case 50 -> System.out.println("nilai anda kurang");
            case 40 -> System.out.println("nilai anda cukup kurang");
            case 30, 20,10 -> System.out.println("nilai anda sangat kurang, mungkin anda salah jurusan");
            default -> System.out.println("masukan nilai genap dari range 10 sampai 100");
        } **/

        //keyword yield, spt pengembalian nilai
        // berjalan di java 14 keatas
    /** pesan = switch (nilai){
            case 100 :
                yeild "Wow.. nilai anda sempurna";
            case 90 :
                yield "nilai anda sangat bagus";
            case 80 :
                yield "nilai anda bagus";
            case 70 :
                yield "nilai anda cukup bagus";
            case 60 :
                yield "nilai anda cukup";
            case 50 :
                yield "nilai anda kurang";
            case 40 :
                yield "nilai anda cukup kurang";
            case 30, 20,10 :
                yield "nilai anda sangat kurang, mungkin anda salah jurusan";
            default:
                yield "masukan nilai genap dari range 10 sampai 100";
        }

        System.out.println(pesan);
    **/
    }
}
