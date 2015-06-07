import java.util.ArrayList;

public class Bank {

	ArrayList<Kunde> Kunden = new ArrayList<Kunde>();

	public void neueKunden(Kunde esel) {
		Kunden.add(esel);

	}

	public Kunde getKunde(int besitzerid, int pin) {
		for (Kunde e : Kunden) {
			if (e.getBesitzerid() == besitzerid && e.isPin(pin)) {
				return e;
			}
		}
		return null;
	}

	public void updateKunde(Kunde benutzer) {
		for (Kunde e : Kunden) {
			if (e.getBesitzerid() == benutzer.getBesitzerid()) {
				Kunden.remove(e);
			}

		}
		Kunden.add(benutzer);
	}

	private Konto getKonto(int kontonummer) {
		for (Kunde e : Kunden) {
			for (Konto i : e.kunden_Konten) {
				if (i.getKontonummer() == kontonummer) {
					return i;
				}
			}
		}
		return null;
	}

	public void ueberweisen(int kontonummer, int betrag) {
		Konto getAccount = getKonto(kontonummer);
		getAccount.eingang(betrag);
		Kunde besitzer = getAccount.besitzer;
		besitzer.updateKonto(getAccount);
	}

}
