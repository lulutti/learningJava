package test;

import impl.FactoryClothes;
import model.Clothes;
import model.TypeClothing;
import model.TypeSize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ClothesTest {
    FactoryClothes factory = new FactoryClothes();
    List<Clothes> ClothesList = new ArrayList<>();
        Clothes pants;
        Clothes dress;
        Clothes dress2;



        @BeforeEach
        void doBefore(){
            pants = factory.searchClothe(TypeSize.X, TypeClothing.PANTS, true, false);
            dress = factory.searchClothe(TypeSize.LS, TypeClothing.DRESS, false, false);
            dress2 = factory.searchClothe(TypeSize.XL, TypeClothing.DRESS, false, false);

        }

        @Test
        public void factoryLength(){
            ClothesList.add(pants);
            ClothesList.add(pants);
            ClothesList.add(pants);
            ClothesList.add(dress);
            ClothesList.add(dress2);
            Assertions.assertEquals(3,factory.getCount());
        }
}
