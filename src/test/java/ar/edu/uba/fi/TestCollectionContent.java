package ar.edu.uba.fi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCollectionContent {

    @Test
    public void sumarizeCredits() {
        Mame m = new Mame();

        m.add(new Credit(5));
        m.add(new Credit(10));

        assertEquals(new Credit(15), m.credits());
    }

    @Test
    public void sumarizeCreditsForWhenNoCredits() {
        Mame m = new Mame();

        assertEquals(new Credit(), m.credits());
    }
}
