package com.onlinebookstore.dao;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.Mapping;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString

@Table(name = "tbl_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sku;
	private String name;
	private String description;
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	@Column(name = "img_url")
	private String imageUrl;
	private boolean active;
	@Column(name = "units_in_stock)")
	private int unitsOfStock;
	@Column(name = "date_created")
	private Date createOn;
	@Column(name = "last_updated")
	private Date updateOn;
	
	@ManyToOne
	@JoinColumn(name="category_id", nullable=false)
	private BookCategory bookCategory;
}
