import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;


public class PruebasUnitarias {
    @Test
    public void test(){
        ArrayList<ArrayList<String>> dic = new ArrayList<ArrayList<String>>();
        ArrayList<String> word = new ArrayList<>();
        //primer cliente
        word.add("Jenifer");
        word.add("Fiebre");
        word.add("D");
        dic.add(word);
        
        ArrayList<String> word1 = new ArrayList<>();
        //segundo cliente
        word1.add("Carlos");
        word1.add("Dengue");
        word1.add("B");
        dic.add(word1);
        
        ArrayList<String> word2 = new ArrayList<>();
        //tercero cliente
        word2.add("Juan");
        word2.add("Diarrea");
        word2.add("E");
        dic.add(word2);
        
        ArrayList<String> word3 = new ArrayList<>();
        //cuarto cliente
        word3.add("Justin");
        word3.add("Covid");
        word3.add("A");
        dic.add(word3);
        
        VectorHeap<String> vh = new VectorHeap<>();
        for(int i=0; i<dic.size();i++){
            vh.add(dic.get(i).get(2));
        }
        ArrayList<String> orden = new ArrayList<>();
        orden.add("A");
        orden.add("B");
        orden.add("D");
        orden.add("E");
        int i=0;
        do{
            String prioridad =vh.getFirst();
            assertEquals(orden.get(i), prioridad);
            i++;
        }while(vh.isEmpty()==false);

        
    }
}
