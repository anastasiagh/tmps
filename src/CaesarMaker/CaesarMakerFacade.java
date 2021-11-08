package CaesarMaker;

public class CaesarMakerFacade {
    private CaesarMaker CaesarWithChicken;
    private CaesarMaker CaesarWithShrimps;
    private CaesarMaker VeganCaesar;

    public void CaesarMaker() {
        CaesarWithChicken = new caesarWithChicken();
        CaesarWithShrimps = new caesarWithShrimps();
        VeganCaesar = new veganCaesar();
    }

    public void prepareCaesarWithChicken() {
        CaesarWithChicken.prepareCaesar();
    }

    public void prepareCaesarWithShrimps() {
        CaesarWithShrimps.prepareCaesar();
    }

    public void prepareVeganCaesar() {
        VeganCaesar.prepareCaesar();
    }
}
