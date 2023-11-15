package id.ac.unand.fti.si.pbo;

public class MemberPlatinum extends Member implements CanDeposit, CanRequestCicilan, CanRequestDelivery {
    Integer saldo = 0;

    @Override
    public Integer deposit(Integer jumlahDeposit) {
        this.saldo = this.saldo + jumlahDeposit;
        return this.saldo;
    }

    @Override
    public Integer tarikTunai(Integer jumlahTarikTunai) {
        this.saldo = this.saldo - jumlahTarikTunai;
        return this.saldo;
    }

    @Override
    public Integer getSaldo() {
        return getSaldo();
    }

    public Integer cekSaldo(){
        return this.saldo;
    }

    @Override
    public Integer hitungTotalBayar(Integer jumlahBelanja) {
        if (jumlahBelanja >= 500000 && jumlahBelanja <= 1000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 3 / 100) ;
        } else if (jumlahBelanja > 1000000 && jumlahBelanja <= 7000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 5 / 100);
        } else if (jumlahBelanja > 7000000 && jumlahBelanja <= 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100) - 1;
        } else if (jumlahBelanja > 10000000) {
            this.totalBayar = jumlahBelanja - (jumlahBelanja * 7 / 100);
        } else {
            this.totalBayar = jumlahBelanja;
        }
        
        return this.totalBayar;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
        return hitungCicilanPerBulan(totalBelanja, jumlahBulan);
    }

    @Override
    public Integer hitungOngkir(Double jarakTujuan) {
        Integer hargaOngkir = 0;
        if (jarakTujuan >= 10.0){
            for (Integer i = 10; i < jarakTujuan; i++){
                hargaOngkir = hargaOngkir + 1000;
            }
        }
        return hargaOngkir;
    }
    
}
