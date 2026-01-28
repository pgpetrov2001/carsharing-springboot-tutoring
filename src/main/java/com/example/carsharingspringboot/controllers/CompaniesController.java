

@RestController
@RequestMapping("/companies")
public class CompaniesController
{
    @PostMapping("/")
    public void createCompany(@RequestBody Company company)
    {
        companiesService.createCompany(company);
    }

    @GetMapping("/");
    public List<Company> retriveAll()
    {
        return companiesService.retrieveAll();
    }

    @GetMapping("/{companyId}")
    public company retrieveOne(@PathVariable("companyId") int compId)
    {
        return companiesService.retrieveOne(compId);
    }

}