package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ATMTest {

    ATM atm;

    @BeforeClass
    public void setUp() {
        atm = new ATM();
        atm.setName("Juara Coding");
        atm.setSaldo(1000);
    }

    @Test
    public void testGetName(){
        String expected = "Juara Coding";
        String actual = atm.getName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetSaldo(){
        Double expected = 1000.0;
        Double actual = atm.lihatSaldo();
        Assert.assertEquals(expected, actual);
        System.out.println("Saldo Awal Anda : ");
        System.out.println("Rp. " + actual);
    }

    @Test
    public void testSetorUang(){
        atm.setorUang(5000);
        double expected = 6000;
        System.out.println("isi Saldo anda : ");
        System.out.println("Rp. " + atm.lihatSaldo());
    }

    @Test
    public void testSetorUangNegatif(){
        atm.setorUang(0);
    }

    @Test
    public void testTarikUang(){
        atm.tarikUang(4000);
        System.out.println("sisa Saldo anda : ");
        System.out.println("Rp. " + atm.lihatSaldo());
    }

    @Test
    public void testTarikUangLebihdariSaldo(){
        atm.tarikUang(7000);
    }

    @Test
    public void testTarikUangNegatif(){
        atm.tarikUang(0);
    }

}
