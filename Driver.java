public class Driver{
    public static void main (String[] args){
        VectorHeap<String> vh = new VectorHeap<>();
        vh.add("B");
        vh.add("A");
        vh.add("C");
        vh.add("E");
        vh.add("D");

        System.out.println(vh.data);
    }
}