package PROYECTO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Archivos{
    String nam;
    Scanner ing=new Scanner(System.in);
    public void PedirArchivos(){
        int opc;
        System.out.println("DESEA CARGAR DATOS? \n1.Si\n2.No");
        opc=ing.nextInt();
        if(opc==1){
            System.out.println("NOMBRE DEL ARCHIVO");
            nam = ing.nextLine();
            nam = ing.nextLine();
        }
        else{
            if(opc==2){
                System.out.println("NOMBRE PARA GUARDAR ARCHIVO");
                nam = ing.nextLine();
                nam = ing.nextLine();
            }
        }
        
    }
    public void Datos (int Not[],String Clas[],int Prom,String MS[]){
        try{
            String ND=nam;
            String rut="C:\\Users\\Raul\\Desktop\\Examen Final\\Exam"+ND+".txt";
            System.out.println(nam);
            String Sep = "---------------------------....--------------..........---------\n";
            File doc = new File(rut);
            if(!doc.exists()){
                doc.createNewFile();
            }
            FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<3;i++){
                bw.write("Curso: "+Clas[i]+"\tNota:"+Not[i]+"\n");
            }
            bw.write("Promedio: "+Prom+"\n");
            for(int i=0;i<2;i++){
                    bw.write(MS[i]+"\n");
            }
            bw.write(Sep);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}