package com.example.filmy.dao;

import com.example.filmy.dao.entity.VideoCassete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoCasseteRepo extends CrudRepository<VideoCassete, Long> {

    Optional<VideoCassete> findAllById(Long id);
}
