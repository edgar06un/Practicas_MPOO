/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mppo_2;

/**
 *
 * @author edgarriv69
 */
public class MPPO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            /*Hola mundo*/        
        System.out.println("Hola Mundo 2");
        
        /*Declaracion de variables*/ 
        //Declaracion de las variables 
        int a =56;
        int b =10;
        /*Mandar a impresión, despues de las 
        comillas se agrega un + y la variable*/
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        //Declaración y mandar a impresion dos variables en el mismo print
        int c=14, d=99;
        System.out.println("c = "+ c +" d ="+ d);
        
        
        /*Estructuras de flujo de control*/
        //Compara los numeros a y b a través de un operador lógico
        if(a>b){
            System.out.println("a es mayor que b"); 
            
        }else{ //Estructura else,  en caso de no cumplir la primer operación
           System.out.println("a menor a b");
        }
                
        /*if mediante metodo*/
        //if por medio de un metodo que manda las variables a y b
        if(mayorQue (a,b)){
            System.out.println("mayorQue regresa true");
        }else{
            System.out.println("mayorQue regresa false");
        }
        
         /*if mediante metodo*/
        a=10; b=5;
        if(a>b){
            System.out.println("a>b");            
        }
        
        /*Estructura anidada de if, para tener mayor precisión u 
        opciones en caso de no cumplir con la operación*/
        else if(a>=b)
            System.out.println("a>=b");
        else 
            System.out.println("a<b");
        
             /*if mediante metodo*/
             //Se manda a llamar la clase KeyboardInput
    KeyboardInput teclado = new KeyboardInput();
    System.out.println("Escriba un numero de la semana");
    //Se pide al isuario ingresar una variable dia, por medio de la clase KI
    int dia = teclado.readInteger();
    /*La funcion switch sirve en caso de tener varios casos, los cuales estan 
    definidos por una variable int. Compara diretamente la variable que se 
    pidio al usuario con cada uno de los casos definidos.*/
    switch(dia){
        case 1: 
            System.out.println("domingo");
            break;
        case 2: 
            System.out.println("Lunes");
            break;  
        case 3: 
            System.out.println("Martes");
            break; 
        case 4: 
            System.out.println("Miercoles");
            break; 
        case 5: 
            System.out.println("Jueves");
            break;
        case 6: 
            System.out.println("Viernes");
            break; 
        case 7: 
            System.out.println("Sabado");
            break;
        default:
            System.out.println("No es numero entre 1 y 7");
            break;        
    }   
    
    //Ciclo for
    //Declaracion de arreglos, donde el tamaño esta definido entre corchetes []
    int[] arr = new int[10];
    int var =10;
    //Arreglo del tamaño de la variable var
    int[] arr2 = new int[var];
    
    //Esta i es una variable local, cuando termine el for la eliminara 
    
    /*El ciclo for se define por tres parámetros, el primero inicializa el 
    contador local, el segundo compara hasta donde se quiere el terminar y 
    pro último se agrega los pasos con los que se avaza.*/
    for(int i = 0; i < var; i++){
        //Arreglo donde en la posición 0 guardamos un 0, el posicón 1 guardamos un 1
        arr2[i]=i;        
    }
    //Este for imprime cada una de las variables del arreglo arr2
    for(int i=0; i< var; i++){
        System.out.println(arr2[i]);
    }
    
        //Ciclo while
        //Esta es una i de declaracion global, no local 
        int i=0;
        //EL ciclo while ejecuta el ciclo hasta los pasos que se especifican
        while(i<5){
            System.out.println("Contando hacia arriba "+i);
            //Actualizacion del contador
            //i=i+1;
            i++;
        }
        //i se quedo en el valor de 5
        System.out.println(i);
        while(i>0){
            System.out.println("Contando hacia abjo "+i);
            //i=i-1;
            i--;
        }
        
        //Ciclo do - while
        /*Do while primero entra al codigo y despues 
        verifica que puede volver a entrar*/ 
        System.out.println("Antes del do-while i="+i);
        do{
            System.out.println("Entro en el do-while");
            System.out.println("Contando hacia abajo "+i);
            i--;
        } while(i>0);
        
        System.out.println("Despues del do while i="+i);

        
         //Continue continua con el ciclo en lugar del break
         int numero;
         
         for(int j=0; j<3; j++){
             System.out.println("Ingresa un numero");
             numero = teclado.readInteger();
             if(numero==0){
                 /*Este ciclo compara la variable numero ingresada por el 
                 usuario. Y en el print se realiza la division en la misma 
                 línea.*/
                 System.out.println("100/"+numero+"="+ (100/numero) );
                 //No se sale del for a comparacion de un break, continua con el nuemro 
                 //No sale de la estructura
                 continue;
             }
             System.out.println("Se termino el for");
             
         }
    }
       
    /*Funcion publica de tipo booleana mayorQue, la cual recibe dos 
    variables enterasy regresa la operacion al la variable x y y. */
    public static boolean mayorQue(int x, int y){
        return (x>y);
    }
}
