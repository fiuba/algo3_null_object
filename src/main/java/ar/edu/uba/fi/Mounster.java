package ar.edu.uba.fi;

public class Mounster implements Content {

    @Override
    public void bumpInto(Actor actor) {
        actor.kill();
    }

}
