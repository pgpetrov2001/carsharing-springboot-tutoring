
@Entity
class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(mappedBy = "renter")
    @JoinColumn
    private Car rentedCar;
}