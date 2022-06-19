package com.pluriel.pms.data.entities;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tbl_potentielchambres")
@Builder
@Entity
public class PotentielChambres {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true,nullable = false)
    private String code;

    @Column(unique = true,nullable = false)
    private String description;

    @Column(columnDefinition="tinyint(1) default 1")
    private Boolean isActif;

}
