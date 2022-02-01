package ru.bank.queue.model;

public class Client {

    private String fio;
    private String passportNumber;
    private String clientId;

    public Client (String fio, String passportNumber, String clientId){
        this.fio = fio;
        this.passportNumber = passportNumber;
        this.clientId = clientId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fio='" + fio + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", clientId='" + clientId + '\'' +
                '}';
    }
}
