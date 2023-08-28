package com.drucare.bankapplication.dao;

import com.drucare.bankapplication.bean.Bank;
import com.drucare.bankapplication.repo.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort.Direction;

import java.util.List;
import java.util.Optional;

@Repository
public class BankDao {

    @Autowired
    private BankRepo bankRepo;

    public Bank saveBank(Bank bank) {
        if (bank != null) {
            return bankRepo.save(bank);
        }
        return null;
    }

    public List<Bank> fetchAllBankDetails() {

        List<Bank> bankList = bankRepo.findAll();
        if (!bankList.isEmpty()) {
            return bankList;
        }
        return null;
    }

    public List<String> findIfscCodeDetailsByBank(String bankName) {
        List<Bank> bankList = bankRepo.findAll();
        if (!bankList.isEmpty()) {
            return bankList.stream().filter(name -> name.getBankName().equalsIgnoreCase(bankName)).map(Bank::getIfceCode).toList();
        }
        return null;
    }

    public Bank updateBankDetails(Bank bank) {
        Optional<Bank> optionalBank = bankRepo.findById(bank.getBankId());
        if (optionalBank.isPresent()) {
            return bankRepo.save(bank);
        }
        return null;
    }

    public Page<Bank> findBankDetailsByPage(Optional<Integer> pageNo, Optional<Integer> pageSize, Optional<String> sortByBankName) {

        return bankRepo.findAll(PageRequest.of(pageNo.orElse(0), pageSize.orElse(0), Direction.ASC, sortByBankName.orElse("id")));

    }

    public List<Bank> sortBankDetailsByCode() {
        return bankRepo.findAllSortedByIfscCode();
//        Bank bank = byBankNameSorted.stream().findFirst().get();
//        System.out.println(bank);
//        return null;
    }

    public void deleteBankByCode(String ifceCode) {
         bankRepo.deleteBankByIfscCode(ifceCode);
    }
}
