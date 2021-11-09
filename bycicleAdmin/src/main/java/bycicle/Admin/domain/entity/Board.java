package bycicle.Admin.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity(name="REPORTLIST")//신고 리스트
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class) /* JPA에게 해당 Entity는 Auditiong 기능을 사용함을 알립니다. */
public class Board {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(length = 10 ,nullable = false)
    private String title;
    
    @Column(length = 10, nullable = false)
    private String manager;

    @Column(length = 100, nullable = false)
    private String location;
    
    @Column(length =100, nullable = false)
    private String admin;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Builder
    public Board(Long id, String manager, String location, String content, String admin, String title) {
        this.id = id;
        this.manager = manager;
        this.location = location;
        this.content = content;
        this.admin = admin;
        this.title = title;
    }
}