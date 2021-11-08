package CaesarMaker;

class caesarWithChicken implements CaesarMaker {
    @Override
    public void prepareCaesar() {
        System.out.println("Chicken");
    }
}

class caesarWithShrimps implements CaesarMaker {
    @Override
    public void prepareCaesar() {
        System.out.println("shrimps");
    }
}

class veganCaesar implements CaesarMaker {
    @Override
    public void prepareCaesar() {
        System.out.println("vegan");
    }
}
