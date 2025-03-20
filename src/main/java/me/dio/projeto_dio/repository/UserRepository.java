package me.dio.projeto_dio.repository;

import me.dio.projeto_dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
