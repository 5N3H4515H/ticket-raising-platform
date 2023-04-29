package com.major.project.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {

    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        System.out.println(encoder.encode("ad11234"));
//        System.out.println(encoder.encode("tl11234"));
//        System.out.println(encoder.encode("ad21234"));
//        System.out.println(encoder.encode("tl21234"));
        System.out.println(encoder.encode("aloksharma"));

        /*System.out.println(encoder.matches("12345678","$2a$10$plGVQRlY2err71ku/iDBAO2hjeD0.nltuFnd37dTLnfTA7nf4QL2."));
        System.out.println(encoder.matches("12345678","$2a$10$eVUGsyFRvvzPCSsfEz3EIe9hOsf0t2.Wub819lUPmEM0cwy2yyt3q"));
        System.out.println(encoder.matches("12345678","$2a$10$jH/J2pSqfddkaatBEhlxEe755nqKMIcqrAuCvzB6EWw94fyYp7.W2"));
        System.out.println(encoder.matches("12345678","$2a$10$j0cfcAAcCNQSLh1LJX4mCevq9j1bR1a0TguL882SYAubykpSWdJiW"));*/

    }

}
