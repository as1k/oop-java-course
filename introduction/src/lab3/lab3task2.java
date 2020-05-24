package lab3;

public class lab3task2 {

	public static void main(String[] args) {
		Winterfell JonSnowsArmy = new Winterfell(10000);
		KingsLanding CerceisArmy = new KingsLanding(30000);
		JonSnowsArmy.motto();
		CerceisArmy.motto();
		JonSnowsArmy.KillTheEnemy();
		CerceisArmy.KillTheEnemy();
		System.out.println("Stark's army = " + JonSnowsArmy.Starks + "\n" +
							"Lannister's army = " + CerceisArmy.Lannisters);
	}
}

abstract class Kingdom {
    public abstract void motto();
    public void prayer(){
        System.out.println("Valar Morgulus");
    }
}

interface Guardians{
	public void KillTheEnemy();
}
        
class Winterfell extends Kingdom implements Guardians{
	static int Starks;
	public Winterfell(int Starks) {
		this.Starks = Starks;
	}
    @Override
    public void motto(){
    System.out.println("Winter is coming!");
    }
	@Override
	public void KillTheEnemy() {
		KingsLanding.Lannisters -= 7500;
	}
}

class KingsLanding extends Kingdom implements Guardians{
	static int Lannisters;
	public KingsLanding(int Lannisters) {
		this.Lannisters = Lannisters;
	}
	@Override
	public void motto() {
		System.out.println("A Lannister always pays his debts!");
	}
	@Override
	public void KillTheEnemy() {
		Winterfell.Starks -= 3000;
	}
}