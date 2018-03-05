/*Trabajo en Grupo Guia 2
//Proyecto desarrollado con lenguaje de programación Java "Supermercado" 
//*Autores
//HARBEY JAIR GUERRERO BULLA
//CAMILO ANDRES SERRANO QUINTERO 
//YEISSON ROMERO MANCIPE 
//Universidad EAN
//Construccion de Software
*/
package supermercado;

public class Mostrador extends Empleado{
    private Double ventas; 

    public Mostrador(String n, String cc, String c, double v){  
       super(n,cc,c,"Mostrador"); 
        ventas = v; 
    }


    public double salarioDiario( ){  
          return (26042 + 0.15 * ventas); 
    } 
} 