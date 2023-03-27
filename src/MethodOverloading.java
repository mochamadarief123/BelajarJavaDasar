/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27/03/23
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        /*
        * method overloading adalah kemampuan membuat method dengan nama yg sama
        * dengan syarat parameternya berbeda, entah itu type datanya ataupun jumlah parameternya
        * jika sama persis maka error
        */

        sayHello();
        sayHello("Tiara");
        sayHello("Putri", "Tiara");
    }

    static void sayHello (){
        System.out.println("Hello World");
    }

    static void sayHello (String name){
        System.out.println("Hello " + name);
    }

    static void sayHello (String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
