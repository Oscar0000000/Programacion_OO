package ejer1;
import java.awt.*;
import java.awt.event.*;

public class Ventana {

	    public static void main(String[] args) {
	        // 1. Crear el Frame principal
	        Frame frame = new Frame("Ejemplo AWT");
	        frame.setBackground(Color.LIGHT_GRAY);
	        frame.setLayout(null); // Desactivamos el layout automático 
	        frame.setSize(300, 220); // Tamaño de la ventana

	        // 2. Crear los controles (Componentes)
	        Button btnSalir = new Button("Salir");
	        Button btnLimpiar = new Button("Limpiar");
	        TextField txtEntrada = new TextField("Escribe algo...");

	        // 3. Posicionar cada elemento de forma absoluta usando setBounds
	        // Valores ajustados para que quede idéntico a la primera foto
	        btnSalir.setBounds(30, 50, 60, 30);
	        btnLimpiar.setBounds(95, 50, 65, 30);
	        txtEntrada.setBounds(30, 95, 130, 30);

	        // 4. Añadir la funcionalidad de los botones (Eventos)
	        
	        // Acción para el botón "Salir" (utiliza dispose() 
	        btnSalir.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                frame.dispose(); // Cierra de forma limpia liberando recursos
	                System.exit(0);
	            }
	        });

	        // Acción para el botón "Limpiar"
	        btnLimpiar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txtEntrada.setText("");
	            }
	        });

	        // Asegurar que la 'X' de la ventana también funcione
	        frame.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                frame.dispose();
	                System.exit(0);
	            }
	        });

	        // 5. Añadir los controles al contenedor (Frame)
	        frame.add(btnSalir);
	        frame.add(btnLimpiar);
	        frame.add(txtEntrada);

	        // 6. Hacer visible la ventana al final 
	        frame.setVisible(true);
	    }
	}

	


	
		    


