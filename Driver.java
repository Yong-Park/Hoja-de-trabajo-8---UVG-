//Yong Bum Park 20117
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver{
    public static ArrayList<ArrayList<String>> dic = new ArrayList<ArrayList<String>>();
    public static void main (String[] args){
        //lectura del archivo txt
        Scanner scanner = new Scanner(System.in);
            //lectura del diccionario
            try{
                File datos = new File("pacientes.txt");
                Scanner lectura = new Scanner(datos);

                while(lectura.hasNextLine()){
                    String expresion = lectura.nextLine();
                    String[] strsplit = expresion.split(",");
                    ArrayList<String> words = new ArrayList<>();
                    for(int i=0;i<strsplit.length;i++){
                        words.add(strsplit[i]);
                    }
                    dic.add(words);                
                }
                lectura.close();
            }catch(FileNotFoundException e){
                System.out.println("No se encontro el archivo");
                e.printStackTrace();
            }
        //ingresar los datos y mostrarlos
        System.out.println("Pacientes antes de ser ordenados por prioridad");
        VectorHeap<String> vh = new VectorHeap<>();
        for(int i=0; i<dic.size();i++){
            System.out.println(dic.get(i));
            vh.add(dic.get(i).get(2));
        }
        //mostrar los pacientes ya ordenados segun la prioridad
        System.out.println("Pacientes despues de ser ordenados por prioridad");
        do{
            String prioridad =vh.getFirst();
            for(int i=0;i<dic.size();i++){
                if(dic.get(i).contains(prioridad)){
                    System.out.println(dic.get(i));
                }
            }
        }while(vh.isEmpty()==false);
    }
}