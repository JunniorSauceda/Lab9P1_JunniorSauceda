/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_junniorsauceda;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Junnior Sauceda
 */
public class Lab9P1_JunniorSauceda {
static Scanner sc=new Scanner(System.in);
static Scanner sc_st=new Scanner(System.in);
static Random ran=new Random();
static ArrayList<Libros> Librero=new ArrayList<>();
static int contador=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir=true;
        do{
            System.out.println("1.- Libros y más Libros REMASTERED: ");
            System.out.println("2.- Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:{
                    boolean submenu=true;
                    while(submenu){
                        System.out.println("1.- Agregar Libro");
                        System.out.println("2.- Lista Libros");
                        System.out.println("3.- Modificar Libro");
                        System.out.println("4.- Eliminar Libro");
                        System.out.println("5.- Buscar libros por titulo");
                        System.out.println("6.- Buscar libros segun autor");
                        System.out.println("7.- Busqueda con filtro de genero");
                        System.out.println("8.- Salir");
                        System.out.println("Ingrese una opcion ");
                        int eleccion=sc.nextInt();
                        switch(eleccion){
                            case 1:{
                                contador++;
                                AgregarLibro();
                            }
                            break;
                            case 2:{
                                if(contador>0){
                                    ImprimirLibros();
                                }
                                else{
                                    System.out.println("Aun no se ha agregado ningun libro");
                                }
                            }
                            break;
                            case 3:{
                                if(contador>0){
                                    ModificarLibros();
                                }
                                else{
                                    System.out.println("Primero debe agregar un libro");
                                }

                            }
                            break;
                            case 4:{
                                if(contador>0){
                                    EliminarLibros();
                                }
                                else{
                                    System.out.println("Primero debe agregar un libro");
                                }
                            }
                            break;
                            case 5:{
                                if(contador>0){
                                    BuscarTitulo();
                                }
                                else{
                                    System.out.println("Primero debe agregar un libro");
                                }
                            }
                            break;
                            case 6:{
                                if(contador>0){
                                    BuscarAutor();
                                }
                                else{
                                    System.out.println("Primero debe agregar un libro");
                                }
                            }
                            break;
                            case 7:{
                                if(contador>0){
                                    BuscarGenero();
                                }
                                else{
                                    System.out.println("Primero debe agregar un libro");
                                }
                            }
                            break;
                            case 8:{
                               submenu=false;
                            }
                            break;
                            default:{
                                System.out.println("Opcion invaida");
                            }
                            break;
                        }

                    }
                    break;
                    }
                case 2:{
                    seguir=false;
                }
                break;
                default:{
                    System.out.println("Opcion Invalida");
                }
                break;
            }
        }while(seguir);
        // TODO code application logic here
    }
    public static void AgregarLibro(){
        System.out.println("Ha elegido la opcion para agregar un libro, porfavor aporte la informacion solicitada");
        System.out.println("Ingrese el Titulo: ");
        String titulo=sc_st.nextLine();
        System.out.println("Ingrese el Autor: ");
        String autor=sc_st.nextLine();
        System.out.println("Ingrese el Genero del libro: ");
        String genero=sc_st.nextLine();
        System.out.println("Ingrese la Edad minima: ");
        int min=sc.nextInt();
        while(min<1){
            System.out.println("Ingrese una Edad minima valida: ");
            min=sc.nextInt();
        }
        Librero.add(new Libros(titulo,autor,genero,min));
        System.out.println("Libro agregado exitosamente");
        
    }
    public static void ImprimirLibros(){
        System.out.println("La lista de libros actual es la siguiente:");
        System.out.println("");
        for (int i = 0; i < Librero.size(); i++) {
            System.out.println("Libro "+(i+1));
            System.out.println("Titulo: "+Librero.get(i).getTitulo());
            System.out.println("Autor: "+Librero.get(i).getAutor());
            System.out.println("Genero: "+Librero.get(i).getGenero());
            System.out.println("Edad minima: "+Librero.get(i).getEdadMin());
            System.out.println("");
        } 
    }
    public static void ModificarLibros(){
        System.out.println("Ha seleccionar la opcion de modificar libros, elija el libro que modificara: ");
        System.out.println("");
        ImprimirLibros();
        int libromod=sc.nextInt();
        while(libromod<1||libromod>Librero.size()){
            System.out.println("Ingrese una opcion valida: ");
            libromod=sc.nextInt();
            
        }
        System.out.println("Ha seleccionado el libro "+Librero.get(libromod-1).getTitulo()+", que atributo desea modificar");
        System.out.println("1.- Titulo");
        System.out.println("2.- Autor");
        System.out.println("3.- Genero");
        System.out.println("4.- Edad Minima");
        int mod=sc.nextInt();
        while(mod<1||mod>4){
            System.out.println("Ingrese una opcion valida");
            System.out.println("1.- Titulo");
            System.out.println("2.- Autor");
            System.out.println("3.- Genero");
            System.out.println("4.- Edad Minima");
            mod=sc.nextInt();
        }
        switch(mod){
            case 1:{
                System.out.println("Modificara el Titulo del libro"); 
                System.out.println("Ingrese el nuevo titulo:");
                Librero.get(libromod-1).setTitulo(sc_st.nextLine());
                System.out.println("¡Libro modificado exitosamente!");
            }
            break;
            case 2:{
                System.out.println("Modificara el Autor del libro"); 
                System.out.println("Ingrese el nuevo autor:");
                Librero.get(libromod-1).setAutor(sc_st.nextLine());
                System.out.println("¡Libro modificado exitosamente!");
            }
            break;
            case 3:{
                System.out.println("Modificara el Genero del libro"); 
                System.out.println("Ingrese el nuevo Genero:");
                Librero.get(libromod-1).setGenero(sc_st.nextLine());
                System.out.println("¡Libro modificado exitosamente!");
            }
            break;
            case 4:{
                System.out.println("Modificara la Edad Minima del libro"); 
                System.out.println("Ingrese la nueva Edad Minima:");
                Librero.get(libromod-1).setEdadMin(sc.nextInt());
                while(Librero.get(libromod-1).getEdadMin()<1){
                System.out.println("Ingrese una Edad minima valida: ");
                Librero.get(libromod-1).setEdadMin(sc.nextInt());
                }
                System.out.println("¡Libro modificado exitosamente!");
            }
            break;
            default:{
                System.out.println("Opcion invalida");
            }
            break;
        }
    }
    public static void EliminarLibros(){
        System.out.println("Ha seleccionar la opcion de Eliminar libros, elija el libro que eliminara: ");
        System.out.println("");
        ImprimirLibros();
        int elimlibro=sc.nextInt();
        while(elimlibro<1||elimlibro>Librero.size()){
            System.out.println("Ingrese una opcion valida: ");
            elimlibro=sc.nextInt();
            
        }
        System.out.println("Ha seleccionado el libro "+Librero.get(elimlibro-1).getTitulo()+" este libro se eliminara");
        Librero.remove(elimlibro-1);
        
    }
    public static void BuscarTitulo(){
        System.out.println("Ingrese el Titulo a buscar:");
        String busctl=sc_st.nextLine();
        int cont=1;
        for (int i = 0; i < Librero.size(); i++) {
            if(busctl.equalsIgnoreCase(Librero.get(i).getTitulo())){
                if(cont==1){
                    System.out.println("Libros con el Titulo "+Librero.get(i).getTitulo());
                }
                System.out.println("Libro "+(cont));
                System.out.println("Titulo: "+Librero.get(i).getTitulo());
                System.out.println("Autor: "+Librero.get(i).getAutor());
                System.out.println("Genero: "+Librero.get(i).getGenero());
                System.out.println("Edad minima: "+Librero.get(i).getEdadMin());
                System.out.println("");
                cont++;
                
            }
            if(cont<2&&i==Librero.size()-1){
                System.out.println("No se han encontrado libros con el titulo "+Librero.get(i).getTitulo());
            }
        } 
    }
    public static void BuscarAutor(){
        System.out.println("Ingrese el autor a buscar:");
        String buscautor=sc_st.nextLine();
        int cont=1;
        for (int i = 0; i < Librero.size(); i++) {
            if(buscautor.equalsIgnoreCase(Librero.get(i).getAutor())){
                if(cont==1){
                    System.out.println("Libros con el Autor "+Librero.get(i).getAutor());
                }
                System.out.println("Libro "+(cont));
                System.out.println("Titulo: "+Librero.get(i).getTitulo());
                System.out.println("Autor: "+Librero.get(i).getAutor());
                System.out.println("Genero: "+Librero.get(i).getGenero());
                System.out.println("Edad minima: "+Librero.get(i).getEdadMin());
                System.out.println("");
                cont++;
                
            }
            if(cont<2&&i==Librero.size()-1){
                System.out.println("No se han encontrado libros del Autor "+Librero.get(i).getAutor());
            }
        }
    }
    public static void BuscarGenero(){
        System.out.println("Ingrese el genero a buscar:");
        String buscgen=sc_st.nextLine();
        int cont=1;
        for (int i = 0; i < Librero.size(); i++) {
            if(buscgen.equalsIgnoreCase(Librero.get(i).getGenero())){
                if(cont==1){
                    System.out.println("Libros con genero de "+Librero.get(i).getGenero());
                }
                    System.out.println("Libro "+(cont));
                    System.out.println("Titulo: "+Librero.get(i).getTitulo());
                    System.out.println("Autor: "+Librero.get(i).getAutor());
                    System.out.println("Genero: "+Librero.get(i).getGenero());
                    System.out.println("Edad minima: "+Librero.get(i).getEdadMin());
                    System.out.println("");
                    cont++;
                    
            }
            if(cont<2&&i==Librero.size()-1){
                System.out.println("No se han encontrado libros del genero "+Librero.get(i).getGenero());
            }
        }
        
    }
    
    
}

