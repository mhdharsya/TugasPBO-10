package id.ac.unand.fti.si.pbo;

public class MemberGold extends Member implements CanRequestCicilan, CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 2/100); }
        else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 4/100); }
        else if (jumlahBelanja > 7000000){
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 6/100); }
        else{
        this.totalBayar = jumlahBelanja; }

        return this.totalBayar;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
        Integer cicilan = totalBelanja/jumlahBulan;
        return cicilan;
    }

    @Override
    public Integer hitungOngkir(Double jarakTujuan) {
        Integer hargaOngkir = 0;
        if (jarakTujuan >= 7.0){
            for (Integer i = 7; i < jarakTujuan; i++){
                hargaOngkir = hargaOngkir + 1000;
            }
        }
        return hargaOngkir;
    }
}
