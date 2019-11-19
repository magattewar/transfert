package com.magatte.transfertargent.transfert.service;

import com.magatte.transfertargent.transfert.model.Partenaire;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class PartenairesService implements CrudRepository<Partenaire, Integer> {

    @Override
    public <S extends Partenaire> S save(S s) {
        return null;
    }

    @Override
    public <S extends Partenaire> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Partenaire> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Partenaire> findAll() {



        return null;
    }

    @Override
    public Iterable<Partenaire> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Partenaire partenaire) {

    }

    @Override
    public void deleteAll(Iterable<? extends Partenaire> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}



