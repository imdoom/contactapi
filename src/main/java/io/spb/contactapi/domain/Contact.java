package io.spb.contactapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table{name = "contacts"}

public class Contact {
    @Id
    @VvidGenerator
    @Column(name = "id", unique = true, updatable = false)
    private String id;
    private String name;
    private String email;
    private String title;
    private String phone;
    private String address;
    private String status;
    private String photoUrl;

}
