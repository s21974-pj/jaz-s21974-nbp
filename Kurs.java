package org.example.jazs21974nbp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "kurs")
public class Kurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Kurs identyfikator = Integer", example = "10")
    private Integer id;

    @Schema(description = "KursWaluta identyfikator = enum[AED, AFN, ALL, AMD, ANG, AOA , AWG, AUD, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BOV, BRL, BSD, BTN, BWP, BYN, BZD, CAD, CDF, CHE, CHF, CHW, CLF, CLP, CNY, COP, COU, CRC, CUP, CVE, CZK, DJF, DKK, DOP, DZD, EGP, ERN, ETB, EUR, FJD, FKP, GBP, GEL, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HTG, HUF, IDR, ILS, INR, IQD, IRR, ISK, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LYD, MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRU, MUR, MVR, MWK, MXN, MXV, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, SHP, SLL, SOS, SRD, SSP, STN, SVC, SYP, SZL, THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, USN, UYI, UYU, UYW, UZS, VES, VND, VUV, WST, XAF, XAG, XAU, XBA, XBB, XBC, XBD, XCD, XDR, XOF, XPD, XPF, XPT, XSU, XTS, XUA, XXX, YER, ZAR, ZMW, ZWL]", example = "PLN")
    @Enumerated(EnumType.STRING)
    private KursWaluta waluta;

    @Schema(description = "Kurs początkowa data zakresu w formacie YYYY-MM-DD = String", example = "2023-04-15")
    private String dataStart;

    @Schema(description = "Kurs końcowa data zakresu w formacie YYYY-MM-DD = String", example = "2021-05-11")
    private String dataStop;

    @Schema(description = "Kurs kurs walutowy = Float", example = "5.3213")
    private Float kurs;

    @Schema(description = "Kurs data wykonania zapytania = LocalDateTime", example = "")
    private LocalDateTime czas;

    public KursWaluta getWaluta() {
        return waluta;
    }

    public Float getKurs() {
        return kurs;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getCzas() {
        return czas;
    }

    public String getDataStart() {
        return dataStart;
    }

    public String getDataStop() {
        return dataStop;
    }

    public void setCzas(LocalDateTime czas) {
        this.czas = czas;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public void setDataStop(String dataStop) {
        this.dataStop = dataStop;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setKurs(Float kurs) {
        this.kurs = kurs;
    }

    public void setWaluta(KursWaluta waluta) {
        this.waluta = waluta;
    }

}
