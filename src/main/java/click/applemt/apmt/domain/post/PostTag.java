package click.applemt.apmt.domain.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@Table(name = "posts_tag")
public class PostTag {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "posts_tag_id")
    private Long id;
    @JsonIgnore
    @ManyToOne(fetch = LAZY) //단방향 연관관계로 설계
    @JoinColumn(name = "posts_id")
    private Post post;
    @JsonIgnore
    @ManyToOne(fetch = LAZY) //단방향 연관관계로 설계
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
