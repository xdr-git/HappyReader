/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author xdr
 */
public class HappyReaderGui extends javax.swing.JFrame {

	private SubscriptionsList mySubscriptionsList;
	private SubscriptionListModel mySubscriptionsListModel;
	private File currentFile;
	private int subscriptionsFeedListCurrentLine;
	private Subscription currentSubscription;
	private RssItemList myRssFeedRssItemlist;

	/**
	 * Creates new form HappyReaderGui
	 */
	public HappyReaderGui() {
		initComponents();
		mySubscriptionsListModel = new SubscriptionListModel();
		subscriptionsFeedList.setModel(mySubscriptionsListModel);
		mySubscriptionsList = new SubscriptionsList();
		mySubscriptionsListModel.setSubscriptionsList(mySubscriptionsList);
		subscriptionsFeedListCurrentLine = 0;
		myRssFeedRssItemlist = new RssItemList();

	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                bottomSplitPane = new javax.swing.JSplitPane();
                rightSplitPane = new javax.swing.JSplitPane();
                rssFeedContentPane = new javax.swing.JScrollPane();
                rssFeedContentTable = new javax.swing.JTable();
                rssFeedContentPreviewPane = new javax.swing.JScrollPane();
                rssFeedContentPreviewTextArea = new javax.swing.JTextArea();
                leftSplitPane = new javax.swing.JSplitPane();
                openStreamButton = new javax.swing.JButton();
                rssFeedListPane = new javax.swing.JScrollPane();
                subscriptionsFeedList = new javax.swing.JList();
                happyMenuBar = new javax.swing.JMenuBar();
                happyMenu = new javax.swing.JMenu();
                openMenuItem = new javax.swing.JMenuItem();
                exitMenuItem = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                bottomSplitPane.setDividerLocation(150);

                rightSplitPane.setDividerLocation(150);
                rightSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

                rssFeedContentPane.setBackground(new java.awt.Color(255, 255, 255));

                rssFeedContentTable.setRowSelectionAllowed(true);
                rssFeedContentTable.setColumnSelectionAllowed(false);
                rssFeedContentTable.setCellSelectionEnabled(false);
                rssFeedContentTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Title", "date", "url"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.Long.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                rssFeedContentTable.setToolTipText("");
                rssFeedContentTable.setColumnSelectionAllowed(true);
                rssFeedContentTable.getTableHeader().setReorderingAllowed(false);
                rssFeedContentTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                rssFeedContentTableMouseClicked(evt);
                        }
                });
                rssFeedContentTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                rssFeedContentTablePropertyChange(evt);
                        }
                });
                rssFeedContentPane.setViewportView(rssFeedContentTable);
                rssFeedContentTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                if (rssFeedContentTable.getColumnModel().getColumnCount() > 0) {
                        rssFeedContentTable.getColumnModel().getColumn(0).setResizable(false);
                        rssFeedContentTable.getColumnModel().getColumn(1).setResizable(false);
                        rssFeedContentTable.getColumnModel().getColumn(2).setResizable(false);
                }

                rightSplitPane.setLeftComponent(rssFeedContentPane);

                rssFeedContentPreviewTextArea.setColumns(20);
                rssFeedContentPreviewTextArea.setLineWrap(true);
                rssFeedContentPreviewTextArea.setWrapStyleWord(true);
                rssFeedContentPreviewTextArea.setRows(5);
                rssFeedContentPreviewPane.setViewportView(rssFeedContentPreviewTextArea);

                rightSplitPane.setRightComponent(rssFeedContentPreviewPane);

                bottomSplitPane.setRightComponent(rightSplitPane);

                leftSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

                openStreamButton.setText("Open stream...");
                openStreamButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                openStreamButtonActionPerformed(evt);
                        }
                });
                leftSplitPane.setLeftComponent(openStreamButton);

                subscriptionsFeedList.setModel(new javax.swing.AbstractListModel() {
                        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                        public int getSize() { return strings.length; }
                        public Object getElementAt(int i) { return strings[i]; }
                });
                subscriptionsFeedList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                                subscriptionsFeedListValueChanged(evt);
                        }
                });
                rssFeedListPane.setViewportView(subscriptionsFeedList);

                leftSplitPane.setRightComponent(rssFeedListPane);

                bottomSplitPane.setLeftComponent(leftSplitPane);

                happyMenu.setText("File");

                openMenuItem.setText("Open..");
                openMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                openMenuItemActionPerformed(evt);
                        }
                });
                happyMenu.add(openMenuItem);

                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitMenuItemActionPerformed(evt);
                        }
                });
                happyMenu.add(exitMenuItem);

                happyMenuBar.add(happyMenu);

                setJMenuBar(happyMenuBar);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bottomSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bottomSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
	 System.exit(0);
