package OrderHistory;

import java.util.HashMap;

public class CaesarOrderHistory {
    private static final HashMap orderedSalads = new HashMap();

    public static CaesarType addSaladToHistory(String caesarType) {
        CaesarType existingSalad = (CaesarType)orderedSalads.get(caesarType);
        if(existingSalad == null) {
            CaesarType newCaesar = new CaesarType(caesarType);
            orderedSalads.put(caesarType, newCaesar);
            System.out.println("Adding to order history: " + caesarType);
            System.out.println("History length:" + orderedSalads.size());
            return newCaesar;
        }

        System.out.println("Such salad has already been created, returning you the same");
        return existingSalad;
    }
}
