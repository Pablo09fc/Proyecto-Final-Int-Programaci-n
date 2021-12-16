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
    public int [][] Precios=new int [3][3];
    private Scanner FIDE= new Scanner (System.in);
   
        public void Datos_Personales()//Esta clase se utiliza para recuadar los datos del estudiante
        {
            JOptionPane.showMessageDialog(null, "Se le solicitarán los datos usuario");
            String cedula= JOptionPane.showInputDialog("Escriba la cédula");
            String nombre=JOptionPane.showInputDialog("Escriba el nombre");
            String apellidos = JOptionPane.showInputDialog("Escriba los apellidos");

            JOptionPane.showMessageDialog(null, "Bienvenido usuario "+nombre+" "+apellidos+" , cedula "+cedula);
        }
        
        public void Precios()//Se utiliza una clase externa para realizar este apartado
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
            
            System.out.println("Cabezote Mitsubichi: 100000");
            System.out.println("Cabezote Toyota: 150000");
            System.out.println("Cabezote Hyundai: 200000");
            
            
        }
        
        public void Factura()
        {
            double iva=0.13;
            JOptionPane.showMessageDialog(null, "En este taller únicamente vendemos nuestros productos en combo, así que eliga una opción");
            JOptionPane.showMessageDialog(null,"1. Cabezote Mitsubichi, Entrada de clutch");
            JOptionPane.showMessageDialog(null,"1.Información de estudiantes");
            JOptionPane.showMessageDialog(null,"2.Reporte de notas");
        }
        
        public void Salir()
            {
               JOptionPane.showMessageDialog(null,"Usted ha salido del sistema"); 
            }
        public static void main(String[] args)
        {
            ProyectoFinalProgramacion FIDE1=new ProyectoFinalProgramacion();
            FIDE1.Datos_Personales();
            FIDE1.Precios();
        }
}
