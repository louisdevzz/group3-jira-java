package group1;

import raven.toast.Notifications;
import com.formdev.flatlaf.FlatIntelliJLaf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class CreateTask extends javax.swing.JFrame {

    /**
     * Creates new form CreateTask
     */
    public CreateTask() {
        initComponents();
        setLocationRelativeTo(null);
        Notifications.getInstance().setJFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTopic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFromDate = new javax.swing.JTextField();
        jToDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescription = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jAssignment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTags = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel1.setText("CREATE TASK");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Task Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Topic");

        jTopic.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N


        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("From date (dd/MM/yyyy)");

        jFromDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N


        jToDate.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("To date (dd/MM/yyyy)");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Description");

        jScrollPane1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jDescription.setColumns(20);
        jDescription.setRows(5);
        jScrollPane1.setViewportView(jDescription);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Assignment");

        jAssignment.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Status");

        jStatus.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--", "TODO", "PENDING", "COMPLETED" }));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Tags");

        jTags.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jToDate)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                        .addComponent(jTags)
                                        .addComponent(jAssignment)
                                        .addComponent(jStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFromDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTopic, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jToDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTags, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnClose.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnClose.setText("Exit");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCreate))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Task Details");

        pack();
    }// </editor-fold>

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {
        String topic = jTopic.getText();
        String fromDate = jFromDate.getText();
        String toDate = jToDate.getText();
        String description = jDescription.getText();
        String assignment = jAssignment.getText();
        String in_status =(String) jStatus.getSelectedItem();
        String tags = jTags.getText();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String created_at_task = ft.format(new Date());

        Task.STATUS status = null;
        if(Objects.equals(in_status, "TODO")){
            status = Task.STATUS.TODO;
        }
        else if(Objects.equals(in_status, "COMPLETED")){
            status = Task.STATUS.COMPLETED;
        }else if(Objects.equals(in_status,"PENDING")){
            status = Task.STATUS.PENDING;
        }
        try{
            management.createTask(pid,topic,fromDate,toDate,description,assignment,created_at_task,status,"",tags);
            Notifications.getInstance().show(Notifications.Type.SUCCESS,"CREATE TASK SUCCESS!");
        }catch (Exception e){
            e.printStackTrace();
            Notifications.getInstance().show(Notifications.Type.ERROR,"CREATE TASK FAILED!");
        }

    }

    public void setManagement(Management management){
        this.management = management;
    }
    public void setPid(int pid){
        this.pid = pid;
    }
    public static void main(String args[]) {
        try{
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        CreateTask createTask = new CreateTask();
        createTask.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField jAssignment;
    private javax.swing.JTextArea jDescription;
    private javax.swing.JTextField jFromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jStatus;
    private javax.swing.JTextField jTags;
    private javax.swing.JTextField jToDate;
    private javax.swing.JTextField jTopic;
    private Management management;
    private int pid;
    // End of variables declaration
}
