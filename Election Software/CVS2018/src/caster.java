
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFCell;






public class caster extends javax.swing.JFrame {
    //Head Boy
    Integer[] hbVotes = {0,0,0,0};
    
    //Head Girl
    Integer[] hgVotes = {0,0,0,0};
    
    //Asst. Head Boy
    Integer[] ahbVotes = {0,0,0,0};
    
    //Asst. Head Girl
    Integer[] ahgVotes = {0,0,0,0};
    
    //Cultural Secretary
    Integer[] csVotes = {0,0,0,0};
        
    //Sports Captain
    Integer[] scVotes = {0,0,0,0};
    
    //Sports Vice Captain
    Integer[] scvVotes = {0,0,0,0};
    
    //Junior Sports Captain
    Integer[] scjeiVotes = {0,0,0,0};
    Integer[] scjVotes = {0,0,0,0};
    
    //NARMADA
    Integer[] ncVotes = {0,0,0,0};
    Integer[] nvcVotes = {0,0,0,0};
    Integer[] njcVotes = {0,0,0,0};
    
    //CAUVERY
    Integer[] ccVotes = {0,0,0,0};
    Integer[] cvcVotes = {0,0,0,0};
    Integer[] cjcVotes = {0,0,0,0};
    
    //GANGOTRI
    Integer[] gcVotes = {0,0,0,0};
    Integer[] gvcVotes = {0,0,0,0};
    Integer[] gjcVotes = {0,0,0,0};
    
    //PERIYAR
    Integer[] pcVotes = {0,0,0,0};
    Integer[] pvcVotes = {0,0,0,0};
    Integer[] pjcVotes = {0,0,0,0}; 
    
   
    public caster() throws IOException, BiffException {
        this.getContentPane().setBackground(Color.WHITE);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hb = new javax.swing.JFrame();
        hblabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hbpic1 = new javax.swing.JLabel();
        hb1 = new javax.swing.JLabel();
        hb0v = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        hbpic2 = new javax.swing.JLabel();
        hb2 = new javax.swing.JLabel();
        hb1v = new javax.swing.JButton();
        hg = new javax.swing.JFrame();
        hglabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        hgpic1 = new javax.swing.JLabel();
        hg1 = new javax.swing.JLabel();
        hg0v = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        hgpic3 = new javax.swing.JLabel();
        hg3 = new javax.swing.JLabel();
        hg1v = new javax.swing.JButton();
        ahb = new javax.swing.JFrame();
        ahblabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ahbpic1 = new javax.swing.JLabel();
        ahb1 = new javax.swing.JLabel();
        ahb0v = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        ahb2 = new javax.swing.JLabel();
        ahb1v = new javax.swing.JButton();
        ahbpic2 = new javax.swing.JLabel();
        ahg = new javax.swing.JFrame();
        ahglabel = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        ahgpic1 = new javax.swing.JLabel();
        ahg1 = new javax.swing.JLabel();
        ahg0v = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        ahgpic2 = new javax.swing.JLabel();
        ahg2 = new javax.swing.JLabel();
        ahg1v = new javax.swing.JButton();
        cs = new javax.swing.JFrame();
        cslabel = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        cspic1 = new javax.swing.JLabel();
        cs1 = new javax.swing.JLabel();
        cs0v = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        cspic2 = new javax.swing.JLabel();
        cs2 = new javax.swing.JLabel();
        cs1v = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        cspic3 = new javax.swing.JLabel();
        cs3 = new javax.swing.JLabel();
        cs2v = new javax.swing.JButton();
        sc = new javax.swing.JFrame();
        scblabel = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        sc0v = new javax.swing.JButton();
        scb1 = new javax.swing.JLabel();
        scbpic1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        scbpic2 = new javax.swing.JLabel();
        scb2 = new javax.swing.JLabel();
        sc1v = new javax.swing.JButton();
        scv = new javax.swing.JFrame();
        scvlabel = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        scvpic1 = new javax.swing.JLabel();
        scv1 = new javax.swing.JLabel();
        scv0v = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        scvpic2 = new javax.swing.JLabel();
        scv2 = new javax.swing.JLabel();
        scv1v = new javax.swing.JButton();
        scjei = new javax.swing.JFrame();
        hblabel10 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        scjei0v = new javax.swing.JButton();
        scg3 = new javax.swing.JLabel();
        scgpic3 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        scgpic4 = new javax.swing.JLabel();
        scg4 = new javax.swing.JLabel();
        scjei1v = new javax.swing.JButton();
        scj = new javax.swing.JFrame();
        hblabel3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        scj0v = new javax.swing.JButton();
        scg1 = new javax.swing.JLabel();
        scgpic1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        scgpic2 = new javax.swing.JLabel();
        scg2 = new javax.swing.JLabel();
        scj1v = new javax.swing.JButton();
        house = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        narmada = new javax.swing.JButton();
        cauvery = new javax.swing.JButton();
        gangotri = new javax.swing.JButton();
        periyar = new javax.swing.JButton();
        nc = new javax.swing.JFrame();
        hblabel1 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        ncpic2 = new javax.swing.JLabel();
        nc2 = new javax.swing.JLabel();
        nc0v = new javax.swing.JButton();
        jPanel51 = new javax.swing.JPanel();
        ncpic1 = new javax.swing.JLabel();
        nc1 = new javax.swing.JLabel();
        nc1v = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        ncpic3 = new javax.swing.JLabel();
        nc3 = new javax.swing.JLabel();
        nc2v = new javax.swing.JButton();
        nvc = new javax.swing.JFrame();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        nvcpic1 = new javax.swing.JLabel();
        nvc1 = new javax.swing.JLabel();
        nvc0v = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        nvcpic2 = new javax.swing.JLabel();
        nvc2 = new javax.swing.JLabel();
        nvc1v = new javax.swing.JButton();
        nvclabel = new javax.swing.JLabel();
        njc = new javax.swing.JFrame();
        hblabel2 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        njcpic1 = new javax.swing.JLabel();
        njc1 = new javax.swing.JLabel();
        njc0v = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        njcpic2 = new javax.swing.JLabel();
        njc2 = new javax.swing.JLabel();
        njc1v = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        njcpic3 = new javax.swing.JLabel();
        njc3 = new javax.swing.JLabel();
        njc2v = new javax.swing.JButton();
        cc = new javax.swing.JFrame();
        hblabel4 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        ccpic1 = new javax.swing.JLabel();
        cc1 = new javax.swing.JLabel();
        cc0v = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        ccpic2 = new javax.swing.JLabel();
        cc2 = new javax.swing.JLabel();
        cc1v = new javax.swing.JButton();
        cjc = new javax.swing.JFrame();
        hblabel5 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        cjcpic1 = new javax.swing.JLabel();
        cjc1 = new javax.swing.JLabel();
        cjc0v = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        cjcpic2 = new javax.swing.JLabel();
        cjc2 = new javax.swing.JLabel();
        cjc1v = new javax.swing.JButton();
        jPanel57 = new javax.swing.JPanel();
        cjcpic3 = new javax.swing.JLabel();
        cjc3 = new javax.swing.JLabel();
        cjc2v = new javax.swing.JButton();
        gc = new javax.swing.JFrame();
        hblabel6 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        gcpic1 = new javax.swing.JLabel();
        gc1 = new javax.swing.JLabel();
        gc0v = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        gcpic2 = new javax.swing.JLabel();
        gc2 = new javax.swing.JLabel();
        gc1v = new javax.swing.JButton();
        gvc = new javax.swing.JFrame();
        csjlabel3 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        csjpic10 = new javax.swing.JLabel();
        csj13 = new javax.swing.JLabel();
        gvc0v = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        csjpic11 = new javax.swing.JLabel();
        csj14 = new javax.swing.JLabel();
        gvc1v = new javax.swing.JButton();
        gjc = new javax.swing.JFrame();
        hblabel7 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        gjcpic1 = new javax.swing.JLabel();
        gjc1 = new javax.swing.JLabel();
        gjc0v = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        gjcpic2 = new javax.swing.JLabel();
        gjc2 = new javax.swing.JLabel();
        gjc1v = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        gjcpic3 = new javax.swing.JLabel();
        gjc3 = new javax.swing.JLabel();
        gjc2v = new javax.swing.JButton();
        pvc = new javax.swing.JFrame();
        csjlabel4 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        csjpic13 = new javax.swing.JLabel();
        csj17 = new javax.swing.JLabel();
        pvc0v = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        csjpic14 = new javax.swing.JLabel();
        csj18 = new javax.swing.JLabel();
        pvc1v = new javax.swing.JButton();
        pjc = new javax.swing.JFrame();
        hblabel9 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        pjcpic1 = new javax.swing.JLabel();
        pjc1 = new javax.swing.JLabel();
        pjc0v = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        pjcpic2 = new javax.swing.JLabel();
        pjc2 = new javax.swing.JLabel();
        pjc1v = new javax.swing.JButton();
        jPanel62 = new javax.swing.JPanel();
        pjcpic3 = new javax.swing.JLabel();
        pjc3 = new javax.swing.JLabel();
        pjc2v = new javax.swing.JButton();
        thanx = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        hb.setBackground(new java.awt.Color(255, 255, 255));
        hb.setMinimumSize(new java.awt.Dimension(1366, 768));
        hb.setUndecorated(true);
        hb.setResizable(false);
        hb.setSize(new java.awt.Dimension(1366, 768));
        hb.getContentPane().setLayout(new java.awt.BorderLayout(0, 5));

        hblabel.setBackground(new java.awt.Color(0, 0, 0));
        hblabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel.setForeground(new java.awt.Color(255, 255, 255));
        hblabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel.setText("Head Boy");
        hblabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hblabel.setOpaque(true);
        hblabel.setPreferredSize(new java.awt.Dimension(182, 70));
        hb.getContentPane().add(hblabel, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 2, 2));

        hbpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hbpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/hb0Bryan.jpg"))); // NOI18N
        hbpic1.setName(""); // NOI18N

        hb1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        hb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hb1.setText("Bryan Bobby George");

        hb0v.setBackground(new java.awt.Color(0, 0, 0));
        hb0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        hb0v.setForeground(new java.awt.Color(255, 255, 255));
        hb0v.setText("Vote");
        hb0v.setToolTipText("");
        hb0v.setDefaultCapable(false);
        hb0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hb1)
                    .addComponent(hb0v))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(hbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hb0v)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        hbpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hbpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/hb1Raphael.jpg"))); // NOI18N
        hbpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        hb2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        hb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hb2.setText("Raphael Tony");

        hb1v.setBackground(new java.awt.Color(0, 0, 0));
        hb1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        hb1v.setForeground(new java.awt.Color(255, 255, 255));
        hb1v.setText("Vote");
        hb1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hb1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hb1v)
                    .addComponent(hb2)
                    .addComponent(hbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(hbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hb1v)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        hb.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        hg.setBackground(new java.awt.Color(255, 255, 255));
        hg.setMinimumSize(new java.awt.Dimension(1366, 768));
        hg.setUndecorated(true);
        hg.setResizable(false);
        hg.setSize(new java.awt.Dimension(1366, 768));

        hglabel.setBackground(new java.awt.Color(0, 0, 0));
        hglabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hglabel.setForeground(new java.awt.Color(255, 255, 255));
        hglabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hglabel.setText("Head Girl");
        hglabel.setOpaque(true);
        hglabel.setPreferredSize(new java.awt.Dimension(182, 70));
        hg.getContentPane().add(hglabel, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        hgpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hgpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/hg0Rose.jpg"))); // NOI18N
        hgpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hgpic1.setName(""); // NOI18N
        hgpic1.setPreferredSize(new java.awt.Dimension(200, 225));

        hg1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        hg1.setText("Rose Mibu");
        hg1.setName("hg1"); // NOI18N

        hg0v.setBackground(new java.awt.Color(0, 0, 0));
        hg0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        hg0v.setForeground(new java.awt.Color(255, 255, 255));
        hg0v.setText("Vote");
        hg0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hg0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hg1)
                    .addComponent(hg0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(hgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hg0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7);

        hgpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hgpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/hg1Mariam.jpg"))); // NOI18N
        hgpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hgpic3.setPreferredSize(new java.awt.Dimension(200, 225));

        hg3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        hg3.setText("Mariam George");
        hg3.setName("hg1"); // NOI18N

        hg1v.setBackground(new java.awt.Color(0, 0, 0));
        hg1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        hg1v.setForeground(new java.awt.Color(255, 255, 255));
        hg1v.setText("Vote");
        hg1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hg1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hgpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hg3)
                    .addComponent(hg1v))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(hgpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hg1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel8);

        hg.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        ahb.setBackground(new java.awt.Color(255, 255, 255));
        ahb.setMinimumSize(new java.awt.Dimension(1366, 768));
        ahb.setUndecorated(true);
        ahb.setResizable(false);
        ahb.setSize(new java.awt.Dimension(1366, 768));

        ahblabel.setBackground(new java.awt.Color(0, 0, 0));
        ahblabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        ahblabel.setForeground(new java.awt.Color(255, 255, 255));
        ahblabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahblabel.setText("Assistant Head Boy");
        ahblabel.setOpaque(true);
        ahblabel.setPreferredSize(new java.awt.Dimension(182, 70));
        ahblabel.setRequestFocusEnabled(false);
        ahb.getContentPane().add(ahblabel, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(0, 2));

        jPanel5.setPreferredSize(new java.awt.Dimension(683, 698));

        ahbpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahbpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/ahb0Siddharth.jpg"))); // NOI18N
        ahbpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ahbpic1.setName(""); // NOI18N

        ahb1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        ahb1.setText("Siddharth Anil Menon");

        ahb0v.setBackground(new java.awt.Color(0, 0, 0));
        ahb0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        ahb0v.setForeground(new java.awt.Color(255, 255, 255));
        ahb0v.setText("Vote");
        ahb0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahb0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ahb1)
                    .addComponent(ahb0v)
                    .addComponent(ahbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ahbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ahb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ahb0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(683, 698));

        ahb2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        ahb2.setText("Mathew Rajesh");

        ahb1v.setBackground(new java.awt.Color(0, 0, 0));
        ahb1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        ahb1v.setForeground(new java.awt.Color(255, 255, 255));
        ahb1v.setText("Vote");
        ahb1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahb1vActionPerformed(evt);
            }
        });

        ahbpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahbpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/ahb1Mathew.jpg"))); // NOI18N
        ahbpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ahbpic2.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ahb2)
                    .addComponent(ahb1v)
                    .addComponent(ahbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ahbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ahb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ahb1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9);

        ahb.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        ahg.setBackground(new java.awt.Color(255, 255, 255));
        ahg.setMinimumSize(new java.awt.Dimension(1366, 768));
        ahg.setUndecorated(true);
        ahg.setResizable(false);
        ahg.setSize(new java.awt.Dimension(1366, 768));

        ahglabel.setBackground(new java.awt.Color(0, 0, 0));
        ahglabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        ahglabel.setForeground(new java.awt.Color(255, 255, 255));
        ahglabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahglabel.setText("Assistant Head Girl");
        ahglabel.setOpaque(true);
        ahglabel.setPreferredSize(new java.awt.Dimension(182, 70));
        ahg.getContentPane().add(ahglabel, java.awt.BorderLayout.NORTH);

        jPanel44.setLayout(new java.awt.GridLayout(1, 2));

        ahgpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahgpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/ahg0Rachel.jpg"))); // NOI18N
        ahgpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ahgpic1.setName(""); // NOI18N

        ahg1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        ahg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahg1.setText("Rachel Anna George");

        ahg0v.setBackground(new java.awt.Color(0, 0, 0));
        ahg0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        ahg0v.setForeground(new java.awt.Color(255, 255, 255));
        ahg0v.setText("Vote");
        ahg0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahg0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ahgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ahg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ahg0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ahgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ahg1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ahg0v)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel44.add(jPanel10);

        ahgpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahgpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/ahg1Ann.jpg"))); // NOI18N
        ahgpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ahg2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        ahg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ahg2.setText("Ann Maria Dominic");

        ahg1v.setBackground(new java.awt.Color(0, 0, 0));
        ahg1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        ahg1v.setForeground(new java.awt.Color(255, 255, 255));
        ahg1v.setText("Vote");
        ahg1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahg1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ahgpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ahg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ahg1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ahgpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ahg2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ahg1v)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel44.add(jPanel11);

        ahg.getContentPane().add(jPanel44, java.awt.BorderLayout.CENTER);

        cs.setBackground(new java.awt.Color(255, 255, 255));
        cs.setMinimumSize(new java.awt.Dimension(1366, 768));
        cs.setUndecorated(true);
        cs.setResizable(false);
        cs.setSize(new java.awt.Dimension(1366, 768));

        cslabel.setBackground(new java.awt.Color(0, 0, 0));
        cslabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        cslabel.setForeground(new java.awt.Color(255, 255, 255));
        cslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cslabel.setText("Cultural Secretary");
        cslabel.setOpaque(true);
        cslabel.setPreferredSize(new java.awt.Dimension(182, 70));
        cs.getContentPane().add(cslabel, java.awt.BorderLayout.PAGE_START);

        jPanel12.setLayout(new java.awt.GridLayout(1, 3));

        cspic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cspic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cs0Sharone.jpg"))); // NOI18N
        cspic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cspic1.setName(""); // NOI18N
        cspic1.setPreferredSize(new java.awt.Dimension(200, 225));

        cs1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cs1.setText("Sharone Paul");
        cs1.setName("hg1"); // NOI18N

        cs0v.setBackground(new java.awt.Color(0, 0, 0));
        cs0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cs0v.setForeground(new java.awt.Color(255, 255, 255));
        cs0v.setText("Vote");
        cs0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cs1)
                    .addComponent(cs0v)
                    .addComponent(cspic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cspic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cs1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cs0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel13);

        cspic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cspic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cs1Brooke.jpg"))); // NOI18N
        cspic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cspic2.setPreferredSize(new java.awt.Dimension(200, 225));

        cs2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cs2.setText("Brooke George");
        cs2.setName("hg1"); // NOI18N

        cs1v.setBackground(new java.awt.Color(0, 0, 0));
        cs1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cs1v.setForeground(new java.awt.Color(255, 255, 255));
        cs1v.setText("Vote");
        cs1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cspic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cs2)
                    .addComponent(cs1v))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cspic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cs2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cs1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel14);

        cspic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cspic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sample3.png"))); // NOI18N
        cspic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cspic3.setPreferredSize(new java.awt.Dimension(200, 225));

        cs3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cs3.setText("Mehnaaz Mather");
        cs3.setName("hg1"); // NOI18N

        cs2v.setBackground(new java.awt.Color(0, 0, 0));
        cs2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cs2v.setForeground(new java.awt.Color(255, 255, 255));
        cs2v.setText("Vote");
        cs2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cs2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cs2v)
                    .addComponent(cs3)
                    .addComponent(cspic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cspic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cs3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cs2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel12.add(jPanel15);

        cs.getContentPane().add(jPanel12, java.awt.BorderLayout.CENTER);

        sc.setBackground(new java.awt.Color(255, 255, 255));
        sc.setMinimumSize(new java.awt.Dimension(1366, 768));
        sc.setUndecorated(true);
        sc.setResizable(false);
        sc.setSize(new java.awt.Dimension(1366, 768));

        scblabel.setBackground(new java.awt.Color(0, 0, 0));
        scblabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        scblabel.setForeground(new java.awt.Color(255, 255, 255));
        scblabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scblabel.setText("Sports Captain");
        scblabel.setOpaque(true);
        scblabel.setPreferredSize(new java.awt.Dimension(182, 70));
        sc.getContentPane().add(scblabel, java.awt.BorderLayout.NORTH);

        jPanel18.setLayout(new java.awt.GridLayout(1, 2));

        sc0v.setBackground(new java.awt.Color(0, 0, 0));
        sc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        sc0v.setForeground(new java.awt.Color(255, 255, 255));
        sc0v.setText("Vote");
        sc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc0vActionPerformed(evt);
            }
        });

        scb1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scb1.setText("Kiran Shankar");

        scbpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scbpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/sc0Kiran.jpg"))); // NOI18N
        scbpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scbpic1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sc0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scbpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel16);

        scbpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scbpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/sc1Sandhra.jpg"))); // NOI18N
        scbpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        scb2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scb2.setText("Sandhra P. Bijoy");

        sc1v.setBackground(new java.awt.Color(0, 0, 0));
        sc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        sc1v.setForeground(new java.awt.Color(255, 255, 255));
        sc1v.setText("Vote");
        sc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sc1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scbpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel17);

        sc.getContentPane().add(jPanel18, java.awt.BorderLayout.CENTER);

        scv.setBackground(new java.awt.Color(255, 255, 255));
        scv.setMinimumSize(new java.awt.Dimension(1366, 768));
        scv.setUndecorated(true);
        scv.setResizable(false);
        scv.setSize(new java.awt.Dimension(1366, 768));

        scvlabel.setBackground(new java.awt.Color(0, 0, 0));
        scvlabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        scvlabel.setForeground(new java.awt.Color(255, 255, 255));
        scvlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scvlabel.setText("Sports Vice Captain");
        scvlabel.setOpaque(true);
        scvlabel.setPreferredSize(new java.awt.Dimension(182, 70));
        scv.getContentPane().add(scvlabel, java.awt.BorderLayout.PAGE_START);

        jPanel24.setLayout(new java.awt.GridLayout(1, 2));

        scvpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scvpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/svc0Elisheba.jpg"))); // NOI18N
        scvpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scvpic1.setName(""); // NOI18N
        scvpic1.setPreferredSize(new java.awt.Dimension(200, 225));

        scv1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scv1.setText("Elisheba Naveen");
        scv1.setName("hg1"); // NOI18N

        scv0v.setBackground(new java.awt.Color(0, 0, 0));
        scv0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scv0v.setForeground(new java.awt.Color(255, 255, 255));
        scv0v.setText("Vote");
        scv0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scv0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scv1)
                    .addComponent(scv0v)
                    .addComponent(scvpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scvpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scv1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scv0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel24.add(jPanel25);

        scvpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scvpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/svc1Maneesh.jpg"))); // NOI18N
        scvpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scvpic2.setPreferredSize(new java.awt.Dimension(200, 225));

        scv2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scv2.setText("Maneesh Janardhanan");
        scv2.setName("hg1"); // NOI18N

        scv1v.setBackground(new java.awt.Color(0, 0, 0));
        scv1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scv1v.setForeground(new java.awt.Color(255, 255, 255));
        scv1v.setText("Vote");
        scv1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scv1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scv2)
                    .addComponent(scv1v)
                    .addComponent(scvpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scvpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scv2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scv1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel24.add(jPanel26);

        scv.getContentPane().add(jPanel24, java.awt.BorderLayout.CENTER);

        scjei.setBackground(new java.awt.Color(255, 255, 255));
        scjei.setMinimumSize(new java.awt.Dimension(1366, 768));
        scjei.setUndecorated(true);
        scjei.setResizable(false);
        scjei.setSize(new java.awt.Dimension(1366, 768));

        hblabel10.setBackground(new java.awt.Color(0, 0, 0));
        hblabel10.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel10.setForeground(new java.awt.Color(255, 255, 255));
        hblabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel10.setText("Junior Sports Captain (From 8th Grade)");
        hblabel10.setOpaque(true);
        hblabel10.setPreferredSize(new java.awt.Dimension(182, 70));
        scjei.getContentPane().add(hblabel10, java.awt.BorderLayout.NORTH);

        jPanel22.setLayout(new java.awt.GridLayout(1, 2));

        scjei0v.setBackground(new java.awt.Color(0, 0, 0));
        scjei0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scjei0v.setForeground(new java.awt.Color(255, 255, 255));
        scjei0v.setText("Vote");
        scjei0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scjei0vActionPerformed(evt);
            }
        });

        scg3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scg3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scg3.setText("Jaik Kuruvilla");

        scgpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scgpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/scjei0Jaik.jpg"))); // NOI18N
        scgpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scgpic3.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scjei0v)
                    .addComponent(scgpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scgpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scjei0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel23);

        scgpic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scgpic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/scjei1Raghav.jpg"))); // NOI18N
        scgpic4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        scg4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scg4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scg4.setText("Raghav R.");

        scjei1v.setBackground(new java.awt.Color(0, 0, 0));
        scjei1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scjei1v.setForeground(new java.awt.Color(255, 255, 255));
        scjei1v.setText("Vote");
        scjei1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scjei1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scgpic4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scjei1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scgpic4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scg4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scjei1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel27);

        scjei.getContentPane().add(jPanel22, java.awt.BorderLayout.CENTER);

        scj.setBackground(new java.awt.Color(255, 255, 255));
        scj.setMinimumSize(new java.awt.Dimension(1366, 768));
        scj.setUndecorated(true);
        scj.setResizable(false);
        scj.setSize(new java.awt.Dimension(1366, 768));

        hblabel3.setBackground(new java.awt.Color(0, 0, 0));
        hblabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel3.setForeground(new java.awt.Color(255, 255, 255));
        hblabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel3.setText("Junior Sports Captain (From 9th Grade)");
        hblabel3.setOpaque(true);
        hblabel3.setPreferredSize(new java.awt.Dimension(182, 70));
        scj.getContentPane().add(hblabel3, java.awt.BorderLayout.NORTH);

        jPanel21.setLayout(new java.awt.GridLayout(1, 2));

        scj0v.setBackground(new java.awt.Color(0, 0, 0));
        scj0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scj0v.setForeground(new java.awt.Color(255, 255, 255));
        scj0v.setText("Vote");
        scj0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scj0vActionPerformed(evt);
            }
        });

        scg1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scg1.setText("Gowri S. Nair");

        scgpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scgpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/scj0Gowri.jpg"))); // NOI18N
        scgpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        scgpic1.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scj0v)
                    .addComponent(scgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scgpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scj0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel19);

        scgpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scgpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/scj1Aadil.jpg"))); // NOI18N
        scgpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        scg2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        scg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scg2.setText("Aadil Ismail");

        scj1v.setBackground(new java.awt.Color(0, 0, 0));
        scj1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        scj1v.setForeground(new java.awt.Color(255, 255, 255));
        scj1v.setText("Vote");
        scj1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scj1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scgpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scj1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(scgpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scj1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel20);

        scj.getContentPane().add(jPanel21, java.awt.BorderLayout.CENTER);

        house.setMinimumSize(new java.awt.Dimension(1366, 768));
        house.setUndecorated(true);
        house.setResizable(false);
        house.setSize(new java.awt.Dimension(1366, 768));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choose your House");

        narmada.setBackground(new java.awt.Color(255, 51, 51));
        narmada.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        narmada.setText("Narmada");
        narmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narmadaActionPerformed(evt);
            }
        });

        cauvery.setBackground(new java.awt.Color(0, 51, 255));
        cauvery.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cauvery.setText("Cauvery");
        cauvery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cauveryActionPerformed(evt);
            }
        });

        gangotri.setBackground(new java.awt.Color(0, 153, 51));
        gangotri.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gangotri.setText("Gangotri");
        gangotri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gangotriActionPerformed(evt);
            }
        });

        periyar.setBackground(new java.awt.Color(255, 255, 0));
        periyar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        periyar.setText("Periyar");
        periyar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periyarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout houseLayout = new javax.swing.GroupLayout(house.getContentPane());
        house.getContentPane().setLayout(houseLayout);
        houseLayout.setHorizontalGroup(
            houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, houseLayout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addGroup(houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gangotri, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(narmada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cauvery, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periyar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(501, 501, 501))
        );
        houseLayout.setVerticalGroup(
            houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(houseLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(narmada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cauvery, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(houseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gangotri, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periyar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 140, Short.MAX_VALUE))
        );

        nc.setBackground(new java.awt.Color(255, 255, 255));
        nc.setMinimumSize(new java.awt.Dimension(1366, 768));
        nc.setUndecorated(true);
        nc.setResizable(false);
        nc.setSize(new java.awt.Dimension(1366, 768));

        hblabel1.setBackground(new java.awt.Color(204, 0, 0));
        hblabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel1.setForeground(new java.awt.Color(255, 255, 255));
        hblabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel1.setText("Narmada House Captain");
        hblabel1.setOpaque(true);
        hblabel1.setPreferredSize(new java.awt.Dimension(182, 70));
        nc.getContentPane().add(hblabel1, java.awt.BorderLayout.NORTH);

        jPanel50.setLayout(new java.awt.GridLayout(1, 0));

        ncpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ncpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/nc0Maria.jpg"))); // NOI18N
        ncpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nc2.setText("Maria Charles");

        nc0v.setBackground(new java.awt.Color(0, 0, 0));
        nc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nc0v.setForeground(new java.awt.Color(255, 255, 255));
        nc0v.setText("Vote");
        nc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nc0v)
                    .addComponent(nc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ncpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ncpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel50.add(jPanel48);

        ncpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ncpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/nc1Noel.jpg"))); // NOI18N
        ncpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ncpic1.setName(""); // NOI18N

        nc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nc1.setText("Noel Martin");

        nc1v.setBackground(new java.awt.Color(0, 0, 0));
        nc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nc1v.setForeground(new java.awt.Color(255, 255, 255));
        nc1v.setText("Vote");
        nc1v.setToolTipText("");
        nc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nc1v)
                    .addComponent(ncpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ncpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel50.add(jPanel51);

        ncpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ncpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/nc2Prerana.jpg"))); // NOI18N
        ncpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        nc3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nc3.setText("Prerana Maria Alok");

        nc2v.setBackground(new java.awt.Color(0, 0, 0));
        nc2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nc2v.setForeground(new java.awt.Color(255, 255, 255));
        nc2v.setText("Vote");
        nc2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nc2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nc2v)
                    .addComponent(ncpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ncpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nc2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel50.add(jPanel49);

        nc.getContentPane().add(jPanel50, java.awt.BorderLayout.CENTER);

        nvc.setBackground(new java.awt.Color(255, 255, 255));
        nvc.setMinimumSize(new java.awt.Dimension(1366, 768));
        nvc.setUndecorated(true);
        nvc.setResizable(false);
        nvc.setSize(new java.awt.Dimension(1366, 768));

        jPanel28.setLayout(new java.awt.GridLayout(1, 3));

        nvcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/nvc0Hetvi.jpg"))); // NOI18N
        nvcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nvcpic1.setName(""); // NOI18N
        nvcpic1.setPreferredSize(new java.awt.Dimension(200, 225));

        nvc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nvc1.setText("Hetvi Lalan");
        nvc1.setName("hg1"); // NOI18N

        nvc0v.setBackground(new java.awt.Color(0, 0, 0));
        nvc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nvc0v.setForeground(new java.awt.Color(255, 255, 255));
        nvc0v.setText("Vote");
        nvc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nvc0v)
                    .addComponent(nvc1)
                    .addComponent(nvcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(nvcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nvc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nvc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel28.add(jPanel29);

        nvcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/nvc1Riya.jpg"))); // NOI18N
        nvcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        nvcpic2.setPreferredSize(new java.awt.Dimension(200, 225));

        nvc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        nvc2.setText("Riya Renjith");
        nvc2.setName("hg1"); // NOI18N

        nvc1v.setBackground(new java.awt.Color(0, 0, 0));
        nvc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        nvc1v.setForeground(new java.awt.Color(255, 255, 255));
        nvc1v.setText("Vote");
        nvc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nvcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nvc2)
                    .addComponent(nvc1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(nvcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nvc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nvc1v)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel28.add(jPanel30);

        nvc.getContentPane().add(jPanel28, java.awt.BorderLayout.CENTER);

        nvclabel.setBackground(new java.awt.Color(204, 0, 0));
        nvclabel.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        nvclabel.setForeground(new java.awt.Color(255, 255, 255));
        nvclabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvclabel.setText("Narmada House Vice captain");
        nvclabel.setOpaque(true);
        nvclabel.setPreferredSize(new java.awt.Dimension(182, 70));
        nvc.getContentPane().add(nvclabel, java.awt.BorderLayout.PAGE_START);

        njc.setBackground(new java.awt.Color(255, 255, 255));
        njc.setMinimumSize(new java.awt.Dimension(1366, 768));
        njc.setUndecorated(true);
        njc.setResizable(false);
        njc.setSize(new java.awt.Dimension(1366, 768));

        hblabel2.setBackground(new java.awt.Color(204, 0, 0));
        hblabel2.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel2.setForeground(new java.awt.Color(255, 255, 255));
        hblabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel2.setText("Narmada Junior House Captain");
        hblabel2.setOpaque(true);
        hblabel2.setPreferredSize(new java.awt.Dimension(182, 70));
        njc.getContentPane().add(hblabel2, java.awt.BorderLayout.NORTH);

        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        njcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/njc0Roshal.jpg"))); // NOI18N
        njcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        njcpic1.setName(""); // NOI18N

        njc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        njc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njc1.setText("Roshal Mathew");

        njc0v.setBackground(new java.awt.Color(0, 0, 0));
        njc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        njc0v.setForeground(new java.awt.Color(255, 255, 255));
        njc0v.setText("Vote");
        njc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(njc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(njc0v)
                    .addComponent(njcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(njcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(njc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(njc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel47.add(jPanel31);

        njcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/njc1Aditya.jpg"))); // NOI18N
        njcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        njc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        njc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njc2.setText("Aditya Gupta");

        njc1v.setBackground(new java.awt.Color(0, 0, 0));
        njc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        njc1v.setForeground(new java.awt.Color(255, 255, 255));
        njc1v.setText("Vote");
        njc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(njc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(njc1v)
                    .addComponent(njcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(njcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(njc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(njc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel47.add(jPanel45);

        njcpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njcpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/njc2Mia.jpg"))); // NOI18N
        njcpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        njc3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        njc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        njc3.setText("Mia Mathew");

        njc2v.setBackground(new java.awt.Color(0, 0, 0));
        njc2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        njc2v.setForeground(new java.awt.Color(255, 255, 255));
        njc2v.setText("Vote");
        njc2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njc2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(njc2v)
                    .addComponent(njc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(njcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(njcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(njc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(njc2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel47.add(jPanel46);

        njc.getContentPane().add(jPanel47, java.awt.BorderLayout.CENTER);

        cc.setBackground(new java.awt.Color(255, 255, 255));
        cc.setMinimumSize(new java.awt.Dimension(1366, 768));
        cc.setUndecorated(true);
        cc.setResizable(false);
        cc.setSize(new java.awt.Dimension(1366, 768));

        hblabel4.setBackground(new java.awt.Color(0, 51, 153));
        hblabel4.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel4.setForeground(new java.awt.Color(255, 255, 255));
        hblabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel4.setText("Cauvery House Captain");
        hblabel4.setOpaque(true);
        hblabel4.setPreferredSize(new java.awt.Dimension(182, 70));
        cc.getContentPane().add(hblabel4, java.awt.BorderLayout.NORTH);

        jPanel55.setLayout(new java.awt.GridLayout(1, 2));

        ccpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cc0Bhagya.jpg"))); // NOI18N
        ccpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ccpic1.setName(""); // NOI18N

        cc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cc1.setText("Bhagya Vinod");

        cc0v.setBackground(new java.awt.Color(0, 0, 0));
        cc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cc0v.setForeground(new java.awt.Color(255, 255, 255));
        cc0v.setText("Vote");
        cc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ccpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cc0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ccpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel55.add(jPanel52);

        ccpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cc1Tanisha.jpg"))); // NOI18N
        ccpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cc2.setText("Tanisha Amina Shiraz");

        cc1v.setBackground(new java.awt.Color(0, 0, 0));
        cc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cc1v.setForeground(new java.awt.Color(255, 255, 255));
        cc1v.setText("Vote");
        cc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ccpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cc1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ccpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel55.add(jPanel53);

        cc.getContentPane().add(jPanel55, java.awt.BorderLayout.CENTER);

        cjc.setBackground(new java.awt.Color(255, 255, 255));
        cjc.setMinimumSize(new java.awt.Dimension(1366, 768));
        cjc.setUndecorated(true);
        cjc.setResizable(false);
        cjc.setSize(new java.awt.Dimension(1366, 768));

        hblabel5.setBackground(new java.awt.Color(0, 51, 153));
        hblabel5.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel5.setForeground(new java.awt.Color(255, 255, 255));
        hblabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel5.setText("Cauvery Junior House Captain");
        hblabel5.setOpaque(true);
        hblabel5.setPreferredSize(new java.awt.Dimension(182, 70));
        cjc.getContentPane().add(hblabel5, java.awt.BorderLayout.NORTH);

        jPanel58.setLayout(new java.awt.GridLayout(1, 3));

        cjcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cjc0Naufrida.jpg"))); // NOI18N
        cjcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cjcpic1.setName(""); // NOI18N

        cjc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cjc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjc1.setText("Naufrida Neyas Mohammed");

        cjc0v.setBackground(new java.awt.Color(0, 0, 0));
        cjc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cjc0v.setForeground(new java.awt.Color(255, 255, 255));
        cjc0v.setText("Vote");
        cjc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cjc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cjc0v)
                    .addComponent(cjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cjc1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cjc0v)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel58.add(jPanel54);

        cjcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cjc1Tanya.jpg"))); // NOI18N
        cjcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cjc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cjc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjc2.setText("Tanya George");

        cjc1v.setBackground(new java.awt.Color(0, 0, 0));
        cjc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cjc1v.setForeground(new java.awt.Color(255, 255, 255));
        cjc1v.setText("Vote");
        cjc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cjc1v)
                    .addComponent(cjc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cjc2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cjc1v)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel58.add(jPanel56);

        cjcpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjcpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/cjc2Shashank.jpg"))); // NOI18N
        cjcpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cjc3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        cjc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cjc3.setText("T. S. Shashank");

        cjc2v.setBackground(new java.awt.Color(0, 0, 0));
        cjc2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cjc2v.setForeground(new java.awt.Color(255, 255, 255));
        cjc2v.setText("Vote");
        cjc2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjc2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cjc3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cjc2v)
                    .addComponent(cjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(cjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cjc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cjc2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel58.add(jPanel57);

        cjc.getContentPane().add(jPanel58, java.awt.BorderLayout.CENTER);

        gc.setBackground(new java.awt.Color(255, 255, 255));
        gc.setMinimumSize(new java.awt.Dimension(1366, 768));
        gc.setUndecorated(true);
        gc.setResizable(false);
        gc.setSize(new java.awt.Dimension(1366, 768));

        hblabel6.setBackground(new java.awt.Color(0, 153, 0));
        hblabel6.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel6.setForeground(new java.awt.Color(255, 255, 255));
        hblabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel6.setText("Gangotri House Captain");
        hblabel6.setOpaque(true);
        hblabel6.setPreferredSize(new java.awt.Dimension(182, 70));
        gc.getContentPane().add(hblabel6, java.awt.BorderLayout.NORTH);

        jPanel34.setLayout(new java.awt.GridLayout(1, 2));

        gcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gc0Namitha.jpg"))); // NOI18N
        gcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gcpic1.setName(""); // NOI18N

        gc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        gc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gc1.setText("Namitha Sunil");

        gc0v.setBackground(new java.awt.Color(0, 0, 0));
        gc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gc0v.setForeground(new java.awt.Color(255, 255, 255));
        gc0v.setText("Vote");
        gc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gc0v)
                    .addComponent(gcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(gcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel34.add(jPanel33);

        gcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gc1Rohan.jpg"))); // NOI18N
        gcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        gc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        gc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gc2.setText("Rohan Sunny");

        gc1v.setBackground(new java.awt.Color(0, 0, 0));
        gc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gc1v.setForeground(new java.awt.Color(255, 255, 255));
        gc1v.setText("Vote");
        gc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gc1v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(gcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel34.add(jPanel32);

        gc.getContentPane().add(jPanel34, java.awt.BorderLayout.CENTER);

        gvc.setBackground(new java.awt.Color(255, 255, 255));
        gvc.setMinimumSize(new java.awt.Dimension(1366, 768));
        gvc.setUndecorated(true);
        gvc.setResizable(false);
        gvc.setSize(new java.awt.Dimension(1366, 768));

        csjlabel3.setBackground(new java.awt.Color(0, 153, 0));
        csjlabel3.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        csjlabel3.setForeground(new java.awt.Color(255, 255, 255));
        csjlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjlabel3.setText("Gangotri House Vice Captain");
        csjlabel3.setOpaque(true);
        csjlabel3.setPreferredSize(new java.awt.Dimension(182, 70));
        gvc.getContentPane().add(csjlabel3, java.awt.BorderLayout.PAGE_START);

        jPanel36.setLayout(new java.awt.GridLayout(1, 3));

        csjpic10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjpic10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gvc0Karishma.jpg"))); // NOI18N
        csjpic10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        csjpic10.setName(""); // NOI18N
        csjpic10.setPreferredSize(new java.awt.Dimension(200, 225));

        csj13.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        csj13.setText("Karishma H. Kothari");
        csj13.setName("hg1"); // NOI18N

        gvc0v.setBackground(new java.awt.Color(0, 0, 0));
        gvc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gvc0v.setForeground(new java.awt.Color(255, 255, 255));
        gvc0v.setText("Vote");
        gvc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gvc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(csjpic10, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csj13)
                    .addComponent(gvc0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(csjpic10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(csj13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gvc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel36.add(jPanel37);

        csjpic11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjpic11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gvc1Elizabeth.jpg"))); // NOI18N
        csjpic11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        csjpic11.setPreferredSize(new java.awt.Dimension(200, 225));

        csj14.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        csj14.setText("Elizabeth Jacob");
        csj14.setName("hg1"); // NOI18N

        gvc1v.setBackground(new java.awt.Color(0, 0, 0));
        gvc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gvc1v.setForeground(new java.awt.Color(255, 255, 255));
        gvc1v.setText("Vote");
        gvc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gvc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(csj14)
                    .addComponent(gvc1v)
                    .addComponent(csjpic11, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(csjpic11, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(csj14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gvc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel36.add(jPanel38);

        gvc.getContentPane().add(jPanel36, java.awt.BorderLayout.CENTER);

        gjc.setBackground(new java.awt.Color(255, 255, 255));
        gjc.setMinimumSize(new java.awt.Dimension(1366, 768));
        gjc.setUndecorated(true);
        gjc.setResizable(false);
        gjc.setSize(new java.awt.Dimension(1366, 768));

        hblabel7.setBackground(new java.awt.Color(0, 153, 0));
        hblabel7.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel7.setForeground(new java.awt.Color(255, 255, 255));
        hblabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel7.setText("Gangotri Junior House Captain");
        hblabel7.setOpaque(true);
        hblabel7.setPreferredSize(new java.awt.Dimension(182, 70));
        gjc.getContentPane().add(hblabel7, java.awt.BorderLayout.NORTH);

        jPanel60.setLayout(new java.awt.GridLayout(1, 3));

        gjcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gjcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gjc0Prathibha.jpg"))); // NOI18N
        gjcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gjcpic1.setName(""); // NOI18N

        gjc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        gjc1.setText("Prathibha Premkumar");

        gjc0v.setBackground(new java.awt.Color(0, 0, 0));
        gjc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gjc0v.setForeground(new java.awt.Color(255, 255, 255));
        gjc0v.setText("Vote");
        gjc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gjc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gjc1)
                    .addComponent(gjc0v))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(gjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gjc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gjc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel60.add(jPanel59);

        gjcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gjcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gjc1Annya.jpg"))); // NOI18N
        gjcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        gjc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        gjc2.setText("Annya Anil");

        gjc1v.setBackground(new java.awt.Color(0, 0, 0));
        gjc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gjc1v.setForeground(new java.awt.Color(255, 255, 255));
        gjc1v.setText("Vote");
        gjc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gjc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gjc2)
                    .addComponent(gjc1v)
                    .addComponent(gjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(gjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gjc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gjc1v)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel60.add(jPanel39);

        gjcpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gjcpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/gjc2Yakov.jpg"))); // NOI18N
        gjcpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        gjc3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        gjc3.setText("Yakov George");

        gjc2v.setBackground(new java.awt.Color(0, 0, 0));
        gjc2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        gjc2v.setForeground(new java.awt.Color(255, 255, 255));
        gjc2v.setText("Vote");
        gjc2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gjc2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gjc3)
                    .addComponent(gjc2v))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(gjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gjc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gjc2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel60.add(jPanel35);

        gjc.getContentPane().add(jPanel60, java.awt.BorderLayout.CENTER);

        pvc.setBackground(new java.awt.Color(255, 255, 255));
        pvc.setMinimumSize(new java.awt.Dimension(1366, 768));
        pvc.setUndecorated(true);
        pvc.setResizable(false);
        pvc.setSize(new java.awt.Dimension(1366, 768));

        csjlabel4.setBackground(new java.awt.Color(255, 204, 0));
        csjlabel4.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        csjlabel4.setForeground(new java.awt.Color(255, 255, 255));
        csjlabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjlabel4.setText("Periyar House Vice Captain");
        csjlabel4.setOpaque(true);
        csjlabel4.setPreferredSize(new java.awt.Dimension(182, 70));
        pvc.getContentPane().add(csjlabel4, java.awt.BorderLayout.PAGE_START);

        jPanel40.setLayout(new java.awt.GridLayout(1, 3));

        csjpic13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjpic13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/pvc0AshwinShaji.jpg"))); // NOI18N
        csjpic13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        csjpic13.setName(""); // NOI18N
        csjpic13.setPreferredSize(new java.awt.Dimension(200, 225));

        csj17.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        csj17.setText("Ashwin Saji");
        csj17.setName("hg1"); // NOI18N

        pvc0v.setBackground(new java.awt.Color(0, 0, 0));
        pvc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pvc0v.setForeground(new java.awt.Color(255, 255, 255));
        pvc0v.setText("Vote");
        pvc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(csjpic13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csj17)
                    .addComponent(pvc0v))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(csjpic13, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(csj17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pvc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel40.add(jPanel41);

        csjpic14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        csjpic14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/pvc1Naina.jpg"))); // NOI18N
        csjpic14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        csjpic14.setPreferredSize(new java.awt.Dimension(200, 225));

        csj18.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        csj18.setText("Naina Marie");
        csj18.setName("hg1"); // NOI18N

        pvc1v.setBackground(new java.awt.Color(0, 0, 0));
        pvc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pvc1v.setForeground(new java.awt.Color(255, 255, 255));
        pvc1v.setText("Vote");
        pvc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(csj18)
                    .addComponent(pvc1v)
                    .addComponent(csjpic14, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(csjpic14, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(csj18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pvc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel40.add(jPanel42);

        pvc.getContentPane().add(jPanel40, java.awt.BorderLayout.CENTER);

        pjc.setBackground(new java.awt.Color(255, 255, 255));
        pjc.setMinimumSize(new java.awt.Dimension(1366, 768));
        pjc.setUndecorated(true);
        pjc.setResizable(false);
        pjc.setSize(new java.awt.Dimension(1366, 768));

        hblabel9.setBackground(new java.awt.Color(255, 204, 0));
        hblabel9.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        hblabel9.setForeground(new java.awt.Color(255, 255, 255));
        hblabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hblabel9.setText("Periyar Junior House Captain");
        hblabel9.setOpaque(true);
        hblabel9.setPreferredSize(new java.awt.Dimension(182, 70));
        pjc.getContentPane().add(hblabel9, java.awt.BorderLayout.NORTH);

        jPanel63.setLayout(new java.awt.GridLayout(1, 3));

        pjcpic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjcpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/pjc0Mayuri.jpg"))); // NOI18N
        pjcpic1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pjcpic1.setName(""); // NOI18N

        pjc1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pjc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjc1.setText("Mayuri Jalin");

        pjc0v.setBackground(new java.awt.Color(0, 0, 0));
        pjc0v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pjc0v.setForeground(new java.awt.Color(255, 255, 255));
        pjc0v.setText("Vote");
        pjc0v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjc0vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pjc1)
                    .addComponent(pjc0v))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(pjcpic1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pjc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pjc0v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel63.add(jPanel43);

        pjcpic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjcpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/pjc1Ruth.jpg"))); // NOI18N
        pjcpic2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pjc2.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pjc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjc2.setText("Ruth Sarah Abraham");

        pjc1v.setBackground(new java.awt.Color(0, 0, 0));
        pjc1v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pjc1v.setForeground(new java.awt.Color(255, 255, 255));
        pjc1v.setText("Vote");
        pjc1v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjc1vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pjc2)
                    .addComponent(pjc1v))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(pjcpic2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pjc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pjc1v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel63.add(jPanel61);

        pjcpic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjcpic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/candidates/pjc2Hrithik.jpg"))); // NOI18N
        pjcpic3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        pjc3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        pjc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pjc3.setText("Hrithik Joseph");

        pjc2v.setBackground(new java.awt.Color(0, 0, 0));
        pjc2v.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        pjc2v.setForeground(new java.awt.Color(255, 255, 255));
        pjc2v.setText("Vote");
        pjc2v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pjc2vActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pjc3)
                    .addComponent(pjc2v))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(pjcpic3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pjc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pjc2v)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel63.add(jPanel62);

        pjc.getContentPane().add(jPanel63, java.awt.BorderLayout.CENTER);

        thanx.setBackground(new java.awt.Color(255, 255, 255));
        thanx.setMinimumSize(new java.awt.Dimension(1366, 768));
        thanx.setUndecorated(true);
        thanx.setResizable(false);
        thanx.setSize(new java.awt.Dimension(1366, 768));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thank you.");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout thanxLayout = new javax.swing.GroupLayout(thanx.getContentPane());
        thanx.getContentPane().setLayout(thanxLayout);
        thanxLayout.setHorizontalGroup(
            thanxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1368, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thanxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        thanxLayout.setVerticalGroup(
            thanxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thanxLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        password.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        password.setTitle("Password");
        password.setModal(true);
        password.setResizable(false);

        jLabel16.setText("Enter Password :");

        jPasswordField1.setToolTipText("");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 153, 0));
        jButton5.setText("GO ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordLayout = new javax.swing.GroupLayout(password.getContentPane());
        password.getContentPane().setLayout(passwordLayout);
        passwordLayout.setHorizontalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordLayout.setVerticalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        welcome.setFont(new java.awt.Font("Consolas", 0, 72)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome");

        jButton1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jButton1.setText("Click Here to cast your vote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    hb.getContentPane().setBackground(Color.WHITE);
    hb.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

//HB Votes
    

    private void hb0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb0vActionPerformed
    hbVotes[0]++;
    setWindow(hg);
    hb.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_hb0vActionPerformed

    private void hb1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hb1vActionPerformed
    hbVotes[1]++;
    setWindow(hg);
    hb.dispose();
            // TODO add your handling code here:
    }//GEN-LAST:event_hb1vActionPerformed

//HG Votes
    
    private void hg0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hg0vActionPerformed
hgVotes[0]++;
setWindow(ahb);
    hg.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_hg0vActionPerformed

//AHB Votes
    
    private void ahb0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahb0vActionPerformed
ahbVotes[0]++;    
setWindow(ahg);
    ahb.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ahb0vActionPerformed

    private void ahb1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahb1vActionPerformed
ahbVotes[1]++;    
setWindow(ahg);
    ahb.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ahb1vActionPerformed

//AHG VOTES
    
    private void ahg0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahg0vActionPerformed
ahgVotes[0]++;
setWindow(cs);
    ahg.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ahg0vActionPerformed

    private void ahg1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahg1vActionPerformed
ahgVotes[1]++;
setWindow(cs);
    ahg.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ahg1vActionPerformed

//NC Votes
    
    private void nc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nc1vActionPerformed
ncVotes[1]++;
setWindow(nvc);
    nc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_nc1vActionPerformed

    private void nc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nc0vActionPerformed
ncVotes[0]++;
setWindow(nvc);
    nc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_nc0vActionPerformed

//NJC Votes
    
    private void njc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_njc0vActionPerformed
njcVotes[0]++;
thankyou();
njc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_njc0vActionPerformed

    private void njc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_njc1vActionPerformed
njcVotes[1]++;
thankyou();
njc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_njc1vActionPerformed

    private void njc2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_njc2vActionPerformed
njcVotes[2]++;
thankyou();
njc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_njc2vActionPerformed

//CC Votes
    
    private void cc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cc0vActionPerformed
ccVotes[0]++;
setWindow(cjc);
cc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cc0vActionPerformed

    private void cc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cc1vActionPerformed
ccVotes[1]++;
setWindow(cjc);
cc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cc1vActionPerformed

//CJC Votes
    
    private void cjc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjc0vActionPerformed
cjcVotes[0]++;
thankyou();
cjc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cjc0vActionPerformed

    private void cjc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjc1vActionPerformed
cjcVotes[1]++;
thankyou();
cjc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cjc1vActionPerformed

    private void cjc2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjc2vActionPerformed
cjcVotes[2]++;
thankyou();
cjc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cjc2vActionPerformed

//GC Votes
    
    private void gc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gc0vActionPerformed
gcVotes[0]++;
setWindow(gvc);
gc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gc0vActionPerformed

    private void gc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gc1vActionPerformed
gcVotes[1]++;
setWindow(gvc);
gc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gc1vActionPerformed

//GJC Votes
    
    private void gjc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gjc0vActionPerformed
gjcVotes[0]++;
thankyou();
gjc.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_gjc0vActionPerformed

    private void gjc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gjc1vActionPerformed
gjcVotes[1]++;
thankyou();
gjc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gjc1vActionPerformed

    private void gjc2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gjc2vActionPerformed
gjcVotes[2]++;
thankyou();
gjc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gjc2vActionPerformed

//PJC Votes
    
    private void pjc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjc0vActionPerformed
pjcVotes[0]++;
thankyou();
pjc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_pjc0vActionPerformed

    private void pjc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjc1vActionPerformed
pjcVotes[1]++;
thankyou();
pjc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_pjc1vActionPerformed

    private void pjc2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pjc2vActionPerformed
 pjcVotes[2]++;
thankyou();
pjc.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_pjc2vActionPerformed
//NARMADA
    private void narmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narmadaActionPerformed
nc.setVisible(true);  
house.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_narmadaActionPerformed

//SC Votes
    
    private void sc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc0vActionPerformed
scVotes[0]++;
setWindow(scv);
sc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_sc0vActionPerformed

    private void sc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc1vActionPerformed
scVotes[1]++;
setWindow(scv);
sc.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_sc1vActionPerformed

//Junior SC Votes

    private void scj0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scj0vActionPerformed
scjVotes[0]++;
house.getContentPane().setBackground(Color.WHITE);
house.setVisible(true);
scj.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_scj0vActionPerformed

    private void scj1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scj1vActionPerformed
scjVotes[1]++;
house.getContentPane().setBackground(Color.WHITE);
house.setVisible(true);
scj.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_scj1vActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        getPass();        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        getPass();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jPasswordField1.setText("");
password.pack();
password.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cauveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cauveryActionPerformed
cc.setVisible(true);
house.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cauveryActionPerformed

    private void gangotriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gangotriActionPerformed
gc.setVisible(true);
house.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_gangotriActionPerformed

    private void periyarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periyarActionPerformed
pvc.setVisible(true);
house.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_periyarActionPerformed

    //CulSec Votes
    
    private void cs0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs0vActionPerformed
csVotes[0]++;
setWindow(sc);
cs.dispose(); 
// TODO add your handling code here:
    }//GEN-LAST:event_cs0vActionPerformed

    private void cs1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs1vActionPerformed
csVotes[1]++;
setWindow(sc);
cs.dispose();         
// TODO add your handling code here:
    }//GEN-LAST:event_cs1vActionPerformed

    //Sports Vice Captain
   
    private void scv0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scv0vActionPerformed
scvVotes[0]++;
setWindow(scjei);
scv.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_scv0vActionPerformed

    private void scv1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scv1vActionPerformed
scvVotes[1]++;
setWindow(scjei);
scv.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_scv1vActionPerformed

    //Narmada House Vice Captains
    
    private void nvc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvc0vActionPerformed
nvcVotes[0]++;
setWindow(njc);
nvc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_nvc0vActionPerformed

    private void nvc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvc1vActionPerformed
nvcVotes[1]++;
setWindow(njc);
nvc.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_nvc1vActionPerformed

    //Gangotri House Vice Captains
    
    private void gvc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gvc0vActionPerformed
gvcVotes[0]++;
setWindow(gjc);
gvc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gvc0vActionPerformed

    private void gvc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gvc1vActionPerformed
gvcVotes[1]++;
setWindow(gjc);
gvc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_gvc1vActionPerformed

    //Periyar House Vice Captains
    
    private void pvc0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvc0vActionPerformed
pvcVotes[0]++;
setWindow(pjc);
pvc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_pvc0vActionPerformed

    private void pvc1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvc1vActionPerformed
pvcVotes[1]++;
setWindow(pjc);
pvc.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_pvc1vActionPerformed

    //Mariam HG Vote
    
    private void hg1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hg1vActionPerformed
        hgVotes[1]++;
        setWindow(ahb);
        hg.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_hg1vActionPerformed

    //Mehnaaz Mather
    
    private void cs2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cs2vActionPerformed
        csVotes[2]++;
        setWindow(sc);
        cs.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cs2vActionPerformed

    private void scjei0vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scjei0vActionPerformed
scjeiVotes[0]++;
setWindow(scj);
scjei.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_scjei0vActionPerformed

    private void scjei1vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scjei1vActionPerformed
scjeiVotes[1]++;
setWindow(scj);
scjei.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_scjei1vActionPerformed

    private void nc2vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nc2vActionPerformed
        ncVotes[2]++;
        setWindow(nvc);
        nc.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_nc2vActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {      
        
        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        new caster().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(caster.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (BiffException ex) {
                        Logger.getLogger(caster.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
    }
    
    public void setWindow(JFrame j){
        j.getContentPane().setBackground(Color.WHITE);
        j.setVisible(true);
        //Printing to excel
        printToExcel();
    }
    
    
    public void thankyou(){
        thanx.getContentPane().setBackground(new Color(255,153,0));
        thanx.setVisible(true);
    }
    public void getPass(){
        char pass[] = jPasswordField1.getPassword();
    if(resultPasswordVerify(pass))
        showResults();
    else if(returnPasswordVerify(pass))
        Return();
    else
        JOptionPane.showMessageDialog(null, "Invalid Password");
    jPasswordField1.setText("");
    }
    public static boolean resultPasswordVerify(char[] input){
        char[] resultPass = {'r','e','s','u','l','t'};
        if(input.length != resultPass.length)
            return false;
        for(int i=0; i<input.length; i++)
            if(input[i] != resultPass[i])
                return false;
        return true;
    }
    public static boolean returnPasswordVerify(char[] input){
        char[] returnPass = {'r','e','t','u','r','n'};
        if(input.length != returnPass.length)
            return false;
        for(int i=0; i<input.length; i++)
            if(input[i] != returnPass[i])
                return false;
        return true;
    }
    public void Return(){
        password.dispose();
        thanx.dispose();
        setVisible(true);
    }
    
    public void showResults(){
        
        //Call printToExcell method
        printToExcel();
        password.dispose();
        thanx.dispose();
        
        
    }
    
    
    public void printToExcel(){
        // Excel file should be in .xls format and should be initialized with the values 0
        String voteLocation = "D:\\votes.xls";
        
        try {
            FileInputStream inputStream = new FileInputStream(new File(voteLocation));
            HSSFWorkbook workbook = new HSSFWorkbook (inputStream);
            HSSFSheet sheet = workbook.getSheetAt(0);
            HSSFCell cell = null;
 
            int j = 0;
            //HB
            AddEntry(0,3,hbVotes,cell,sheet);
            //HG
            AddEntry(1,3,hgVotes,cell,sheet);
            //AHB
            AddEntry(2,3,ahbVotes,cell,sheet);
            //AHG
            AddEntry(3,3,ahgVotes,cell,sheet);
            
            //CulSecretary
            AddEntry(4,3,csVotes,cell,sheet);
            
            //SpCap
            AddEntry(5,3,scVotes,cell,sheet);
            //SpViceCaptain
            AddEntry(6,3,scvVotes,cell,sheet);
            //SpCapJunior
            AddEntry(7,3,scjeiVotes,cell,sheet);
            AddEntry(8,3,scjVotes,cell,sheet);
            
            //PeriyarHouse
            //PHouseCap
            AddEntry(9,3,pcVotes,cell,sheet);
            //PHouseVice
            AddEntry(10,3,pvcVotes,cell,sheet);
            //PHouseJunior
            AddEntry(11,3,pjcVotes,cell,sheet);
            
            //NarmadaHouse
            //NHouseCap
            AddEntry(12,3,ncVotes,cell,sheet);
            //NHouseVice
            AddEntry(13,3,nvcVotes,cell,sheet);
            //NHouseJunior
            AddEntry(14,3,njcVotes,cell,sheet);
            
            //GangotriHouse
            //GHouseCap
            AddEntry(15,3,gcVotes,cell,sheet);
            //GHouseVice
            AddEntry(16,3,gvcVotes,cell,sheet);
            //GHouseJunior
            AddEntry(17,3,gjcVotes,cell,sheet);
            
            //CauveryHouse
            //CHouseCap
            AddEntry(18,3,ccVotes,cell,sheet);
            //CHouseVice
            AddEntry(19,3,cvcVotes,cell,sheet);
            //CHouseJunior
            AddEntry(20,3,cjcVotes,cell,sheet);
            
            
            
            
 
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream(new File(voteLocation));
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Arguments : j - Row index no. , n - no. of candidates in the post, data[] - The array holding the votes.Cell and Sheet is common for everything
    public void AddEntry(int j,int n, Integer data[],HSSFCell cell, HSSFSheet sheet){
        for(int i=0; i<n; ++i){ 
            cell = (HSSFCell) sheet.getRow(j).getCell(i);
            cell.setCellValue(data[i]);
        }
    }
    
    
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame ahb;
    private javax.swing.JButton ahb0v;
    private javax.swing.JLabel ahb1;
    private javax.swing.JButton ahb1v;
    private javax.swing.JLabel ahb2;
    private javax.swing.JLabel ahblabel;
    private javax.swing.JLabel ahbpic1;
    private javax.swing.JLabel ahbpic2;
    private javax.swing.JFrame ahg;
    private javax.swing.JButton ahg0v;
    private javax.swing.JLabel ahg1;
    private javax.swing.JButton ahg1v;
    private javax.swing.JLabel ahg2;
    private javax.swing.JLabel ahglabel;
    private javax.swing.JLabel ahgpic1;
    private javax.swing.JLabel ahgpic2;
    private javax.swing.JButton cauvery;
    private javax.swing.JFrame cc;
    private javax.swing.JButton cc0v;
    private javax.swing.JLabel cc1;
    private javax.swing.JButton cc1v;
    private javax.swing.JLabel cc2;
    private javax.swing.JLabel ccpic1;
    private javax.swing.JLabel ccpic2;
    private javax.swing.JFrame cjc;
    private javax.swing.JButton cjc0v;
    private javax.swing.JLabel cjc1;
    private javax.swing.JButton cjc1v;
    private javax.swing.JLabel cjc2;
    private javax.swing.JButton cjc2v;
    private javax.swing.JLabel cjc3;
    private javax.swing.JLabel cjcpic1;
    private javax.swing.JLabel cjcpic2;
    private javax.swing.JLabel cjcpic3;
    private javax.swing.JFrame cs;
    private javax.swing.JButton cs0v;
    private javax.swing.JLabel cs1;
    private javax.swing.JButton cs1v;
    private javax.swing.JLabel cs2;
    private javax.swing.JButton cs2v;
    private javax.swing.JLabel cs3;
    private javax.swing.JLabel csj13;
    private javax.swing.JLabel csj14;
    private javax.swing.JLabel csj17;
    private javax.swing.JLabel csj18;
    private javax.swing.JLabel csjlabel3;
    private javax.swing.JLabel csjlabel4;
    private javax.swing.JLabel csjpic10;
    private javax.swing.JLabel csjpic11;
    private javax.swing.JLabel csjpic13;
    private javax.swing.JLabel csjpic14;
    private javax.swing.JLabel cslabel;
    private javax.swing.JLabel cspic1;
    private javax.swing.JLabel cspic2;
    private javax.swing.JLabel cspic3;
    private javax.swing.JButton gangotri;
    private javax.swing.JFrame gc;
    private javax.swing.JButton gc0v;
    private javax.swing.JLabel gc1;
    private javax.swing.JButton gc1v;
    private javax.swing.JLabel gc2;
    private javax.swing.JLabel gcpic1;
    private javax.swing.JLabel gcpic2;
    private javax.swing.JFrame gjc;
    private javax.swing.JButton gjc0v;
    private javax.swing.JLabel gjc1;
    private javax.swing.JButton gjc1v;
    private javax.swing.JLabel gjc2;
    private javax.swing.JButton gjc2v;
    private javax.swing.JLabel gjc3;
    private javax.swing.JLabel gjcpic1;
    private javax.swing.JLabel gjcpic2;
    private javax.swing.JLabel gjcpic3;
    private javax.swing.JFrame gvc;
    private javax.swing.JButton gvc0v;
    private javax.swing.JButton gvc1v;
    private javax.swing.JFrame hb;
    private javax.swing.JButton hb0v;
    private javax.swing.JLabel hb1;
    private javax.swing.JButton hb1v;
    private javax.swing.JLabel hb2;
    private javax.swing.JLabel hblabel;
    private javax.swing.JLabel hblabel1;
    private javax.swing.JLabel hblabel10;
    private javax.swing.JLabel hblabel2;
    private javax.swing.JLabel hblabel3;
    private javax.swing.JLabel hblabel4;
    private javax.swing.JLabel hblabel5;
    private javax.swing.JLabel hblabel6;
    private javax.swing.JLabel hblabel7;
    private javax.swing.JLabel hblabel9;
    private javax.swing.JLabel hbpic1;
    private javax.swing.JLabel hbpic2;
    private javax.swing.JFrame hg;
    private javax.swing.JButton hg0v;
    private javax.swing.JLabel hg1;
    private javax.swing.JButton hg1v;
    private javax.swing.JLabel hg3;
    private javax.swing.JLabel hglabel;
    private javax.swing.JLabel hgpic1;
    private javax.swing.JLabel hgpic3;
    private javax.swing.JFrame house;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton narmada;
    private javax.swing.JFrame nc;
    private javax.swing.JButton nc0v;
    private javax.swing.JLabel nc1;
    private javax.swing.JButton nc1v;
    private javax.swing.JLabel nc2;
    private javax.swing.JButton nc2v;
    private javax.swing.JLabel nc3;
    private javax.swing.JLabel ncpic1;
    private javax.swing.JLabel ncpic2;
    private javax.swing.JLabel ncpic3;
    private javax.swing.JFrame njc;
    private javax.swing.JButton njc0v;
    private javax.swing.JLabel njc1;
    private javax.swing.JButton njc1v;
    private javax.swing.JLabel njc2;
    private javax.swing.JButton njc2v;
    private javax.swing.JLabel njc3;
    private javax.swing.JLabel njcpic1;
    private javax.swing.JLabel njcpic2;
    private javax.swing.JLabel njcpic3;
    private javax.swing.JFrame nvc;
    private javax.swing.JButton nvc0v;
    private javax.swing.JLabel nvc1;
    private javax.swing.JButton nvc1v;
    private javax.swing.JLabel nvc2;
    private javax.swing.JLabel nvclabel;
    private javax.swing.JLabel nvcpic1;
    private javax.swing.JLabel nvcpic2;
    private javax.swing.JDialog password;
    private javax.swing.JButton periyar;
    private javax.swing.JFrame pjc;
    private javax.swing.JButton pjc0v;
    private javax.swing.JLabel pjc1;
    private javax.swing.JButton pjc1v;
    private javax.swing.JLabel pjc2;
    private javax.swing.JButton pjc2v;
    private javax.swing.JLabel pjc3;
    private javax.swing.JLabel pjcpic1;
    private javax.swing.JLabel pjcpic2;
    private javax.swing.JLabel pjcpic3;
    private javax.swing.JFrame pvc;
    private javax.swing.JButton pvc0v;
    private javax.swing.JButton pvc1v;
    private javax.swing.JFrame sc;
    private javax.swing.JButton sc0v;
    private javax.swing.JButton sc1v;
    private javax.swing.JLabel scb1;
    private javax.swing.JLabel scb2;
    private javax.swing.JLabel scblabel;
    private javax.swing.JLabel scbpic1;
    private javax.swing.JLabel scbpic2;
    private javax.swing.JLabel scg1;
    private javax.swing.JLabel scg2;
    private javax.swing.JLabel scg3;
    private javax.swing.JLabel scg4;
    private javax.swing.JLabel scgpic1;
    private javax.swing.JLabel scgpic2;
    private javax.swing.JLabel scgpic3;
    private javax.swing.JLabel scgpic4;
    private javax.swing.JFrame scj;
    private javax.swing.JButton scj0v;
    private javax.swing.JButton scj1v;
    private javax.swing.JFrame scjei;
    private javax.swing.JButton scjei0v;
    private javax.swing.JButton scjei1v;
    private javax.swing.JFrame scv;
    private javax.swing.JButton scv0v;
    private javax.swing.JLabel scv1;
    private javax.swing.JButton scv1v;
    private javax.swing.JLabel scv2;
    private javax.swing.JLabel scvlabel;
    private javax.swing.JLabel scvpic1;
    private javax.swing.JLabel scvpic2;
    private javax.swing.JFrame thanx;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
