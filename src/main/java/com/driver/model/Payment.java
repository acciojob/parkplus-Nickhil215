package com.driver.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean paymentComplated;
    @Enumerated(value = EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToOne
    @JoinColumn
    private Reservation Reservation;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaymentComplated() {
        return paymentComplated;
    }

    public void setPaymentComplated(boolean paymentComplated) {
        this.paymentComplated = paymentComplated;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public com.driver.model.Reservation getReservation() {
        return Reservation;
    }

    public void setReservation(com.driver.model.Reservation reservation) {
        Reservation = reservation;
    }
}
