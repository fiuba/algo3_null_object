package ar.edu.uba.fi;

import java.util.Objects;

public class Credit {
    private int value;

    public Credit(int value) {
        this.value = value;
    }

    public Credit() {
        this.value = 0;
    }

    public void add(Credit c) {
        this.value = this.value + c.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return value == credit.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
