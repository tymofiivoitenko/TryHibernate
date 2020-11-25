import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Alien {

    @Id
    private int id;
    private String aname;
    private String colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
