package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {

    private final Death8 deth;

    @Autowired
    public Needle7(Death8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
