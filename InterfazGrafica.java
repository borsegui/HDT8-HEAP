/ **
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * /

importación  java.awt.EventQueue;

importación  javax.imageio.ImageIO;
importación  javax.swing.JFileChooser;
importación  javax.swing.JFrame;
importación  javax.swing.JLabel;
importación  javax.swing.JSlider;

importación  java.awt.Font;
importación  java.awt.event.ActionEvent;
importación  java.awt.event.ActionListener;
importación  java.awt.image.BufferedImage;
importación  java.io.File;
importación  java.io.FileNotFoundException;
importación  java.io.IOException;

importación  javax.swing.ImageIcon;
importación  javax.swing.JButton;
importación  javax.swing.JTextField;
importación  javax.swing.JTextArea;
importación  javax.swing.JTextPane;
importación  javax.swing.JRadioButton;

importación  java.awt.Color;


/ **
 *
 * El Objetivo de Este Programa es utilizar VectorHep ONU de la estafa Comparador párrafo Ordenar en Orden de Prioridad a los Pacientes de hospital de la ONU
 *
 * Se introduce la ONU archivo de texto con tres Datos de los Pacientes Separados de comas
 * Deveulve en Orden de Prioridad, Siendo la A de mas urgencia, a los Pacientes
 * /
pública  clase  InterfazGrafica {

		privada  JFrame frame;
		privada  JSlider deslizador;
		privada  JLabel etiqueta;
		privada  JTextField txtIngreseALos;
		privada  JFileChooser fc;
		privada  de archivos de archivos;
		// privada Calculadora <Integer> calculadora = new Calculadora <Integer> ();
		privada  JButton btnSeleccionarArchivo;
		privada  JButton buttonCalcular;
		privada  JTextArea textArea;
		privada  int metodo = 1;
		
			
	/ *		
				VectorHeap vector = new VectorHeap ();
				vector.add (nueva Paciente ("Juan Pérez", "Yo no", "C"));
				vector.add (nueva Paciente ("Anda", "LE", "A"));
				vector.add (nueva Paciente ("jo", "Hanna", "E"));
				vector.add (nueva Paciente ("jeimmy", "Mimi", "B"));
				
				System.out.println (((Paciente) vector.poll ()) getPrioridad ().);
				System.out.println (((Paciente) vector.poll ()) getPrioridad ().);
				System.out.println (((Paciente) vector.poll ()) getPrioridad ().);
				System.out.println (((Paciente) vector.poll ()) getPrioridad ().);
				
				
			}
} * /

		 públicas  estáticas  vacíos  principales (Cuerda [] args) {
			EventQueue. InvokeLater (nueva  Ejecutable () {
				pública  void  run () {
					tratar {
						InterfazGrafica2 ventana =  nueva  InterfazGrafica2 ();
						ventana. marco. setVisible (verdadero);
					} Catch (Excepción e) {
						e. printStackTrace ();
					}
				}
			});
		}
		
		pública  InterfazGrafica2 () {
			inicializar ();
		}
		
		pública  void  initialize () {
			frame =  nueva  JFrame ();
			marco. setBounds (100, 100, 587, 381);
			marco. setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
			marco. getContentPane (). setLayout (nulo);
			
			JLabel lblEmergencia =  nueva  JLabel ("Cruz Roja Emer.");
			lblEmergencia. setForeground (en color. RED);
			lblEmergencia. setFont (nueva  fuente ("Tahoma", Fuente. BOLD, 50));
			lblEmergencia. setBounds (10, 11, 582, 106);
			marco. getContentPane (). add (lblEmergencia);
			
			btnSeleccionarArchivo =  nuevo  JButton ("recientemente Seleccionar Archivo");
			btnSeleccionarArchivo. setBounds (362, 128, 174, 23);
			btnSeleccionarArchivo. addActionListener (nuevo  Evento ());
			marco. getContentPane (). add (btnSeleccionarArchivo);
			
			txtIngreseALos =  nueva  JTextField ();
			txtIngreseALos. setText ("Ingrese a los Pacientes ...");
			txtIngreseALos. setBounds (20, 128, 332, 23);
			marco. getContentPane (). add (txtIngreseALos);
			txtIngreseALos. setColumns (10);
			
			buttonCalcular =  nuevo  JButton ("ordeñar Pacientes");
			buttonCalcular. setBounds (20, 164, 174, 23);
			buttonCalcular. addActionListener (nuevo  Evento ());
			marco. getContentPane (). add (buttonCalcular);
			
			JLabel lblResultados =  nueva  JLabel ("Resultados:");
			lblResultados. setBounds (20, 199, 100, 21);
			marco. getContentPane (). add (lblResultados);
			
			textArea =  nueva  JTextArea ();
			textArea. setBounds (20, 218, 306, 113);
			marco. getContentPane (). add (textArea);
			
			JTextPane textPane =  nueva  JTextPane ();
			textPane. setForeground (en color. RED);
			textPane. setText       ("___ CRUZ ROJA \ n __ | | __ \ n [__ __] EMERGENCIA \ n __ | | \ n __ | | \ n __ | | PACIENTES \ n __ | __ |");
			textPane. setBounds (362, 175, 154, 140);
			marco. getContentPane (). add (textPane);
			
			fc =  nueva  JFileChooser ();
			
			
		}
		

		privada  de clase  Evento  implementa  ActionListener {


			pública  void  actionPerformed (ActionEvent  una) {
			
				si (a. getSource () == btnSeleccionarArchivo) {
					int returnVal = fc. showOpenDialog (marco);
			        si (returnVal ==  JFileChooser. APPROVE_OPTION) {
			        	Sistema. Cabo. Println ("Seleccion");
			            archivo = fc. getSelectedFile ();
			            txtIngreseALos. setText (archivo. getAbsolutePath ());
			        } 
				} Demás  si (a. GetSource () == buttonCalcular) {
							tratar {
								Emergencia2 emergencia =  nueva  Emergencia2 ();
								emergencia. entrarPacientes (archivo. getAbsolutePath ());
								textArea. setText (emergencia. devolverPacientesEnOrden ());
							} Catch (FileNotFoundException e) {
								// Bloque catch generado automáticamente TODO
								e. printStackTrace ();
							}
				}
			}
		}
}
