package ar.edu.uba.fi;

public class Actor {
    private boolean isAlive = true;

    public void stepOn(Cell c) {
        c.bumpInto(this);
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void kill() {
        this.isAlive = false;
    }
}
