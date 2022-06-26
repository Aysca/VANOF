/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanof;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;;


public class Jadwal {
    private SimpleIntegerProperty no;
    private SimpleStringProperty hari;
    private SimpleStringProperty posyandu;
    private SimpleStringProperty alamat;
    
    public Jadwal(){
        this(0, "", "", "");
    }

    public Jadwal(int no, String hari, String posyandu, String alamat) {
        this.no = new  SimpleIntegerProperty(no);
        this.hari = new SimpleStringProperty(hari);
        this.posyandu = new SimpleStringProperty(posyandu);
        this.alamat = new SimpleStringProperty(alamat);
        
    }

    public int getNo() {
        return no.get();
    }

    public void setNo(int nm) {
        this.no = no;
    }

    public String getHari() {
        return hari.get();
    }

    public void setHari(String nm) {
        this.hari.set(nm);
    }

    public String getPosyandu() {
        return posyandu.get();
    }

    public void setPosyandu(String nm) {
        this.posyandu .set(nm);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String nm) {
        this.alamat.set(nm);
    }
    
    
}
