package impl;


import model.Clothes;
import model.TypeClothing;
import model.TypeSize;

import java.util.HashMap;
import java.util.Map;

public class FactoryClothes {
    private Integer count = 0;
    private static Map<String, Clothes> flyweight = new HashMap<>();
    public Integer getCount() {
        return count;
    }



    public Clothes searchClothe(TypeSize typeSize, TypeClothing typeClothing, boolean isNew, boolean imported) {

        String id = String.format("Size: %s type: %s isNew: %s imported: %s", typeSize, typeClothing, isNew, imported);

        if (!flyweight.containsKey(id)) {
            flyweight.put(id, new Clothes(typeSize, typeClothing, isNew, imported));
            System.out.println("clothes created!");
            count++;
            System.out.printf("%s \n", count);
        }
        return flyweight.get(id);
    }


}
