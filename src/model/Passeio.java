package model;

public final class Passeio extends Veiculo {

	private int qtdPassageiros;

	public Passeio() {

	}

	@Override
	public float calcVel(float velocMax) {

		return 1000/velocMax;
	}

	public int getQtdPssageiros() {
		return qtdPassageiros;
	}

	public final void setQtdPssageiros(int qtdPssageiros) {
		this.qtdPassageiros = qtdPssageiros;
	}

}
