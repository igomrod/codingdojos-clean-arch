package org.gradiant.codingdojos.katas.domain;

import java.util.Optional;

public interface KataRepository {
    void save(Kata kata);

    Optional<Kata> search(String id);
}
