import java.util.ArrayList;

public class Paciente {
    
    /** 
     * @param data
     */
    public void fichaPaciente(ArrayList<String> data){
        //imprimir la ficha de cada cliente
        System.out.println("_______________________________");
        System.out.println("Nombre: " + data.get(0));
        System.out.println("Enfermedad: " + data.get(1));
        System.out.println("Emergencia: " + data.get(2));
        System.out.println("_______________________________");
    }
}
