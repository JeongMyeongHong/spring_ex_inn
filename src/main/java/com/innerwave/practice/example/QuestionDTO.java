package com.innerwave.practice.example;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name="Questions")
public class QuestionDTO {
    @Id @Column(name="question_id") @GeneratedValue
    private long questionID;

    @Column(name = "written_date")
    @CreationTimestamp
    private Timestamp writtenDate;

    @Column(name = "edited_date")
    @UpdateTimestamp
    private Timestamp editedDate;

    @Column @NotNull
    private String question;
}
