/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grill;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Jack
 */
public class Grill3 extends javax.swing.JFrame {

    /**
     * Creates new form Grill3
     */
    public Grill3() {
        initComponents();
        
        class symbolType
        {
            String x;
            String y;
            String height;
            String width;
            String font;
            String backgroundColor;
            String foregroundColor;
            String opaque;
            String text;
            
        }

        class barType
        {
            java.util.Map<String, symbolType> root;
            java.util.Map<String, symbolType> sharp;
            java.util.Map<String, symbolType> flat;
            java.util.Map<String, symbolType> interval1Numeral;
            java.util.Map<String, symbolType> interval1Sharp;
            java.util.Map<String, symbolType> interval1Flat;
            java.util.Map<String, symbolType> interval1Plus;
            java.util.Map<String, symbolType> interval1Minus;
            java.util.Map<String, symbolType> interval1Delta;
            java.util.Map<String, symbolType> interval1Dim;
            java.util.Map<String, symbolType> interval1M;
            java.util.Map<String, symbolType> interval1LeftParens;
            java.util.Map<String, symbolType> interval1RightParens;
            java.util.Map<String, symbolType> interval2Numeral;
            java.util.Map<String, symbolType> interval2Sharp;
            java.util.Map<String, symbolType> interval2Flat;
            java.util.Map<String, symbolType> interval2Plus;
            java.util.Map<String, symbolType> interval2Minus;
            java.util.Map<String, symbolType> interval2Delta;
            java.util.Map<String, symbolType> interval2Dim;
            java.util.Map<String, symbolType> interval2M;
            java.util.Map<String, symbolType> interval2LeftParens;
            java.util.Map<String, symbolType> interval2RightParens;
            java.util.Map<String, symbolType> interval3Numeral;
            java.util.Map<String, symbolType> interval3Sharp;
            java.util.Map<String, symbolType> interval3Flat;
            java.util.Map<String, symbolType> interval3Plus;
            java.util.Map<String, symbolType> interval3Minus;
            java.util.Map<String, symbolType> interval3Delta;
            java.util.Map<String, symbolType> interval3Dim;
            java.util.Map<String, symbolType> interval3M;
            java.util.Map<String, symbolType> interval3LeftParens;
            java.util.Map<String, symbolType> interval3RightParens;
            java.util.Map<String, symbolType> interval4Numeral;
            java.util.Map<String, symbolType> interval4Sharp;
            java.util.Map<String, symbolType> interval4Flat;
            java.util.Map<String, symbolType> interval4Plus;
            java.util.Map<String, symbolType> interval4Minus;
            java.util.Map<String, symbolType> interval4Delta;
            java.util.Map<String, symbolType> interval4Dim;
            java.util.Map<String, symbolType> interval4M;
            java.util.Map<String, symbolType> interval4LeftParens;
            java.util.Map<String, symbolType> interval4RightParens;
            java.util.Map<String, symbolType> interval5Numeral;
            java.util.Map<String, symbolType> interval5Sharp;
            java.util.Map<String, symbolType> interval5Flat;
            java.util.Map<String, symbolType> interval5Plus;
            java.util.Map<String, symbolType> interval5Minus;
            java.util.Map<String, symbolType> interval5Delta;
            java.util.Map<String, symbolType> interval5Dim;
            java.util.Map<String, symbolType> interval5M;
            java.util.Map<String, symbolType> interval5LeftParens;
            java.util.Map<String, symbolType> interval5RightParens;
            java.util.Map<String, symbolType> plus;
            java.util.Map<String, symbolType> minus;
            java.util.Map<String, symbolType> delta;
            java.util.Map<String, symbolType> diminished;
            java.util.Map<String, symbolType> halfDiminished;
            java.util.Map<String, symbolType> slash;
            java.util.Map<String, symbolType> bass;
            java.util.Map<String, symbolType> beginRepeat;
            java.util.Map<String, symbolType> endRepeat;
                        
        }
        

        java.util.Map<String, barType> chordSymbolLayout = new java.util.HashMap<>();
        
        chordSymbolLayout.put("fullBar", new barType());
        chordSymbolLayout.put("halfBarUpper", new barType());
        chordSymbolLayout.put("halfBarLower", new barType());
        chordSymbolLayout.put("twoPerBar", new barType());
        chordSymbolLayout.put("fourPerBar", new barType());
        
        
        //java.util.Map<String, java.util.HashMap> fullBar = new java.util.HashMap<>();
        //java.util.Map<String, java.util.HashMap> halfBarUpper = new java.util.HashMap<>();
        //java.util.Map<String, java.util.HashMap> halfBarLower = new java.util.HashMap<>();
        //java.util.Map<String, java.util.HashMap> twoPerBar = new java.util.HashMap<>();
        //java.util.Map<String, java.util.HashMap> fourPerBar = new java.util.HashMap<>();
        
        //chordSymbolLayout.put("fullBar", fullBar);
        
        
        
        java.util.Map<String, String> root = new java.util.HashMap<>();
        
        
        
        java.util.Map<String, String> dimension = new java.util.HashMap<>();
        dimension.put("x", "10");
        dimension.put("y", "16");
        dimension.put("height", "30");
        dimension.put("width", "39");
        
        java.util.Map<String, String> font = new java.util.HashMap<>();
        font.put("root", "36 Bold");
        
        java.util.Map<String, String> colors = new java.util.HashMap<>();
        colors.put("background", "240, 240, 240");
        colors.put("foreground", "0, 0, 0");
        
        //java.util.List<String> x = java.util.ArrayList<String>("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jpnlPatterns = new javax.swing.JPanel();
        jlblFull = new javax.swing.JLabel();
        jlblHalf = new javax.swing.JLabel();
        jlblOneTwo = new javax.swing.JLabel();
        jlblTwoOne = new javax.swing.JLabel();
        jlblFour = new javax.swing.JLabel();
        jpnlCharacters = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jpnlControls = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jpnlGrid = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFrameTopHandler(evt);
            }
        });

        jpnlPatterns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlPatterns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnlPatternsMousePressed(evt);
            }
        });

        jlblFull.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblFull.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblFull.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblFull.setOpaque(true);
        jlblFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblFullMousePressed(evt);
            }
        });

        jlblHalf.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\DiagClear74-44.png")); // NOI18N
        jlblHalf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblHalf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblHalf.setOpaque(true);
        jlblHalf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblHalfMousePressed(evt);
            }
        });

        jlblOneTwo.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\1-2-74-44.png")); // NOI18N
        jlblOneTwo.setText("jLabel2");
        jlblOneTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblOneTwo.setMaximumSize(new java.awt.Dimension(60, 45));
        jlblOneTwo.setMinimumSize(new java.awt.Dimension(60, 45));
        jlblOneTwo.setOpaque(true);
        jlblOneTwo.setPreferredSize(new java.awt.Dimension(60, 45));
        jlblOneTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblOneTwoMousePressed(evt);
            }
        });

        jlblTwoOne.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\2-1-74-44.png")); // NOI18N
        jlblTwoOne.setText("jLabel5");
        jlblTwoOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblTwoOne.setMaximumSize(new java.awt.Dimension(60, 45));
        jlblTwoOne.setMinimumSize(new java.awt.Dimension(60, 45));
        jlblTwoOne.setOpaque(true);
        jlblTwoOne.setPreferredSize(new java.awt.Dimension(60, 45));
        jlblTwoOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblTwoOneMousePressed(evt);
            }
        });

        jlblFour.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\4-74-44.png")); // NOI18N
        jlblFour.setText("jLabel1");
        jlblFour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblFour.setMaximumSize(new java.awt.Dimension(60, 45));
        jlblFour.setMinimumSize(new java.awt.Dimension(60, 45));
        jlblFour.setOpaque(true);
        jlblFour.setPreferredSize(new java.awt.Dimension(60, 45));
        jlblFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblFourMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnlPatternsLayout = new javax.swing.GroupLayout(jpnlPatterns);
        jpnlPatterns.setLayout(jpnlPatternsLayout);
        jpnlPatternsLayout.setHorizontalGroup(
            jpnlPatternsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPatternsLayout.createSequentialGroup()
                .addGroup(jpnlPatternsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPatternsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlPatternsLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(jpnlPatternsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblFull, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblTwoOne, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlblFour, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jlblHalf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblOneTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnlPatternsLayout.setVerticalGroup(
            jpnlPatternsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPatternsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlblFull, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHalf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblOneTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTwoOne, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblFour, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnlCharacters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("A");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel10.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel10.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("B");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel11.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel11.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("C");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel12.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel12.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("D");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel13.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel13.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("E");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel14.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel14.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("F");
        jLabel15.setToolTipText("");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel15.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel15.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("G");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel16.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel16.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel17.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("♯");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel17.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel17.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel18.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("♭");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel18.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel18.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("M");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel19.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel19.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel19.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("m");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel20.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel20.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel20.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel21.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("+");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel21.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel21.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel21.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel22.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("O");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel22.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel22.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel22.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel23.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Δ");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel23.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel23.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel24.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("–");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel24.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel24.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel24.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("5");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel27.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel27.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel27.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("3");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel28.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel28.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel28.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("6");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel29.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel29.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel29.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("7");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel30.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel30.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel30.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("9");
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel31.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel31.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel31.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("11");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel32.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel32.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel32.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("13");
        jLabel33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel33.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel33.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel33.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("/");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel35.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel35.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel35.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText(")");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel36.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel36.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText(":");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel37.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel37.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("(");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel38.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel38.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel38.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("˅");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel39.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel39.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel39.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("˄");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel40.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel40.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel40.setPreferredSize(new java.awt.Dimension(26, 26));

        jLabel41.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Ø");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel41.setMaximumSize(new java.awt.Dimension(26, 26));
        jLabel41.setMinimumSize(new java.awt.Dimension(26, 26));
        jLabel41.setPreferredSize(new java.awt.Dimension(26, 26));

        javax.swing.GroupLayout jpnlCharactersLayout = new javax.swing.GroupLayout(jpnlCharacters);
        jpnlCharacters.setLayout(jpnlCharactersLayout);
        jpnlCharactersLayout.setHorizontalGroup(
            jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlCharactersLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(44, 44, 44))
        );
        jpnlCharactersLayout.setVerticalGroup(
            jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpnlCharactersLayout.createSequentialGroup()
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlCharactersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSpinner2.setValue(1);

        jSpinner3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Show");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClick(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Intro Bars");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("End Bars");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Lines");
        jLabel9.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearLabelMousePressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Add");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addLabel(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Remove 1");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnlControlsLayout = new javax.swing.GroupLayout(jpnlControls);
        jpnlControls.setLayout(jpnlControlsLayout);
        jpnlControlsLayout.setHorizontalGroup(
            jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlControlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jSpinner2)
                    .addComponent(jSpinner3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlControlsLayout.createSequentialGroup()
                        .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlControlsLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpnlControlsLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(80, 80, 80)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(60, 60, 60)
                                .addComponent(jButton3)))
                        .addContainerGap())
                    .addGroup(jpnlControlsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(62, 62, 62))))
        );
        jpnlControlsLayout.setVerticalGroup(
            jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlControlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel9)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnlGrid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnlGrid.setMinimumSize(new java.awt.Dimension(85, 64));
        jpnlGrid.setPreferredSize(new java.awt.Dimension(235, 64));
        jpnlGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnlGridMousePressed(evt);
            }
        });
        jpnlGrid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jpnlPatterns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jpnlCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jpnlControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnlCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jpnlPatterns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                .addComponent(jpnlControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClick
        //System.out.print("Here");
        //Dimension d = new Dimension(680, 64 * (int)jSpinner2.getValue());
        //jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        //System.out.print(d);
        //System.out.print("There");
        //jpnlGrid.setPreferredSize(d);
       // System.out.print("Everywhere");
        //jPanel4.setSize(d);
        /*java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        jlpChordGrid = new javax.swing.JLayeredPane[(int)jSpinner2.getValue()][8];
        for (int indexY = 0; indexY < (int)jSpinner2.getValue(); indexY++)
        {
            for (int index2 = 0; index2 < 8; index2++)
            {
                jlpChordGrid[indexY][index2] = new javax.swing.JLayeredPane();
                jlpChordGrid[indexY][index2].setMaximumSize(new java.awt.Dimension(85, 64));
                jlpChordGrid[indexY][index2].setMinimumSize(new java.awt.Dimension(85, 64));
                jlpChordGrid[indexY][index2].setPreferredSize(new java.awt.Dimension(85, 64));
                jlpChordGrid[indexY][index2].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jlpChordGrid[indexY][index2].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                
                gridBagConstraints.gridx = index2;
                gridBagConstraints.gridy = indexY;
                jPanel4.add(jlpChordGrid[indexY][index2], gridBagConstraints);

         
            }
            
        }*/
        //jpnlGrid.revalidate();
       //pack();
        //   System.out.println("Anywhere"); 
    }//GEN-LAST:event_btnShowMouseClick

    private void jFrameTopHandler(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrameTopHandler
        System.out.println(evt);
    }//GEN-LAST:event_jFrameTopHandler

    private void jlblFullMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblFullMousePressed
        strIconPath = "";
        jlblFull.setBackground(new Color(255, 255, 255));
        jlblHalf.setBackground(new Color(214, 217, 223));
        jlblOneTwo.setBackground(new Color(214, 217, 223));    
        jlblTwoOne.setBackground(new Color(214, 217, 223));
        jlblFour.setBackground(new Color(214, 217, 223));         
        intEditMode = 1;
