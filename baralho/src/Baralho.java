import java.util.Random;

public class Baralho {

    private Carta[] baralho = new Carta[56];

    public Baralho(){
        String[] imagens = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Rei"};
        String[] naipes = {"Paus", "Copas", "Espadas", "Ouros"};
        int index = 0;

        for(String naipe: naipes){
            for(String imagem: imagens){
                baralho[index] = new Carta(naipe, imagem);
                index++;
            }
        }
        for (int lastCards = 52; lastCards < 56; lastCards++) {
            baralho[lastCards] = new Carta("Coringa", "Joker");
        }
    }

    public void embaralhar(){
        for(int i = baralho.length -1; i>0; i--){
            int j = (int)(Math.random() *  (i + 1));

            Carta aux = baralho[i];
            baralho[i] = baralho[j];
            baralho[j] = aux;
        }
    }

    public Carta distribuirCarta(){
        int topo = baralho.length - 1;

        while(topo>0 && baralho[topo] == null){
            topo--;
            if(topo<0){
                System.out.println("Sem c   artas no baralho!");
                return null;
            }
        }

        Carta cartaRetirada = baralho[topo];
        baralho[topo] = null;

        return cartaRetirada;

    }

    public boolean hasCarta(String imagem, String naipe ){
        for(Carta c: baralho){
            if(c!= null && c.getImagem().equals(imagem) && c.getNaipe().equals(naipe)){
                return true;
            }
        }
        return false;
    }

    public void imprimirBaralho(){
        for(Carta carta: baralho){
            System.out.println(carta);
        }
    }
}
