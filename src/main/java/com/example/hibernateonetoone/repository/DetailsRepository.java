package com.example.hibernateonetoone.repository;

import com.example.hibernateonetoone.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Long> {
    Details findById(long id);
}
