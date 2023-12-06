package com.xproce.demo;

import com.xproce.demo.dao.entities.Etudiant;
import com.xproce.demo.dao.repositories.EtudiantRepository;
import com.xproce.demo.dtos.EtudiantDTOInscription;
import com.xproce.demo.dtos.EtudiantDTOScolarite;
import com.xproce.demo.mappers.EtudiantMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner  commandLineRunner (EtudiantRepository etudiantRepository){
        return args -> {
            ModelMapper modelMapper = new ModelMapper();
            EtudiantMapper etudiantMapper =  new EtudiantMapper(modelMapper);
            EtudiantDTOInscription etudiantDTOInscription = EtudiantDTOInscription.builder()
                    .email("x@gmail.com")
                    .name("x")
                    .password("123")
                    .build();

            Etudiant etudiant = etudiantMapper.fromEtudiantDTOInscriptionToEtudiant(etudiantDTOInscription);
            Etudiant etudiantAdded = etudiantRepository.save(etudiant);
            EtudiantDTOScolarite etudiantDTOScolarite = etudiantMapper.fromEtudiantToEtudiantDTOScolarite(etudiantAdded);
            System.out.println(etudiantDTOScolarite);
        };
    }


}
