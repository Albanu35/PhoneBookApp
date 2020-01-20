
package classpackage;

import Exceptii.NumarTelefonExceptie;

public class NrFix extends NrTel {

    public NrFix(String numarTelefon) {
        super(numarTelefon);
        validareNumar();
    }

    @Override
    public void validareNumar() {
        // Exceptie pentru introducerea unui numar diferit fata de cele clasice
        if (!numarTelefon.substring(0, 2).equals("02") && !numarTelefon.substring(0, 2).equals("03")) {
            throw new NumarTelefonExceptie("Numarul introdus nu este un numar de telefon fix!");
        }
    }

    @Override
    public int compareTo(Object o) {
        NrFix another = (NrFix) o;
        return numarTelefon.compareTo(another.numarTelefon);
    }

    public String toString() {
        return super.numarTelefon;
    }
}
