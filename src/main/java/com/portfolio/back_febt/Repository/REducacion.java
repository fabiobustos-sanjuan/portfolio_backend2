package com.portfolio.back_febt.Repository;

import com.portfolio.back_febt.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreEsc(String nombreEsc);
    public boolean existsByNombreEsc(String nombreEsc);
}
