package org.gradiant.codingdojos.katas.application.create;

import org.gradiant.codingdojos.katas.domain.Kata;
import org.gradiant.codingdojos.katas.domain.KataRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class KataCreatorShould {
    @Test
    void create_a_valid_course() {
        KataRepository repository = mock(KataRepository.class);
        KataCreator creator    = new KataCreator(repository);

        String id       = "some-id";
        String name     = "name";
        String duration = "duration";

        Kata kata = new Kata(id, name, duration);

        creator.create(kata.id(), kata.name(), kata.duration());

        verify(repository, atLeastOnce()).save(kata);
    }
}
