package com.driver.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isPaymentCompleted;
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

    public boolean getisPaymentCompleted() {
        return isPaymentCompleted;
    }

    public void setisPaymentCompleted(boolean paymentCompleted) {
        isPaymentCompleted = paymentCompleted;
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
