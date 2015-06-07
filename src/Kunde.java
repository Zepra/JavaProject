import java.util.ArrayList;

public class Kunde {

	String name;
	static int Zaehler = 0;
	int besitzerid;
	int pin;

	Bank Sparkasse;

	ArrayList<Konto> kunden_Konten = new ArrayList<Konto>();
	ArrayList<String> reichtuemer = new ArrayList<String>();

	public Kunde(String name, int pin) {
		this.pin = pin;
		this.besitzerid = Zaehler;
		Zaehler++;
		this.name = name;
	}

	public int getBesitzerid() {
		return besitzerid;
	}

	public void setBesitzerid(int besitzerid) {
		this.besitzerid = besitzerid;
	}

	public void updateKonto(Konto kundkonto) {
		for (Konto e : kunden_Konten) {
			if (e.getKontonummer() == kundkonto.getKontonummer()) {
				kunden_Konten.remove(e);
				break;
			}

		}
		kunden_Konten.add(kundkonto);
	}

	// Pin getterSetter
	public boolean isPin(int pin) {
		if (pin == this.pin) {
			return true;
		}
		return false;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void getKontodaten() {
		for (Konto e : kunden_Konten) {
			e.printState();
		}
	}

	public Konto getKonto(int kontonummer) {
		for (Konto e : kunden_Konten) {
			if (e.getKontonummer() == kontonummer) {
				return e;
			}
		}
		return null;
	}

	public void addKonto(int kontonummer, double kontostand, double kredit) {
		Konto bankAccount = new Konto(this, kontonummer, kontostand, kredit);
		kunden_Konten.add(bankAccount);
	}

}
