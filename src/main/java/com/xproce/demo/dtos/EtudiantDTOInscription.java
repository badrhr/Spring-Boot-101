package com.xproce.demo.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EtudiantDTOInscription {
    private String name;
    private String email;
    private String password;
}
