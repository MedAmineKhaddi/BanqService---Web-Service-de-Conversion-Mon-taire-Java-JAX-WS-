package ma.Atelier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
//le nom de classe dans ficheir XML
@XmlRootElement(name = "COMPTE")
//pour appliquée les annotation juste sûr les attributs , soft les constructors
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;

    //pour ignorer ça pour xml , annotation JaxB

    private double sold;
    @XmlTransient
    private Date date;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Compte() {
    }
    public Compte(int code, double sold, Date date) {
        this.code = code;
        this.sold = sold;
        this.date = date;
    }

}
