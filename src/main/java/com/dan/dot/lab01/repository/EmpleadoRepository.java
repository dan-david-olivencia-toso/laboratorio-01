package com.dan.dot.lab01.repository;

import com.dan.dot.lab01.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    Optional<Empleado> findEmpleadoById(Integer id);
    Optional<Empleado> findEmpleadoByMail(String mail);
    Optional<Empleado> findEmpleadoByUsuarioUsuario(String usuario);
    boolean existsById(Integer id);
    boolean existsByMail(String mail);
    boolean existsByUsuarioUsuario(String usuario);
    Empleado save(Empleado empleado);
}
