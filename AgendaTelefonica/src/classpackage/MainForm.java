package classpackage;
import Exceptii.ContactExistentException;
import Exceptii.FileCSVHeaderException;
import Exceptii.ItemNotSelectedException;
import Exceptii.NumarTelefonExceptie;
import Exceptii.NumeEronatExceptie;
import Exceptii.PrenumeEronatExceptie;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MainForm extends javax.swing.JFrame {
    
    DefaultListModel model = new DefaultListModel();
    List<Contact> listaContacte = new ArrayList<>();
    Agenda agenda = new Agenda(listaContacte);
         
    // Metoda de actualizare a elementelor din lista in momentul modificarii acesteia
    private void actualizeazaModel() {
        model.clear();
        listaContacte.forEach((o) -> {
            model.addElement(o);
        });
    }

    
    public MainForm() {
        initComponents();
        miDeschidere.setEnabled(false);
        miSalvare.setEnabled(false);
        miInregistrare.setEnabled(true);
        btnGroup.add(cbFix);
        btnGroup.add(cbMobil);
        ContactList.setModel(model);
        btnAdauga.setEnabled(false);
        btnModifica.setEnabled(false);
        btnSterge.setEnabled(false);
        cbFiltre.setEnabled(false);
        cbOrdonari.setEnabled(false);
        tfPersonalizat.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DiAddNume = new javax.swing.JDialog();
        lblAddContact = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfNrTelefon = new javax.swing.JTextField();
        cbNrFix = new javax.swing.JCheckBox();
        cbNrMobil = new javax.swing.JCheckBox();
        btnSalveaza = new javax.swing.JButton();
        btnModificaDate = new javax.swing.JButton();
        diDespreApp = new javax.swing.JDialog();
        lbAutor = new javax.swing.JLabel();
        spTextInfo = new javax.swing.JScrollPane();
        txtInfoDespre = new javax.swing.JTextArea();
        lblPanel1 = new javax.swing.JPanel();
        lblFiltrare1 = new javax.swing.JLabel();
        lblOrdonare1 = new javax.swing.JLabel();
        cbFiltru = new javax.swing.JComboBox<>();
        cbOrdonar = new javax.swing.JComboBox<>();
        lblFiltru = new javax.swing.JLabel();
        tfFiltru = new java.awt.TextField();
        btnFiltreaza = new javax.swing.JButton();
        btnOrdoneaza = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstContacte = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lbReserved = new javax.swing.JLabel();
        MenuBar1 = new javax.swing.JMenuBar();
        miFisiere = new javax.swing.JMenu();
        mDeschidere = new javax.swing.JMenuItem();
        mSalvare = new javax.swing.JMenuItem();
        mIesire = new javax.swing.JMenuItem();
        miAutor = new javax.swing.JMenu();
        mInregistrare = new javax.swing.JMenuItem();
        mDespre = new javax.swing.JMenuItem();

        DiAddNume.setBackground(new java.awt.Color(153, 153, 153));
        DiAddNume.setForeground(new java.awt.Color(204, 204, 0));

        lblAddContact.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblAddContact.setText("                                    Completati corect datele:");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Nume:");

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSurname.setText("Prenume:");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDate.setText("Data Nasterii:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Numar Telefon:");

        cbNrFix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbNrFix.setText("Fix");
        cbNrFix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNrFixActionPerformed(evt);
            }
        });

        cbNrMobil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbNrMobil.setText("Mobil");

        btnSalveaza.setBackground(new java.awt.Color(204, 204, 0));
        btnSalveaza.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalveaza.setText("Salveaza");

        btnModificaDate.setBackground(new java.awt.Color(204, 204, 0));
        btnModificaDate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificaDate.setText("Modifica");

        javax.swing.GroupLayout DiAddNumeLayout = new javax.swing.GroupLayout(DiAddNume.getContentPane());
        DiAddNume.getContentPane().setLayout(DiAddNumeLayout);
        DiAddNumeLayout.setHorizontalGroup(
            DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiAddNumeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddContact, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addGroup(DiAddNumeLayout.createSequentialGroup()
                        .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DiAddNumeLayout.createSequentialGroup()
                                .addComponent(cbNrFix, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(cbNrMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(DiAddNumeLayout.createSequentialGroup()
                                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSalveaza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(tfSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(tfDate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(tfNrTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addComponent(btnModificaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(191, 191, 191))
        );
        DiAddNumeLayout.setVerticalGroup(
            DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiAddNumeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNrTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(DiAddNumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNrFix)
                    .addComponent(cbNrMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalveaza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnModificaDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        diDespreApp.setBackground(new java.awt.Color(204, 204, 0));

        lbAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAutor.setText("                    Author:                     Alexander Ciobanu                                 2.0 Version");

        txtInfoDespre.setColumns(20);
        txtInfoDespre.setRows(5);
        txtInfoDespre.setText("Aceasta este aplicatia cu interfata grafica - PhoneBookApp;\n\nPentru a folosi aplicatia in modul full, aveti nevoie sa introduceti\n\ncodul de inregistrare corect: 1984322;\n\nContactele noi introduse au campurile obligatorii: Nume si Prenume,\n\nData Nastere, Telefon (Fix/Mobil).\n\nAplicatia permite sa ordonam contactele dupa filtre: Dupa nume, prenume,\n\ndata nastere, etc.");
        spTextInfo.setViewportView(txtInfoDespre);

        javax.swing.GroupLayout diDespreAppLayout = new javax.swing.GroupLayout(diDespreApp.getContentPane());
        diDespreApp.getContentPane().setLayout(diDespreAppLayout);
        diDespreAppLayout.setHorizontalGroup(
            diDespreAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addGroup(diDespreAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTextInfo)
                .addContainerGap())
        );
        diDespreAppLayout.setVerticalGroup(
            diDespreAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diDespreAppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spTextInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblFiltrare1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFiltrare1.setText("Filtrare dupa:");

        lblOrdonare1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrdonare1.setText("Ordonare dupa:");

        cbFiltru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltruActionPerformed(evt);
            }
        });

        cbOrdonar.setToolTipText("");
        cbOrdonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdonarActionPerformed(evt);
            }
        });

        lblFiltru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFiltru.setText("filtru:");

        btnFiltreaza.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnFiltreaza.setText("Filtreaza");

        btnOrdoneaza.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnOrdoneaza.setText("Ordoneaza");

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));

        lstContacte.setBackground(new java.awt.Color(255, 255, 51));
        jScrollPane2.setViewportView(lstContacte);

        btnAdd.setBackground(new java.awt.Color(204, 204, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Adauga");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 204, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(51, 51, 51));
        btnEdit.setText("Editeaza");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Sterge");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lbReserved.setText("Alexander's PhoneBook app, all rights reserved");

        javax.swing.GroupLayout lblPanel1Layout = new javax.swing.GroupLayout(lblPanel1);
        lblPanel1.setLayout(lblPanel1Layout);
        lblPanel1Layout.setHorizontalGroup(
            lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(lbReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lblPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblPanel1Layout.createSequentialGroup()
                        .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblOrdonare1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFiltrare1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbOrdonar, 0, 190, Short.MAX_VALUE)
                            .addComponent(cbFiltru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(lblFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdoneaza, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btnFiltreaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        lblPanel1Layout.setVerticalGroup(
            lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblPanel1Layout.createSequentialGroup()
                        .addComponent(cbFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(lblPanel1Layout.createSequentialGroup()
                        .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFiltreaza, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfFiltru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFiltrare1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOrdonar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOrdonare1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdoneaza, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbReserved, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        miFisiere.setText("Fisiere");
        miFisiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFisiereActionPerformed(evt);
            }
        });

        mDeschidere.setText("Deschidere");
        mDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDeschidereActionPerformed(evt);
            }
        });
        miFisiere.add(mDeschidere);

        mSalvare.setText("Salvare");
        miFisiere.add(mSalvare);

        mIesire.setText("Iesire");
        mIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIesireActionPerformed(evt);
            }
        });
        miFisiere.add(mIesire);

        MenuBar1.add(miFisiere);

        miAutor.setText("Ajutor");

        mInregistrare.setText("Inregistrare");
        mInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInregistrareActionPerformed(evt);
            }
        });
        miAutor.add(mInregistrare);

        mDespre.setText("Despre");
        miAutor.add(mDespre);

        MenuBar1.add(miAutor);

        setJMenuBar(MenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miFisiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFisiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miFisiereActionPerformed

    private void mDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDeschidereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mDeschidereActionPerformed

    private void cbFiltruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltruActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbOrdonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdonarActionPerformed

    private void cbNrFixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNrFixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNrFixActionPerformed
//Butonul din meniu pentru iesirea din aplicatie
    private void mIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIesireActionPerformed
       int response = JOptionPane.showConfirmDialog(this, "Doriti sa parasiti aplicatia?", "Confirmare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mIesireActionPerformed

    private void mInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInregistrareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mInregistrareActionPerformed

                                    
    
    //Buton tip comboBox pentru setarea tipului de filtru
    private void cbFiltreActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (cbFiltre.getSelectedIndex() == 0) {
            agenda.filtreazaNrFix();
        }
        if (cbFiltre.getSelectedIndex() == 1) {
            agenda.filtreazaNrMobil();
        }
        if (cbFiltre.getSelectedIndex() == 2) {
            agenda.filtreazaNascutiAstazi();
        }
        if (cbFiltre.getSelectedIndex() == 3) {
            agenda.filtreazaNascutiLunaCurenta();
        }
        if (cbFiltre.getSelectedIndex() == 4) {
            agenda.filtreazaPersonalizat(tfPersonalizat.getText());
        }
    }                                        
    
    //Buton pentru deschiderea ferestrei ce permite introducerea codului de inregistrare
    private void miInregistrareActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Introduceti codul de validare:", "Confirmare", JOptionPane.QUESTION_MESSAGE));
            if (n == cod) {
                // In cazul introducerii codului de inregistrare corect, toate functionalitatile aplicatiei devin accesibile, altfel se genereaza exceptie
                lblReclama.setVisible(false);
                miDeschidere.setEnabled(true);
                miSalvare.setEnabled(true);
                miInregistrare.setEnabled(false);
                btnAdauga.setEnabled(true);
                btnModifica.setEnabled(true);
                btnSterge.setEnabled(true);
                lblCod.setVisible(false);
                cbFiltre.setEnabled(true);
                cbOrdonari.setEnabled(true);
                tfPersonalizat.setEditable(true);
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Cod de validare eronat!");
        }

    }                                              

    //Buton pentru deschiderea ferestrei de dialog unde vom introduce datele noului contact
    private void btnAdaugaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        diAdauga.setVisible(true);
        btnUpdate.setVisible(false);
    }                                         
    
    //Buton ce adauga un nou contact in agenda, validand datele acestuia
    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) throws Contact.NumeEronatExceptie {                                            
        try {
            String nume = tfNume.getText();
            String prenume = tfPrenume.getText();
            String dataNasterii = tfDataNasterii.getText();
            Contact c = new Contact(nume, prenume, dataNasterii);
            if (c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                JOptionPane.showMessageDialog(this, "Data de nasterii a contactului este astazi!");
            }
            String numarTelefon = tfNumarTelefon.getText();
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrFix(numarTelefon);
                c.setNrTel(nrTel);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrMobil(numarTelefon);
                c.setNrTel(nrTel);
            } else {
                throw new NullPointerException("");
            }
            for (Contact ct : listaContacte) {
                if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                    throw new ContactExistentException("");
                }
            }
            listaContacte.add(c);
            model.addElement(c);
            tfNume.setText("");
            tfPrenume.setText("");
            tfDataNasterii.setText("");
            tfNumarTelefon.setText("");
            btnGroup.clearSelection();
            btnUpdate.setVisible(true);
            diAdauga.setVisible(false);
            actualizeazaModel();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
        } catch (NumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
        } catch (PrenumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
        } catch (NumarTelefonExceptie e) {
            JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
        } catch (ContactExistentException e) {
            JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Nu ai selectat tipul de telefon!");
        }

    }                                           
    
    //Buton pentru stergerea contactului selectat din agenda
    private void btnStergeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!model.isEmpty()) {
            Contact c = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            int response = JOptionPane.showConfirmDialog(this, "Doriti sa stergeti contactul " + c.getNume() + " " + c.getPrenume() + " ?", "Confirmare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                model.removeElementAt(ContactList.getSelectedIndex());
                listaContacte.remove(c);
                actualizeazaModel();
            }
        }
    }                                         
    
    //Buton pentru deschiderea ferestrei de modificare a contactului, aducand datele existente ale acestuia in campuri
    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            // Exceptie pentru neselectarea unui element
            if (ContactList.isSelectionEmpty()) {
                throw new ItemNotSelectedException();
            }
            // Prelucrarea datelor contactului selectat pentru a le prelua in campurile din fereastra de dialog
            Contact actual = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            String sc[] = actual.toString().split(",");
            diAdauga.setVisible(true);
            String name[] = sc[0].split(" ");
            tfNume.setText(name[0]);
            tfPrenume.setText(name[1]);
            tfNumarTelefon.setText(sc[1].trim());
            if (tfNumarTelefon.getText().substring(0, 2).equals("02") || tfNumarTelefon.getText().substring(0, 2).equals("03")) {
                cbFix.setSelected(true);
            } else {
                cbMobil.setSelected(true);
            }
            String d = sc[2].trim();
            String dataNasterii[] = d.split("-");
            String a = dataNasterii[0];
            String l = dataNasterii[1];
            String z = dataNasterii[2];
            String dt = z + "." + l + "." + a;
            tfDataNasterii.setText(dt);
            btnConfirma.setVisible(false);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Lista este goala!");
        } catch (ItemNotSelectedException e) {
            JOptionPane.showMessageDialog(this, "Nu exista un index selectat");
        }


    }                                           
    
    //Buton pentru modificarea contactului selectat, validand datele acestuia
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Contact.NumeEronatExceptie {                                          
        try {
            //Efectuam validarea numarului de telefon inainte de a schimba datele contactului din model
            String numarTelefon = tfNumarTelefon.getText();
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrFix(numarTelefon);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrMobil(numarTelefon);
            } else {
                JOptionPane.showMessageDialog(this, "Nu ati selectat tipul de numar de telefon!");
            }
            Contact s = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            listaContacte.remove(s);
            // Setam datele din model luand in considerare modificarile efectuate
            model.setElementAt(new Contact(tfNume.getText(), tfPrenume.getText(), tfDataNasterii.getText()), ContactList.getSelectedIndex());
            Contact c = (Contact) model.getElementAt(ContactList.getSelectedIndex());
            //Parcurgem din nou algoritmul de validare al numarului de telefon pentru a il seta
            if (cbFix.isSelected()) {
                NrTel nrTel = new NrFix(numarTelefon);
                c.setNrTel(nrTel);
            } else if (cbMobil.isSelected()) {
                NrTel nrTel = new NrMobil(numarTelefon);
                c.setNrTel(nrTel);
            } else {
                throw new NullPointerException("");
            }
            if (c.getDataNasterii().getMonth().equals(LocalDate.now().getMonth()) && c.getDataNasterii().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                JOptionPane.showMessageDialog(this, "Data de nasterii a contactului este astazi!");
            }
            for (Contact ct : listaContacte) {
                if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                    throw new ContactExistentException("");
                }
            }
            // Stergem datele din campuri pentru a nu afisate cand se apasa din nou Adauga/Modifica pentru alt contact;
            listaContacte.add(c);
            tfNume.setText("");
            tfPrenume.setText("");
            tfDataNasterii.setText("");
            tfNumarTelefon.setText("");
            btnGroup.clearSelection();
            btnConfirma.setVisible(true);
            diAdauga.setVisible(false);
            actualizeazaModel();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
        } catch (NumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
        } catch (PrenumeEronatExceptie e) {
            JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
        } catch (NumarTelefonExceptie e) {
            JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
        } catch (ContactExistentException e) {
            JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Nu ai selectat tipul de telefon!");
        }

    }                                         
    
    //Buton ce afiseaza o scurta descriere despre aplicatie
    private void miDespreActionPerformed(java.awt.event.ActionEvent evt) {                                         
        diInfo.setVisible(true);
    }                                        
    
    //Buton tip comboBox pentru setarea tipului de ordonare
    private void cbOrdonariActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (cbOrdonari.getSelectedIndex() == 0) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_NUME);
        }
        if (cbOrdonari.getSelectedIndex() == 1) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_PRENUME);
        }
        if (cbOrdonari.getSelectedIndex() == 2) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_DATA_NASTERII);
        }
        if (cbOrdonari.getSelectedIndex() == 3) {
            agenda.ordoneaza(Agenda.CriteriuOrdonare.DUPA_NUMAR_TELEFON);
        }
    }                                          
    
    //Butonul aranjeaza lista in functie de filtrul si ordonarea selectata
    private void btnFiltrareActionPerformed(java.awt.event.ActionEvent evt) {                                            
        List<Contact> lista = (List<Contact>) listaContacte.stream().filter(Agenda.predicate).sorted(Agenda.map.get(Agenda.criteriu)).collect(Collectors.toList());
        model.clear();
        lista.forEach((o) -> {
            model.addElement(o);
        });
    }                                           
    
    //TextField pentru filtrare personalizata
    private void tfPersonalizatActionPerformed(java.awt.event.ActionEvent evt) {                                               
        cbFiltreActionPerformed(evt);
    }                                              
    
    //Salvarea in format CSV a listei
    private void miSalvareActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!model.isEmpty()) {
            int response = JOptionPane.showConfirmDialog(this, "Doriti sa salvati lista de contacte?", "Salvare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    JFileChooser chooser = new JFileChooser();
                    chooser.showSaveDialog(this);
                    File list = new File(chooser.getSelectedFile().getAbsolutePath() + ".csv");
                    PrintWriter writer = new PrintWriter(list);
                    StringBuilder sb = new StringBuilder();

                    sb.append("Nume");
                    sb.append(",");
                    sb.append("Prenume");
                    sb.append(",");
                    sb.append("Data nasterii");
                    sb.append(",");
                    sb.append("Numar Telefon");
                    sb.append(",");
                    sb.append("\r\n");

                    listaContacte.stream().map((c) -> {
                        sb.append(c.getNume());
                        return c;
                    }).map((c) -> {
                        sb.append(",");
                        sb.append(c.getPrenume());
                        return c;
                    }).map((c) -> {
                        sb.append(",");
                        String dataNasterii[] = c.getDataNasterii().toString().split("-");
                        String a = dataNasterii[0];
                        String l = dataNasterii[1];
                        String z = dataNasterii[2];
                        String dt = z + "." + l + "." + a;
                        sb.append(dt);
                        sb.append(",");
                        sb.append(c.getNrTel().toString());
                        return c;
                    }).forEachOrdered((_item) -> {
                        sb.append("\r\n");
                    });

                    writer.write(sb.toString());
                    writer.close();

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }                                         
    
    //Deschiderea si incarcarea unei lista, validand datele acesteia
    private void miDeschidereActionPerformed(java.awt.event.ActionEvent evt) throws Contact.NumeEronatExceptie {                                             
        int response = JOptionPane.showConfirmDialog(this, "Doriti sa incarcati lista de contacte?", "Incarcare", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            JFileChooser chooser = new JFileChooser();
            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File list = chooser.getSelectedFile();
                try {
                    FileReader reader = new FileReader(list);
                    Scanner input = new Scanner(reader);
                    String[] headLine = input.nextLine().split(",");
                    if (!headLine[0].equals("Nume") || !headLine[1].equals("Prenume") || !headLine[2].equals("Data nasterii") || !headLine[3].equals("Numar Telefon")) {
                        throw new FileCSVHeaderException("");
                    }
                    while (input.hasNextLine()) {
                        String[] contactLine = input.nextLine().split(",");
                        String nume = contactLine[0];
                        String prenume = contactLine[1];
                        String dataNasterii = contactLine[2];
                        String numarTelefon = contactLine[3];
                        Contact c = new Contact(nume, prenume, dataNasterii);
                        if (numarTelefon.substring(0, 2).equals("02") || numarTelefon.substring(0, 2).equals("03")) {
                            NrTel nrTel = new NrFix(numarTelefon);
                            c.setNrTel(nrTel);
                        } else if (numarTelefon.substring(0, 2).equals("07")) {
                            NrTel nrTel = new NrMobil(numarTelefon);
                            c.setNrTel(nrTel);
                        } else {
                            JOptionPane.showMessageDialog(this, "Nu ati selectat tipul de numar de telefon!");
                        }
                        for (Contact ct : listaContacte) {
                            if (ct.getNume().equals(c.getNume()) && ct.getPrenume().equals(c.getPrenume()) && ct.getDataNasterii().equals(c.getDataNasterii()) && ct.getNrTel().equals(c.getNrTel())) {
                                throw new ContactExistentException("");
                            }
                        }
                        listaContacte.add(c);
                        model.addElement(c);
                        actualizeazaModel();
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this, "Numele/prenumele nu a fost introdus!");
                } catch (NumeEronatExceptie e) {
                    JOptionPane.showMessageDialog(this, "Numele a fost introdus eronat!");
                } catch (PrenumeEronatExceptie e) {
                    JOptionPane.showMessageDialog(this, "Prenumele a fost introdus eronat!");
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(this, "Data nasterii nu este valida!");
                } catch (NumarTelefonExceptie e) {
                    JOptionPane.showMessageDialog(this, "Numarul de telefon introdus este invalid!");
                } catch (ContactExistentException e) {
                    JOptionPane.showMessageDialog(this, "Contactul exista deja in agenda!");
                } catch (FileCSVHeaderException ex) {
                    JOptionPane.showMessageDialog(this, "Capul de tabul nu e formatat corect");
                }
            }
        }


    } 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DiAddNume;
    private javax.swing.JMenuBar MenuBar1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFiltreaza;
    private javax.swing.JButton btnModificaDate;
    private javax.swing.JButton btnOrdoneaza;
    private javax.swing.JButton btnSalveaza;
    private javax.swing.JComboBox<String> cbFiltru;
    private javax.swing.JCheckBox cbNrFix;
    private javax.swing.JCheckBox cbNrMobil;
    private javax.swing.JComboBox<String> cbOrdonar;
    private javax.swing.JDialog diDespreApp;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAutor;
    private javax.swing.JLabel lbReserved;
    private javax.swing.JLabel lblAddContact;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFiltrare1;
    private javax.swing.JLabel lblFiltru;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrdonare1;
    private javax.swing.JPanel lblPanel1;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JList<String> lstContacte;
    private javax.swing.JMenuItem mDeschidere;
    private javax.swing.JMenuItem mDespre;
    private javax.swing.JMenuItem mIesire;
    private javax.swing.JMenuItem mInregistrare;
    private javax.swing.JMenuItem mSalvare;
    private javax.swing.JMenu miAutor;
    private javax.swing.JMenu miFisiere;
    private javax.swing.JScrollPane spTextInfo;
    private javax.swing.JTextField tfDate;
    private java.awt.TextField tfFiltru;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNrTelefon;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextArea txtInfoDespre;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JList<String> ContactList;
    private javax.swing.JTextArea InfoApp;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane TxPane;
    private javax.swing.JButton btnAdauga;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnFiltrare;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnModifica;
    private javax.swing.JButton btnSterge;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbFiltre;
    private javax.swing.JCheckBox cbFix;
    private javax.swing.JCheckBox cbMobil;
    private javax.swing.JComboBox<String> cbOrdonari;
    private javax.swing.JDialog diAdauga;
    private javax.swing.JDialog diInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAdauga;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDataNasterii;
    private javax.swing.JLabel lblFiltrare;
    private javax.swing.JLabel lblNumarTelefon;
    private javax.swing.JLabel lblNume;
    private javax.swing.JLabel lblOrdonare;
    private javax.swing.JPanel lblPanel;
    private javax.swing.JLabel lblPersonalizat;
    private javax.swing.JLabel lblPrenume;
    public static javax.swing.JLabel lblReclama;
    private javax.swing.JMenu mAjutor;
    private javax.swing.JMenu mFisiere;
    private javax.swing.JMenuItem miDeschidere;
    private javax.swing.JMenuItem miDespre;
    private javax.swing.JMenuItem miIesire;
    private javax.swing.JMenuItem miInregistrare;
    private javax.swing.JMenuItem miSalvare;
    private javax.swing.JTextField tfDataNasterii;
    private javax.swing.JTextField tfNumarTelefon;
    private javax.swing.JTextField tfNume;
    private javax.swing.JTextField tfPersonalizat;
    private javax.swing.JTextField tfPrenume;
}
