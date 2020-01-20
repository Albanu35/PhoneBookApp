package classpackage;

import Exceptii.ContactExistentException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agenda implements Serializable{

    public enum CriteriuOrdonare {
        DUPA_NUME, DUPA_PRENUME, DUPA_DATA_NASTERII, DUPA_NUMAR_TELEFON
    }

    public Agenda(List<Contact> listaContacte) {
        map.put(CriteriuOrdonare.DUPA_NUME, dupaNume);
        map.put(CriteriuOrdonare.DUPA_PRENUME, dupaPrenume);
        map.put(CriteriuOrdonare.DUPA_DATA_NASTERII, dupaDataNasterii);
        map.put(CriteriuOrdonare.DUPA_NUMAR_TELEFON, dupaNumarTelefon);
    }

    public Comparator<Contact> dupaNume = (Contact c1, Contact c2) -> c1.getNume().compareToIgnoreCase(c2.getNume());
    public Comparator<Contact> dupaPrenume = (Contact c1, Contact c2) -> c1.getPrenume().compareToIgnoreCase(c2.getPrenume());
    public Comparator<Contact> dupaDataNasterii = (Contact c1, Contact c2) -> c1.getDataNasterii().compareTo(c2.getDataNasterii());
    public Comparator<Contact> dupaNumarTelefon = (Contact c1, Contact c2) -> c1.getNrTel().toString().compareTo(c2.getNrTel().toString());

    public static Predicate<Contact> predicate = (c) -> true;

    public static HashMap<CriteriuOrdonare, Comparator> map = new HashMap<>();

    public static List<Contact> listaContacte = new ArrayList<>();
    public static CriteriuOrdonare criteriu = CriteriuOrdonare.DUPA_NUME;

    public void ordoneaza(CriteriuOrdonare criteriu) {
        this.criteriu = criteriu;
    }

    public void adaugare(Contact contact) throws ContactExistentException {
        for (Contact c : listaContacte) {
            if (c.getNume().equals(contact.getNume()) && c.getPrenume().equals(contact.getPrenume()) && c.getDataNasterii().equals(contact.getDataNasterii()) && c.getNrTel().toString().equals(contact.getNrTel().toString())) {
                throw new ContactExistentException("Contactul exista deja in agenda!");
            } else {
                this.listaContacte.add(contact);
            }
        }
    }

    public void filtreazaNrFix() {
        Agenda.predicate = (c) -> c.getNrTel() instanceof NrFix;
    }

    public void filtreazaNrMobil() {
        Agenda.predicate = (c) -> c.getNrTel() instanceof NrMobil;
    }

    public void filtreazaNascutiAstazi() {
        Agenda.predicate = (c) -> c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() == LocalDate.now().getDayOfMonth();
    }

    public void filtreazaNascutiLunaCurenta() {
        Agenda.predicate = (c) -> c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() > LocalDate.now().getDayOfMonth();
    }

    public void filtreazaPersonalizat(String filtrare) {
        Agenda.predicate = (c) -> c.getNume().contains(filtrare) || c.getPrenume().contains(filtrare) || c.getNrTel().toString().contains(filtrare);
    }

    public static List<Contact> contacte() {
        List<Contact> Lista = Lista = (List<Contact>) listaContacte.stream().filter(predicate).sorted(Agenda.map.get(criteriu)).collect(Collectors.toList());
        return Lista;
    }
}
