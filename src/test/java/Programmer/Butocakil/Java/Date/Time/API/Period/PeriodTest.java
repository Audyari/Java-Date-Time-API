package Programmer.Butocakil.Java.Date.Time.API.Period;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    void create() {

        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);
        Period period5 = Period.of(10, 10, 10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);

    }

    @Test
    void get() {

        Period period = Period.of(10, 10, 10);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

    @Test
    void between() {

        Period period = Period.between(
                LocalDate.of(1985, 10, 10),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

    @Test
    void calculateAge() {
        // Kasus tes: Tanggal lahir 24 Januari 1983
        LocalDate tanggalLahir = LocalDate.of(1983, 1, 24);
        LocalDate tanggalSekarang = LocalDate.of(2024, 7, 9);

        int tahunExpected = 41;
        int bulanExpected = 5;
        int hariExpected = 15;

        int[] usiaSesungguhnya = hitungUsia(tanggalLahir, tanggalSekarang);

        System.out.println("Usia yang diharapkan: " + tahunExpected + " tahun, " + bulanExpected + " bulan, " + hariExpected + " hari");
        System.out.println("Usia yang dihitung: " + usiaSesungguhnya[0] + " tahun, " + usiaSesungguhnya[1] + " bulan," +
                " " + usiaSesungguhnya[2] + " hari");

        Assertions.assertArrayEquals(new int[]{tahunExpected, bulanExpected, hariExpected}, usiaSesungguhnya);
    }

    private int[] hitungUsia(LocalDate tanggalLahir, LocalDate tanggalSekarang) {
        Period periode = Period.between(tanggalLahir, tanggalSekarang);
        return new int[]{periode.getYears(), periode.getMonths(), periode.getDays()};
    }
}