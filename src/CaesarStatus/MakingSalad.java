package CaesarStatus;

import CaesarMaker.CaesarMaker;

public class MakingSalad implements CaesarMaker {
    private String caesarType;

    public MakingSalad(String caesarType) {
        this.caesarType = caesarType;
        startPreparingSalad(caesarType);
    }

    public MakingSalad() {

    }

    @Override
        public void prepareCaesar() {
            System.out.println("Salad is ready!");
        }

        private void startPreparingSalad(String caesarType) {
            System.out.println(caesarType + " is preparing..");
        }
}
