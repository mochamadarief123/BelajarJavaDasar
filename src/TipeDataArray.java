/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 23/03/23
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public class TipeDataArray {
    public static void main(String[] args) {
        //cara penulisan array
        String[] arrayString;
        arrayString =new String[3];

        arrayString[0] = "Mochamad";
        arrayString[1] = "Arief";
        arrayString[2] = "Nurhidayat";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //mengubah value array
        arrayString[2] = "Borip";

        System.out.println(arrayString[2]);

        //atau
        Integer[] arrayInteger = new Integer[5];

        arrayInteger[0] = 19;
        arrayInteger[1] = 11;
        arrayInteger[2] = 41;
        arrayInteger[3] = 49;
        arrayInteger[4] = 99;

        //atau
        Float[] arrayFloat = new Float[]{
                10.90F, 90.11F, 50.21F
        };

        //atau
        Byte[] arrayByte = {
                10, 21, 9, 40, 67
        };

        //array didalam array
        String[][] arrayString2 ={
                {"Dani", "Ayu", "Sinta"},
                {"Ara", "Jhon"},
                {"Joseph"}
        };

        //cara akses array didalam array
        System.out.println(arrayString2[1][0]);

        //mengkosongkan value array
        arrayString2[0][2] = "null";
        System.out.println(arrayString2[0][2]);

        //cara mengetahui panjang array, gunakan .lenght
        System.out.println(arrayString2.length);

        String[][][] animals = {
                {
                        {"elang", "merpati", "kakatua", "gagak"},
                        {"pipit", "camar"}
                },
                {
                        {"kambing", "kerbau"},
                        {"anjing", "ular"}
                },
                {
                        {"hiu", "paus", "lumba-lumba", "pari"},
                        {"nemo"}
                }
        };

        System.out.println(animals[0][0][2]);
        System.out.println(animals[2][1][0]);


    }
}
