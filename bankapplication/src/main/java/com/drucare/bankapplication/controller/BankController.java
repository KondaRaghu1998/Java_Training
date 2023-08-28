package com.drucare.bankapplication.controller;

import com.drucare.bankapplication.bean.Bank;
import com.drucare.bankapplication.response.BankResponse;
import com.drucare.bankapplication.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/bankapp")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping(value = "/insertBank")
    public ResponseEntity<?> saveBank(@RequestBody Bank bank) {
        BankResponse<?> bankResponse = bankService.saveBank(bank);
        return new ResponseEntity<>(bankResponse, HttpStatus.CREATED);
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<?> fetchAllBankDetails() {
        BankResponse<?> fetchAllBankDetailsResponse = bankService.fetchAllBankDetails();
        return new ResponseEntity<>(fetchAllBankDetailsResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/findByBankName")
    public ResponseEntity<?> findIfscCodeDetailsByBank(@RequestParam String bankName) {
        BankResponse<?> ifscCodeDetailsByBankResponse = bankService.findIfscCodeDetailsByBank(bankName);
        return new ResponseEntity<>(ifscCodeDetailsByBankResponse, HttpStatus.OK);
    }

    @PutMapping(value = "/updateBankDetails")
    public ResponseEntity<?> updateBankDetails(@RequestBody Bank bank) {
        BankResponse<?> updateBankDetailsResponse = bankService.updateBankDetails(bank);
        return new ResponseEntity<>(updateBankDetailsResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/findByPage")
    public ResponseEntity<?> findBankDetailsByPage(@RequestParam Optional<Integer> pageNo, @RequestParam Optional<Integer> pageSize, @RequestParam Optional<String> sortByBankName) {
        BankResponse<?> bankDetailsByBankResponse = bankService.findBankDetailsByPage(pageNo, pageSize, sortByBankName);
        return new ResponseEntity<>(bankDetailsByBankResponse, HttpStatus.OK);
    }

    @GetMapping(value = "/sortBankByCode")
    public ResponseEntity<?> sortBankDetailsByCode() {
        BankResponse<?> bankDetailsByBankResponse = bankService.sortBankDetailsByCode();
        return new ResponseEntity<>(bankDetailsByBankResponse, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteByCode/{ifceCode}")
    public ResponseEntity<String> deleteBankByCode(@PathVariable String ifceCode) {
        bankService.deleteBankByCode(ifceCode);
        return new ResponseEntity<>("Bank Details Deleted By Ifsc code Success...!!!", HttpStatus.OK);
    }


}
