package classpackage;

import Exceptii.NumarTelefonExceptie;

public class NrMobil extends NrTel {

    public NrMobil(String numarTelefon) {
        super(numarTelefon);
        validareNumar();
    }

    @Override
    public void validareNumar() {
        // Exceptie pentru introducerea unui numar diferit fata de cele clasice
        if (!numarTelefon.substring(0, 2).equals("07")) {
            throw new NumarTelefonExceptie("Numarul introdus nu este un numar de telefon mobil!");
        }
    }

    @Override
    public int compareTo(Object o) {
        NrMobil another = (NrMobil) o;
        return numarTelefon.compareTo(another.numarTelefon);
    }

    public String toString() {
        return super.numarTelefon;
    }
}

