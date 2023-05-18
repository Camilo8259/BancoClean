package java.com.ejemplo.bancoclean.domain.repository;

import java.com.ejemplo.bancoclean.domain.model.Usuario;

public interface UsuarioRepository {

    Usuario findById(String id);
    void save(Usuario usuario);
    void deleteById(String id);
}
