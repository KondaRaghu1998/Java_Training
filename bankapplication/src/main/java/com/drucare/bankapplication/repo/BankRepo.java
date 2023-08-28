package com.drucare.bankapplication.repo;

import com.drucare.bankapplication.bean.Bank;
import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface BankRepo extends JpaRepository<Bank,Integer> {

//    @Query("SELECT b FROM Bank b ORDER BY b.ifceCode DESC")
//    public List<Bank> findAllSortedByIfscCode();

    @Query("SELECT b FROM Bank b ORDER BY b.bankName, b.branch DESC")
    public List<Bank> findAllSortedByIfscCode();

    /*
      @Transactional annotation ensures that the operation is performed within a transaction.
      @Modifying 
     */
    @Transactional
    @Modifying
    @Query("DELETE FROM Bank b WHERE b.ifceCode=:ifceCode")
   public void deleteBankByIfscCode(@PathParam("ifceCode") String ifceCode);
}
