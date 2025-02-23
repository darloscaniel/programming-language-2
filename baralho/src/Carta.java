public class Carta {
    private String naipe;
    private String imagem;

 public Carta(String naipe, String imagem){

     this.imagem = imagem;
     this.naipe = naipe;
 }

    public String getNaipe() {
        return naipe;
    }

    public String getImagem() {
        return imagem;
    }

    @Override
    public String toString() {
        return imagem + " de " + naipe;
    }
}