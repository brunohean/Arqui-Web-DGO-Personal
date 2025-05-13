package pe.edu.upc.demo3165api.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "License")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLicense;

    @Column(name = "typeLicense", nullable = false,length = 15)
    private String typeLicense;

    @Column(name = "costLicense",nullable = false)
    private double costLicense;

    @Column(name = "startDateLicense",nullable = false)
    private LocalDate startDateLicense;

    @Column(name = "endDateLicense",nullable = false)
    private LocalDate endDateLicense;

    @Column(name = "providerLicense",length =30 ,nullable = false)
    private String providerLicense;

    @ManyToOne
    @JoinColumn(name = "idApp")
    private App app;

    public License() {
    }

    public License(int idLicense, String typeLicense, double costLicense, LocalDate startDateLicense, LocalDate endDateLicense, String providerLicense, App app) {
        this.idLicense = idLicense;
        this.typeLicense = typeLicense;
        this.costLicense = costLicense;
        this.startDateLicense = startDateLicense;
        this.endDateLicense = endDateLicense;
        this.providerLicense = providerLicense;
        this.app = app;
    }

    public int getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(int idLicense) {
        this.idLicense = idLicense;
    }

    public String getTypeLicense() {
        return typeLicense;
    }

    public void setTypeLicense(String typeLicense) {
        this.typeLicense = typeLicense;
    }

    public double getCostLicense() {
        return costLicense;
    }

    public void setCostLicense(double costLicense) {
        this.costLicense = costLicense;
    }

    public LocalDate getStartDateLicense() {
        return startDateLicense;
    }

    public void setStartDateLicense(LocalDate startDateLicense) {
        this.startDateLicense = startDateLicense;
    }

    public LocalDate getEndDateLicense() {
        return endDateLicense;
    }

    public void setEndDateLicense(LocalDate endDateLicense) {
        this.endDateLicense = endDateLicense;
    }

    public String getProviderLicense() {
        return providerLicense;
    }

    public void setProviderLicense(String providerLicense) {
        this.providerLicense = providerLicense;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
