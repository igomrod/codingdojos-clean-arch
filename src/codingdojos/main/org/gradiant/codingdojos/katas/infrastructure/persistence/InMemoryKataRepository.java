package org.gradiant.codingdojos.katas.infrastructure.persistence;

import org.gradiant.codingdojos.katas.domain.Kata;
import org.gradiant.codingdojos.katas.domain.KataRepository;
import org.gradiant.shared.domain.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public final class InMemoryKataRepository implements KataRepository {
    private HashMap<String, Kata> courses = new HashMap<>();

    @Override
    public void save(Kata kata) {
        courses.put(kata.id(), kata);
    }

    public Optional<Kata> search(String id) {
        return Optional.ofNullable(courses.get(id));
    }
}
