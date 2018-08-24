public class CustomerMilkTea extends Customer{
    public String HomeAddress;
    public String OfficeAddress;
    public Integer PointDiscount;

    public CustomerMilkTea(Integer CustomerID, String CustomerName, String Address, Integer Phone, String HomeAddress,
                           String OfficeAddress, Integer PointDiscount) {
        super(CustomerID, CustomerName, Address, Phone);
        this.HomeAddress = HomeAddress;
        this.OfficeAddress = OfficeAddress;
        this.PointDiscount = PointDiscount;
    }

    public String GetInfo (CustomerMilkTea customer){
        String name = "Customer: "+ customer.CustomerName;
        String address = customer.HomeAddress + "," + customer.OfficeAddress;
        Integer Point = customer.PointDiscount;
        String fullInfo = name + "-" + address + "-" + Point;
        return fullInfo;
    }

    public float CalculatorDiscount (Customer customer, int numDiscount){
        if(customer.Address == "Q9"){
            return numDiscount/50;
        }
        return numDiscount/100;
    }
}
