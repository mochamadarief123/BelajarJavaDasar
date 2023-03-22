/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 5:44
 * To change this template use File | Settings | File Templates.
 */
public class Variable {
    public static void main(String[] args) {
        int iniNamaVariableInt;
        iniNamaVariableInt= 90;

        String iniNamaVariableString = "hallo";

        System.out.println(iniNamaVariableInt);

        //penulisan spt diatas value nya bisa diubah
        iniNamaVariableInt = 10;

        System.out.println(iniNamaVariableInt);

        //atau gunakan var (java otomatis mengenali jenis tipe data dari value yg kita isi)
        //contoh penulisan
        //var jekel = "Laki-laki";


        //gunakan keyword final jika value variable di set agar tidak dapat di ubah
        final int iniNamaVariable2 = 120;



    }


}
