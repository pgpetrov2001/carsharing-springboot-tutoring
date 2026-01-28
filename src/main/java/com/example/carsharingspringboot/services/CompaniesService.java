



@Service
public class CompaniesService
{
    private final CompaniesRepository CR;
    public void createCompany(Company company)
    {
        Optional<Company> dbComp = CR.findById(company.getId());
        if(!dbComp.isEmpty())
        {
            throw new IllegalArgumentException("Company already exists");
        }
        CR.save(company);
    }
    public List<Company> retrieveAll()
    {
        //List<Company> lst = new List<>();
        return CR.findAll();
    }
    public Company retrieveOne(int id)
    {
        return CR.findCompanyById(id);
    }


}