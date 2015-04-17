/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resto;

/**
 *
 * @author user
 */
public final class pelayan {
    private String nama;
    private pelangan meja;
    private String id;

    
     public pelayan() {
    }

    public pelayan( String nama) throws Exception {
        
        try {
            this.setNama(nama);
        } catch (Exception e) {
            throw e;
        }
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama)throws Exception {
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("Nama tidak boleh "
                        + "mengandung angka"); }
        }
            this.nama = nama;
    }

    /**
     * @return the meja
     */
    public pelangan getMeja() {
        return meja;
    }

    /**
     * @param meja the meja to set
     */
    public void setMeja(pelangan meja) {
        this.meja = meja;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
