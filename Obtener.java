package PROYECTO;
import java.util.Scanner;
public class Obtener{
    int Not[]= new int[3];{
    }
    int SumN, Prom;
    String Clas[]= new String[3];{
        Clas[0]= "PROGRAMACIÓN";
        Clas[1]= "ALGORITMOS";
        Clas[2]= "LÓGICA EN SISTEMAS";
    }
    String MS[]=new String[2];{
    }
    Scanner ingresar = new Scanner(System.in);
    Archivos Archivo = new Archivos();
    public void NOTAS(){
         System.out.println("INRESE LAS NOTAS");
        for(int i=0;i<3;i++){
            System.out.println("Ingresa la Nota del curso "+Clas[i]);
            Not[i]= ingresar.nextInt();
            System.out.println(" ");
        }
    } 
    public void NOTALTA(){
        if(Not[0]>Not[1]&&Not[0]>Not[2]){
            System.out.println("NOTA ALTA: "+Not[0]+"  CURSO"+Clas[0]);
        }
        else{
            if(Not[1]>Not[0]&&Not[1]>Not[2]){
                System.out.println("NOTA ALTA: "+Not[1]+"  CURSO"+Clas[1]);
            }
            else{
                if(Not[2]>Not[0]&&Not[2]>Not[1]){
                    System.out.println("NOTA ALTA: "+Not[1]+"  CURSO"+Clas[1]);
                }
            }
        }
        System.out.println(MS[0]);
    }
    public void PROMEDIO(){
        for(int i=0;i<3;i++){
            SumN+=Not[i];
        }
        Prom=SumN/3;
        System.out.println("El Promedio Final de los Cursos es: "+Prom);
    }
    public void PROMOVIDO(){
        if(Not[0]>=61 && Not[1]>=61 && Not[2]>=61){
            MS[1]=("FELICIDADES, HA SIDO PROMOVIDO :D \n");
        }
        else{
            MS[1]=("LO SIENTO, NO HA SIDO PROMOVIDO :( \n");
        }
        System.out.println(MS[1]);
    }
}