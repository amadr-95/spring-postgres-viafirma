package com.example.spring.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    /*@Query(
            value = "SELECT * FROM Account WHERE id_customer = :idCustomer",
            nativeQuery = true
    )*/
    List<Account> findAllAccountsByCustomerId(Long id);
}
