package com.kh.toy.member;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PersistentLogins {

	@Column(columnDefinition = "varchar(64 char) not null")
	private String username;
	
	@Id
	@Column(columnDefinition = "varchar(64 char)")
	private String series;

	@Column(columnDefinition = "varchar(64 char) not null")
	private String token;

	@Column(columnDefinition = "varchar(64 char) not null")
	private LocalDateTime lastUsed;
	
}
