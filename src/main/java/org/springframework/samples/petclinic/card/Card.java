package org.springframework.samples.petclinic.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;
import org.springframework.samples.petclinic.board.Board;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cards")
public class Card extends BaseEntity{

	@NotEmpty
	@Column(name = "color")
	private String color;
	
	@NotEmpty
	@Column(name = "suit")
	private String suit;
	
	@Min(value = 1)
	@Max(value = 13)
	@Column(name = "number")
	private Integer number;
	
	//Columna
	@Range(min=0,max=7)
    int xPosition;
	//Fila
    @Range(min=0,max=20)
    int yPosition;
    
	private Boolean isShowed;
	
	@ManyToOne
	Board board;
	
	public Integer getPositionXInPixels(Integer size) {
    	return (xPosition)*size;
    }
    
    public Integer getPositionYInPixels(Integer size) {
    	return (yPosition)*size;
    }
    
   
}
