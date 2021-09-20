package formularioAlta;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formularioAltaJava
 */
@WebServlet("/altaJava")
public class formularioAltaJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formularioAltaJava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nombre");
		String codigo = request.getParameter("fav_language");
		String [] arrayIde = request.getParameterValues("ide");
		String [] arrayTrabajo = request.getParameterValues("estudio");
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.print("<br>");
		salida.print("Nombre: " + nom);
		salida.print("<br>");
		salida.print("Codigo: " + codigo);
		salida.print("<br>");
		
		String ides = " ";
		for(int i=0;i<arrayIde.length;i++){
			ides += arrayIde[i] + " ";
		}
		salida.print("Ides utilizados: " + ides);
		salida.print("<br>");
		
		String trab = " ";
		for(int i=0;i<arrayTrabajo.length;i++){
			trab += arrayTrabajo[i] + " ";
		}
		salida.print("LUgares de trabajo: " + trab);
		salida.print("<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
