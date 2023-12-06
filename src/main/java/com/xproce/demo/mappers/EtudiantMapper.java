package com.xproce.demo.mappers;

import com.xproce.demo.dao.entities.Etudiant;
import com.xproce.demo.dtos.EtudiantDTOInscription;
import com.xproce.demo.dtos.EtudiantDTOScolarite;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

@AllArgsConstructor
public class EtudiantMapper {

    private ModelMapper modelMapper;

    public Etudiant fromEtudiantDTOScolariteToEtudiant(EtudiantDTOScolarite etudiant) {
        return this.modelMapper.map(etudiant, Etudiant.class);
    }

    public EtudiantDTOScolarite fromEtudiantToEtudiantDTOScolarite(Etudiant etudiant) {
        return this.modelMapper.map(etudiant, EtudiantDTOScolarite.class);
    }

    public Etudiant fromEtudiantDTOInscriptionToEtudiant(EtudiantDTOInscription etudiant) {
        return this.modelMapper.map(etudiant, Etudiant.class);
    }

    public EtudiantDTOInscription fromEtudiantToEtudiantDTOInscription(Etudiant etudiant) {
        return this.modelMapper.map(etudiant, EtudiantDTOInscription.class);
    }
}
