package com.juaracoding;

public class ATM {
    private double saldo;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaldo(double saldoAwal) {
        if (saldoAwal > 0) {
            this.saldo = saldoAwal;
        } else {
            throw new IllegalArgumentException("Saldo harus lebih dari 0");
        }
    }

    public double lihatSaldo() {
        return saldo;
    }
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
}
