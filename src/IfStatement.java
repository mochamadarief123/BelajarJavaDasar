/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 24/03/23
 * Time: 12:40
 * To change this template use File | Settings | File Templates.
 */
public class IfStatement {
    public static void main(String[] args) {
        int nilaiLulus = 100;
        int nilaAbsen = 90;

        //statement if
        if (nilaiLulus >= 75 && nilaAbsen >= 70){
            System.out.println("selamat anda lulus");
        }

        //statement else
        if (nilaiLulus>= 75 && nilaAbsen >= 70){
            System.out.println("anda lulus");
        }  else {
            System.out.println("silahkan coba lagi di kesempatan yang ada nanti");
        }

        //statement else if
        if (nilaiLulus >= 90 && nilaAbsen >= 90){
            System.out.println("anda mendapatkan nilai A");
        } else if (nilaiLulus >= 80 && nilaAbsen > 80){
            System.out.println("anda mendapatkan nnilai B");
        } else if (nilaiLulus >= 70 && nilaAbsen >= 70){
            System.out.println("anda mendapatkan nilai C");
        } else if (nilaiLulus >= 50 && nilaAbsen >= 50){
            System.out.println("anda mendapatkan nilai D");
        } else{
            System.out.println("andamendapatkan nilai E");
        }
    }
}
