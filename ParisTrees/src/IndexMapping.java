/**
 * @author Salah Eddine
 *
 */
public enum IndexMapping {
	GEOPOINT(0),
	ARRONDISSEMENT(1),
	GENRE(2),
	ESPECE(3),
	FAMILLE(4),
	ANNEE_PLANTATION(5),
	HAUTEUR(6),
	CIRCONFERENCE(7),
	ADRESSE(8),
	NOM_COMMUN(9),
	VARIETE(10),
	OBJECTID(11),
	NOM_EV(12);
	
	private final int value;
    private IndexMapping(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
