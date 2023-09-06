package primerProyecto;

public class Bicharraco {
	private String name;
	private AttackType tipo;
	private int power;
	private int vida;
	
	public Bicharraco(String name, int vida, AttackType tipo) {
		this.name=name;
		this.vida=vida;
		this.tipo=tipo;
		this.power=this.setPower();
		System.out.println("Bicharraco "+ name +" creado. HP = "+this.vida);
		
	};
	public void atacarA(Bicharraco b) {

		b.setVida(-this.power);
		System.out.println(this.name+" le metió un "+ this.tipo +" a "+b.name+ " y quedó con " + b.getVida());
		System.out.println("-Bicharraco "+b.name+": Auch eso dolio, " + this.name);
	}
	
	public void setVida(int danio) {
		this.vida=this.vida+danio;
		
	}
	
	public int getVida() {
		return this.vida;
	}
	
	private int setPower() {
		int value=0;
		switch (this.tipo) {
		case fogonazo:
			value=3;
		case cabezazo:
			value=2;
		case tingazo:
			value=3;
		}
		return value;
	}
	
}
