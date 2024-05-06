package group1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.sun.source.tree.Scope;
import raven.toast.Notifications;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;
import java.util.Objects;

public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        Notifications.getInstance().setJFrame(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jproject1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jfullname = new javax.swing.JLabel();
        jfullname1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jNameProject = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCP = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableData1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePD = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jtitle = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescription = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jStatus = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jShowText = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jMessage = new javax.swing.JTextField();
        btnComment = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();
        jCreateTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1390, 720));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Project");

        jproject1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jproject1.setText("name project");

        btnCreate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jfullname.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jfullname.setText("Name user");

        jfullname1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jfullname1.setText("Welcome, ");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Chat room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jfullname1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jfullname, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnCreate))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jproject1)
                                                .addGap(0, 106, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jfullname)
                                        .addComponent(jfullname1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(btnCreate))
                                .addGap(18, 18, 18)
                                .addComponent(jproject1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jNameProject.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jNameProject.setText("Name project");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTableCP.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jTableCP.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "COMPLETED"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        jScrollPane2.setViewportView(jTableCP);
        if (jTableCP.getColumnModel().getColumnCount() > 0) {
            jTableCP.getColumnModel().getColumn(0).setResizable(false);
        }

        jTableData1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jTableData1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "TODO"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableData1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableData1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableData1);
        if (jTableData1.getColumnModel().getColumnCount() > 0) {
            jTableData1.getColumnModel().getColumn(0).setResizable(false);
        }

        jTablePD.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jTablePD.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "PENDING"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane4.setViewportView(jTablePD);
        if (jTablePD.getColumnModel().getColumnCount() > 0) {
            jTablePD.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Board", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1091, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 589, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("List", jPanel4);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jtitle.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jtitle.setText("title project");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel2.setText("Status");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jLabel3.setText("Description");

        jDescription.setEditable(false);
        jDescription.setColumns(20);
        jDescription.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jDescription.setRows(5);
        jDescription.setText("hello");
        jDescription.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jDescription.setEnabled(false);
        jScrollPane1.setViewportView(jDescription);

        jPanel18.setBackground(new java.awt.Color(51, 153, 0));

        jStatus.setBackground(new java.awt.Color(0, 204, 51));
        jStatus.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jStatus.setForeground(new java.awt.Color(255, 255, 255));
        jStatus.setText("status");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jStatus)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(121, 121, 121)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28))
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtitle)
                                .addGap(474, 474, 474))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jtitle)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(377, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Summary", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jShowTextLayout = new javax.swing.GroupLayout(jShowText);
        jShowText.setLayout(jShowTextLayout);
        jShowTextLayout.setHorizontalGroup(
                jShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jShowTextLayout.setVerticalGroup(
                jShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 423, Short.MAX_VALUE)
        );

        jMessage.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N

        btnComment.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnComment, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnComment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jShowText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jShowText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Comment", jPanel15);

        jCreateTask.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        jCreateTask.setText("Create task");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jTabbedPane1)
                                                .addContainerGap())
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jNameProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCreateTask)
                                                .addGap(18, 18, 18))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(498, 498, 498)
                                        .addComponent(btnCreate1)
                                        .addContainerGap(499, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jNameProject)
                                        .addComponent(jCreateTask))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(325, 325, 325)
                                        .addComponent(btnCreate1)
                                        .addContainerGap(326, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        CreateProject createProject = new CreateProject();
        createProject.setVisible(true);
    }

    public void setManagement(Management management){
        this.management = management;
    }

    public void setName(String fullname){
        jfullname.setText(fullname);
    }

    public void setUID(String uid){
        this.uid = uid;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void JCreateTaskActionPerformed(java.awt.event.ActionEvent evt) {
        CreateTask createTask = new CreateTask();
        createTask.setManagement(management);
        createTask.setPid(pid);
        createTask.setVisible(true);
    }
    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    public static void main(String args[]) {
        try{
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);

    }
    private void jTableData1MouseClicked(java.awt.event.MouseEvent evt) {
        int row = jTableData1.getSelectedRow();
        int col = jTableData1.getSelectedColumn();
        DefaultTableModel model = (DefaultTableModel) jTableData1.getModel();
        Object value = model.getValueAt(row,col);
        System.out.println(value);
    }
    public void loadProject(Management management){
        List<Project> projectLists = management.loadProjectByUID(uid);
        for(Project p: projectLists){
            System.out.println(p);
            jproject1.setText(p.getTitle());
            jNameProject.setText(p.getTitle());
            jtitle.setText(p.getTitle());
            jStatus.setText(p.getStatus().name());
            jDescription.setText(p.getDescription());
            setPid(p.getPid());
        }
    }
    public void loadTask(Management management){
        List<Task> taskList = management.loadTaskByPID(pid);
        for(Task t: taskList){
            if(t.getStatus()== Task.STATUS.TODO){
                DefaultTableModel model = (DefaultTableModel) jTableData1.getModel();
                String[] topicTodo = {t.getTopic()};
                model.addRow(topicTodo);
            }else if(t.getStatus() == Task.STATUS.PENDING){
                DefaultTableModel model = (DefaultTableModel) jTablePD.getModel();
                String[] topicPending = {t.getTopic()};
                model.addRow(topicPending);
            }else if(t.getStatus() == Task.STATUS.COMPLETED){
                DefaultTableModel model = (DefaultTableModel) jTableCP.getModel();
                String[] topicCP = {t.getTopic()};
                model.addRow(topicCP);
            }
        }
    }

    public void setPid(int pid){
        this.pid = pid;
    }
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCreateTask;
    private javax.swing.JTextArea jDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jMessage;
    private javax.swing.JLabel jNameProject;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCP;
    private javax.swing.JTable jTableData1;
    private javax.swing.JTable jTablePD;
    private javax.swing.JPanel jShowText;
    private javax.swing.JLabel jStatus;
    private javax.swing.JLabel jfullname;
    private javax.swing.JLabel jfullname1;
    private javax.swing.JLabel jproject1;
    private javax.swing.JLabel jtitle;
    private Management management;
    private String uid;
    private int pid;
    // End of variables declaration
}
