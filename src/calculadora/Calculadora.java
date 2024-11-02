/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author USUARIO
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var s = new Suma();
        var r = new Resta();
        var m = new Multipli();
        var d = new Divi();
        //What the font==Para buscar fuente
        s.ver(1, 1.5);
        r.ver(2, 3);
        m.ver(4.5, 8);
        d.ver(8, 14.5);
        // i+i =i;
        //d+d=d;
        System.out.println(s.ver(1, 1.5));
        System.out.println(r.ver(2, 3));
        System.out.println(m.ver(4.5, 8));
        System.out.println(d.ver(8, 14.5));
        //Usar polimosrfismo;
    }
    
}
