package se.lexcion.kenan.booklender.model;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class LibraryUser {

    private int userId;
    private LocalDate regDate;
    private String name;
    private String email;

    public LibraryUser(LocalDate regDate, String name, String email) {
        this.regDate = regDate;
        setName(name);
        setEmail(email);


    }

}
