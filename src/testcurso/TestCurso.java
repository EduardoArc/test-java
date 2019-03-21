
package testcurso;

import java.util.Scanner;

public class TestCurso {
    //este comentario lo añadi yo(Daniel)
    //esta tambien ajja

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
       String nombre;

       
       int id ;
       
       double precio;
       
       char simbolo ;
       
       boolean envioGratuito;
       
       System.out.println("Proporciona el nombre:");
       
       nombre =  scanner.nextLine();
       
       System.out.println("Proporciona el id:");
       id =  scanner.nextInt();
       
       System.out.println("Proporciona el precio: ");
       precio =  scanner.nextDouble();
       
       System.out.println("Proporciona el simbolo: ");
       simbolo =  scanner.next().charAt(0);
       
        
       
       System.out.println("Proporciona el envio: (si, no)  ");
        
       String envio = scanner.nextLine();
       
       if (envio.equals("si")) {
            envioGratuito  = true;
        }else{
           envioGratuito = false;
       }
       
       
       System.out.println("Nombre: "+nombre+"\n");
       System.out.println("id: "+id+"\n");
       System.out.println("Precio "+precio+"\n");
       System.out.println("simbolo"+simbolo+"\n");
       
       System.out.println("envio Gratuito: "+envioGratuito);
       
       System.exit(0);
       
    }
    
}
