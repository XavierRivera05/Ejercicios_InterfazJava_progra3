/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcompararobjetos;

/**
 *
 * @author luisr
 */
public class Producto implements ComparableObjeto {
    private String nombre;
    private double precio;
    
    //Albañil o constructor
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    //Getter
    public double getPrecio()
    {
        return precio;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    @Override
    public int comparar(Object o)
    {
        if (o instanceof Producto)
        {
            Producto otro = (Producto) o;
            return Double.compare(this.precio, otro.getPrecio());
        }
        else
        {
            System.out.println("No es un producto para comparar...");
            return 0;
        }
    }
}
