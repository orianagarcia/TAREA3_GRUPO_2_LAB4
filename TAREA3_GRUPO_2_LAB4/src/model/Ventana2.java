package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txbN1;
	private JTextField txbN2;
	private JTextField txbN3;
	private JTextField txbPromedio;
	private JTextField txbCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelNotas = new JPanel();
		PanelNotas.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelNotas.setBounds(10, 11, 287, 150);
		contentPane.add(PanelNotas);
		PanelNotas.setLayout(null);
		
		JLabel lblN1 = new JLabel("Nota 1 :");
		lblN1.setBounds(49, 23, 56, 14);
		PanelNotas.add(lblN1);
		
		txbN1 = new JTextField();
		txbN1.setBounds(115, 20, 110, 20);
		PanelNotas.add(txbN1);
		txbN1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2 :");
		lblNota2.setBounds(49, 51, 56, 14);
		PanelNotas.add(lblNota2);
		
		txbN2 = new JTextField();
		txbN2.setColumns(10);
		txbN2.setBounds(115, 48, 110, 20);
		PanelNotas.add(txbN2);
		
		JLabel lblN3 = new JLabel("Nota 3 :");
		lblN3.setBounds(49, 79, 56, 14);
		PanelNotas.add(lblN3);
		
		txbN3 = new JTextField();
		txbN3.setColumns(10);
		txbN3.setBounds(115, 76, 110, 20);
		PanelNotas.add(txbN3);
		
		JLabel lblTP = new JLabel("TPS");
		lblTP.setBounds(49, 112, 56, 14);
		PanelNotas.add(lblTP);
		
		String [] estados = {"Aprobado", "Desaprobado" };
		JComboBox cboTP = new JComboBox(estados);
		cboTP.setSelectedIndex(-1);
		cboTP.setBounds(115, 109, 112, 20);
		PanelNotas.add(cboTP);
		
		JPanel PanelResultados = new JPanel();
		PanelResultados.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelResultados.setBounds(16, 166, 287, 84);
		contentPane.add(PanelResultados);
		PanelResultados.setLayout(null);
		
		JLabel lblProm = new JLabel("Promedio");
		lblProm.setBounds(37, 28, 56, 14);
		PanelResultados.add(lblProm);
		
		txbPromedio = new JTextField();
		txbPromedio.setColumns(10);
		txbPromedio.setBounds(116, 25, 109, 20);
		PanelResultados.add(txbPromedio);
		
		JLabel lblCond = new JLabel("Condicion");
		lblCond.setBounds(37, 56, 56, 14);
		PanelResultados.add(lblCond);
		
		txbCondicion = new JTextField();
		txbCondicion.setColumns(10);
		txbCondicion.setBounds(116, 53, 109, 20);
		PanelResultados.add(txbCondicion);
		
		// ACA HAGO EL PROMEDIO
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double prom = (Double.parseDouble(txbN1.getText())+ Double.parseDouble(txbN2.getText())+ Double.parseDouble(txbN3.getText()))/3;
			    txbPromedio.setText(String.valueOf(prom));
			}
		});
		btnCalcular.setBounds(322, 37, 102, 30);
		contentPane.add(btnCalcular);
		
		// ACA LIMPIO LOS TEXTBOXS
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txbN1.setText("");
				txbN2.setText("");
			    txbN3.setText("");
				cboTP.setSelectedIndex(-1); 
				txbPromedio.setText("");
				txbCondicion.setText("");
			}
		});
		btnNuevo.setBounds(322, 77, 102, 30);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(322, 118, 102, 30);
		contentPane.add(btnSalir);
	}
}
