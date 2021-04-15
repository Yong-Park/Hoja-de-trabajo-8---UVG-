public class Driver{
    public static void main (String[] args){
        VectorHeap<String> vh = new VectorHeap<>();
        vh.add("Baba");
        vh.add("Apple");
        vh.add("Coco");
        vh.add("Acid");
        vh.add("Elephant");

        do{
            System.out.println(vh.getFirst());
        }while(vh.isEmpty()==false);
    }
}