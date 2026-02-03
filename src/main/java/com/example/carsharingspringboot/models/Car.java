

@Entity
class Car {
    @Id
    @GeneratedValue
    Long id;

    @Column(nullable=false)
    String name;

    @ManyToOne(mappedBy="ownedCars", optional=false)
    @JoinColumn
    private Company owningCompany;

    @OneToOne(mappedBy="rentedCar")
    private Customer renter;
}
