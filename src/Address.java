public class Address {

    private String street;
    private String city;
    private String province;
    private String zipcode;

    public Address(String st, String cty, String prov, String zip){
        this.street = st;
        this.city = cty;
        this.province = prov;
        this.zipcode = zip;
    }

    public void getAdress(){
        System.out.println("Street : " + street
                + "\nCity : " + city
                + "\nProvince" + province
                + "\nZipcode : " + zipcode);
    }
}
