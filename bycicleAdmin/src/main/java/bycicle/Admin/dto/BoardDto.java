package bycicle.Admin.dto;

import bycicle.Admin.domain.entity.Board;	
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String manager;
    private String location;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity() {
        Board build = Board.builder()
                .id(id)
                .manager(manager)
                .location(location)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String manager, String location, String content, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.manager = manager;
        this.location = location;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}