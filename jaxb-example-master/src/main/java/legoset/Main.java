package legoset;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setNumber("75211");
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter","Stromtrooper", "Star Wars", "Solo"));
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stromtrooper"));
        legoset.setMinifigs(minifigs);
        legoset.setWeight(new Weight(0.89,"kg"));

        JAXBHelper.toXML(legoset, System.out);
    }
}
