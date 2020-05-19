/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class Farmacia extends javax.swing.JFrame {

    ConsultasBD consulta = new ConsultasBD();
    ArrayList<Personal> listaPersonal = new ArrayList<>();
    int idPersonal = -1;

    public Farmacia() {
        initComponents();
        listaPersonal = consulta.consultarPersonal();
        llenarTablaPersonal();
    }

    public void llenarTablaPersonal() {
        DefaultTableModel llenar
                = (DefaultTableModel) tablaPersonal.getModel();
        Object[] fila = new Object[4];
        //limpiar tabla
        for (int i = 0; i < tablaPersonal.getRowCount(); i++) {
            llenar.removeRow(i);
            i = i - 1;
        }
        for (Personal aux : listaPersonal) {
            fila[0] = aux.getId_personal();
            fila[1] = aux.getNombre();
            fila[2] = aux.getDomicilio();
            fila[3] = aux.getEdad();
            llenar.addRow(fila);
        }
    }

    public boolean verificarCajas() {
        boolean txt1 = true;
        boolean txt2 = true;
        boolean txt3 = true;
        boolean txt4 = true;
        if (txtDomicilio.getText().compareTo("") == 0) {
            txt1 = false;
        }
        if (txtEdad.getText().compareTo("") == 0) {
            txt2 = false;
        }
        if (txtID.getText().compareTo("") == 0) {
            txt3 = false;
        }
        if (txtNombre.getText().compareTo("") == 0) {
            txt4 = false;
        }

        if (!txt1 || !txt2 || !txt3 || !txt4) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios !!!");
            return false;
        }
        return true;
    }

    public boolean verificarCajasMedicamentos() {
        if (txtIDProducto.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtNombreComercial.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtNombreGenerico.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtPresentacion.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtFormaFarmaceutica.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtCondicionVenta.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtCaducidad.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtFabricante.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtStock.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtPrecio.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        return true;
    }

    public boolean verificarCajasProdHigiene() {
        if (txtCaducidadProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtIDProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtMarcaProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtNombreProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtPrecioProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtPresentProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        if (txtStockProdHigiene.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Campos vacios!!");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnGuardarNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtIDProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreComercial = new javax.swing.JTextField();
        txtNombreGenerico = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        txtFormaFarmaceutica = new javax.swing.JTextField();
        txtCondicionVenta = new javax.swing.JTextField();
        txtCaducidad = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregarMedicamento = new javax.swing.JButton();
        btnVerMedicamento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtIDProdHigiene = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNombreProdHigiene = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMarcaProdHigiene = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPresentProdHigiene = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCaducidadProdHigiene = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioProdHigiene = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtStockProdHigiene = new javax.swing.JTextField();
        btnVerProdH = new javax.swing.JButton();
        btnAgregarProdHigiene = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia");

        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Domicilio", "Edad"
            }
        ));
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonalMouseClicked(evt);
            }
        });
        tablaPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaPersonalKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonal);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendedores", jPanel2);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Domicilio:");

        jLabel4.setText("edad:");

        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtDomicilio)
                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarNuevo)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btnGuardarNuevo)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Nuevo Vendedor", jPanel1);

        jLabel5.setText("id_producto");

        jLabel6.setText("Nombre Comercial");

        jLabel7.setText("Nombre Generico");

        jLabel8.setText("Presentacion");

        jLabel9.setText("Forma Farmaceutica");

        jLabel10.setText("Condicion Venta");

        jLabel11.setText("Caducidad");

        jLabel12.setText("Fabricante");

        jLabel13.setText("Stock");

        jLabel14.setText("Precio");

        btnAgregarMedicamento.setText("Agregar");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });

        btnVerMedicamento.setText("Ver Medicamentos");
        btnVerMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMedicamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(0, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addGap(252, 252, 252))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(txtIDProducto)
                                        .addComponent(txtNombreComercial)
                                        .addComponent(txtNombreGenerico)
                                        .addComponent(txtPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtFormaFarmaceutica, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(txtCondicionVenta)
                            .addComponent(jLabel14)
                            .addComponent(txtCaducidad)
                            .addComponent(txtFabricante)
                            .addComponent(txtStock)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVerMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCondicionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormaFarmaceutica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(btnVerMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Nuevo Medicamento", jPanel3);

        jLabel15.setText("ID");

        jLabel16.setText("Nombre");

        jLabel17.setText("Marca");

        jLabel18.setText("Presentacion");

        jLabel19.setText("Caducidad");

        jLabel20.setText("Precio");

        jLabel21.setText("Stock");

        btnVerProdH.setText("Ver Productos Higiene");
        btnVerProdH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProdHActionPerformed(evt);
            }
        });

        btnAgregarProdHigiene.setText("Agregar");
        btnAgregarProdHigiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdHigieneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(txtIDProdHigiene)
                    .addComponent(txtNombreProdHigiene)
                    .addComponent(txtMarcaProdHigiene)
                    .addComponent(txtPresentProdHigiene, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(txtCaducidadProdHigiene)
                    .addComponent(txtPrecioProdHigiene)
                    .addComponent(txtStockProdHigiene, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnVerProdH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(btnAgregarProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaducidadProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPresentProdHigiene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerProdH)
                    .addComponent(btnAgregarProdHigiene))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Nuevo ProdHigiene", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPersonalKeyReleased
        // TODO add your handling code here:
        int fila = tablaPersonal.getSelectedRow();
        idPersonal = Integer.parseInt(String.valueOf(tablaPersonal.getValueAt(fila, 0)));
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // AQUI ABRIMOS LA VENTANA PARA VEMTAS 
            Globales.personalActivo = consulta.buscarPersonalPorID(idPersonal);
            Ventas frmVentas = new Ventas();
            frmVentas.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_tablaPersonalKeyReleased

    private void tablaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMouseClicked
        // TODO add your handling code here:
        int fila = tablaPersonal.getSelectedRow();
        idPersonal = Integer.parseInt(String.valueOf(tablaPersonal.getValueAt(fila, 0)));
    }//GEN-LAST:event_tablaPersonalMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if (idPersonal != -1) {
            Globales.personalG = consulta.buscarPersonalPorID(idPersonal);
            FrmEditarPersonal frm = new FrmEditarPersonal();
            frm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if (idPersonal != -1) {
            Personal p = consulta.buscarPersonalPorID(idPersonal);
            int boton = JOptionPane.showConfirmDialog(this,
                    "¿Desea borrar este elemento: " + p.getNombre()
                    + "?", "Advertencia!!", JOptionPane.YES_NO_OPTION);
            if (boton == JOptionPane.YES_NO_OPTION) {
                consulta.borrarPersonal(idPersonal);
                idPersonal = -1;
            }
            listaPersonal = consulta.consultarPersonal();
            llenarTablaPersonal();
        } else {
            JOptionPane.showMessageDialog(this, "debe tener un registro activo");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        // TODO add your handling code here:
        if (!verificarCajas()) {
            return;
        }
        try {
            int idPersonal = Integer.parseInt(txtID.getText());
            String nombrePersonal = txtNombre.getText().toUpperCase();
            String domicilioPersonal = txtDomicilio.getText().toUpperCase();
            int edad = Integer.parseInt(txtEdad.getText());
            consulta.insertarPersonal(idPersonal, nombrePersonal, domicilioPersonal, edad);
            llenarTablaPersonal();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verificar los numeros");
        }
        txtDomicilio.setText("");
        txtEdad.setText("");
        txtID.setText("");
        txtNombre.setText("");

    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        listaPersonal = consulta.consultarPersonal();
        llenarTablaPersonal();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        if (idPersonal != -1){
            Globales.personalActivo = consulta.buscarPersonalPorID(idPersonal);
        Ventas frmVentas = new Ventas();
        frmVentas.setVisible(true);
        this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar Usuario !");
        }
       
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnVerMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMedicamentoActionPerformed
        // TODO add your handling code here:
        FrmVerMedicamentos frm = new FrmVerMedicamentos();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerMedicamentoActionPerformed

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        // TODO add your handling code here:
        if (!verificarCajasMedicamentos()) {
            return;
        }
        try {
            int idMedicamento = Integer.parseInt(txtIDProducto.getText());
            String marcaComercial = txtNombreComercial.getText().toUpperCase();
            String nombreGenerico = txtNombreGenerico.getText().toUpperCase();
            String presentacion = txtPresentacion.getText().toUpperCase();
            String formaFarmaceutica = txtFormaFarmaceutica.getText().toUpperCase();
            String condicionVenta = txtCondicionVenta.getText().toUpperCase();
            String caducidad = txtCaducidad.getText().toUpperCase();
            String fabricante = txtFabricante.getText().toUpperCase();
            int stock = Integer.parseInt(txtStock.getText());
            int precio = Integer.parseInt(txtPrecio.getText());
            consulta.insertarMedicamento(
                    idMedicamento,
                    marcaComercial,
                    nombreGenerico,
                    presentacion,
                    formaFarmaceutica,
                    condicionVenta,
                    caducidad,
                    fabricante,
                    stock,
                    precio);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Verificar numeros en campos");
        }

        txtID.setText("");
        txtNombreComercial.setText("");
        txtNombreGenerico.setText("");
        txtPresentacion.setText("");
        txtFormaFarmaceutica.setText("");
        txtCondicionVenta.setText("");
        txtCaducidad.setText("");
        txtFabricante.setText("");
        txtStock.setText("");
        txtPrecio.setText("");

    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void btnAgregarProdHigieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdHigieneActionPerformed
        // TODO add your handling code here:
        if (!verificarCajasProdHigiene()) {
            return;
        }
        try {
            int id_producto = Integer.parseInt(txtIDProdHigiene.getText());
            String nombre = txtNombreProdHigiene.getText();
            String marca = txtMarcaProdHigiene.getText();
            String presentacion = txtMarcaProdHigiene.getText();
            String caducidad = txtCaducidadProdHigiene.getText();
            int precio = Integer.parseInt(txtPrecioProdHigiene.getText());
            int stock = Integer.parseInt(txtStockProdHigiene.getText());
            consulta.insertarProductoHigiene(id_producto, nombre, marca,
                    presentacion, caducidad, precio, stock);
        } catch (NumberFormatException e) {
        }
        txtIDProdHigiene.setText("");
        txtNombreProdHigiene.setText("");
        txtMarcaProdHigiene.setText("");
        txtPresentProdHigiene.setText("");
        txtCaducidadProdHigiene.setText("");
        txtPrecioProdHigiene.setText("");
        txtStockProdHigiene.setText("");

    }//GEN-LAST:event_btnAgregarProdHigieneActionPerformed

    private void btnVerProdHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProdHActionPerformed
        // TODO add your handling code here:
        FrmVerProductosHigiene frm = new FrmVerProductosHigiene();
        frm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVerProdHActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.JButton btnAgregarProdHigiene;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVerMedicamento;
    private javax.swing.JButton btnVerProdH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaPersonal;
    private javax.swing.JTextField txtCaducidad;
    private javax.swing.JTextField txtCaducidadProdHigiene;
    private javax.swing.JTextField txtCondicionVenta;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFormaFarmaceutica;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDProdHigiene;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtMarcaProdHigiene;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtNombreGenerico;
    private javax.swing.JTextField txtNombreProdHigiene;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioProdHigiene;
    private javax.swing.JTextField txtPresentProdHigiene;
    private javax.swing.JTextField txtPresentacion;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtStockProdHigiene;
    // End of variables declaration//GEN-END:variables
}
