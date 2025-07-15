package br.com.nathanshigaki.projeto_todolist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nathanshigaki.projeto_todolist.Entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
