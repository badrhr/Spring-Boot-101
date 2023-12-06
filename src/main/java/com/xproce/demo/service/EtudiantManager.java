package com.xproce.demo.service;

import com.xproce.demo.dao.entities.Etudiant;
import com.xproce.demo.dao.repositories.EtudiantRepository;
import com.xproce.demo.dtos.EtudiantDTOInscription;
import com.xproce.demo.mappers.EtudiantMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EtudiantManager {

    @Autowired
    EtudiantRepository etudiantRepository;
    ModelMapper modelMapper = new ModelMapper();
    EtudiantMapper etudiantMapper = new EtudiantMapper(modelMapper);

    public Etudiant inscription(EtudiantDTOInscription etudiantDTOInscription) {

        Etudiant etudiant = this.etudiantRepository.findByEmail(etudiantDTOInscription.getEmail());
        if (etudiant == null) {
            Etudiant etudiantentity = etudiantMapper.fromEtudiantDTOInscriptionToEtudiant(etudiantDTOInscription);
            return this.etudiantRepository.save(etudiantentity);
        }
        return null ;
    }
}
