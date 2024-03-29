package model;

public final class Carga extends Veiculo {
	private int cargaMax;
	private int tracao;

	public Carga() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcVel(float velocMax) {
		// TODO Auto-generated method stub
		return 100000/velocMax;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTracao() {
		return tracao;
	}

	public final void setTracao(int tracao) {
		this.tracao = tracao;
	}

	

}
