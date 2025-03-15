/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazgeometrica;

/**
 *
 * @author luisr
 */
public class Rectangulon implements FiguraGeometrica {
    private double base;
    private double altura;
    
    //Albañil, que diga Constructor
    public Rectangulon(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double area()
    {
        return base * altura;
    }
    
    @Override
    public double perimetro()
    {
        return 2 * (base + altura);
    }
}
