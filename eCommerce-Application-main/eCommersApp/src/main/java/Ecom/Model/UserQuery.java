package Ecom.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "User_Query")
public class UserQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "query_id")
    private long queryId;

    @Column(name = "user_name")
    @NotBlank(message = "user name is must")
    private String userName;

    @Column(name = "user_mail")
    @NotBlank(message = "user email is must")
    @Email
    private String userMail;


    @Column(name = "user_query")
    @Size(max = 100)
    private String userQuery;

}
