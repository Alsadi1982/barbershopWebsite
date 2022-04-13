package ru.edu.barbershopwebsite.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

/**
 * Сущность клиента(пользователя, барбера, админа)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String password;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.ORDINAL)
    private UserRole role = UserRole.USER;

    @Override
    public String toString() {
        return login;
    }
//
//    public String getGreet() {
//        return firstName;
//    }
}

