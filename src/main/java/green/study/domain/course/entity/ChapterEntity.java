package green.study.domain.course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chapter")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChapterEntity { // 회차 엔티티

    @Id
    @Column(nullable = false)
    private Long courseNo;

    @Column(nullable = false)
    private Long chapterNo;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int orderNo;





}
