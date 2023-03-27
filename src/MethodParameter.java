/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 15:06
 * To change this template use File | Settings | File Templates.
 */
public class MethodParameter {
    public static void main(String[] args) {

        //cara panggil method
        sayHello("Mochamad", "arief");
        sayHello("Putri", "tiara");
        sayHello("Dheny", "sasono");
    }

    /*
    * didalam method juga bisa menambahkan parameter/ argumen
    * kita bisa menambahkan parameter/ argumen sebanyak nya tanpa ada batasan
    */

    //method
    static void sayHello( String firstName,String lastName){
        System.out.println("Hallo " + firstName + " " + lastName);
    }
}
