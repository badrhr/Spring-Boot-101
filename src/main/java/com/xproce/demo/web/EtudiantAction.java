package com.xproce.demo.web;

import com.xproce.demo.dao.entities.Etudiant;
import com.xproce.demo.dtos.EtudiantDTOInscription;
import com.xproce.demo.dtos.EtudiantDTOScolarite;
import com.xproce.demo.mappers.EtudiantMapper;
import com.xproce.demo.service.EtudiantManager;
import org.modelmapper.ModelMapper;

public class EtudiantAction {


    public EtudiantDTOScolarite inscription(EtudiantDTOInscription etudiantDTOInscription) {
        ModelMapper modelMapper = new ModelMapper();
        EtudiantMapper etudiantMapper = new EtudiantMapper(modelMapper);
        EtudiantManager etudiantManager = new EtudiantManager();
        Etudiant etudiant = etudiantManager.inscription(etudiantDTOInscription);
        return etudiantMapper.fromEtudiantToEtudiantDTOScolarite(etudiant);

    }
}
