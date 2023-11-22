package Data;

import dbase.Tools;
import dbase.bdd;
import static dbase.bdd.runNonQuery;

import javax.swing.JOptionPane;

public class rdv {
	bdd b=new bdd();
	public int id;
	public String nom_patient;
	public String prenom_patient;
	public int tel;
	public String date;
	public String heure;
	
	
	public rdv() {
    }
	
	public rdv(int id, String nom_patient, String prenom_patient, int tel, String date, String heure) {
		super();
		this.id = id;
		this.nom_patient = nom_patient;
		this.prenom_patient = prenom_patient;
		this.tel = tel;
		this.date = date;
		this.heure = heure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_patient() {
		return nom_patient;
	}
	public void setNom_patient(String nom_patient) {
		this.nom_patient = nom_patient;
	}
	public String getPrenom_patient() {
		return prenom_patient;
	}
	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	@Override
	public String toString() {
		return "rdv [id=" + id + ", nom_patient=" + nom_patient + ", prenom_patient=" + prenom_patient + ", tel=" + tel
				+ ", date=" + date + ", heure=" + heure + "]";
	}
	
	

    public boolean Ajouter() throws ClassNotFoundException
    {
         String requete="insert into rdv(nom_patient,prenom_patient,tel,heure,date)VALUES('"+nom_patient+"','"+prenom_patient+"','"+tel+"','"+heure+"','"+date+"')";
      
                       return b.runNonQuery(requete);
            
   }
    public boolean Supprimer() throws ClassNotFoundException
    {
        String requete="delete from rdv where id = '"+id+"'";
          if (JOptionPane.showConfirmDialog (null,"Veillez Supprimer ce Patient","Confirmation",
                   JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
              
                     return  b.runNonQuery(requete);
      
            
           }
               return false;
    }
    public boolean Modifier() throws ClassNotFoundException
    {
        
           if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                   JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

        String Req=("update rdv set nom_patient='"+nom_patient+"',prenom_patient='"+prenom_patient+"',tel='"+tel+"',heure='"+heure+"',date='"+date+"' where id ='"+id+"'");
                     return b.runNonQuery(Req);
       
        
     }
               return false;
    }
	
}
