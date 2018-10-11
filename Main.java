public class Main{
  public static void main(String[] args) {
    Shinobi[] s = new Shinobi[3];
    s[0] = new Shinobi();
    s[0].setNoReg("012606");
    s[0].setNama("Uchiha Sasuke");
    s[0].setPeringkat("Genin");

    s[1] = new Shinobi();
    s[1].setNoReg("012607");
    s[1].setNama("Uzumaki Naruto");
    s[1].setPeringkat("Genin");

    s[2] = new Shinobi();
    s[2].setNoReg("012601");
    s[2].setNama("Haruno Sakura");
    s[2].setPeringkat("Chunin");
    System.out.println("Data Shinobi \n");
    for (Shinobi x:s ) {
      System.out.println("No Registrasi : "+x.getNoReg());
      System.out.println("Nama : "+x.getNama());
      System.out.println("peringkat : "+x.getNoReg());
      System.out.println();
    }
  }
}