// TODO add your handling code here:
        }//GEN-LAST:event_exitMenuItemActionPerformed

        private void openStreamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStreamButtonActionPerformed
		DefaultTableModel model;
		model = (DefaultTableModel) rssFeedContentTable.getModel();

		myRssFeedRssItemlist = null;
		try {
			myRssFeedRssItemlist = HappyReaderUtility.createRssItemList(currentSubscription.getLink());

		} catch (SAXException | IOException | ParserConfigurationException ex) {
			Logger.getLogger(HappyReaderGui.class.getName()).log(Level.SEVERE, null, ex);
		}
		for (int i = 0; myRssFeedRssItemlist.getSize() > i; i++) {
			String title = myRssFeedRssItemlist.getRssItem(i).getTitle();
			String date = myRssFeedRssItemlist.getRssItem(i).getPubDate();
			String url = myRssFeedRssItemlist.getRssItem(i).getUrl();
			Object[] o = {title, date, url};
			model.addRow(o);
		}
        }//GEN-LAST:event_openStreamButtonActionPerformed
        private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
		JFileChooser fileChooser = new JFileChooser(new File("."));
		int result = fileChooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION);
		{

			currentFile = fileChooser.getSelectedFile();
			mySubscriptionsList = HappyReaderUtility.createSubscriptionList(currentFile);
			mySubscriptionsListModel.setSubscriptionsList(mySubscriptionsList);
			mySubscriptionsList = HappyReaderUtility.createSubscriptionList(currentFile);
		}
        }//GEN-LAST:event_openMenuItemActionPerformed

        private void subscriptionsFeedListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_subscriptionsFeedListValueChanged
		if (!evt.getValueIsAdjusting()) {
			subscriptionsFeedListCurrentLine = subscriptionsFeedList.getSelectedIndex();
			currentSubscription = mySubscriptionsList.getSubscription(subscriptionsFeedListCurrentLine);

		}
        }//GEN-LAST:event_subscriptionsFeedListValueChanged

        private void rssFeedContentTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rssFeedContentTablePropertyChange
		// TODO add your handling code here:
        }//GEN-LAST:event_rssFeedContentTablePropertyChange

        private void rssFeedContentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rssFeedContentTableMouseClicked
		// TODO add your handling code here:
		int row = rssFeedContentTable.rowAtPoint(evt.getPoint());
		rssFeedContentPreviewTextArea.setText(myRssFeedRssItemlist.getRssItem(row).getDescription());

        }//GEN-LAST:event_rssFeedContentTableMouseClicked

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
			java.util.logging.Logger.getLogger(HappyReaderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HappyReaderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HappyReaderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HappyReaderGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HappyReaderGui().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JSplitPane bottomSplitPane;
        private javax.swing.JMenuItem exitMenuItem;
        private javax.swing.JMenu happyMenu;
        private javax.swing.JMenuBar happyMenuBar;
        private javax.swing.JSplitPane leftSplitPane;
        private javax.swing.JMenuItem openMenuItem;
        private javax.swing.JButton openStreamButton;
        private javax.swing.JSplitPane rightSplitPane;
        private javax.swing.JScrollPane rssFeedContentPane;
        private javax.swing.JScrollPane rssFeedContentPreviewPane;
        private javax.swing.JTextArea rssFeedContentPreviewTextArea;
        private javax.swing.JTable rssFeedContentTable;
        private javax.swing.JScrollPane rssFeedListPane;
        private javax.swing.JList subscriptionsFeedList;
        // End of variables declaration//GEN-END:variables

	private void JFileChooser() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}