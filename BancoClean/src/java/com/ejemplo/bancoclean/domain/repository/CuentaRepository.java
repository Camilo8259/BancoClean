package java.com.ejemplo.bancoclean.domain.repository;

import java.com.ejemplo.bancoclean.domain.model.Cuenta;

public interface CuentaRepository {

    Cuenta findById(String id);
    void save(Cuenta cuenta);
    void deleteById(String id);
}
