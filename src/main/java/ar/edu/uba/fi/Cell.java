package ar.edu.uba.fi;


public class Cell {
    private final Content content;

    public Cell() {
        this.content = new Empty();
    }
    public Cell(Content content) {

        this.content = content;
    }
    public void bumpInto(Actor actor) {

        content.bumpInto(actor);
    }
}
