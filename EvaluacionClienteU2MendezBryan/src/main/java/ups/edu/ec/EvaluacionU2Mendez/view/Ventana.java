package ups.edu.ec.EvaluacionU2Mendez.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import ups.edu.ec.EvaluacionU2Mendez.model.Vehiculo;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField placatxt;
	private JTextField marcatxt;
	private JTextField colortxt;
	private JTextField modeotxt;
	private JTextField duenotxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("VEHICULOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton insertarbtn = new JButton("INSERTAR");
		insertarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa=placatxt.getText();
				String marca=marcatxt.getText();
				String color=colortxt.getText();
				String modelo=modeotxt.getText();
				String dueno=duenotxt.getText();
				VentVehiculo vh= new VentVehiculo();
				try {
					vh.conectar();
					vh.insertarVehiculo(placa, marca, color, modelo, dueno);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		insertarbtn.setBounds(326, 102, 118, 21);
		contentPane.add(insertarbtn);
		
		JButton buscarbtn = new JButton("BUSCAR");
		buscarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa=placatxt.getText();
				VentVehiculo vh= new VentVehiculo();
				Vehiculo v= new Vehiculo();
				try {
					vh.conectar();
					v=vh.buscarVehiculo(placa);
					if(v != null) {
						placatxt.setText(v.getPlaca());
						marcatxt.setText(v.getMarca());
						colortxt.setText(v.getColor());
						modeotxt.setText(v.getModelo());
						duenotxt.setText(v.getDueno());
					}else {
							limpiar();
						}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		buscarbtn.setBounds(326, 133, 118, 21);
		contentPane.add(buscarbtn);
		
		JButton actualizarbtn = new JButton("ACTUALIZAR");
		actualizarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String placa=placatxt.getText();
				String marca=marcatxt.getText();
				String color=colortxt.getText();
				String modelo=modeotxt.getText();
				String dueno=duenotxt.getText();
				VentVehiculo vh= new VentVehiculo();
				try {
					vh.conectar();
					vh.actualizarVehiculo(placa, marca, color, modelo, dueno);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		actualizarbtn.setBounds(326, 164, 118, 21);
		contentPane.add(actualizarbtn);
		
		JLabel lblNewLabel = new JLabel("PLACA:");
		lblNewLabel.setBounds(10, 106, 85, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MARCA:");
		lblNewLabel_1.setBounds(10, 141, 74, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("COLOR:");
		lblNewLabel_2.setBounds(10, 182, 74, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MODELO:");
		lblNewLabel_3.setBounds(10, 219, 74, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DUEÑO:");
		lblNewLabel_4.setBounds(10, 259, 85, 13);
		contentPane.add(lblNewLabel_4);
		
		placatxt = new JTextField();
		placatxt.setBounds(100, 103, 133, 19);
		contentPane.add(placatxt);
		placatxt.setColumns(10);
		
		marcatxt = new JTextField();
		marcatxt.setBounds(100, 134, 133, 19);
		contentPane.add(marcatxt);
		marcatxt.setColumns(10);
		
		colortxt = new JTextField();
		colortxt.setBounds(100, 179, 133, 19);
		contentPane.add(colortxt);
		colortxt.setColumns(10);
		
		modeotxt = new JTextField();
		modeotxt.setBounds(100, 216, 133, 19);
		contentPane.add(modeotxt);
		modeotxt.setColumns(10);
		
		duenotxt = new JTextField();
		duenotxt.setBounds(100, 256, 133, 19);
		contentPane.add(duenotxt);
		duenotxt.setColumns(10);
	}
	
	public void limpiar() {
		marcatxt.setText("");
		colortxt.setText("");
		modeotxt.setText("");
		duenotxt.setText("");
	}
}
