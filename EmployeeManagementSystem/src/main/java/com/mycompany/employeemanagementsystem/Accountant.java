/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */
public class Accountant extends Employee implements PaidLeavable {

    private int leaveQuota;

    public String applyLeave() {
        if (this.leaveQuota > 1) {
            this.leaveQuota = this.leaveQuota - 1;
            return ("Usulan cuti berbayar " + this.nama + " disetujui")
        } else {
            return ("Kuota cuti berbayar " + this.nama + " tidak mencukupi")
        }
    }
}
