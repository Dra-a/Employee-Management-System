/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author ACER
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Freelancer {
    protected int contractDuration;
    protected LocalDate contractEndDate;

    public double calculateContractPayment() {
        double bulanDurasi = this.contractDuration/30.0;
        int roundedBulanDurasi = (int) Math.ceil(bulanDurasi);
        return this.salary * roundedBulanDurasi;
    }

    public String checkContractStatus() {
        if (LocalDate.now() > this.contractEndDate) {
            return "Kontrak telah berakhir";
        } else {
            Locale indo = Locale.forLanguageTag("id-ID");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String hari = this.contractEndDate.getDayOfWeek().getDisplayName(TextStyle.FULL, indo);
            String tanggal = this.contractEndDate.format(formatter);
            return ("Kontrak aktif hingga " + hari + ", " + tanggal)
        }
    }
}
