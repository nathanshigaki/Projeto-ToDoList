package br.com.nathanshigaki.projeto_todolist.Service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.nathanshigaki.projeto_todolist.Entity.Todo;
import br.com.nathanshigaki.projeto_todolist.Repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> read(){
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);;
        return read();
    }
}
