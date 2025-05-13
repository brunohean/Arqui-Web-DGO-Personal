package pe.edu.upc.demo3165api.dtos;

import pe.edu.upc.demo3165api.entities.App;

import java.time.LocalDate;

public class LicenseDTO {
    private int idLicense;
    private String typeLicense;
    private double costLicense;
    private LocalDate startDateLicense;
    private LocalDate endDateLicense;
    private String providerLicense;
    private App app;

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
