/**
 * @(#)Figura.java
 *
 * @author fires.
 * @version 1.00 2010/5/23
 */

package Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 *
 * Decalaracion de la clase abstracta Figura
 */
public abstract class Figura {
    // Variables de clase
    private Point2D inicio;             // Inicio de las coordenadas del Punto(x,y) de la figura
    private Color colorBorde;           // Color del borde de la figura
    private Color colorRelleno;         // Color del relleno de la figura
    private int tamanhio;               // Tamanhio de la figura

    // Constructor Predeterminado
    public Figura(){
        setInicio(new Point2D.Double(0, 0));    // Punto (0, 0)
        setColorBorde(Color.BLACK);             // ColorBorde negro
        setColorRelleno(Color.WHITE);           // ColorRelleno blanco
        setTamanhio(1);                         // Tamanhio 1
    }

    public Figura(Point2D punto, Color colorBorde, Color colorRelleno,
             int tamanhio){
        setInicio(punto);               // Punto
        setColorBorde(colorBorde);      // ColorBorde
        setColorRelleno(colorRelleno);  // ColorRelleno
        setTamanhio(tamanhio);          // Tamanhio 
    }

    public Figura(int x, int y, Color colorBorde, Color colorRelleno,
             int tamanhio){
        setInicio(new Point2D.Double(x, y));        // Punto
        setColorBorde(colorBorde);                  // ColorBorde
        setColorRelleno(colorRelleno);              // ColorRelleno
        setTamanhio(tamanhio);                      // Tamanhio
    }

    // Setters y Getters
    /**
     * Devuelve el color del borde
     *
     * @return colorBorde el color del borde
     */
    public Color getColorBorde() {
        return colorBorde;
    }

    /**
     * Establece el color del borde
     *
     * @param colorBorde el color del borde
     */
    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    /**
     * Devuelve el color del relleno
     *
     * @return colorRelleno el color del relleno
     */
    public Color getColorRelleno() {
        return colorRelleno;
    }

    /**
     * Establece el color del relleno
     *
     * @param colorRelleno el color del relleno
     */
    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    /**
     * Devuelve la coordenada inicial de Point 2D(x, y)
     *
     * @return la coordenada inicial de Point 2D(x, y)
     */
    public Point2D getInicio() {
        return inicio;
    }

    /**
     * Establece la coordenada inicial de Point 2D(x, y))
     *
     * @param la coordenada inicial de Point 2D(x, y)
     */
    public void setInicio(Point2D inicio) {
        this.inicio = inicio;
    }

     /**
     * Establece la coordenada inicial de Point 2D(x, y))
     *
     * @param x y
     */
    public void setInicio(int x, int y) {
        Point2D inicioCoordenada = new Point2D.Double(x, y);
        this.inicio = inicioCoordenada;
    }

    /**
     * Devuelve el tamanhio de la figura
     *
     * @return tamanhio el tamanhio de la figura
     */
    public int getTamanhio() {
        return tamanhio;
    }

    /**
     * Establece el tamanhio de la figura
     *
     * @param tamanhio el tamanhio de la figura
     */
    public void setTamanhio(int tamanhio) {
        this.tamanhio = tamanhio;
    }

    // Metodos varios
    // Dibuja dependiendo de la figura
    public void dibujar(Graphics g){}
}