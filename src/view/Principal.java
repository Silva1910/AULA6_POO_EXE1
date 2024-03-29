package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Principal {
	public static void main(String[] args) {
		Carga c = new Carga();
		Passeio p = new Passeio();
		
		
		c.setPlaca("ABCD");
		c.setMarca("chevrolet");
		c.setModelo("Prisma");
		c.setCor("branco");
		c.setVelocMax(300);
		c.setQtdRodas(4);
		Motor m1 = new Motor();
		m1.setPotencia(250);
		m1.setQtdPist(6);
		c.setMotor(m1);
		c.setCargaMax(10);
		c.setTracao(50);
	
		p.setPlaca("EFGH");
		p.setMarca("FIAT");
		p.setModelo("STRADA");
		p.setCor("PRETO");
		p.setVelocMax(600);
		p.setQtdRodas(4);
		Motor m2 = new Motor();
		m2.setPotencia(100);
		m2.setQtdPist(8);
		p.setMotor(m2);
		p.setQtdPssageiros(10);
		
	System.out.println(" CARRO DE CARGA");
	System.out.println("Placa: " + c.getPlaca());
	System.out.println("Marca: " + c.getMarca());
	System.out.println("Modelo: " + c.getModelo());
	System.out.println("Cor: " + c.getCor());
	System.out.println("Velocidade Máxima: " + c.calcVel(c.getVelocMax()));
	System.out.println("Quantidade de Rodas: " + c.getQtdRodas());
	System.out.println("Potência do Motor: " + c.getMotor().getPotencia());
	System.out.println("Quantidade de Pistões do Motor: " + c.getMotor().getQtdPist());
	System.out.println("Carga Máxima: " + c.getCargaMax());
	System.out.println("Tração: " + c.getTracao());

	System.out.println(" ***************************************************");
	System.out.println(" CARRO DE PASSEIO");
	System.out.println("Placa: " + p.getPlaca());
	System.out.println("Marca: " + p.getMarca());
	System.out.println("Modelo: " + p.getModelo());
	System.out.println("Cor: " + p.getCor());
	System.out.println("Velocidade Máxima: " + p.calcVel(p.getVelocMax()));
	System.out.println("Quantidade de Rodas: " + p.getQtdRodas());
	System.out.println("Potência do Motor: " + p.getMotor().getPotencia());
	System.out.println("Quantidade de Pistões do Motor: " + p.getMotor().getQtdPist());
	System.out.println("Quantidade de Passageiros: " + p.getQtdPssageiros());
	
	System.out.println(" ***************************************************");
	}


}
