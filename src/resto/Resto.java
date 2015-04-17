/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;

/**
 *
 * @author user
 */
public class Resto {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pelayan petugas1 = new pelayan();
        petugas1.setId("w33");
        try {
            petugas1.setNama("Ari");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        pelangan pembeli1 = new pelangan();
        pembeli1.setMeja(1);
        pembeli1.setNama("anto");
        pembeli1.setPesanan(1);
        
        harga set1 = new harga ();
        set1.setHargar(13000);
        set1.setMin(3000);
        set1.getHargar();
        set1.getMin();
        
        menu pack = new menu();
        pack.setMakanan(2);
        pack.setMinuman(2);
        pack.getMakanan();
        pack.getMinuman();
        
       struk struk1 = new struk();
       struk1.setPelangan(pembeli1);
       struk1.setKode("ka1");
       struk1.setPelayan(petugas1);
       struk1.setHarga(set1);
    }
      
       
    
    static void cetakstruk(struk a){
        System.out.println(a.getKode());
        System.out.println(a.getPelangan().getNama());
        System.out.println(a.getPelayan().getNama());
        System.out.println(a.getHarga());
        System.out.println(a.getMenu());
        int total = 2 * 13000 + 3000 * 2;
        System.out.println(+total);
    }
        
        
        
                
}
