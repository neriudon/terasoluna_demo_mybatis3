package terasoluna_demo_mybatis3.domain.service.todo;

import java.util.Collection;

import terasoluna_demo_mybatis3.domain.model.Todo;

public interface TodoService {
	Collection<Todo> findAll();

	Todo create(Todo todo);

	Todo finish(String todoId);

	void delete(String todoId);
}