package javase02.t03;

import javase02.t01.Pen;

import java.util.HashMap;
import java.util.Map;

public class NoviceSet {
    public static Map<Stationery, Integer> noviceSet = new HashMap<>();

    static {
        noviceSet.put(new Pencil("Pencico", "Russia", "Grey"), 10);
        noviceSet.put(new Pen("Penco", "China", 104857, "White", "Blue"), 5);
        noviceSet.put(new Pen("Penco", "China", 104858, "Black", "Black"), 1);
        noviceSet.put(new Stickers("Sticko", "France", "A6", "Yellow"), 2);
        noviceSet.put(new CopyPaper("Peperco", "USA", "A4", "White", 80), 2);
        noviceSet.put(new Steppler("Stepco", "Japan"), 1);
        noviceSet.put(new Notepad("Notepadco", "Italy", 240), 3);
    }
}
