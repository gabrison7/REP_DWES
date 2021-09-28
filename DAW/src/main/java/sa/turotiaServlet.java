package sa;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class turotiaServlet
 */
@WebServlet("/turotia")
public class turotiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public turotiaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("alumno");
		String profesor = request.getParameter("profesor");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String asunto = request.getParameter("asunto");
		//String material1 = request.getParameter("material1");
		//String material2 = request.getParameter("material2");
		//String material2 = request.getParameter("material3");
		String [] arrayMaterial = request.getParameterValues("material");
		
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.print("Datos de las tutorías");
		salida.print("<br>");
		salida.print("Nombre: " + nombre);
		salida.print("<br>");
		salida.print("Profesor: " + profesor);
		salida.print("<br>");
		salida.print("Día: " + dia);
		salida.print("<br>");
		salida.print("Hora: " + hora);
		salida.print("<br>");
		salida.print("Asunto: " + asunto);
		salida.print("<br>");
		/*
		String materiales = "";
		if(material1!=null){
			materiales = material1;
		}
		if(material2!=null){
			materiales += " " + material2;
		}
		if(material3!=null){
			materiales += " " + material3;
		}
		*/
		String materiales = " ";
		for(int i=0;i<arrayMaterial.length;i++){
			materiales += arrayMaterial[i] + " ";
		}
		salida.print("Material aportado: " + materiales);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
