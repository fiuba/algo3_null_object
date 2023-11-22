package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mame {

    private final List<Credit> credits;

    public Mame() {

        this.credits = new ArrayList<>();
    }

    public void add(Credit credit) {

        credits.add(credit);
    }

//    public Credit credits() {
//        if ( this.credits.size() == 0 ) {
//            return null;
//        }
//
//        Credit result = this.credits.remove(0);
//
//        for( Credit c : this.credits) {
//            result.add(c);
//        }
//
//        return result;
//    }

    public Credit credits() {
        Credit result = new Credit();

        for( Credit c : this.credits) {
            result.add(c);
        }

        return result;
    }


}
