package com.binhtt.book.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDate createdAt;
    private LocalDate expiresAt;
    private LocalDate validatedAt;

    @ManyToOne
    @Column(name="userId", nullable = false)
    private User user;
}
