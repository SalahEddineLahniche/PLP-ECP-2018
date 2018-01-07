/**
 * @author Salah Eddine
 *
 */
public final class Tree {
	private Tree() { } // this class can't be instantiated nor extended
	public static String getGEOPOINT() {
		return GEOPOINT;
	}
	public static void setGEOPOINT(String gEOPOINT) {
		GEOPOINT = gEOPOINT;
	}
	public static String getARRONDISSEMENT() {
		return ARRONDISSEMENT;
	}
	public static void setARRONDISSEMENT(String aRRONDISSEMENT) {
		ARRONDISSEMENT = aRRONDISSEMENT;
	}
	public static String getGENRE() {
		return GENRE;
	}
	public static void setGENRE(String gENRE) {
		GENRE = gENRE;
	}
	public static String getESPECE() {
		return ESPECE;
	}
	public static void setESPECE(String eSPECE) {
		ESPECE = eSPECE;
	}
	public static String getFAMILLE() {
		return FAMILLE;
	}
	public static void setFAMILLE(String fAMILLE) {
		FAMILLE = fAMILLE;
	}
	public static String getANNEE_PLANTATION() {
		return ANNEE_PLANTATION;
	}
	public static void setANNEE_PLANTATION(String aNNEE_PLANTATION) {
		ANNEE_PLANTATION = aNNEE_PLANTATION;
	}
	public static String getHAUTEUR() {
		return HAUTEUR;
	}
	public static void setHAUTEUR(String hAUTEUR) {
		HAUTEUR = hAUTEUR;
	}
	public static String getCIRCONFERENCE() {
		return CIRCONFERENCE;
	}
	public static void setCIRCONFERENCE(String cIRCONFERENCE) {
		CIRCONFERENCE = cIRCONFERENCE;
	}
	public static String getADRESSE() {
		return ADRESSE;
	}
	public static void setADRESSE(String aDRESSE) {
		ADRESSE = aDRESSE;
	}
	public static String getNOM_COMMUN() {
		return NOM_COMMUN;
	}
	public static void setNOM_COMMUN(String nOM_COMMUN) {
		NOM_COMMUN = nOM_COMMUN;
	}
	public static String getVARIETE() {
		return VARIETE;
	}
	public static void setVARIETE(String vARIETE) {
		VARIETE = vARIETE;
	}
	public static String getOBJECTID() {
		return OBJECTID;
	}
	public static void setOBJECTID(String oBJECTID) {
		OBJECTID = oBJECTID;
	}
	public static String getNOM_EV() {
		return NOM_EV;
	}
	public static void setNOM_EV(String nOM_EV) {
		NOM_EV = nOM_EV;
	}
	private static String GEOPOINT;
	private static String ARRONDISSEMENT;
	private static String GENRE;
	private static String ESPECE;
	private static String FAMILLE;
	private static String ANNEE_PLANTATION;
	private static String HAUTEUR;
	private static String CIRCONFERENCE;
	private static String ADRESSE;
	private static String NOM_COMMUN;
	private static String VARIETE;
	private static String OBJECTID;
	private static String NOM_EV;
	
	public static Object get(IndexMapping index) {
		switch(index) {
		case ADRESSE:
			return getADRESSE();
		case ANNEE_PLANTATION:
			return getANNEE_PLANTATION();
		case ARRONDISSEMENT:
			return getARRONDISSEMENT();
		case CIRCONFERENCE:
			return getCIRCONFERENCE();
		case ESPECE:
			return getESPECE();
		case FAMILLE:
			return getFAMILLE();
		case GENRE:
			return getGENRE();
		case GEOPOINT:
			return getGEOPOINT();
		case HAUTEUR:
			return getHAUTEUR();
		case NOM_COMMUN:
			return getNOM_COMMUN();
		case NOM_EV:
			return getNOM_EV();
		case OBJECTID:
			return getOBJECTID();
		case VARIETE:
			return getVARIETE();
		default:
			return null;
		}
	}
	public static void set(IndexMapping index, Object value) {
		switch(index) {
		case ADRESSE:
			setADRESSE((String)value);
			break;
		case ANNEE_PLANTATION:
			setANNEE_PLANTATION((String)value);
			break;
		case ARRONDISSEMENT:
			setARRONDISSEMENT((String)value);
			break;
		case CIRCONFERENCE:
			setCIRCONFERENCE((String)value);
			break;
		case ESPECE:
			setESPECE((String)value);
			break;
		case FAMILLE:
			setFAMILLE((String)value);
			break;
		case GENRE:
			setGENRE((String)value);
			break;
		case GEOPOINT:
			setGEOPOINT((String)value);
			break;
		case HAUTEUR:
			setHAUTEUR((String)value);
			break;
		case NOM_COMMUN:
			setNOM_COMMUN((String)value);
			break;
		case NOM_EV:
			setNOM_EV((String)value);
			break;
		case OBJECTID:
			setOBJECTID((String)value);
			break;
		case VARIETE:
			setVARIETE((String)value);
		default:
			break;
		}
	}

}
