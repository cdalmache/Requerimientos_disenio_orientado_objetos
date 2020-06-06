/*
 * IMPLEMENTE UN ALGORITMO QUE ME PERMITA DESPLEJAR LOS REQUERIMIENTOS  FUNCIONALES
 *NO FUNCIONALES Y EL  DISEÑO ORIENTADO A OBJETOS.
 */
package daniel.diseno;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Disenio {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        System.out.println("INGRESE LOS REQUERIMIENTO FUNCIONALES:");
        String requerimiento=objeto.next();
              
        String requerimiento2=objeto.next();
               
         String requerimiento3=objeto.next();
                  
         String requerimiento4=objeto.next();
         
         System.out.println("SUS REQUERIMIENTOS FUNCIONALES SON :");
         System.out.println("1. "+requerimiento);
         System.out.println("2. "+requerimiento2);
         System.out.println("3. "+requerimiento3);
         System.out.println("4. "+requerimiento4);
         
         System.out.println("INGRESE LOS REQUERIMIENTOS NO FUNCIONALES");
         String norequerimiento=objeto.next();
              
        String norequerimiento2=objeto.next();
               
         String norequerimiento3=objeto.next();
                  
         String norequerimiento4=objeto.next();
         
         System.out.println("SUS REQUERIMIENTOS  NO FUNCIONALES SON :");
         System.out.println("1. "+norequerimiento);
         System.out.println("2. "+norequerimiento2);
         System.out.println("3. "+norequerimiento3);
         System.out.println("4. "+norequerimiento4);
         
        System.out.print("INGRESE EL OBJETO: ");
        String pieza=objeto.next();
        
        System.out.print("INGRESE EL TIPO DE OBJETO: ");
        String tipo=objeto.next();
        
               
         System.out.println("INGRESE LAS FUNCIONES: ");
         String fun1=objeto.next();
         String frequerimiento=objeto.next();  
         
         String fun2=objeto.next();
        String frequerimiento2=objeto.next();
               
        String fun3=objeto.next();
         String frequerimiento3=objeto.next();
                  
         String fun4=objeto.next();
         String frequerimiento4=objeto.next();
         
        System.out.println("SUS  DISEÑO ES: ");
        System.out.println("OBJETO: "+pieza);
        
        System.out.println("TIPO DE OBJETO: "+tipo);
        
        System.out.println("SUS REQUERIMIENTOS SON : ");
        System.out.println("1.- : "+requerimiento);
        System.out.println("2.-  : "+requerimiento2);
        System.out.println("3.-  : "+requerimiento3);
        System.out.println("4.-  : "+requerimiento4);
        
        System.out.println("SUS FUNCIONES SON : ");
        System.out.print("1.-"+fun1);
        System.out.println(" "+frequerimiento);
        System.out.print("2.-"+fun2);
        System.out.println(" "+frequerimiento2);
        System.out.print("3.-"+fun3);
        System.out.println(" "+frequerimiento3);
        System.out.print("4.-"+fun4);
        System.out.println(" "+frequerimiento4);
        
        
        
    }
    
}