//jlblFull.setOpaque(true);
        //jlblHalf.setOpaque(false);
        //jlblOneTwo.setOpaque(false);
        //jlblTwoOne.setOpaque(false);
        //jlblFour.setOpaque(false);

        //jlpCurrentBar.setBackground(new java.awt.Color(240, 240, 240));
        //jlpCurrentBar.setOpaque(false);
        //jlpCurrentBar.
        //System.out.println(jlpCurrentBar.isOpaque());
    }//GEN-LAST:event_jlblFullMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jpnlGrid.setSize(834, 64 * (int)jSpinner2.getValue() + 2);
        jlblChordGrid = new javax.swing.JLabel[8][(int)jSpinner2.getValue()];                  
        jlpChordGrid = new javax.swing.JLayeredPane[8][(int)jSpinner2.getValue()];
        jpnlChordGrid = new javax.swing.JPanel[8][(int)jSpinner2.getValue()];
        //javax.swing.JLabel jlblLayer0 = new javax.swing.JLabel();
        //javax.swing.JLabel jlblLayer1 = new javax.swing.JLabel();
        //javax.swing.JLabel jlblLayer2 = new javax.swing.JLabel();
        //jlblLayer0.setText("Zero");
        //jlblLayer0.setOpaque(true);
        //jlblLayer1.setText("One");
        //jlblLayer1.setOpaque(true);
        //jlblLayer2.setText("Two");
        //jlblLayer2.setOpaque(true);        
        
        for (int indexY = 0; indexY < (int)jSpinner2.getValue(); indexY++)
        {
            for (int indexX = 0; indexX < 8; indexX++)
            {
                //Working code
                /*
                javax.swing.JLabel jlblTest = new javax.swing.JLabel();
                jlblTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jlblTest.setBounds(0, 0, 104, 64);
                jlblTest.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\DiagWide.png"));
                //jlblTest.setVisible(true);
                
                javax.swing.JPanel jpnlTest = new javax.swing.JPanel();
                jpnlTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jpnlTest.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jpnlTest.setBounds(1, 1, 104, 64);
                jpnlTest.add(jlblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
                
                //jlpTest.revalidate();
                //jlpTest.repaint();
                jpnlGrid.add(jpnlTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
                
                javax.swing.JLabel jlblTest2 = new javax.swing.JLabel();
                jlblTest2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jlblTest2.setBounds(0, 0, 104, 64);
                jlblTest2.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\2-1Wide.png"));
                //jlblTest.setVisible(true);
                
                javax.swing.JPanel jpnlTest2 = new javax.swing.JPanel();
                jpnlTest2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jpnlTest2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jpnlTest2.setBounds(105, 1, 104, 64);
                jpnlTest2.add(jlblTest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
                
                //jlpTest.revalidate();
                //jlpTest.repaint();
                jpnlGrid.add(jpnlTest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

                //jpnlGrid.revalidate();
                //jpnlGrid.repaint();
                */ 
                //javax.swing.JLabel jlblTest = new javax.swing.JLabel();
                
                //jlblTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                //jlblTest.setBounds(1, 1, 104, 64);
                //jlblTest.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\2-1Wide.png"));
                //jpnlGrid.add(jlblTest);
                        
/*
                jpnlChordGrid[indexX][indexY] = new javax.swing.JPanel();
                jlblIcon = new javax.swing.JLabel();
                jlblIcon.setText("Text");
                jlblIcon.setBackground(Color.red);
                jlblIcon.setOpaque(false);
                jlblIcon.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\2-1Wide.png"));
                jpnlChordGrid[indexX][indexY].add(jlblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 104, 64));
                jpnlChordGrid[indexX][indexY].setOpaque(false);
                jpnlChordGrid[indexX][indexY].setBounds(indexX*104 + 1, indexY*64 + 1, 104, 64);
                jpnlChordGrid[indexX][indexY].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jpnlChordGrid[indexX][indexY].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jpnlGrid.add(jpnlChordGrid[indexX][indexY], new org.netbeans.lib.awtextra.AbsoluteConstraints(indexX*104 + 1, indexY*64 + 1, 104, 64));                        
*/
                //jlblChordGrid[indexX][indexY] = new javax.swing.JLabel();
                //jlblChordGrid[indexX][indexY].setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\2-1Wide.png"));
                //jlblChordGrid[indexX][indexY].setBounds(indexX*104 + 1, indexY*64 + 1, 104, 64);
                //jlblChordGrid[indexX][indexY].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                //jlblChordGrid[indexX][indexY].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                //jpnlGrid.add(jlblChordGrid[indexX][indexY], new org.netbeans.lib.awtextra.AbsoluteConstraints(indexX*104 + 1, indexY*64 + 1, 104, 64));                
                //jPanel4.add(jlpChordGrid[indexY][index2], gridBagConstraints);
               
                //javax.swing.JLabel jlblTest = new javax.swing.JLabel();
                //jlblTest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                //jlblTest.setBounds(0, 0, 104, 64);
                //jlblTest.setIcon(new javax.swing.ImageIcon("O:\\NetBeans\\grill\\DiagWide.png"));
         
                
                
                
                jpnlChordGrid[indexX][indexY] = new javax.swing.JPanel();
                //jpnlChordGrid[indexX][indexY].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                //jpnlChordGrid[indexX][indexY].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                //jpnlChordGrid[indexX][indexY].setBounds(1, 1, 104, 64);
                //jpnlChordGrid[indexX][indexY].add(jlblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
                
                
                //jlpChordGrid[indexX][indexY].setOpaque(true);
                //jlpChordGrid[indexX][indexY].setLayer(jlblLayer0, javax.swing.JLayeredPane.DEFAULT_LAYER, 0);
                //jlpChordGrid[indexX][indexY].setLayer(jlblLayer1, javax.swing.JLayeredPane.DEFAULT_LAYER, 1);
                //jlpChordGrid[indexX][indexY].setLayer(jlblLayer2, javax.swing.JLayeredPane.DEFAULT_LAYER, 2);
                //jlpChordGrid[indexX][indexY].add(jlblLayer0);

                //javax.swing.Jlabel jlblIcon = jlpChordGrid[indexX][indexY].getLayer(this)
                //        .setLayer(new javax.swing.JLabel(), javax.swing.JLayeredPane.DEFAULT_LAYER, 0);       
                
                jpnlChordGrid[indexX][indexY].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));                
                jpnlChordGrid[indexX][indexY].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jpnlChordGrid[indexX][indexY].setBounds(indexX*104 + 1, indexY*64 + 1, 104, 64);
                
                //jpnlChordGrid[indexX][indexY].add(jlblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
                
                jpnlGrid.add(jpnlChordGrid[indexX][indexY], new org.netbeans.lib.awtextra.AbsoluteConstraints(indexX*104 + 1, indexY*64 + 1, 104, 64));
                
                //gridBagConstraints.gridx = indexX;
                //gridBagConstraints.gridy = indexY;
                //jPanel4.add(jlpChordGrid[indexY][index2], gridBagConstraints);
                
                //pack();
         
            }
            
        }


    }//GEN-LAST:event_jButton1MousePressed

    private void jpnlGridMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlGridMousePressed
        System.out.println("Here");
        //System.out.println(this);
                //System.out.println(evt.getX());
                //System.out.println(jpnlGrid.getWidth());
                //System.out.println(evt.getXOnScreen());
                //System.out.println(evt.getY());
                //System.out.println(jpnlGrid.getHeight());
                //System.out.println(evt.getYOnScreen());
        int intXPos = evt.getX();
        int intYPos = evt.getY();
        int intGridWidth = jpnlGrid.getWidth();
        int intGridHeight = jpnlGrid.getHeight();
        if (intXPos != 0 && intXPos != intGridWidth - 1 && intYPos != 0 && intYPos != intGridHeight - 1 && intEditMode == 1)
        {
            System.out.println("There");
            int intGridBarX = (intXPos - 1)/104;
            int intGridBarY = (intYPos - 1)/ 64;
            
            javax.swing.JLabel jlblBar = new javax.swing.JLabel();
            jlblBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jlblBar.setBounds(0, 0, 104, 64);
            jlblBar.setIcon(new javax.swing.ImageIcon(strIconPath));
            jpnlChordGrid[intGridBarX][intGridBarY].add(jlblBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
            
            System.out.println(intGridBarX);
            System.out.println(intGridBarY);
            //jlpCurrentBar = C;
            //jlpCurrentBar.
            jpnlChordGrid[intGridBarX][intGridBarY].setOpaque(true);
            jpnlChordGrid[intGridBarX][intGridBarY].setBackground(Color.white);
            //jpnlGrid.revalidate();
            //pack();
            
        }
        
    }//GEN-LAST:event_jpnlGridMousePressed

    private void jlblHalfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblHalfMousePressed
        strIconPath = "O:\\NetBeans\\grill\\DiagWide.png";
        jlblFull.setBackground(new Color(214, 217, 223));     
        jlblHalf.setBackground(new Color(255, 255, 255));
        jlblOneTwo.setBackground(new Color(214, 217, 223));    
        jlblTwoOne.setBackground(new Color(214, 217, 223));
        jlblFour.setBackground(new Color(214, 217, 223)); 
        intEditMode = 1;        
        
        //jlblFull.setOpaque(false);
        //jlblHalf.setOpaque(false);
        //jlblOneTwo.setOpaque(false);
        //jlblTwoOne.setOpaque(false);
        //jlblFour.setOpaque(false);
        //pack();
    }//GEN-LAST:event_jlblHalfMousePressed

    private void jlblOneTwoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblOneTwoMousePressed
        strIconPath = "O:\\NetBeans\\grill\\1-2Wide.png";
        jlblFull.setBackground(new Color(214, 217, 223));
        jlblHalf.setBackground(new Color(214, 217, 223));
        jlblOneTwo.setBackground(new Color(255, 255, 255));    
        jlblTwoOne.setBackground(new Color(214, 217, 223));
        jlblFour.setBackground(new Color(214, 217, 223));  
        intEditMode = 1;
    }//GEN-LAST:event_jlblOneTwoMousePressed

    private void jlblTwoOneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblTwoOneMousePressed
        strIconPath = "O:\\NetBeans\\grill\\2-1Wide.png";
        jlblFull.setBackground(new Color(214, 217, 223));
        jlblHalf.setBackground(new Color(214, 217, 223));
        jlblOneTwo.setBackground(new Color(214, 217, 223));    
        jlblTwoOne.setBackground(new Color(255, 255, 255));
        jlblFour.setBackground(new Color(214, 217, 223));  
        intEditMode = 1;
    }//GEN-LAST:event_jlblTwoOneMousePressed

    private void jlblFourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblFourMousePressed
        strIconPath = "O:\\NetBeans\\grill\\4Wide.png";
        jlblFull.setBackground(new Color(214, 217, 223));
        jlblHalf.setBackground(new Color(214, 217, 223));
        jlblOneTwo.setBackground(new Color(214, 217, 223));    
        jlblTwoOne.setBackground(new Color(214, 217, 223));
        jlblFour.setBackground(new Color(255, 255, 255));
        intEditMode = 1;
    }//GEN-LAST:event_jlblFourMousePressed

    private void jpnlPatternsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlPatternsMousePressed

    }//GEN-LAST:event_jpnlPatternsMousePressed

    private void addLabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabel
        jpnlGrid.setSize(834, 64 * (int)jSpinner2.getValue() + 2);
        jpnlChordGrid = new javax.swing.JPanel[8][(int)jSpinner2.getValue()];
        
        jpnlChordGrid[0][0] = new javax.swing.JPanel();
        jpnlChordGrid[0][0].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));                
        jpnlChordGrid[0][0].setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpnlChordGrid[0][0].setBounds(0*104 + 1, 0*64 + 1, 104, 64);
        jpnlGrid.add(jpnlChordGrid[0][0], new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        javax.swing.JLabel jlblBar = new javax.swing.JLabel();
        jlblBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblBar.setBounds(0, 0, 104, 64);
        jlblBar.setIcon(new javax.swing.ImageIcon(strIconPath));
        jlblBar.setText("Label 1");
        jlblBar.setOpaque(true);
        jpnlChordGrid[0][0].add(jlblBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jlblBar = new javax.swing.JLabel();
        jlblBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblBar.setBounds(0, 0, 104, 64);
        jlblBar.setIcon(new javax.swing.ImageIcon(strIconPath));
        jlblBar.setText("Label 2");
        jlblBar.setOpaque(true);
        jpnlChordGrid[0][0].add(jlblBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0), 0);
        
        /*
        jlblLabel1 = new javax.swing.JLabel();
        jlblLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblLabel1.setBounds(1, 1, 104, 64);
        jlblLabel1.setText("Label 1");
        jlblLabel1.setIcon(new javax.swing.ImageIcon(""));
        jpnlGrid.add(jlblLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        
        
        jlblLabel2 = new javax.swing.JLabel();
        jlblLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblLabel2.setBounds(105, 1, 104, 64);
        jlblLabel2.setText("Label 2");
        jlblLabel2.setIcon(new javax.swing.ImageIcon(""));
        jpnlGrid.add(jlblLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        */
    }//GEN-LAST:event_addLabel

    private void clearLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLabelMousePressed
        System.out.println(jpnlChordGrid[0][0].getComponentCount());
        System.out.println(jpnlChordGrid[0][0].getComponent(0));
        System.out.println(jpnlChordGrid[0][0].getComponent(1));
    }//GEN-LAST:event_clearLabelMousePressed

    private void removeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLabelMousePressed
        jpnlChordGrid[0][0].remove(0);
        jpnlChordGrid[0][0].remove(0);
        //validate();
        repaint();
    }//GEN-LAST:event_removeLabelMousePressed

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
            java.util.logging.Logger.getLogger(Grill3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grill3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grill3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grill3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grill3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel jlblFour;
    private javax.swing.JLabel jlblFull;
    private javax.swing.JLabel jlblHalf;
    private javax.swing.JLabel jlblOneTwo;
    private javax.swing.JLabel jlblTwoOne;
    private javax.swing.JPanel jpnlCharacters;
    private javax.swing.JPanel jpnlControls;
    private javax.swing.JPanel jpnlGrid;
    private javax.swing.JPanel jpnlPatterns;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLayeredPane[][] jlpChordGrid;
    private javax.swing.JPanel[][] jpnlChordGrid;
    private javax.swing.JLabel[][] jlblChordGrid;
    private javax.swing.JLayeredPane jlpCurrentBar;
    private String strIconPath;
    private javax.swing.JLabel jlblIcon;
    private int intEditMode = 0;
    private javax.swing.JLabel jlblLabel1;
    private javax.swing.JLabel jlblLabel2;
    private java.util.Map fullLayout;
    private class fullLayout 
    {
        java.util.List<String> root = new java.util.ArrayList<String>();    
        
    }
    private class halfUpperLayout 
    {
    
    }
    private class halfLowerLayout 
    {
    
    }
    private class twoLayout 
    {
    
    }
    private class fourLayout 
    {
    
    }
    
}


