package com.burnus.all.data;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@MappedSuperclass
@Data
public class BaseTimeEntity {
	
	 @Column(name = "createdAt")
	    private LocalDateTime createdAt; //생성
	    @Column(name = "modifiedAt")
	    private LocalDateTime modifiedAt; //수정

	    //PrePersist -> db 들어가기 전에 check
	    //JPA 엔티티가 INSERT 되기 전에 실행될 메서드 지정
	    @PrePersist
	    public void prePersist() {
	        this.createdAt = LocalDateTime.now();
	    }

}
