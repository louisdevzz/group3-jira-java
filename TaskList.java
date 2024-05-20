package group1;

import com.formdev.flatlaf.FlatIntelliJLaf;

import java.util.Objects;

public class TaskList extends javax.swing.JFrame {

    /**
     * Creates new form TaskList
     */
    public TaskList() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jNameTask = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Status = new javax.swing.JPanel();
        tfDescription = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfFromDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfToDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTags = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jShowText = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jMessage = new javax.swing.JTextField();
        btnComment = new javax.swing.JButton();
        btnCreate1 = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jNameTask.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jNameTask.setText("Name task");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        Status.setBackground(new java.awt.Color(255, 255, 255));

        tfDescription.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel1.setText("Description");

        tfFromDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setText("From Date");

        tfToDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("To Date");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Status");

        tfStatus.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setText("Tags");

        tfTags.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        javax.swing.GroupLayout StatusLayout = new javax.swing.GroupLayout(Status);
        Status.setLayout(StatusLayout);
        StatusLayout.setHorizontalGroup(
                StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StatusLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(tfTags, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusLayout.createSequentialGroup()
                                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(tfFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(tfToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42))))
        );
        StatusLayout.setVerticalGroup(
                StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StatusLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52)
                                .addGroup(StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(StatusLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information", Status);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jShowTextLayout = new javax.swing.GroupLayout(jShowText);
        jShowText.setLayout(jShowTextLayout);
        jShowTextLayout.setHorizontalGroup(
                jShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jShowTextLayout.setVerticalGroup(
                jShowTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 277, Short.MAX_VALUE)
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jShowText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comment", jPanel15);

        btnCreate1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCreate1.setText("Create");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });

        jExit.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jupdate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)
                                                .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jNameTask)
                                                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(498, 498, 498)
                                        .addComponent(btnCreate1)
                                        .addContainerGap(543, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jNameTask)
                                .addGap(18, 18, 18)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(325, 325, 325)
                                        .addComponent(btnCreate1)
                                        .addContainerGap(340, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    public void setTasklist(Task tasklist){
        this.tasklist = tasklist;
    }
    public void loadTask(){
        System.out.println(this.tasklist.toString());
        jNameTask.setText(tasklist.getTopic());
        tfDescription.setText(tasklist.getDescription());
        tfFromDate.setText(tasklist.getFrom_date());
        tfToDate.setText(tasklist.getTo_date());
        tfStatus.setText(tasklist.getStatus().name());
        tfTags.setText(tasklist.getTags());
    }
    public static void main(String args[]) {
        try{
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        //</editor-fold>

        TaskList taskList = new TaskList();
        taskList.setVisible(true);
    }

    private javax.swing.JPanel Status;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jMessage;
    private javax.swing.JLabel jNameTask;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jShowText;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfFromDate;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTags;
    private javax.swing.JTextField tfToDate;
    private Task tasklist;
    // End of variables declaration
}
