/**
 * @author Salah Eddine
 *
 */
public final class Tree {
	public Tree() { } 
	public String getGEOPOINT() {
		return GEOPOINT;
	}
	public void setGEOPOINT(String gEOPOINT) {
		GEOPOINT = gEOPOINT;
	}
	public String getARRONDISSEMENT() {
		return ARRONDISSEMENT;
	}
	public void setARRONDISSEMENT(String aRRONDISSEMENT) {
		ARRONDISSEMENT = aRRONDISSEMENT;
	}
	public String getGENRE() {
		return GENRE;
	}
	public void setGENRE(String gENRE) {
		GENRE = gENRE;
	}
	public String getESPECE() {
		return ESPECE;
	}
	public void setESPECE(String eSPECE) {
		ESPECE = eSPECE;
	}
	public String getFAMILLE() {
		return FAMILLE;
	}
	public void setFAMILLE(String fAMILLE) {
		FAMILLE = fAMILLE;
	}
	public String getANNEE_PLANTATION() {
		return ANNEE_PLANTATION;
	}
	public void setANNEE_PLANTATION(String aNNEE_PLANTATION) {
		ANNEE_PLANTATION = aNNEE_PLANTATION;
	}
	public String getHAUTEUR() {
		return HAUTEUR;
	}
	public void setHAUTEUR(String hAUTEUR) {
		HAUTEUR = hAUTEUR;
	}
	public String getCIRCONFERENCE() {
		return CIRCONFERENCE;
	}
	public void setCIRCONFERENCE(String cIRCONFERENCE) {
		CIRCONFERENCE = cIRCONFERENCE;
	}
	public String getADRESSE() {
		return ADRESSE;
	}
	public void setADRESSE(String aDRESSE) {
		ADRESSE = aDRESSE;
	}
	public String getNOM_COMMUN() {
		return NOM_COMMUN;
	}
	public void setNOM_COMMUN(String nOM_COMMUN) {
		NOM_COMMUN = nOM_COMMUN;
	}
	public String getVARIETE() {
		return VARIETE;
	}
	public void setVARIETE(String vARIETE) {
		VARIETE = vARIETE;
	}
	public String getOBJECTID() {
		return OBJECTID;
	}
	public void setOBJECTID(String oBJECTID) {
		OBJECTID = oBJECTID;
	}
	public String getNOM_EV() {
		return NOM_EV;
	}
	public void setNOM_EV(String nOM_EV) {
		NOM_EV = nOM_EV;
	}
	private String GEOPOINT;
	private String ARRONDISSEMENT;
	private String GENRE;
	private String ESPECE;
	private String FAMILLE;
	private String ANNEE_PLANTATION;
	private String HAUTEUR;
	private String CIRCONFERENCE;
	private String ADRESSE;
	private String NOM_COMMUN;
	private String VARIETE;
	private String OBJECTID;
	private String NOM_EV;
	
	public Object get(IndexMapping index) {
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
	public void set(IndexMapping index, Object value) {
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
