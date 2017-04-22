package br.com.roninfo.DAO;

import java.util.List;

/**
 * Created by roninfo on 22/04/17.
 */
public interface DAO<T extends Banco> {
    T recuperarPorId(Object id);
    List<T> recuperarTodos();
    void salvar(T entidade);
    void update(T entidade);
    void excluir(T entidade);
}
