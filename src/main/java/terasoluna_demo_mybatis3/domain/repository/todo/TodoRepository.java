package terasoluna_demo_mybatis3.domain.repository.todo;

import java.util.Collection;

import terasoluna_demo_mybatis3.domain.model.Todo;

public interface TodoRepository {

    Todo findOne(String todoId);

    Collection<Todo> findAll();

    void create(Todo todo);

    boolean update(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);

}