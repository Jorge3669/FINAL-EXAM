package PROYECTO;
import java.util.Scanner;
public class PROYECT {
    public static void main(String[] args){
        int OP=0;
        Scanner ingresar = new Scanner(System.in);
      Obtener llamar = new Obtener();
        Archivos Archivo = new Archivos();
        System.out.println("TODAS LAS NOTAS");
        Archivo.PedirArchivos();
        while(OP!=5){
            System.out.println("OPCION A REALIZAR");
            System.out.println("INGRESA LA NOTA");
            System.out.println("MOSTRAR NOTA ALTA");
            System.out.println("MOSTRAR PROMEDIO");
            System.out.println("PRO1MOVIDO O NO PROMOVIDO");
            System.out.println("EXIT TO MENU");
            OP=ingresar.nextInt();
            switch(OP){
                case 1:
                    llamar.NOTAS();
                    break;
                case 2:
                    llamar.NOTALTA();
                    break;
                case 3:
                    llamar.PROMEDIO();
                    break;
                case 4:
                    llamar.PROMOVIDO();
                    Archivo.Datos(llamar.Not, llamar.Clas, llamar.SumN, llamar.MS);
            }
        }
        
    }
}