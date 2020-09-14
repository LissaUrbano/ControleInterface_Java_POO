package controleremoto;

public class Programa {
    public static void main(String[] args) {

        //instanciando 
        ControleRemoto c1 = new ControleRemoto(); 
        
        //utilizando metodos abstratos implementados da interface
        c1.ligar();
        c1.aumentarVolume();
        c1.ativarMudo();
        c1.abrirMenu();
    }
}
