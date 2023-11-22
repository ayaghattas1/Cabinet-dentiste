package IHM;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JComponent;

import com.toedter.calendar.IDateEditor;
import com.toedter.calendar.JDateChooser;

public class CustomDateChooser extends JDateChooser {

    private static final long serialVersionUID = 1L;

    public CustomDateChooser() {
        super();
    }

    public CustomDateChooser(Date date) {
        super(date);
    }

    public CustomDateChooser(JComponent component, Date date) {
        super(date);
        component.add(this);
    }

    public String getDateAsString() {
    	  // Obtient la date sélectionnée dans le CustomDateChooser
        Date date = getDate();
        // Formate la date sous forme de chaîne de caractères
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String dateString = dateFormat.format(date);
        // Retourne la chaîne de caractères contenant la date
        return dateString;
    }
}




