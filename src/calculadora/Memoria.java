/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author USUARIO
 */
public abstract class Memoria {
     public abstract void hmemoria (Double x, Double y);
}

class mmas extends Memoria{
    @Override
    public void hmemoria (Double x, Double y){
        Double r;
        r= x + y;
        
    }
}
    

class mmens extends Memoria{
    @Override
    public void hmemoria (Double x, Double y){
        Double r;
        r= x - y;
        
    }
}
