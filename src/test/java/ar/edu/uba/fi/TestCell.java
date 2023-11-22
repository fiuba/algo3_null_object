package ar.edu.uba.fi;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestCell
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void actorStepIntoAnEmptyCellAndTheActorIsAlive() {
        Actor c = new Actor();

        Cell cell = new Cell();

        c.stepOn(cell);

        assertTrue(c.isAlive());

    }

    @Test
    public void actorStepIntoACellWithAMounsterAndDies() {
        Actor c = new Actor();

        Cell cell = new Cell(new Mounster());

        c.stepOn(cell);

        assertFalse(c.isAlive());

    }
}
