//package com.example.demo.controller;
//
//import com.example.demo.model.Customer;
//import com.example.demo.model.Transaction;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Service
//public class RewardsServiceMock {
//
//    private static List<Transaction> transactions = new ArrayList<Transaction>();
//    private static long index;
//
//    static {
//
//        transactions.add( new Transaction(index++, new Customer(1, "John"), 100.0, "Purchase 1", new Date()) );
//        transactions.add( new Transaction(index++, new Customer(2, "Stevie"), 50.0, "Purchase 2", new Date()) );
//        transactions.add( new Transaction(index++, new Customer(3, "Lilly"), 120.0, "Purchase 3", new Date()) );
//
//    }
//
//
//    public List<Transaction> getAll() {
//        return transactions;
//    }
//
//}
