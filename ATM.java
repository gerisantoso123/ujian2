package com.juaracoding;

public class ATM {
    private double saldo;

    // Konstruktor untuk menginisialisasi saldo awal
    public ATM(double saldoAwal) {
        if (saldoAwal < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh kurang dari 0");
        }
        this.saldo = saldoAwal;
    }
    // Metode untuk melihat saldo saat ini
    public double lihatSaldo() {
        return saldo;
    }
    // Metode untuk menyetor uang ke dalam ATM
    public void setorUang(double jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah setoran harus lebih besar dari 0");
        }
        saldo += jumlah;
    }
    // Metode untuk menarik uang dari ATM
    public void tarikUang(double jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            throw new IllegalArgumentException("Jumlah penarikan tidak valid");
        }
        saldo -= jumlah;
    }
}