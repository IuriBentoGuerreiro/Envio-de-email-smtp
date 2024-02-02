package com.ms.email.models;
import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Table(name = "TB_EMAIL")
@Entity
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;
    //nhwwlucpfokcxkus
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailfrom;
    private String emailto;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

}
