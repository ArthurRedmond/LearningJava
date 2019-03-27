public class SpaService
{
    public SpaService()
    {
        serviceDesctiption = "---";
        price = 0;
    }
    private String serviceDesctiption;
    private double price;

    public void setServiceDesctiption(String service)
    {
        serviceDesctiption = service;
    }
    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }
    public String getServiceDescription()
    {
        return serviceDesctiption;
    }
    public double getPrice()
    {
        return price;
    }
}