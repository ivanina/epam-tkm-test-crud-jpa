package app.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fbuser")
public class FbUserSimple implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    @NonNull
    private String firstName;

    @Column(name = "data", columnDefinition = "VARCHAR(255)")
    @NonNull
    private String data;
}
