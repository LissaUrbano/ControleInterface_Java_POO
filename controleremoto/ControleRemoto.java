package controleremoto;

public class ControleRemoto implements Controlador{
    
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    //métodos especiais - construtor
    public ControleRemoto() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
    }

    //métodos getters e setters dos atributos
	private int getVolume() {
		return volume;
	}


	private void setVolume(int volume) {
		this.volume = volume;
	}


	private boolean isLigado() {
		return ligado;
	}


	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	private boolean isTocando() {
		return tocando;
	}


	private void setTocando(boolean tocando) {
		this.tocando = tocando;
    }
    
    //métodos abstratos sobrescristos
	@Override
	public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
	}

	@Override
	public void ativarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
	}

	@Override
	public void aumentarVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
	}

	@Override
	public void desativarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
	}

	@Override
	public void desligar() {
        this.setLigado(false);
	}

	@Override
	public void diminuirVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void ligar() {
        this.setLigado(true);
	}

	@Override
	public void pause() {
        if (this.isLigado() && (this.isTocando())) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }	
	}

	@Override
	public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setLigado(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }		
	}
}
