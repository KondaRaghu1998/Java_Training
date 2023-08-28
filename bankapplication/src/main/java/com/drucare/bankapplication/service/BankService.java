package com.drucare.bankapplication.service;

import com.drucare.bankapplication.bean.Bank;
import com.drucare.bankapplication.dao.BankDao;
import com.drucare.bankapplication.response.BankResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    @Autowired
    private BankDao bankDao;

    public BankResponse<?> saveBank(Bank bank) {
        Bank saveBankResponse = bankDao.saveBank(bank);
        BankResponse<Bank> bankResponse = new BankResponse();
        bankResponse.setData(saveBankResponse);
        bankResponse.setMsg("Bank Data Saved Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.ACCEPTED);
        return bankResponse;
    }

    public BankResponse<?> fetchAllBankDetails() {
        List<Bank> saveBankResponse = bankDao.fetchAllBankDetails();
        BankResponse<List<Bank>> bankResponse = new BankResponse();
        bankResponse.setData(saveBankResponse);
        bankResponse.setMsg("Bank Data Fetching Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.ACCEPTED);
        return bankResponse;
    }

    public BankResponse<?> findIfscCodeDetailsByBank(String bankName) {
        List<String> saveBankResponse = bankDao.findIfscCodeDetailsByBank(bankName);
        BankResponse<List<String>> bankResponse = new BankResponse();
        bankResponse.setData(saveBankResponse);
        bankResponse.setMsg("Bank Data Fetching By BankName Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.ACCEPTED);
        return bankResponse;
    }

    public BankResponse<?> updateBankDetails(Bank bank) {
        Bank updateBankDetailsResponse = bankDao.updateBankDetails(bank);
        BankResponse<Bank> bankResponse = new BankResponse();
        bankResponse.setData(updateBankDetailsResponse);
        bankResponse.setMsg("Bank Data Updated Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.ACCEPTED);
        return bankResponse;
    }

    public BankResponse<?> findBankDetailsByPage(Optional<Integer> pageNo, Optional<Integer> pageSize, Optional<String> sortByBankName) {
        Page<Bank> updateBankDetailsResponse = bankDao.findBankDetailsByPage(pageNo, pageSize, sortByBankName);
        BankResponse<Page<Bank>> bankResponse = new BankResponse();
        bankResponse.setData(updateBankDetailsResponse);
        bankResponse.setMsg("Bank Data Fetch By Page Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.OK);
        return bankResponse;
    }

    public BankResponse<?> sortBankDetailsByCode() {
        List<Bank> updateBankDetailsResponse = bankDao.sortBankDetailsByCode();
        BankResponse<List<Bank>> bankResponse = new BankResponse();
        bankResponse.setData(updateBankDetailsResponse);
        bankResponse.setMsg("Bank Data Fetch By Page Success...!!!");
        bankResponse.setHttpStatus(HttpStatus.OK);
        return bankResponse;
    }

    public void deleteBankByCode(String ifceCode)
    {
        bankDao.deleteBankByCode(ifceCode);
    }
}
