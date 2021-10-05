package br.edu.iftm.classicacaoanimal.testes;

import br.edu.iftm.classicacaoanimal.verterbrados.sanguequente.aves.Avestruz;
import br.edu.iftm.classicacaoanimal.verterbrados.sanguequente.mamiferos.*;

public class App {
    //padrão de construção de hierquia de pacote
    //www.caixa.gov.br
    //-> br.gov.caixa.internetbaking
    //->  "        ".loteiraCaixas
    //www.globo.com.br
    //->br.com.globo.globoplay
    //-> "         ".g1
    //-> "         ".ge
    //www.iftm.edu.br
    //ClassificaoAninal -> iftm
    //-> br.edu.iftm.classificaoAnimal
    public static void main(String[] args) throws Exception {
        Baleia baleia = new Baleia();
        Tigre tigre = new Tigre();
        Urso urso = new Urso();
        Avestruz avesrtuz = new Avestruz();        
    }
}
