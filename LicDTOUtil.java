class LicDTOUtil{

 public static void main(String a[])
 {
    LicDTO lic = new LicDTO();
	lic.setPolicyId(123L);
	lic.setCustomerName("Raju");
	lic.setYear(2021);
	System.out.println(lic.getPolicyId()+"\n"+lic.getCustomerName()+"\n"+lic.getYear());
 }

}