package com.bsb.taller.models.entity;

import com.bsb.taller.utils.constants.DateFormatConstants;
import com.bsb.taller.utils.emuns.StatusOrder;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.util.List;

@Entity @Data @Builder
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "amount_Payments")
    @NonNull  @Min(1)
    private Integer amountPayments;
    //estado de la orden
    @Enumerated(EnumType.STRING)
    private StatusOrder status;
    @Column(name = "date_admission")
    @DateTimeFormat (iso = DateTimeFormat.ISO.DATE, pattern = DateFormatConstants.DATE_TIME_FORMAT)
    private LocalDate dateAdmission;
    @Column(name = "date_repair")
    @DateTimeFormat (iso = DateTimeFormat.ISO.DATE, pattern = DateFormatConstants.DATE_FORMAT)
    private LocalDate dateRepair;
    @Column(name = "date_payment")
    @DateTimeFormat (iso = DateTimeFormat.ISO.DATE, pattern = DateFormatConstants.DATE_TIME_FORMAT)
    private LocalDate datePayment;
    @Column(name = "form_payment")
    private String formPayment;
    private Double total;
    private Long mileage;
    private String fuelLevel;
    private String cardType;
    /*  TODO:Relaxations */
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @OneToMany(mappedBy = "order")
    private List<Labour> labours;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Employee receptionist;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Employee aadministrative;
}
