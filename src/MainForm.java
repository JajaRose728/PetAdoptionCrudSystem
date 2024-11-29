import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame {
    /**
     * Creates new form PetAdoptionSystem
     */
    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        adoptionstatus = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        adoptiondate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        petname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        species = new javax.swing.JTextField();
        adoptername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petadoptionsystem = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(206, 230, 248)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        id.setBackground(new java.awt.Color(204, 255, 204));
        id.setToolTipText("Pet Information ID");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        email.setBackground(new java.awt.Color(204, 255, 204));
        email.setToolTipText("Email Address of the Adopter");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        adoptionstatus.setBackground(new java.awt.Color(204, 255, 204));
        adoptionstatus.setToolTipText("Adopted or Not");
        adoptionstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptionstatusActionPerformed(evt);
            }
        });

        age.setBackground(new java.awt.Color(204, 255, 204));
        age.setToolTipText("Enter Age");
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        adoptiondate.setBackground(new java.awt.Color(204, 255, 204));
        adoptiondate.setToolTipText("Enter the date of the adoption");
        adoptiondate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptiondateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pet Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Adopter Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Species");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Adoption Status");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");

        save.setBackground(new java.awt.Color(0, 153, 102));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 153, 102));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 153, 102));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 102));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        petname.setBackground(new java.awt.Color(204, 255, 204));
        petname.setToolTipText("Enter Pet Name");
        petname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID");

        species.setBackground(new java.awt.Color(204, 255, 204));
        species.setToolTipText("Pet Species and Breed");
        species.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speciesActionPerformed(evt);
            }
        });

        adoptername.setBackground(new java.awt.Color(204, 255, 204));
        adoptername.setToolTipText("First, Middle, and Last Name of the Adopter");
        adoptername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adopternameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address");

        Age.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Age.setForeground(new java.awt.Color(0, 0, 0));
        Age.setText("Age");

        address.setBackground(new java.awt.Color(204, 255, 204));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Adoption Date");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Downloads\\images.png")); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setMaximumSize(new java.awt.Dimension(30, 30));

        petadoptionsystem.setBackground(new java.awt.Color(204, 255, 204));
        petadoptionsystem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        petadoptionsystem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        petadoptionsystem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pet", "Species", "Age", "AdoptionStatus", "Adopter", "Email", "Address", "AdoptionDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        petadoptionsystem.setGridColor(new java.awt.Color(0, 0, 0));
        petadoptionsystem.setSelectionBackground(new java.awt.Color(65, 126, 65));
        petadoptionsystem.setSelectionForeground(new java.awt.Color(0, 102, 0));
        jScrollPane1.setViewportView(petadoptionsystem);

        jLabel11.setText("jLabel11");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(118, 181, 77));
        jLabel12.setText("GREEN LOCAL");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 51));
        jLabel13.setText("PET ADOPTION CENTER");

        clear.setBackground(new java.awt.Color(0, 153, 102));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(Age)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(petname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adoptername, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(species, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(adoptionstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adoptiondate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(save)
                                .addGap(18, 18, 18)
                                .addComponent(clear)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(delete)
                                        .addGap(18, 18, 18)
                                        .addComponent(update))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(search)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(adoptername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(search))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(species, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(save)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(delete)
                    .addComponent(update))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adoptionstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(adoptiondate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
    }//GEN-LAST:event_idActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
    }//GEN-LAST:event_emailActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Connection conn = DBConnection.getConnection();  // Establish database connection
    
    if (conn != null) {
        PreparedStatement pstmt = null;  // PreparedStatement for executing SQL queries
        ResultSet rs = null;  // ResultSet to hold query results

        try {
            String sql;  // Variable to store SQL query
            
            // If the ID input field is empty, display all records
            if (id.getText().trim().isEmpty()) {
                sql = "SELECT * FROM petadoptioninformation";  // Query to fetch all data
                pstmt = conn.prepareStatement(sql);
            } 
            // If the ID field has input, fetch specific data by ID
            else {
                sql = "SELECT * FROM petadoptioninformation WHERE ID = ?";  // Query to fetch by ID
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(id.getText()));  // Set the ID parameter
            }
            
            rs = pstmt.executeQuery();  // Execute the query
            
            // Update the table model with query results
            DefaultTableModel model = (DefaultTableModel) petadoptionsystem.getModel();
            model.setRowCount(0);  // Clear any existing rows from the table
            
            boolean recordFound = false;  // Track if a record is found
            
            // Iterate through the result set and add data to the table
            while (rs.next()) {
                clearall();  // Clear form fields
                
                // Add a row to the table with data from the current record
                model.addRow(new Object[]{
                    rs.getInt("ID"),
                    rs.getString("Pet"),
                    rs.getString("Species"),
                    rs.getString("Age"),
                    rs.getString("AdoptionStatus"),
                    rs.getString("Adopter"),
                    rs.getString("Email"),
                    rs.getString("Address"),
                    rs.getString("AdoptionDate")
                });
                
                // Populate form fields with the first record's data
                if (!recordFound) {
                    id.setText(rs.getString("ID"));
                    petname.setText(rs.getString("Pet"));
                    species.setText(rs.getString("Species"));
                    age.setText(rs.getString("Age"));
                    adoptionstatus.setText(rs.getString("AdoptionStatus"));
                    adoptername.setText(rs.getString("Adopter"));
                    email.setText(rs.getString("Email"));
                    address.setText(rs.getString("Address"));
                    adoptiondate.setText(rs.getString("AdoptionDate"));
                    recordFound = true;  // Mark that a record has been processed
                }
            }
            
            // If no record is found, show a message dialog
            if (!recordFound) {
                JOptionPane.showMessageDialog(this, "No record found with the specified ID.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            // Handle SQL errors
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            // Close resources (ResultSet and PreparedStatement) to prevent leaks
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();  // Log any errors during resource cleanup
            }
            DBConnection.closeConnection(conn);  // Close the database connection
        }
    } else {
        // Display an error message if the connection fails
        JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void adoptionstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptionstatusActionPerformed
    }//GEN-LAST:event_adoptionstatusActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // Establish database connection
    Connection conn = DBConnection.getConnection();  
    if (conn != null) {
        try {
            // SQL query to update record by ID
            String sql = "UPDATE petadoptioninformation SET Pet = ?, Species = ?, Age = ?, AdoptionStatus = ?, " +
                         "Adopter = ?, Email = ?, Address = ?, AdoptionDate = ? WHERE ID = ?";
                         
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            
            // Set query parameters with input field values
            pstmt.setString(1, petname.getText());  
            pstmt.setString(2, species.getText());  
            pstmt.setString(3, age.getText());  
            pstmt.setString(4, adoptionstatus.getText());  
            pstmt.setString(5, adoptername.getText());  
            pstmt.setString(6, email.getText());  
            pstmt.setString(7, address.getText());  
            pstmt.setString(8, adoptiondate.getText());  
            pstmt.setInt(9, Integer.parseInt(id.getText()));  
            
            // Execute the update query
            int rowsUpdated = pstmt.executeUpdate();  
            
            if (rowsUpdated > 0) {  
                System.out.println("The data was successfully updated!");  
                int updatedId = Integer.parseInt(id.getText());  
                refreshTable(updatedId);  // Refresh table with updated data
                JOptionPane.showMessageDialog(this, "Data was successfully updated!", "Updated", JOptionPane.INFORMATION_MESSAGE);  
            } else {
                System.out.println("No record found with the specified ID.");
            }

            pstmt.close();  

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Database connection failed.", "Connection Error", JOptionPane.ERROR_MESSAGE);  
        } catch (NumberFormatException e) {
            System.out.println("Error parsing ID: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Please enter a valid ID.", "Input Error", JOptionPane.ERROR_MESSAGE);  
        } finally {
            DBConnection.closeConnection(conn);  // Close connection
        }
    } else {
        JOptionPane.showMessageDialog(this, "Database connection is null.", "Connection Error", JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_updateActionPerformed
    // Method to refresh the table with the updated data
    private void refreshTable(int updatedId) {
        // Get database connection
    Connection conn = DBConnection.getConnection();
    if (conn != null) {
        try {
            // SQL query to fetch the updated record by ID
            String sql = "SELECT * FROM petadoptioninformation WHERE ID = ?";  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, updatedId);  // Set the updated ID in the query
            
            ResultSet rs = pstmt.executeQuery();  // Execute the query and get results
            
            // Get the table model to update the table
            DefaultTableModel model = (DefaultTableModel) petadoptionsystem.getModel();
            model.setRowCount(0);  // Clear existing rows in the table
            
            // If the record is found, add it to the table
            if (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("ID"),  // Add ID
                    rs.getString("Pet"),  // Add Pet name
                    rs.getString("Species"),  // Add Pet species
                    rs.getString("Age"),  // Add Pet age
                    rs.getString("AdoptionStatus"),  // Add Adoption status
                    rs.getString("Adopter"),  // Add Adopter name
                    rs.getString("Email"),  // Add Adopter email
                    rs.getString("Address"),  // Add Adopter address
                    rs.getString("AdoptionDate")  // Add Adoption date
                });
            }
            
            rs.close();  // Close the ResultSet
            pstmt.close();  // Close the PreparedStatement
        } catch (SQLException e) {
            // Handle SQL exceptions
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            // Close the database connection to release resources
            DBConnection.closeConnection(conn);
            }
        }
    }
    private void petnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petnameActionPerformed

    }//GEN-LAST:event_petnameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Connection conn = DBConnection.getConnection();
    if (conn != null) {
        try {
            int newId;

            // Check if ID 1 is available
            Statement checkIfOneExistsStmt = conn.createStatement();
            ResultSet checkIfOneExistsRs = checkIfOneExistsStmt.executeQuery("SELECT 1 FROM petadoptioninformation WHERE id = 1");
            if (!checkIfOneExistsRs.next()) {
                newId = 1; // If ID 1 is not taken, use it
            } else {
                // Find the smallest missing ID or max(ID) + 1
                Statement findMissingIdStmt = conn.createStatement();
                String findMissingIdQuery = """
                    SELECT MIN(t1.id + 1) AS next_id
                    FROM petadoptioninformation t1
                    LEFT JOIN petadoptioninformation t2
                    ON t1.id + 1 = t2.id
                    WHERE t2.id IS NULL;
                """;
                ResultSet rs = findMissingIdStmt.executeQuery(findMissingIdQuery);
                if (rs.next() && rs.getInt("next_id") != 0) {
                    newId = rs.getInt("next_id"); // Use the smallest missing ID
                } else {
                    Statement maxIdStmt = conn.createStatement();
                    ResultSet maxIdRs = maxIdStmt.executeQuery("SELECT COALESCE(MAX(id), 0) + 1 AS next_id FROM petadoptioninformation");
                    if (maxIdRs.next()) {
                        newId = maxIdRs.getInt("next_id"); // No gaps, use MAX(ID)+1
                    } else {
                        newId = 1; // Table is empty
                    }
                    maxIdRs.close();
                    maxIdStmt.close();
                }
                rs.close();
                findMissingIdStmt.close();
            }
            checkIfOneExistsRs.close();
            checkIfOneExistsStmt.close();

            // Insert new record with the calculated ID
            String sql = "INSERT INTO petadoptioninformation (ID, Pet, Species, Age, AdoptionStatus, Adopter, Email, Address, AdoptionDate)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newId); // Set ID
            pstmt.setString(2, petname.getText());
            pstmt.setString(3, species.getText());
            pstmt.setInt(4, Integer.parseInt(age.getText()));
            pstmt.setString(5, adoptionstatus.getText());
            pstmt.setString(6, adoptername.getText());
            pstmt.setString(7, email.getText());
            pstmt.setString(8, address.getText());
            pstmt.setString(9, adoptiondate.getText());

            // Execute insert and update table
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Record saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Fetch and display all data sorted by ID
                Statement fetchDataStmt = conn.createStatement();
                String fetchDataQuery = "SELECT * FROM petadoptioninformation ORDER BY id ASC";
                ResultSet resultSet = fetchDataStmt.executeQuery(fetchDataQuery);

                DefaultTableModel model = (DefaultTableModel) petadoptionsystem.getModel();
                model.setRowCount(0);  // Clear the table

                // Add records to the table
                while (resultSet.next()) {
                    model.addRow(new Object[]{
                        resultSet.getInt("ID"),
                        resultSet.getString("Pet"),
                        resultSet.getString("Species"),
                        resultSet.getInt("Age"),
                        resultSet.getString("AdoptionStatus"),
                        resultSet.getString("Adopter"),
                        resultSet.getString("Email"),
                        resultSet.getString("Address"),
                        resultSet.getString("AdoptionDate")
                    });
                }
                resultSet.close();
                fetchDataStmt.close();

                clearall();  // Clear input fields
            }
            pstmt.close();
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);  // Close connection
            }
        }    
    }//GEN-LAST:event_saveActionPerformed
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Connection conn = DBConnection.getConnection(); // Establish database connection
    if (conn != null) {
        // Ask user for confirmation to delete the record
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this data?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        // Proceed with deletion if user confirms
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM petadoptioninformation WHERE ID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Validate ID input
                if (id.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "ID cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                pstmt.setInt(1, Integer.parseInt(id.getText())); // Set ID in the query

                // Execute delete operation
                int rowsDeleted = pstmt.executeUpdate();
                if (rowsDeleted > 0) {
                    refreshTable(); // Refresh the table after deletion
                    clearall();     // Clear input fields
                    JOptionPane.showMessageDialog(this, "Record deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No record found with the specified ID.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid ID format. Please enter a numeric ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } finally {
                DBConnection.closeConnection(conn); // Close database connection
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Unable to establish database connection.", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void speciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speciesActionPerformed
    }//GEN-LAST:event_speciesActionPerformed

    private void adopternameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adopternameActionPerformed
    }//GEN-LAST:event_adopternameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
    }//GEN-LAST:event_addressActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
    }//GEN-LAST:event_ageActionPerformed

    private void adoptiondateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptiondateActionPerformed
    }//GEN-LAST:event_adoptiondateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearall();
    }//GEN-LAST:event_clearActionPerformed
    private void refreshTable() {
    DefaultTableModel tableModel = (DefaultTableModel) petadoptionsystem.getModel();
    tableModel.setRowCount(0); // Clear existing table data

    Connection conn = DBConnection.getConnection();
    if (conn != null) {
        try {
            String sql = "SELECT * FROM petadoptioninformation"; // Query to fetch all records
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            // Populate the table with fresh data from the database
            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getInt("ID"), // Add ID
                    rs.getString("Name"), // Add Pet Name
                    rs.getString("Age"), // Add Age
                    rs.getString("Breed"), // Add Breed
                    rs.getString("AdoptionStatus") // Add Adoption Status
                };
                tableModel.addRow(row); // Add row to table
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage()); // Handle SQL errors
        } finally {
            DBConnection.closeConnection(conn); // Close the connection
        }
    }
}
    //Method to clear all input fields
    private void clearall(){
        id.setText("");
        petname.setText("");
        species.setText("");
        age.setText("");
        adoptionstatus.setText("");
        adoptername.setText("");
        email.setText("");
        address.setText("");
        adoptiondate.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel Age;
    private javax.swing.JTextField address;
    private javax.swing.JTextField adoptername;
    private javax.swing.JTextField adoptiondate;
    private javax.swing.JTextField adoptionstatus;
    private javax.swing.JTextField age;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable petadoptionsystem;
    private javax.swing.JTextField petname;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField species;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}