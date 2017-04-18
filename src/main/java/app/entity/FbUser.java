package app.entity;

import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "facebook_user")
public class FbUser {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    @NonNull
    private Long user_id;

    @Column(name = "first_name", columnDefinition = "VARCHAR(50)")
    @NonNull
    private String firstName;

    @Column(name = "keywords", columnDefinition = "JSON")
    private String keywords;

    @Column(name = "fb_data", columnDefinition = "JSON")
    private String fbData;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_added", columnDefinition = "TIMESTAMP DEFAULT NULL")
    private Date dateAdded;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_modified", columnDefinition = "TIMESTAMP DEFAULT NULL")
    private Date dateModified;
}
