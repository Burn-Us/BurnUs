package com.burnus.all.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import com.burnus.all.data.BaseTimeEntity;
import com.burnus.all.data.MemberRole;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Member" )
@Builder
public class MemberEntity extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int member_id;
	
	@Enumerated(EnumType.STRING)
	private MemberRole memberRole = MemberRole.USER;
	
	private String member_email;
	private String member_pw;
	private String member_nickname;
	private Date member_birth;
	private String member_tel;
	private String member_pic_url;
	private boolean blocked;
	private LocalDateTime unblocked_date;
	
	
	

}
