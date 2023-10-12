package Usuario;

import Aparelho.AparelhoTelefonico.AparelhoTelefonico;
import Aparelho.Iphone.Iphone;
import Aparelho.NavegadorInternet.NavegadorInternet;
import Aparelho.ReprodutorMusical.ReprodutorMusical;

public class UsuarioIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        AparelhoTelefonico phone = iphone;
        ReprodutorMusical itunes = iphone;
        NavegadorInternet safari = iphone;

        itunes.tocaMusica();
        itunes.trocaMusica();

        safari.conectaNaInternet();
        safari.buscarNaInternet();

        phone.fazerLigacao();
        phone.receberLigacao();
    }
}
