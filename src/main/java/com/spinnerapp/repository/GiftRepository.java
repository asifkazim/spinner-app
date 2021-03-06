package com.spinnerapp.repository;

import com.spinnerapp.model.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftRepository extends JpaRepository<Gift,Long> {

    List<Gift> findAllByUser(Long userId);

    List<Gift> findByUserAndStatusTrue(Long userId);

}
