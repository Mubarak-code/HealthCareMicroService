package com.microservice.NurseService.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "nurse")
public class Nurse  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nurse_id")
    private Long id;

    @Column(name = "nurse_name", nullable = false)
    @NotBlank(message = "nurse name cannot be blank")
    @Length(min = 1)
    private String nurseName;
    @Column(name = "nurse_number", nullable = false)
    @NotNull(message = "nurse number cannot be blank" )
    private Long nurseNumber;
    @Column(name = "nurse_phone_number", nullable = false)
    @NotNull(message = "Phone number must be entered")
    private Long phoneNumber;
    @Column(name = "email_address", nullable = true)
    @Email(message = "e-mail should be valid")
    private String emailAddress;

    /*
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "employee_id", nullable = true)
    private Employee employee;

    */
    @NotEmpty(message = " EMmploye type cannot be empty")
    @Column(name = "employment_type", nullable = false)
    private String employmentType;


    public Nurse() {

    }
    public Nurse(@NotNull Long nurseNumber, @NotBlank String nurseName,@NotNull Long phoneNumber, @NotEmpty String employmentType) {
        this.nurseNumber = nurseNumber;
        this.nurseName = nurseName;
        this.phoneNumber = phoneNumber;
        this.employmentType = employmentType;

    }



    public Nurse(@NotNull Long nurseNumber, @NotBlank String nurseName,@NotNull Long phoneNumber, String email ,@NotEmpty String employmentType) {
        this.nurseNumber = nurseNumber;
        this.nurseName = nurseName;
        this.phoneNumber = phoneNumber;
        this.employmentType = employmentType;
        this.emailAddress = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNurseName() {
        return nurseName;
    }
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }
    public Long getNurseNumber() {
        return nurseNumber;
    }
    public void setNurseNumber(Long nurseNumber) {
        this.nurseNumber = nurseNumber;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    /*
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    */
    public String getEmploymentType() {
        return employmentType;
    }
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }




}
