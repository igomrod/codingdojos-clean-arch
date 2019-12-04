package org.gradiant.codingdojos.katas.domain;

import java.util.Objects;

public final class Kata {
    private final String id;
    private final String name;
    private final String duration;

    public Kata(String id, String name, String duration) {
        this.id       = id;
        this.name     = name;
        this.duration = duration;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String duration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Kata)) {
            return false;
        }
        Kata kata = (Kata) o;
        return Objects.equals(id, kata.id) &&
               Objects.equals(name, kata.name) &&
               Objects.equals(duration, kata.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration);
    }
}
