/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public class TipeDataBukanPrimitif {

    public static void main(String[] args) {
        //tipe data bukan primitif adalah tipe data yg default value nya null

        //tipe data primitif            //tipedata bukan primitif
        //      byte                                Byte
        //      short                               Short
        //      int                                 Integer
        //      long                                Long
        //      float                               Float
        //      double                              Double
        //      char                                Character
        //      boolean                             Boolean

        //penulisan tipe data bukan primitif
        Integer iniInteger = null;
        Character iniCharacter = 'L';

        System.out.println(iniInteger);

        iniInteger = 200;

        System.out.println(iniInteger);

        //konversi tipe data primitif ke bukan primitif degan tipe data yg kompatibel
        int iniPrimitif = 270;
        Integer iniBukanPrimitif = iniPrimitif;

        //konversi tipe data dari yg bukan primitif ke primitif dengan tipe data yg tidak kompatible
        short iniShort = iniBukanPrimitif.shortValue();
        long iniLong = iniBukanPrimitif.longValue();
        float iniFloat = iniBukanPrimitif.floatValue();

        System.out.println(iniShort);
        System.out.println(iniLong);
        System.out.println(iniFloat);
    }
}
