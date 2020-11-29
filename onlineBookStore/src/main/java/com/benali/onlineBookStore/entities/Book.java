package com.benali.onlineBookStore.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_book")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String description;
	@Column(name="unit_price")
	private double unitePrice;
	@Column(name="image_url")
	private String imageURL;
	private boolean active;
	@Column(name="units_in_stock")
	private int unitsInStock;
	@Column(name="date_created")
	private Date dateCreated;
	@Column(name="last_updated")
	private Date lastCreated;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
}
