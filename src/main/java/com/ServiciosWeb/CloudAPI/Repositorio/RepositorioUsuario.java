package com.ServiciosWeb.CloudAPI.Repositorio;

import com.ServiciosWeb.CloudAPI.Entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    Usuario findByurl(String url);
    Usuario findBynombre(String nombre);
}
