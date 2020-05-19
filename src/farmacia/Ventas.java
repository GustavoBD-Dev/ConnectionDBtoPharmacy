package farmacia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Gustavo
 */
public class Ventas extends javax.swing.JFrame {

    ConsultasBD consulta = new ConsultasBD();
    ArrayList<Venta> listaVentas = new ArrayList<>();
    ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
    ArrayList<ProductoHigiene> listaProductoHigiene = new ArrayList<>();
    int sumaTotalVenta = 0;
    int ID_Venta = 0;

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        txtIDUsuario.setText("" + Globales.personalActivo.getId_personal());
        txtUsuario.setText("" + Globales.personalActivo.getNombre());

        listaVentas = consulta.consultarVentas(Globales.personalActivo.getId_personal());
        listaMedicamentos = consulta.consultarMedicamentos();
        listaProductoHigiene = consulta.consultarProductosHigiene();

        listaMedicamentos.forEach((aux) -> {
            seleccionIdMedicamento.addItem("" + aux.getId_Medicamento());
        });
        listaProductoHigiene.forEach((aux) -> {
            seleccionIdMedicamento.addItem("" + aux.id_Producto);
        });

        txtPrecioVenta.setText("" + sumaTotalVenta);
        mostrarMisVentas();
        limpiarTablaDetalleVenta();
    }

    void limpiarTablaDetalleVenta() {
        DefaultTableModel eliminar
                = (DefaultTableModel) tablaVentaEnProceso.getModel();
        for (int i = 0; i < tablaVentaEnProceso.getRowCount(); i++) {
            eliminar.removeRow(i);
            i = i - 1;
        }
    }

    public void mostrarMisVentas() {
        DefaultTableModel llenar
                = (DefaultTableModel) tablaMisVentas.getModel();
        Object[] fila = new Object[5];
        //limpiar tabla
        for (int i = 0; i < tablaMisVentas.getRowCount(); i++) {
            llenar.removeRow(i);
            i = i - 1;
        }
        listaVentas.stream().map((aux) -> {
            fila[0] = aux.getId_venta();
            return aux;
        }).map((aux) -> {
            fila[1] = aux.getFecha();
            return aux;
        }).map((aux) -> {
            fila[2] = aux.getHora();
            return aux;
        }).map((aux) -> {
            fila[3] = aux.getTotal();
            return aux;
        }).map((aux) -> {
            fila[4] = aux.getId_cliente();
            return aux;
        }).forEachOrdered((_item) -> {
            llenar.addRow(fila);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtIDUsuario = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMisVentas = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        spinnerCantidad = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentaEnProceso = new javax.swing.JTable();
        seleccionIdMedicamento = new javax.swing.JComboBox<>();
        btnPagar = new javax.swing.JButton();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioUnico = new javax.swing.JTextField();
        txtNombreComercialSeleccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreGenericoseleccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIDVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClienteActual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");

        jLabel1.setText("ID:");

        jLabel2.setText("Usuario:");

        txtUsuario.setEnabled(false);

        txtIDUsuario.setEnabled(false);

        tablaMisVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "HORA", "TOTAL", "CLIENTE"
            }
        ));
        jScrollPane1.setViewportView(tablaMisVentas);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mis Ventas", jPanel1);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaVentaEnProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID MED", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tablaVentaEnProceso);

        seleccionIdMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionIdMedicamentoActionPerformed(evt);
            }
        });

        btnPagar.setText("Pagar");
        btnPagar.setEnabled(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        txtPrecioVenta.setEnabled(false);

        jLabel3.setText("TOTAL: $");

        txtPrecioUnico.setEnabled(false);

        txtNombreComercialSeleccion.setEnabled(false);

        jLabel4.setText("ID_Medi");

        jLabel5.setText("Nombre Comercial (Marca)");

        jLabel6.setText("PU");

        jLabel7.setText("CANTIDAD");

        txtNombreGenericoseleccion.setEnabled(false);

        jLabel8.setText("Nombre Generico (nombre)");

        jLabel9.setText("$");

        jLabel10.setText("ID venta");

        jLabel11.setText("ID Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(seleccionIdMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreComercialSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombreGenericoseleccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtClienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(txtPrecioUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionIdMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreGenericoseleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreComercialSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagar)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nueva Venta", jPanel2);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        if (txtIDVenta.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Debe agregar un folio de venta primero");
            return;
        }
        try {
            ID_Venta = Integer.parseInt(txtIDVenta.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe agregar numeros para ID!!");
            return;
        }
        if (((int) spinnerCantidad.getValue()) <= 0) {
            JOptionPane.showMessageDialog(null, "debe  seleccionar unidades mayores a 0 !!!");
        } else {
            // obtener precio por unidad
            int precioFinal = Integer.parseInt(txtPrecioUnico.getText());
            precioFinal = precioFinal * ((int) spinnerCantidad.getValue());
            int idSeleccionado = Integer.parseInt((String) seleccionIdMedicamento.getSelectedItem());
            Medicamento medicamento = 
                    consulta.buscarMedicamentoPorID(idSeleccionado);

            ProductoHigiene producto = 
                    consulta.buscarProductoHigienePorID(idSeleccionado);
            // agregamos producto a la tabla 
            DefaultTableModel agregar
                    = (DefaultTableModel) tablaVentaEnProceso.getModel();
            try {
                agregar.addRow(new Object[]{
                medicamento.getId_Medicamento(),
                spinnerCantidad.getValue(),
                medicamento.getPrecio(),
                precioFinal});
            } catch (Exception e) {
            }
            try {
                agregar.addRow(new Object[]{
                    producto.getId_Producto(),
                    spinnerCantidad.getValue(),
                    producto.getPrecio(),
                    precioFinal
                });
            } catch (Exception e) {
            }
            
            sumaTotalVenta += precioFinal;
            txtPrecioVenta.setText("" + sumaTotalVenta);
            btnPagar.setEnabled(true);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void seleccionIdMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionIdMedicamentoActionPerformed
        // TODO add your handling code here:
        int seleccion = Integer.parseInt("" + seleccionIdMedicamento.getSelectedItem());
        
        try {
            Medicamento medicamentoSeleccionado = consulta.buscarMedicamentoPorID(seleccion);
            txtNombreComercialSeleccion.setText(medicamentoSeleccionado.getNombreComercial());
            txtNombreGenericoseleccion.setText(medicamentoSeleccionado.getNombreGenerico());
            txtPrecioUnico.setText("" + medicamentoSeleccionado.getPrecio());
        } catch (Exception e) {
        } 
        try{
            ProductoHigiene producto = consulta.buscarProductoHigienePorID(seleccion);
            txtNombreGenericoseleccion.setText(producto.getNombre());
            txtNombreComercialSeleccion.setText(producto.getMarca());
            txtPrecioUnico.setText("" +producto.getPrecio());
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_seleccionIdMedicamentoActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        
        // obtenemos los datos de la tabla 
        ArrayList<VentaDetalle> lista = new ArrayList<>();
        DefaultTableModel dato
                = (DefaultTableModel) tablaVentaEnProceso.getModel();
        for (int i = 0; i < tablaVentaEnProceso.getRowCount(); i++) {
            VentaDetalle ventaDetalle = new VentaDetalle(
                    ID_Venta,
                    ((int) dato.getValueAt(i, 0)),
                    ((int) dato.getValueAt(i, 1)),
                    ((int) dato.getValueAt(i, 2)),
                    ((int) dato.getValueAt(i, 3)));
            lista.add(ventaDetalle);
        }
        
        java.util.Date date = new java.util.Date();
        //Date date = new Date(1000);
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String horaActual = hourFormat.format(date);
        // obetener la fecha
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = dateFormat.format(date);
        // total de venta actual
        int ventaActual = Integer.parseInt(txtPrecioVenta.getText());
        // id del cliente 
        int idClienteActualNumero = 0;
        if (!txtClienteActual.getText().isEmpty()) {
            try {
                idClienteActualNumero = Integer.parseInt(txtClienteActual.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe colocar numeros para ID!!");
            }
        }
        // generamos la consulta para obtener un ID de venta en autoincremento
        consulta.nuevaVenta(
                ID_Venta,
                Globales.personalActivo.getId_personal(),
                fechaActual,
                horaActual,
                ventaActual,
                idClienteActualNumero);

        // generamos la insercion de detalle de la venta 
        lista.forEach((aux) -> {
            consulta.insertarVentaDetalle(
                    aux.getId_Venta(),
                    aux.getId_Producto(),
                    aux.getCantidad(),
                    aux.getPrecioUnitario(),
                    aux.getTotal());
            consulta.actualizarStock(aux.id_Producto, aux.cantidad);
        });

        limpiarTablaDetalleVenta();
        txtPrecioVenta.setText("");
        sumaTotalVenta = 0;
        
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        listaVentas = consulta.consultarVentas(Globales.personalActivo.getId_personal());
        mostrarMisVentas();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        Farmacia frmFarmacia = new Farmacia();
        frmFarmacia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> seleccionIdMedicamento;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tablaMisVentas;
    private javax.swing.JTable tablaVentaEnProceso;
    private javax.swing.JTextField txtClienteActual;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtIDVenta;
    private javax.swing.JTextField txtNombreComercialSeleccion;
    private javax.swing.JTextField txtNombreGenericoseleccion;
    private javax.swing.JTextField txtPrecioUnico;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}