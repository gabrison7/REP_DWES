package formularioAlta;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
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
		String lenguaje = request.getParameter("fav_language");
		String ide1 = request.getParameter("ide1");
		String ide2 = request.getParameter("ide2");
		String ide3 = request.getParameter("ide3");
		String [] estudio = request.getParameterValues("estudio");
		
		String mensajeError="";
		if("".equals(nom)){
			mensajeError = "Campo nombre obligatorio<br>";
		}
		if(lenguaje==null){
			mensajeError += "Campo lenguaje obligatorio<br>";
		}	
		if(ide1==null && ide2==null && ide3==null){
			mensajeError = "Campo IDE obligatorio<br>";
		}
		
		if(estudio==null){
			mensajeError = "Campo estudio obligatorio<br>";
		}
		
		if(mensajeError != ""){
			
			response.setContentType("text/html");
			PrintWriter salida = response.getWriter();
			salida.println(mensajeError);
			RequestDispatcher rd = request.getRequestDispatcher("formularioAlta.html");
			rd.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
