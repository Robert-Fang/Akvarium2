package Akvarium;

public class Fisk {
	// TODO Klassen Fisk ska ha (minst) ett attribut: fiskTyp
	// TODO För att underlätta skapandet av Fisk-Objekt, behöver klassen ha en
	// konstruktor som tar emot fiskTyp som inparameter.
	private String FiskTyp;

	public String getFiskTyp() {
		return FiskTyp;
	}

	public void setFiskTyp(String fiskTyp) {
		this.FiskTyp = fiskTyp;
	}

	public Fisk(String FiskTyp) {
		this.FiskTyp = FiskTyp;

	}

}
