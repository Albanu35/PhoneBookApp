package classpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Contact {
    
     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String nume;
    private String prenume;
    private String dataNasteriiInput;
    private NrTel nrTel;
    private LocalDate dataNasterii;

    public Contact(String nume, String prenume, String dataNasteriiInput) throws NumeEronatExceptie {
        char[] listaCharNume = nume.toCharArray(); // Convertim String-ul nume intr-o lista de caractere pentru a determina daca acesta contine doar litere
        // Exceptiile pentru introducerea unui Nume eronat
        if (nume == null || nume.length() < 2) {
            throw new IllegalArgumentException("Numele trebuie sa fie format din doua sau mai multe litere!");
        }
        for (int i = 0; i < listaCharNume.length; i++) {
            if (!Character.isLetter(listaCharNume[i])) {
                throw new NumeEronatExceptie("Numele nu poate sa contina alte caractere inafara de litere!");
            }
        }

        char[] listaCharPrenume = prenume.toCharArray(); // Convertim String-ul prenume intr-o lista de caractere pentru a determina daca acesta contine doar litere
        // Exceptiile pentru introducerea unui Prenume eronat
        if (prenume == null || prenume.length() < 2) {
            throw new IllegalArgumentException("Prenumele trebuie sa fie format din doua sau mai multe litere!");
        }
        for (int i = 0; i < listaCharPrenume.length; i++) {
            if (!Character.isLetter(listaCharPrenume[i])) {
                throw new IllegalArgumentException("Prenumele nu poate sa contina alte caractere inafara de litereWW!");
            }
        }

        // Exceptiile pentru introducerea unei date invalide
        if (!isValidFormat(dataNasteriiInput)) {
            throw new DateTimeParseException("Data introdusa nu are formatul corect sau este invalida", dataNasteriiInput, 0);
        }
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = prelucrareData(dataNasteriiInput);
    }

    public String getNume() {
        return this.nume;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public LocalDate getDataNasterii() {
        return this.dataNasterii;
    }

    public void setNrTel(NrTel numarTelefon) {
        this.nrTel = numarTelefon;
    }

    public NrTel getNrTel() {
        return this.nrTel;
    }

    @Override
    public boolean equals(Object o) {
        Contact another = (Contact) o;
        return nume.equalsIgnoreCase(another.nume) && prenume.equalsIgnoreCase(another.prenume)
                && dataNasterii.equals(another.dataNasterii) && this.getNrTel().toString().equals(another.getNrTel().toString());

    }

    public static LocalDate prelucrareData(String dataNasteriiInput) {
        String[] d = dataNasteriiInput.split("\\.");
        int a = Integer.parseInt(d[2]);
        int l = Integer.parseInt(d[1]);
        int z = Integer.parseInt(d[0]);
        return LocalDate.of(a, l, z);
    }

    public static boolean isValidFormat(String dataNasteriiInput) {
        LocalDate ld = null;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        ld = LocalDate.parse(dataNasteriiInput, format);
        String result = ld.format(format);
        return result.equals(dataNasteriiInput);
    }

    @Override
    public String toString() {
        return prenume + " " + nume + ", " + nrTel + ", " + dataNasterii;
    }

    public static class NumeEronatExceptie extends Exception {

        public NumeEronatExceptie(String numele_nu_poate_sa_contina_alte_caractere) {
        }
    }
}