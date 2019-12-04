package org.gradiant.codingdojos.katas.application.create;

import org.gradiant.codingdojos.katas.domain.Kata;
import org.gradiant.codingdojos.katas.domain.KataRepository;
import org.gradiant.shared.domain.Service;

@Service
public final class KataCreator {
    private KataRepository repository;

    public KataCreator(KataRepository repository) {
        this.repository = repository;
    }

    public void create(String id, String name, String duration) {
        Kata kata = new Kata(id, name, duration);

        this.repository.save(kata);
    }
}
