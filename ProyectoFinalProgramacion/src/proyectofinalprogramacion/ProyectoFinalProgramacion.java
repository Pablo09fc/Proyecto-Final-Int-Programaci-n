/*
U Fidelitas
Introducción a la Programación 
Pablo Fernández Calderón
12/2
Programa: Aplicación de conocimientos II.
 */
package proyectofinalprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoFinalProgramacion 
{
    public int [][] Precios=new int [3][3]; //Se hace un arreglo para almacenar los precios de los productos
    private Scanner FIDE= new Scanner (System.in);
    
   
        public void Datos_Personales()//Esta clase se utiliza para recuadar los datos del usuario
        {
            JOptionPane.showMessageDialog(null, "Se le solicitarán los datos al usuario");
            String cedula= JOptionPane.showInputDialog("Escriba la cédula");
            String nombre=JOptionPane.showInputDialog("Escriba el nombre");
            String apellidos = JOptionPane.showInputDialog("Escriba los apellidos");

            JOptionPane.showMessageDialog(null, "Bienvenido usuario "+nombre+" "+apellidos+" , cedula "+cedula);
        }
        
        public void Precios()//En esta clase se imprimen los precios de los productos
        {
            JOptionPane.showMessageDialog(null, "A continuación se le mostrará la lista de precios de nuestros productos (estos precios cuenta con el servicio de instalación incluido y sin iva)");
            
            System.out.println("Cabezote Mitsubichi: 100000");
            System.out.println("Cabezote Toyota: 150000");
            System.out.println("Cabezote Hyundai: 200000");
            System.out.println("Longitud entrada de clutch para Mitsubichi: 130000");
            System.out.println("Longitud entrada de clutch para Toyota: 125000");
            System.out.println("Longitud entrada de clutch para Hyundai: 123000");
            System.out.println("Torque para llantas Mitsubichi: 30000");
            System.out.println("Torque para llantas Toyota: 25000");
            System.out.println("Torque para llantas Hyundai: 40000"); 
            
            System.out.println();
            System.out.println();
            
            JOptionPane.showMessageDialog(null, "Ahora se dirigirá a elegir los productos que desea, puede comprar en commbo o solamente un producto por ingreso");
        }
        
        public void Factura()//Se fijan los precios de los productos dentro del arreglo
        {
            Precios [0][0]=100000;
            Precios [0][1]=150000;
            Precios [0][2]=200000;
            Precios [1][0]=130000;
            Precios [1][1]=125000;
            Precios [1][2]=123000;
            Precios [2][0]=30000;
            Precios [2][1]=25000;
            Precios [2][2]=40000;
            
            int Cabezote1= Precios [0][0];
            int Cabezote2= Precios [0][1];
            int Cabezote3= Precios [0][2];
            int Longitud1= Precios [1][0];
            int Longitud2= Precios [1][1];
            int Longitud3= Precios [1][2];
            int Torque1= Precios [2][0];
            int Torque2= Precios [2][1];
            int Torque3= Precios [2][2];
            
            //Se le muestra al usuario los combos disponibles y los productos solitarios para la venta
            double iva=0.13;
            JOptionPane.showMessageDialog(null, "Eliga una de las siguientes opciones para luego mostrarle su factura");
            System.out.println("1. Cabezote Mitsubichi, Entrada de clutch para Mitsubishi y Torque para llantas Mitsubichi");
            System.out.println("2. Cabezote Toyota, Entrada de clutch para Toyota y Torque para llantas Toyota");
            System.out.println("3. Cabezote Hyundai, Entrada de clutch para Hyundai y Torque para llantas Hyundai");
            System.out.println("4. Cabezote Mitsubichi");
            System.out.println("5. Cabezote Toyota");
            System.out.println("6. Cabezote Hyundai");
            System.out.println("7. Entrada de clutch para Mitsubichi");
            System.out.println("8. Entrada de clutch para Toyota");
            System.out.println("9. Entrada de clutch para Hyundai");
            System.out.println("10. Torque para llantas Mitsubishi");
            System.out.println("11. Torque para llantas Toyota");
            System.out.println("12. Torque para llantas Hyundai");
            System.out.println();
            System.out.println();
            
            int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la opción requerida "));
            
       //Se utilizan los if para mostrar la factura correspondiente a la opción elegida por el usuario
            if (opcion==1)
            {
                int subtotal1= (Cabezote1+Longitud1+Torque1);
                double ap_iva1= (subtotal1*iva);
                double total1= (subtotal1+ap_iva1);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal1);
                System.out.println("El total es: "+total1);
            }
            if (opcion==2)
            {
                int subtotal2= (Cabezote2+Longitud2+Torque2);
                double ap_iva2= (subtotal2*iva);
                double total2= (subtotal2+ap_iva2);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal2);
                System.out.println("El total es: "+total2);
            }
            if (opcion==3)
            {
                int subtotal3= (Cabezote3+Longitud3+Torque3);
                double ap_iva3= (subtotal3*iva);
                double total3= (subtotal3+ap_iva3);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal3);
                System.out.println("El total es: "+total3);
            }
            if (opcion==4)
            {
                int subtotal4= (Cabezote1);
                double ap_iva4= (subtotal4*iva);
                double total4= (subtotal4+ap_iva4);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal4);
                System.out.println("El total es: "+total4);
            }
            if (opcion==5)
            {
                int subtotal5= (Cabezote2);
                double ap_iva5= (subtotal5*iva);
                double total5= (subtotal5+ap_iva5);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal5);
                System.out.println("El total es: "+total5);
            }
            if (opcion==6)
            {
                int subtotal6= (Cabezote3);
                double ap_iva6= (subtotal6*iva);
                double total6= (subtotal6+ap_iva6);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal6);
                System.out.println("El total es: "+total6);
            }
            if (opcion==7)
            {
                int subtotal7= (Longitud1);
                double ap_iva7= (subtotal7*iva);
                double total7= (subtotal7+ap_iva7);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal7);
                System.out.println("El total es: "+total7);   
            }
            if (opcion==8)
            {
                int subtotal8= (Longitud2);
                double ap_iva8= (subtotal8*iva);
                double total8= (subtotal8+ap_iva8);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal8);
                System.out.println("El total es: "+total8);  
            }
            if (opcion==9)
            {
                int subtotal9= (Longitud3);
                double ap_iva9= (subtotal9*iva);
                double total9= (subtotal9+ap_iva9);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal9);
                System.out.println("El total es: "+total9);   
            }
            if (opcion==10)
            {
                int subtotal10= (Torque1);
                double ap_iva10= (subtotal10*iva);
                double total10= (subtotal10+ap_iva10);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal10);
                System.out.println("El total es: "+total10);   
            }
            if (opcion==11)
            {
                int subtotal11= (Torque2);
                double ap_iva11= (subtotal11*iva);
                double total11= (subtotal11+ap_iva11);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal11);
                System.out.println("El total es: "+total11);   
            }
            if (opcion==12)
            {
                int subtotal12= (Torque1);
                double ap_iva12= (subtotal12*iva);
                double total12= (subtotal12+ap_iva12);
                
                System.out.println("***Taller Goldoni***");
                System.out.println("Valor de IVA: "+iva);
                System.out.println("El subtotal es: "+subtotal12);
                System.out.println("El total es: "+total12);   
            }
        }
        
        public void Salir() //Se da la salida del sistema luego de haberse entregado la factura
            {
               JOptionPane.showMessageDialog(null,"Gracias por su compra en el Taller Goldoni"); 
            }
        public static void main(String[] args)//Se colocan en orden todas las clases utilizadas en el programa para darles uso continuo
        {
            ProyectoFinalProgramacion FIDE1=new ProyectoFinalProgramacion();
            FIDE1.Datos_Personales();
            FIDE1.Precios();
            FIDE1.Factura();
            FIDE1.Salir();
        }
}