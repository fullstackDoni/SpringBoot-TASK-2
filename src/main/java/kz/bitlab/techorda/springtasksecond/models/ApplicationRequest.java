package kz.bitlab.techorda.springtasksecond.models;


import jakarta.persistence.*;
import kz.bitlab.techorda.springtasksecond.repository.AppReq;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "t_applicationrequest")
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "userName")
    String userName;
    @Column(name = "courseName")
    String courseName;
    @Column(name = "commentary")
    String commentary;
    @Column(name = "phone")
    String phone;
    @Column(name = "handler")
    boolean handled;


    public static void save(ApplicationRequest request) {
    }
}
