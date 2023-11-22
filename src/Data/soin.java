package Data;

import javax.swing.JOptionPane;

import dbase.bdd;

public class soin {
	bdd b=new bdd();
	public String nom_patient;
	public int id;
	public String prenom_patient;
	public String type;
	
	
	public soin() {
	}
	
	public soin(String nom_patient, int id, String prenom_patient, String type) {
		super();
		this.nom_patient = nom_patient;
		this.id = id;
		this.prenom_patient = prenom_patient;
		this.type = type;
	}

	public String getNom_patient() {
		return nom_patient;
	}

	public void setNom_patient(String nom_patient) {
		this.nom_patient = nom_patient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom_patient() {
		return prenom_patient;
	}

	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "soin [nom_patient=" + nom_patient + ", id=" + id + ", prenom_patient=" + prenom_patient + ", type="
				+ type + "]";
	}
	
	 public boolean Ajouter() throws ClassNotFoundException
	    {
	         String requete="insert into soin(nom_patient,prenom_patient,type)VALUES('"+nom_patient+"','"+prenom_patient+"','"+type+"')";
	      
	                       return b.runNonQuery(requete);
	            
	   }
	   
	    public boolean Modifier() throws ClassNotFoundException
	    {
	        
	           if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
	                   JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

	        String Req=("update soin set nom_patient='"+nom_patient+"',prenom_patient='"+prenom_patient+"',tel='"+type+"'");
	                     return b.runNonQuery(Req);
	       
	        
	     }
	               return false;
	    }
		
	
}
