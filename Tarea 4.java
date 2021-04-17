/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCPedro
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCPedro
 */
public class Tarea  {
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * @author Pedro Soto
 */
public class CCuenta {


    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

 
    public CCuenta ()
    {
    }
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
 
    public String obtenerNombre()
    {
        return nombre;
    }


     public double estado ()
    {
        return saldo;
    }

   
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }




    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

  
    public String obtenerCuenta ()
    {
        return cuenta;
    }
}

}

package prácticaunidad3;

/**
 *
 * @author Pedro Soto
 */
public class Main {


    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        
        miCuenta = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        try 
        {
            miCuenta.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

}
    public static void main(String[] args) {

        
        double totalCuenta;

     
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);

    
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €");

       
        double ingreso = 350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " €");
        Cuenta1.depositar(ingreso);
        
        System.out.println("-------------------------------------------------");

       
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €"); 

}
public class Cuenta {
    
  
    private int numeroCuenta;
    private double saldo;
    
    public Cuenta(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } 
    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } 

    public double saldo() {
        return saldo;
    }   
    
public class Cuenta {
    
  
    private int numeroCuenta;
    private double saldo;
    
    public Cuenta(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } 

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } 

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } 

    public double saldo() {
        return saldo;
    }    
    
}