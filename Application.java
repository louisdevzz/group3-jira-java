package group1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import raven.toast.Notifications;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Application extends javax.swing.JFrame {
    Management management = new Management();
    public Application() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel4.setVisible(false);
        fullname.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jpanellogin = new javax.swing.JPanel();
        password = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        jtitle = new javax.swing.JLabel();
        juser = new javax.swing.JLabel();
        jpass = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("main"); // NOI18N

        password.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N

        btnlogin.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnsignup.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        btnsignup.setText("Sign Up");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        jtitle.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jtitle.setText("LOGIN");

        juser.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        juser.setText("Username");

        jpass.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jpass.setText("Password");

        username.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N

        fullname.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        jLabel4.setText("Fullname");

        javax.swing.GroupLayout jpanelloginLayout = new javax.swing.GroupLayout(jpanellogin);
        jpanellogin.setLayout(jpanelloginLayout);
        jpanelloginLayout.setHorizontalGroup(
                jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanelloginLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addGroup(jpanelloginLayout.createSequentialGroup()
                                                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(71, 71, 71)
                                                .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtitle)
                                        .addComponent(juser)
                                        .addComponent(jpass)
                                        .addComponent(password)
                                        .addComponent(username)
                                        .addComponent(fullname))
                                .addContainerGap(218, Short.MAX_VALUE))
        );
        jpanelloginLayout.setVerticalGroup(
                jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanelloginLayout.createSequentialGroup()
                                .addContainerGap(46, Short.MAX_VALUE)
                                .addComponent(jtitle)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(juser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jpass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpanellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpanellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {
        jtitle.setText("SIGN IN");
        jLabel4.setVisible(false);
        fullname.setVisible(false);
        String user = username.getText();
        String pass = password.getText();
        if(!user.isEmpty()&&!pass.isEmpty()){
            List<User> users = management.userList();
            for(User u: users){
                if(u.checkUser(user)&&u.checkPass(pass)){
                    System.out.println("login successful!!");
                    List<Project> project = management.loadProjectByUID(u.getUid());
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"LOGIN SUCCESS!!");
                    uid = u.getUid();
                    if(project.isEmpty()){
                        CreateProject createProject = new CreateProject();
                        createProject.setVisible(true);
                        createProject.setUid(u.getUid());
                        createProject.setManagement(management);
                        this.setVisible(false);
                        break;
                    }else{
                        Dashboard dashboard = new Dashboard();
                        dashboard.setManagement(management);
                        dashboard.setVisible(true);
                        this.setVisible(false);
                    }
                }else{
                    Notifications.getInstance().show(Notifications.Type.ERROR,"LOGIN FAILED!!");
                    break;
                }
            }
        }

    }
    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {
        jtitle.setText("SIGN UP");
        jLabel4.setVisible(true);
        fullname.setVisible(true);
        String name = fullname.getText();
        String user = username.getText();
        String pass = password.getText();
        String uid = generateRandomUID(user);

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String created_at = f.format(new Date());
        if(!name.isEmpty()&&!user.isEmpty()&&!pass.isEmpty()){
            try{
                management.createUser(uid,name,user,pass,created_at);
                Notifications.getInstance().show(Notifications.Type.SUCCESS,"CREATE SUCCESS!!");
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dashboard.setManagement(management);
                this.setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public static String generateRandomUID(String username) {
        // Generate random portion
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Change 100 to desired range
        String randomPart = String.format("%04d", randomNumber); // Adjust padding as needed

        // Concatenate username and random portion
        return username +"-"+ randomPart;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        Application application = new Application();
        application.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpanellogin;
    private javax.swing.JLabel jpass;
    private javax.swing.JLabel jtitle;
    private javax.swing.JLabel juser;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    public String uid;

}

