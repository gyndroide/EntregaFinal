package com.Proyectofinal.Julietamancilla.service;
import com.Proyectofinal.Julietamancilla.entity.Entidad;
import com.Proyectofinal.Julietamancilla.repository.Repositorio;
import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
public abstract class ServicioSub <T extends Entidad, N extends Serializable> implements Servicio<T, N> {


    protected Repositorio<T, N> repositorio;

    public ServicioSub(Repositorio<T, N> repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    @Transactional
    public List<T> findAll() throws Exception {
        try {
            return repositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T findById(N id) throws Exception {
        try {
            Optional<T> optional = repositorio.findById(id);
            return optional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T save(T entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T update(N id, T entidad) throws Exception {
        try {
            Optional<T> optional = repositorio.findById(id);
            T estudiante = optional.get();
            estudiante = repositorio.save(entidad);
            return estudiante;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public Boolean delete(N id) throws Exception {
        try {
            if (repositorio.existsById(id)) {
                repositorio.deleteById(id);
                return Boolean.TRUE;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}

