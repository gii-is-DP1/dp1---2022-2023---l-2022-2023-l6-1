package org.springframework.samples.petclinic.deck;

import org.springframework.samples.petclinic.model.BaseEntity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;



import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="deck")
public class Deck extends BaseEntity{

    @Min(value = 1)
    @Max(value = 2)
    @Column(name = "numeroColumna")
    private Integer numeroColumna;
    
}