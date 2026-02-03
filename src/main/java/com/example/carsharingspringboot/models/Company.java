

@Entity
class Company {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "owningCompany")
    private List<Car> ownedCars;
}