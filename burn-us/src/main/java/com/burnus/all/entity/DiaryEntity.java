package com.burnus.all.entity;

import com.burnus.all.data.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "Diary" )
@Builder
public class DiaryEntity extends BaseTimeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diary_id;
	
	@Column(length = 200)
	private String diary_title;
	
	private String diary_content;
	
	//작성자
	@ManyToOne
	private MemberEntity author;
	
	//좋아요
	
	//신고
	
	//댓글
	
	

}
