/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.workshop.main.repository;

import com.poly.workshop.main.model.Hang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hangnt
 */
@Repository
public interface HangRepository extends JpaRepository<Hang, Long> {

    @Query("""
            SELECT h FROM Hang h WHERE ma = ?1
          """)
    Hang searchHangByMa(String ma);
}
