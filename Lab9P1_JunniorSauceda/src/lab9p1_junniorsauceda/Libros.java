/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_junniorsauceda;

import java.util.ArrayList;

/**
 *
 * @author Junnior Sauceda
 */
public class Libros {
    String Titulo,Autor,Genero;
    int EdadMin;
    public Libros(String titulo,String autor,String genero,int edad){
        this.Titulo=titulo;
        this.Autor=autor;
        this.Genero=genero;
        this.EdadMin=edad;
    }
    public Libros(){
        ArrayList<Libros> Librero=new ArrayList<>();
    }
    public String getTitulo(){
        return this.Titulo;
    }
    public String getAutor(){
        return this.Autor;
    }
    public String getGenero(){
        return this.Genero;
    }
    public int getEdadMin(){
        return this.EdadMin;
    }
    public void setTitulo(String titulo){
        this.Titulo=titulo;
    }
    public void setAutor(String autor){
        this.Autor=autor;
    }
    public void setGenero(String genero){
        this.Genero=genero;
    }
    public void setEdadMin(int edad){
        this.EdadMin=edad;
    }
    
}
