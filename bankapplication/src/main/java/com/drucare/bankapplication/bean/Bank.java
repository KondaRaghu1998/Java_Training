package com.drucare.bankapplication.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bank implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bankId;
    @Column(name = "bankname")
    private String bankName;
    @Column(name = "address")
    private String bankAddress;
    @Column(name = "branch")
    private String branch;
    @Column(name = "ifcecode")
    private String ifceCode;

    @CreationTimestamp
    @Column(name = "creationdate",updatable = false)
    private Timestamp creationDate;
    @UpdateTimestamp
    @Column(name = "updationdate")
    private Timestamp updationDate;

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", branch='" + branch + '\'' +
                ", ifceCode='" + ifceCode + '\'' +
                ", updationDate=" + updationDate +
                '}';
    }
}
