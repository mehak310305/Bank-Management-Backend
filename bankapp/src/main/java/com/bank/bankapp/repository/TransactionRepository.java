package com.bank.bankapp.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.bankapp.entity.Account;
import com.bank.bankapp.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> { 
 List <Transaction> findByAccountOrderByCreatedAtDesc(Account account);

}
