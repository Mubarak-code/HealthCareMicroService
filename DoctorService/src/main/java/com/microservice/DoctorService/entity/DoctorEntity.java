package com.microservice.DoctorService.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "doctor")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctor_id")
    private Long id;


    @Column(name = "doctor_name")
    @NotBlank(message = "doctor name cannot be blank")
    @Length(min = 1)
    private String doctorName;
    @Column(name = "doctor_number", nullable = false)
    @NotNull(message = "doctor number cannot be blank" )
    private Long doctorNumber;
    @Column(name = "doctor_phone_number", nullable = false)
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
    @NotEmpty(message = " EmployeeType cannot be empty")
    @Column(name = "employment_type", nullable = false)
    private String employmentType;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "doctor_patient")
    private List<PatientEntity> patients;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "doctor_nurse")
    private List<NurseEntity> nurs;

    public DoctorEntity() {

    }
    public DoctorEntity(@NotNull Long doctorNumber, @NotBlank String doctorName, @NotNull Long phoneNumber, @NotEmpty String employmentType) {
        this.doctorNumber = doctorNumber;
        this.doctorName = doctorName;
        this.phoneNumber = phoneNumber;
        this.employmentType = employmentType;

    }


    public DoctorEntity(@NotNull Long doctorNumber, @NotBlank String doctorName, @NotNull Long phoneNumber, String email , @NotEmpty String employmentType) {
        this.doctorNumber = doctorNumber;
        this.doctorName = doctorName;
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

    public List<PatientEntity> getPatients() {
        return patients;
    }

    public void setPatients(List<PatientEntity> patientEntities) {
        this.patients = patientEntities;
    }

    public List<NurseEntity> getNurses() {
        return nurs;
    }

    public void setNurses(List<NurseEntity> nurs) {
        this.nurs = nurs;
    }

    public void addPatient(PatientEntity patientEntity) {
        patients.add(patientEntity);
    }

    public void addNurse(NurseEntity nurseEntity) {
        nurs.add(nurseEntity);
    }

    public PatientEntity getPatient(Long patientId) {
        for (PatientEntity patientEntity : patients) {
            if(patientEntity.getId() == patientId)
                return patientEntity;
            else
                continue;
        }
        return null;
    }

    public NurseEntity getNurse(Long nurseId) {
        for (NurseEntity nurseEntity : nurs) {
            if(nurseEntity.getId() == nurseId)
                return nurseEntity;
            else
                continue;
        }
        return null;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public Long getDoctorNumber() {
        return doctorNumber;
    }
    public void setDoctorNumber(Long doctorNumber) {
        this.doctorNumber = doctorNumber;
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

