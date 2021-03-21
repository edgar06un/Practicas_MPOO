/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoo_p3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author edgarriv69
 */
public class Actividades_P3 {
    public static void main(String[] args) {
        
        
    System.out.println("***** DICCIONARIO *****");
      //Primero se necesita importar java.util.table
      /*Se declara una constante llamada miDiccionario, la cual 
      contiene dos elementos tipo String.*/
      Hashtable <String,String> miDiccionario = new Hashtable<String,String>();
      //El elemento put ingresa ambos string a la variable miDiccionario 
      miDiccionario.put("Programación", "Acción y efecto de programar.");
      miDiccionario.put("Clases", "Elementos con caracteres comunes.");
      miDiccionario.put("Bocina","Instrumento con el que se refuerza el sonido"
              + " emitido.");
      miDiccionario.put("Libro", "Conjunto de muchas hojas de papel u otro"
              + " material semejante que, encuadernadas, forman un volumen.");
      miDiccionario.put("Consola", "Dispositivo que, integrado o no en una "
              + "máquina, contiene los instrumentos para su control y "
              + "operación.");

      //Al final tenemos algo parecido a una tabla con tres elementos
      

      /*Para imprimir los elementos de mi diccionario agregamos dos 
      variables tipo string para cada elemento.*/
      String palabra;
      String definicion;
      
      //keys es una enumeracion para poder acceder a cada uno de los elementos
      //Se necesita importar java.util.enumeration
      
      /*Se crea una variable tipo diccio, que esta definida con 
      el hashtable creado y es de tipo string. */
      Enumeration<String> diccio = miDiccionario.keys();   
      
      //Para iterar cada uno de los elemntos se utiliza while
      while(diccio.hasMoreElements()){          
          /*Cada elemento dentro de miDiccionario se almacena en palabra para 
          poder iterar*/
          palabra = diccio.nextElement();
          /*Con get se accede a la key de cada valor dentro de miDiccionario y 
          se guarda en la variable definicion*/
          definicion = miDiccionario.get(palabra);
          System.out.println(palabra+" ----> "+definicion);

        }
      
      
      System.out.println("");
      System.out.println("***** AGENDA *****");
      /*Se declara miAgenda, pero ahora con dos valores, uno string 
      y otro integer para guardar numeros*/
      Hashtable<String, Integer> miAgenda = new Hashtable<String,Integer>(); 
      miAgenda.put("Edgar R:", 556124666);
      miAgenda.put("Jorge A:", 555819009);
      miAgenda.put("Alejandro H.",559245259);
      miAgenda.put("Erick R.", 569453354);
      miAgenda.put("Valentina L.", 562345669);

      
      
      //Se declara tanto numero como nombre con su respectivo tipo de dato 
      String nombre;
      Integer numero;

      //Se declara agen con valores tipo string para poder mandar a imprimir
      Enumeration<String> agen = miAgenda.keys();  
      //Iteracion de agen
      while(agen.hasMoreElements()){  
          //Asignación para poder pasar entre cada elemento
          nombre = agen.nextElement();
          numero = miAgenda.get(nombre);
          System.out.println(nombre+": "+numero);
        }
      
        System.out.println("");
        System.out.println("***** Fecha *****");
        
        //Primero se necesita importar java.util.calendar
        Calendar calendar1 = Calendar.getInstance();    
        //Se declara el tipo de formato 
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        //De calendar1 se obtiene la fecha
        //Se crea una variable tipo string para imprimir el dia
        String fechaActual = calendar1.get(Calendar.DAY_OF_MONTH) + " de ";
        //EL +1 es para sumar al formato de mes el numero que se necesita
        fechaActual += (calendar1.get(Calendar.MONTH)+1) + " de ";
        fechaActual += calendar1.get(Calendar.YEAR);
        System.out.println(fechaActual);      
    }
}
