class LaptopTester{               //subclass or child class or derived class...
 
  public static void main(String a[])
  {   
     Hp1 hp = new Hp1();
     hp.price=42900;
     hp.processor="Ryzen";
     hp.modelNumber="LAPTOP-CQR8B6A1";
     hp.storage="512 GB";
     String tore=hp.store(); 
     System.out.println(tore);
	 hp.display();
  }
 
 }