package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {
    @XmlAttribute
    private int count;

    @XmlValue
    private String minifig;

    public Minifig() {}

    public Minifig(int count , String minifig) {
        this.count = count;
        this.minifig = minifig;


    }

}
