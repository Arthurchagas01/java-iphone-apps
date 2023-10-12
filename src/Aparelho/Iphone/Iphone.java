package Aparelho.Iphone;

import Aparelho.AparelhoTelefonico.AparelhoTelefonico;
import Aparelho.NavegadorInternet.NavegadorInternet;
import Aparelho.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    //Funções relativas à ligações
    public void fazerLigacao(){
        System.out.println("Ligando ...");
    }
    public void receberLigacao(){
        System.out.println("Recebendo ligação ...");
    }

    //Funções relativas a navegador de internet
    
    public void verificarConexao(){
        System.out.println("Verificando conexão - Tenha calma");
    }
    
    public void conectaNaInternet(){
        System.out.println("Conectando na internet");
        
    }
    public void buscarNaInternet(){
        System.out.println("Digite sua busca e faça sua navageção de forma tranquila");  
    }

    //Funções relativas a Reprodutor Musical
    public void tocaMusica(){
        System.out.println("Tocando sua música preferida");
    }
    public void trocaMusica(){
        System.out.println("Trocando de música");
    }
    public void paraMusica(){
        System.out.println("Parando de tocar");
    }
    public void pausaMusica(){
        System.out.println("Música pausada");
    }
}

