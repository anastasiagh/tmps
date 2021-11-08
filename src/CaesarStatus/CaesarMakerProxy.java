package CaesarStatus;

public class CaesarMakerProxy extends MakingSalad{
    private MakingSalad makingSalad;
    private String caesarType;

    public CaesarMakerProxy(String caesarType){
        super();
        this.caesarType = caesarType;
    }

    @Override
    public void prepareCaesar(){
        if(makingSalad == null) {
            makingSalad = new MakingSalad(caesarType);
        }
        makingSalad.prepareCaesar();
    }
}
