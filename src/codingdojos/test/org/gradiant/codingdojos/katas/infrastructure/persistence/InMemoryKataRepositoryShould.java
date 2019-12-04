package org.gradiant.codingdojos.katas.infrastructure.persistence;

import org.gradiant.codingdojos.katas.domain.Kata;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

final class InMemoryKataRepositoryShould {
    @Test
    void save_a_course() {
        InMemoryKataRepository repository = new InMemoryKataRepository();
        Kata kata = new Kata("id", "name", "duration");

        repository.save(kata);
    }

    @Test
    void return_an_existing_course() {
        InMemoryKataRepository repository = new InMemoryKataRepository();
        Kata kata = new Kata("id", "name", "duration");

        repository.save(kata);

        assertEquals(Optional.of(kata), repository.search(kata.id()));
    }

    @Test
    void not_return_a_non_existing_course() {
        InMemoryKataRepository repository = new InMemoryKataRepository();

        assertFalse(repository.search("randomId").isPresent());
    }
}
