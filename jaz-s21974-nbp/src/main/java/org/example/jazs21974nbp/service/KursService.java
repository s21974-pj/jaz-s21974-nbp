package org.example.jazs21974nbp.service;

import org.apache.coyote.BadRequestException;
import org.apache.coyote.Response;
import org.example.jazs21974nbp.model.Kurs;
import org.example.jazs21974nbp.model.KursWaluta;
import org.example.jazs21974nbp.repository.KursRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.parser.Entity;

@Service
public class KursService {

    private final KursRepository kursRepository;
    private final RestTemplate restTemplate;

    public KursService(RestTemplate restTemplate, KursRepository kursRepository){
        this.kursRepository = kursRepository;
        this.restTemplate = restTemplate;
    }

    public Kurs getKurs(String dataStart, String dataStop, KursWaluta waluta){
        try{
            restTemplate.getForEntity("http://api.nbp.pl/api/exchangerates/rates/a/" + waluta + "/" + dataStart + "/" + dataStop + "/", Entity.class);
            Kurs kurs = new Kurs();
            kursRepository.save(kurs);
            return kurs;
        }catch (BadRequestException badRequestException ex){

        }
    }


}
