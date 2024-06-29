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

    @Schema(description = "KursWaluta identyfikator = enum[]", example = "10")
    @Enumerated(EnumType.STRING)
    private KursWaluta waluta;

    private String dataStart;

    private String dataStop;

    private Float kurs;

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
