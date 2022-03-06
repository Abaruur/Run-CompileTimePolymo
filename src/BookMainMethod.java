import java.util.HashMap;
import java.util.Map;

public class BookMainMethod {
    //Create a Class for Entry point in java and define main method.
    public static void main(String[] args) {
        HashMap<Integer, Book> map = new HashMap<Integer, Book>();
        //Creating Books
        Book b1 = new Book(101, "Death Note", "Do not know", "BPB", 800);
        Book b2 = new Book(102, "Data communication & networking", "Forouzan", "Mc Graw Hill", 400);
        Book b3 = new Book(103, "Operating Sys", "Willey", "Galvin", 600);
        //Adding books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //Transversing map

        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}