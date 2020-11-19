package livraria_para_programadores_api.telas;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import livraria_para_programadores_api.controle.ControleDeletar;

 

public class DeletarAutor extends javax.swing.JFrame {

   
	private static final long serialVersionUID = 1L;

	
    public DeletarAutor() {
    	this.setTitle("Deletar Autor");
        initComponents();
    }

                      
    private void initComponents() {

        jButtonDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonDeletar.setText("deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        id = new JTextField();
        id.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Informe o Autor que voc\u00EA deseja deletar");
        
        JLabel lblNewLabel_1 = new JLabel("ID do Autor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(139)
        					.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(148)
        					.addComponent(jButtonDeletar))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(151)
        					.addComponent(lblNewLabel_1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(87)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        			.addComponent(lblNewLabel_1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jButtonDeletar)
        			.addGap(107))
        );
        getContentPane().setLayout(layout);

        pack();
    }                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	ControleDeletar d = new ControleDeletar();
    	Integer id= Integer.parseInt(this.id.getText()) ;                        
        d.DeletarAutor(id);
        JOptionPane.showMessageDialog(null, "Autor deletado.");
        this.dispose();
    

    }

                      
    private javax.swing.JButton jButtonDeletar;
    private JTextField id;
}
