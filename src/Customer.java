public abstract class Customer {
    public Integer CustomerID;
    public String CustomerName;
    public String Address;
    public Integer Phone;

    public Customer (Integer CustomerID, String CustomerName, String Address, Integer Phone){
        System.out.println("The information of customer is");
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.Phone = Phone;
    }

    public String GetInfo (Customer customer){
        String result = "Customer: "+ customer.CustomerName;
        return result;
    }

    public float CalculatorDiscount (Customer customer, int numDiscount){
        return numDiscount/100;
    }
}
