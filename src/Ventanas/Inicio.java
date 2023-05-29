package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose H Elel
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo qUE esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        ImgMapa = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        txtDestino1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(0, 0, 204));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 50));

        jPanel1.setBackground(new java.awt.Color(155, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 690, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(255, 255, 255));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(51, 0, 204));
        txtColorOrigen.setText("Origen");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 190, 40));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(51, 0, 204));
        txtColorDestino.setText("Destino       ");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 680, 190, 40));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(51, 0, 204));
        txtColorNodoRecorrido.setText("Nodo Recorrido ");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 190, 40));

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Municipios_de_Santa_Rosa.jpg"))); // NOI18N
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -80, 610, 830));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 660, 740));

        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(0, 0, 153));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1) Santa Rosa de Lima", "2) Nueva Santa Rosa", "3) San Rafael las FLores", "4) Casillas", "5) Cuilapa", "6) Santa Cruz Naranjo", "7) Barberena", "8) Pueblo Nuevo Viñas", "9) taxisco", "10) Guaacapán", "11) Chiquimula", "12) San Juan Tecuaco", "13) Santa Maria Ixhuatán", "14) Oratorio" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(51, 0, 204));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 300, 60));

        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(0, 0, 153));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1) Santa Rosa de Lima", "2) Nueva Santa Rosa", "3) San Rafael las FLores", "4) Casillas", "5) Cuilapa", "6) Santa Cruz Naranjo", "7) Barberena", "8) Pueblo Nuevo Viñas", "9) taxisco", "10) Guaacapán", "11) Chiquimula", "12) San Juan Tecuaco", "13) Santa Maria Ixhuatán", "14) Oratorio" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 460, 50));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 510, 70));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Selecciona el destino:");
        txtDestino.setToolTipText("");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 390, 40));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 250, 40));

        LateralSuperior.setBackground(new java.awt.Color(155, 255, 102));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 730));

        LateralSuperior1.setBackground(new java.awt.Color(155, 255, 102));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 30));

        LateralSuperior2.setBackground(new java.awt.Color(155, 255, 102));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior2.setText("                            Bienvenido al sistema");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 30));

        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setText("                         Kilometros recorridos:");
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 380, 30));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("FIN");
        BotonSalir.setActionCommand("FIN");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 70, 50));

        Fondo.setBackground(new java.awt.Color(155, 255, 102));
        Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayarza-lago.jpg"))); // NOI18N
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -480, 1440, 1610));

        txtDestino1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino1.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino1.setText("Selecciona el destino:");
        getContentPane().add(txtDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
           //1  2  3  4  5  6  7  8  9 10  11 12 13 14
            {0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},//1)Santarosa de lima
            {1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0},//2)Nueva Santa Rosa
            {0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},//3)San Rafael las Flores
            {0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},//4)Casillas
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1},//5)Cuilapa
            {1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},//6)Santa Cruz Naranjo
            {1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0},//7)Barberena
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},//8)Pueblo Nuevo Viñas
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},//9)Taxisco
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0},//10)Guazacapán
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1},//11)Chiquimulilla
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0},//12)San Juan Tecuaco
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1},//13)Santa María Ixhuatán
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},//14)Oratorio
            
        };

        double coe[][] = {
           //1   2   3  4   5     6     7     8    9  10 11 12 13 14
            {0, 2.8, 0, 0, 28.4, 15.7, 17.5, 46.2, 0, 0, 0, 0, 0, 0},//1)Santarosa de lima
           //1    2  3  4   5     6     7  8  9     10  11 12 13 14
            {2.8, 0, 0, 52, 17.3, 46.9, 0, 0, 33.1, 0, 0, 0, 0, 0},//2)Nueva Santa Rosa
           
           //1  2  3  4     5  6     7  8  9    10  11 12 13 14
            {0, 0, 0, 18.2, 0, 41.5, 0, 0, 104.1, 0, 0, 0, 0, 0},//3)San Rafael las Flores
           //1  2    3     4   5  6  7  8  9 10  11 12 13 14
            {0, 2.8, 20.9, 25, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0},//4)Casillas
           //1     2  3   4  5  6  7     8  9  10 11     12 13 14
            {28.4, 0, 25, 0, 0, 0, 13.3, 0, 0, 0, 146.4, 0, 0, 20.7},//5)Cuilapa
           //1     2     3  4  5     6  7     8  9  10 11 12 13 14
            {15.8, 18.8, 0, 0, 22.1, 0, 11.2, 0, 0, 0, 0, 0, 0, 0},//6)Santa Cruz Naranjo
           //1     2  3  4  5     6     7  8     9  10 11 12 13 14
            {39.8, 0, 0, 0, 13.3, 11.1, 0, 29.4, 0, 0, 0, 0, 0, 0},//7)Barberena
           //1     2  3  4  5  6  7     8  9 10  11 12 13 14
            {46.2, 0, 0, 0, 0, 0, 29.4, 0, 0, 0, 0, 0, 0, 0},//8)Pueblo Nuevo Viñas
           //1  2  3  4  5  6  7  8  9 10  11 12 13 14
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//9)Taxisco
           //1  2  3  4  5  6  7  8  9 10  11 12 13 14
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//10)Guazacapán
           //1  2  3  4  5  6  7  8  9 10  11 12 13 14
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//11)Chiquimulilla
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//12)San Juan Tecuaco
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//13)Santa María Ixhuatán
            {10,24.2, 45, 45, 12.86, 78, 45, 47, 8, 9, 47, 78, 9, 45},//14)Oratorio
            
        };

        int xx1[] =    {408, 448, 508, 540, 440, 385, 355, 300, 280,  350,  400,  450,  470, 550 };
        int yy1[] =    {190, 250, 170, 220, 305, 220, 280, 300, 450,  450,  435,  430,  380, 380 };
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
      
        for (int j = 0; j < 14; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 14; j++) {
            for (int k = 0; k < 14; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 14;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();
        
//        1) Santa Rosa de Lima
//2) Nueva Santa Rosa
//3) San Rafael las FLores
//4) Casillas
//5) Cuilapa
//6) Santa Cruz Naranjo
//7) Barberena
//8) Pueblo Nuevo Viñas
//9) taxisco
//10) Guaacapán
//11) Chiquimula
//12) San Juan Tecuaco
//13) Santa Maria Ixhuatán
//14) Oratorio

        if ("1) Santa Rosa de Lima".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("2) Nueva Santa Rosa".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("3) San Rafael las FLores".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("4) Casillas".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("5) Cuilapa".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("6) Santa Cruz Naranjo".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("7) Barberena".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("8) Pueblo Nuevo Viñas".equals(nombreOrigen)) {
            origen = 7;
        }
        
        if ("9) taxisco".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("10) Guaacapán".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("11) Chiquimula".equals(nombreOrigen)) {
            origen = 10;
        }
       
        if ("12) San Juan Tecuaco".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("13) Santa Maria Ixhuatán".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("14) Oratorio".equals(nombreOrigen)) {
            origen = 13;
        }
        

        
        if ("1) Santa Rosa de Lima".equals(nombreDestino)) {
            origen = 0;
        }
        if ("2) Nueva Santa Rosa".equals(nombreDestino)) {
            origen = 1;
        }
        if ("3) San Rafael las FLores".equals(nombreDestino)) {
            origen = 2;
        }
        if ("4) Casillas".equals(nombreDestino)) {
            origen = 3;
        }
        if ("5) Cuilapa".equals(nombreDestino)) {
            origen = 4;
        }
        if ("6) Santa Cruz Naranjo".equals(nombreDestino)) {
            origen = 5;
        }
        if ("7) Barberena".equals(nombreDestino)) {
            origen = 6;
        }
        if ("8) Pueblo Nuevo Viñas".equals(nombreDestino)) {
            origen = 7;
        }
        
        if ("9) taxisco".equals(nombreDestino)) {
            origen = 8;
        }
        if ("10) Guaacapán".equals(nombreDestino)) {
            origen = 9;
        }
        if ("11) Chiquimula".equals(nombreDestino)) {
            origen = 10;
        }
       
        if ("12) San Juan Tecuaco".equals(nombreDestino)) {
            origen = 11;
        }
        if ("13) Santa Maria Ixhuatán".equals(nombreDestino)) {
            origen = 12;
        }
        if ("14) Oratorio".equals(nombreDestino)) {
            origen = 13;
        }
        

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreDestino);
            txtKMAcumulados.setText("Tiene un erro intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("Felicidades usted a encontrado la ruta mas corta, viaje concuidado");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    public static void main(String args[]) {
      

      
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JLabel txtDestino1;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
